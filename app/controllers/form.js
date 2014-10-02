angular.module('governanceControllers').controller("formController", ["$scope", "$rootScope", '$sce', "governanceService",
	function($scope, $rootScope, $sce, governanceService) {
		$scope.governanceGen = "";
		$scope.governanceEnGen = "Fill first the form!";
		$scope.governanceDSLGen = $sce.trustAsHtml("Fill first the form!");
        $scope.permaLink = "";

        $scope.rule = {};
        $scope.rule.people = {};
        $scope.rule.people.leader = false;
        $scope.rule.people.projectBoard = false;
        $scope.rule.people.contributors = false;
        $scope.rule.people.users = false;
        $scope.rule.people.other = false;
        $scope.rule.people.otherRole = '';

        $scope.rule.deadlineDays = 0;
        $scope.rule.deadlineHours = 0;
        $scope.rule.democracyRatio = 50;
        $scope.rule.democracyMinVotes = 0;
        $scope.rule.noDeadline = true;

		$scope.generate = function() {
            if(!$scope.isValid()) 
                return;

            dataEn = {
            	language : "en",
                rule : $scope.rule
            };

            governanceService.generateRule(dataEn).then(
                function(response) {
                    $scope.governanceEnGen = response;
                },
                function(response) {
                    $scope.governanceEnGen = "Ouch! There was an error generating the governance rule";
                }
            );
            
            dataDSL = {
                language : "dsl",
                rule : $scope.rule
            };

            governanceService.generateRule(dataDSL).then(
                function(response) {
                    $scope.governanceDSLGen = $sce.trustAsHtml(response);
                },
                function(response) {
                    $scope.governanceDSLGen = $sce.trustAsHtml("Ouch! There was an error generating the governance rule");
                }
            );

            governanceService.convertToURL($scope.rule).then(
                function(response) {
                    $scope.permaLink = webpageURL + "/#/generate/" + response;
                }, 
                function(reason) {

                }
            );
		};

        $scope.isValid = function() {
            // I guess this can be done by AngularJS automatically but I prefer to 
            // practice a bit with JS
            if(typeof $scope.rule.collaborationType == 'undefined' || $scope.rule.collaborationType === '') {
                $scope.errorQ1 = true;
            } else {
                $scope.errorQ1 = false;
            }

            if(typeof $scope.rule.collaborationPhase == 'undefined' || $scope.rule.collaborationPhase === '') {
                $scope.errorQ2 = true;
            } else {
                $scope.errorQ2 = false;
            }

            if($scope.rule.people.leader === false && $scope.rule.people.projectBoard === false && 
                $scope.rule.people.contributors === false && $scope.rule.people.users === false && 
                $scope.rule.people.other === false) {
                $scope.errorQ3 = true;
            } else {
                $scope.errorQ3 = false;
            }

            if($scope.errorQ3 === false) {
            	if ($scope.rule.people.other === true && $scope.rule.people.otherRole === '') {
                	$scope.errorQ3 = true;
                } else {
                	$scope.errorQ3 = false;
                }
            } 

            if(typeof $scope.rule.strategy == 'undefined' || $scope.rule.strategy === '') {
                $scope.errorQ4 = true;
            } else {
                $scope.errorQ4 = false;
            }

            if(typeof $scope.rule.strategy !== 'undefined' && $scope.rule.strategy == 'voting') {
                if(typeof $scope.rule.democracyRange == 'undefined' || $scope.rule.democracyRange === '') {
                    $scope.errorQ4A = true;
                } else {
                    $scope.errorQ4A = false;
                }

                if(typeof $scope.rule.democracyRatio == 'undefined' || $scope.rule.democracyRatio === '') {
                    $scope.errorQ4B = true;
                } else {
                    $scope.errorQ4B = false;
                }

                if(typeof $scope.rule.democracyMinVotes == 'undefined') {
                    $scope.errorQ4C = true;
                } else {
                    $scope.errorQ4C = false;
                }
            } 

            if(isNaN($scope.rule.deadlineDays) || isNaN($scope.rule.deadlineHours) || ($scope.rule.deadlineHours === 0 && $scope.rule.deadlineDays === 0 && $scope.rule.noDeadline === false)) {
                $scope.errorQ5= true;
            } else {
                $scope.errorQ5 = false;
            }

            if($scope.errorQ1 === true || $scope.errorQ2 === true || $scope.errorQ3 === true || 
               $scope.errorQ4A === true || $scope.errorQ4B === true || $scope.errorQ4C === true ||
               $scope.errorQ4 === true || $scope.errorQ5 === true)
                return false;
            else
                return true;
        };
	}
]);
