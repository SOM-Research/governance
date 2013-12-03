
var governanceSurveyModule = angular.module("governanceSurvey", ["ui.bootstrap"])

governanceSurveyModule.controller("formController", ["$scope", 
    function($scope) {
    	$scope.buttonText = "Submit";

        $scope.submit = function() {
        	$scope.buttonDisabled = true;
        	$scope.buttonText = "Thanks!";

            console.log($scope.q1);

            results = { question1 : $scope.q1 };

            var timestamp = $.now();

            var ref = new Firebase("https://governancesurvey.firebaseio.com/" + timestamp);
            ref.set(results);
        }

        
    }
]);

governanceSurveyModule.controller("genController", ["$scope",
	function($scope) {
		$scope.governanceGen = "";
		$scope.governanceEnGen = "";

		$scope.generate = function() {
			$scope.governanceGen = "strategy1: LeaderDriven {\n\tapplied to\tAll\t// All collaboration types\n\twhen\tTaskAcceptance\n\tdeadline\t1 week\n\twho\tProjectLeader\n}"
			$scope.governanceEnGen = "All the bugs, enhancements and comments will be accepted or rejected in one week by the leader group."
		}		
	}
]);
