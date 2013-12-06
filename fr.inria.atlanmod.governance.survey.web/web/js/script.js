
var governanceSurveyModule = angular.module("governanceSurvey", ["ui.bootstrap"]);

governanceSurveyModule.config(["$httpProvider",
    function($httpProvider) {
        delete $httpProvider.defaults.headers.common["X-Requested-With"];
        $httpProvider.defaults.userXDomain = true;
    }
]);

governanceSurveyModule.controller("genController", ["$scope", "$http", "$rootScope",
	function($scope, $http, $rootScope) {
		$scope.governanceGen = "";
		$scope.governanceEnGen = "Fill first the form!";

        $scope.deadlineDays = 0;
        $scope.deadlineHours = 0;
        $scope.democracyRatio = 50;
        $scope.democracyMinVotes = 0;

        $scope.buttonGenerateDisabled = false;
        $scope.buttonSaveDisabled = true;

		$scope.generate = function() {
            if(!$scope.isValid()) 
                return;

            result = {
                q1 : $scope.collaborationType,
                q2 : $scope.collaborationPhase,
                q3 : $scope.strategy,
                q3A: $scope.democracyRange,
                q3B: $scope.democracyRatio,
                q3C: $scope.democracyMinVotes,
                q4A: $scope.deadlineDays,
                q4B: $scope.deadlineHours,
                q4C: $scope.noDeadline
            }

            dataToSend = $.param(result);

            $http({
                method : "POST",
                url : "governanceGenerator",
                data : dataToSend,
                headers : { "Content-Type" : "application/x-www-form-urlencoded"}
            }).success(function(data) {
                $scope.governanceEnGen = data;
                $scope.buttonSaveDisabled = false;
            }).error(function(data, status, headers, config) {
                $scope.governanceEnGen = "Ouch! There was an error generating the governance rule";
            });
		};

        $scope.save = function() {
            if(!$scope.isValid())
                return;

            if(typeof $scope.governanceEnGen == 'undefined' || $scope.governanceEnGen == '')
                $scope.generate();

            toSave = {
                q1 : $scope.collaborationType,
                q2 : $scope.collaborationPhase,
                q3 : $scope.strategy,
                q3A: $scope.democracyRange,
                q3B: $scope.democracyRatio,
                q3C: $scope.democracyMinVotes,
                q4A: $scope.deadlineDays,
                q4B: $scope.deadlineHours,
                q4C: $scope.noDeadline,
                rule : $scope.governanceEnGen
            }

            $rootScope.$emit("saveRule", toSave);

            $scope.buttonSaveDisabled = true;
        }



        $scope.isValid = function() {
            // I guess this can be done by AngularJS automatically but I prefer to 
            // practice a bit with JS
            if(typeof $scope.collaborationType == 'undefined' || $scope.collaborationType == '') {
                $scope.errorQ1 = true;
            } else {
                $scope.errorQ1 = false;
            }

            if(typeof $scope.collaborationPhase == 'undefined' || $scope.collaborationPhase == '') {
                $scope.errorQ2 = true;
            } else {
                $scope.errorQ2 = false;
            }

            if(typeof $scope.strategy == 'undefined' || $scope.strategy == '') {
                $scope.errorQ3 = true;
            } else {
                $scope.errorQ3 = false;
            }

            if(typeof $scope.strategy !== 'undefined' && $scope.strategy == 'democracy') {
                if(typeof $scope.democracyRange == 'undefined' || $scope.democracyRange == '') {
                    $scope.errorQ3A = true;
                } else {
                    $scope.errorQ3A = false;
                }

                if(typeof $scope.democracyRatio == 'undefined' || $scope.democracyRatio == '') {
                    $scope.errorQ3B = true;
                } else {
                    $scope.errorQ3B = false;
                }

                if(typeof $scope.democracyMinVotes == 'undefined') {
                    $scope.errorQ3C = true;
                } else {
                    $scope.errorQ3C = false;
                }
            } 

            if($scope.deadlineHours == 0 && $scope.deadlineDays == 0 && $scope.noDeadline == false) {
                $scope.errorQ4 = true;
            } else {
                $scope.errorQ4 = false;
            }

            if($scope.errorQ1 == true || $scope.errorQ2 == true || $scope.errorQ3 == true || 
               $scope.errorQ3A == true || $scope.errorQ3B == true || $scope.errorQ3C == true ||
               $scope.errorQ4 == true)
                return false;
            else
                return true;
        }
	}
]);


governanceSurveyModule.controller("surveyController", ["$scope", "$http", "$rootScope",
    function($scope, $http, $rootScope) {
        $scope.buttonText = "Submit";
        $scope.savedRules = [];

        $scope.submit = function() {
            if(!$scope.isValid())
                return;

            $scope.buttonDisabled = true;

            result = {
                q0 : $scope.QS0,
                q1 : $scope.QS1,
                q2 : $scope.QS2,
                q3 : $scope.QS3,
                q4 : $scope.QS4,
                q5 : $scope.QS5,
                examples : $scope.savedRules
            }

            dataToSend = $.param(result);

            $http({
                method : "POST",
                url : "governanceSurvey",
                data : dataToSend,
                headers : { "Content-Type" : "application/x-www-form-urlencoded"}
            }).success(function(data) {
                    $scope.buttonText = "Thanks!";
            }).error(function(data, status, headers, config) {
                $scope.buttonText = "Ouch we had a problem. Could you try again?";
                $scope.buttonDisabled = false;
            });
        }

        $scope.delete = function(element) {
            var index = $scope.savedRules.indexOf(element);
            if(index > -1)
                $scope.savedRules.splice(index, 1);
        }

        var unbind = $rootScope.$on("saveRule", function(event, data) {
            $scope.savedRules.push(data);
        });
        $scope.$on("destroy", unbind);

        $scope.isValid = function() {
            if(typeof $scope.QS0 == 'undefined' || $scope.QS0 == "") {
                $scope.errorQS0 = true;
                return false;
            } else {
                $scope.errorQS0 = false;
                return true;
            }
            return true;
        }
    }
]);
