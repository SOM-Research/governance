
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
