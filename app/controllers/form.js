angular.module('governanceControllers').controller("formController", ["$scope", "$rootScope", '$sce', "governanceService",
	function($scope, $rootScope, $sce, governanceService) {
		$scope.governanceGen = "";
		$scope.governanceEnGen = "Fill first the form!";
		$scope.governanceDSLGen = $sce.trustAsHtml("Fill first the form!");
        $scope.permaLink = "";

        $scope.deadlineDays = 0;
        $scope.deadlineHours = 0;
        $scope.democracyRatio = 50;
        $scope.democracyMinVotes = 0;
        $scope.noDeadline = true;

        $scope.leader = false;
        $scope.projectBoard = false;
        $scope.contributors = false;
        $scope.users = false;
        $scope.other = false;
        $scope.otherRole = '';

		$scope.generate = function() {
            if(!$scope.isValid()) 
                return;

            result = {
            	language : "en",
                q1 : $scope.collaborationType,
                q2 : $scope.collaborationPhase,
                q3A: $scope.leader,
                q3B: $scope.projectBoard,
                q3C: $scope.contributors,
                q3D: $scope.users,
                q3E: $scope.other,
                q3F: $scope.otherRole,
                q4 : $scope.strategy,
                q4A: $scope.democracyRange,
                q4B: $scope.democracyRatio,
                q4C: $scope.democracyMinVotes,
                q5A: $scope.deadlineDays,
                q5B: $scope.deadlineHours,
                q5C: $scope.noDeadline
            };

            var dataToSend = $.param(result);

            governanceService.generateRule(dataToSend).then(
                function(response) {
                    $scope.governanceEnGen = response;
                },
                function(response) {
                    $scope.governanceEnGen = "Ouch! There was an error generating the governance rule";
                }
            );
            
            result.language = "dsl";
            var dataToSend = $.param(result);

            governanceService.generateRule(dataToSend).then(
                function(response) {
                    $scope.governanceDSLGen = $sce.trustAsHtml(response);
                },
                function(response) {
                    $scope.governanceDSLGen = "Ouch! There was an error generating the governance rule";
                }
            );

            governanceService.convertToURL(result).then(
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
            if(typeof $scope.collaborationType == 'undefined' || $scope.collaborationType === '') {
                $scope.errorQ1 = true;
            } else {
                $scope.errorQ1 = false;
            }

            if(typeof $scope.collaborationPhase == 'undefined' || $scope.collaborationPhase === '') {
                $scope.errorQ2 = true;
            } else {
                $scope.errorQ2 = false;
            }

            if($scope.leader === false && $scope.projectBoard === false && $scope.contributors === false && $scope.users === false && $scope.other === false) {
                $scope.errorQ3 = true;
            } else {
                $scope.errorQ3 = false;
            }

            if($scope.errorQ3 === false) {
            	if ($scope.other === true && $scope.otherRole === '') {
                	$scope.errorQ3 = true;
                } else {
                	$scope.errorQ3 = false;
                }
            } 

            if(typeof $scope.strategy == 'undefined' || $scope.strategy === '') {
                $scope.errorQ4 = true;
            } else {
                $scope.errorQ4 = false;
            }

            if(typeof $scope.strategy !== 'undefined' && $scope.strategy == 'voting') {
                if(typeof $scope.democracyRange == 'undefined' || $scope.democracyRange === '') {
                    $scope.errorQ4A = true;
                } else {
                    $scope.errorQ4A = false;
                }

                if(typeof $scope.democracyRatio == 'undefined' || $scope.democracyRatio === '') {
                    $scope.errorQ4B = true;
                } else {
                    $scope.errorQ4B = false;
                }

                if(typeof $scope.democracyMinVotes == 'undefined') {
                    $scope.errorQ4C = true;
                } else {
                    $scope.errorQ4C = false;
                }
            } 

            if(isNaN($scope.deadlineDays) || isNaN($scope.deadlineHours) || ($scope.deadlineHours === 0 && $scope.deadlineDays === 0 && $scope.noDeadline === false)) {
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
