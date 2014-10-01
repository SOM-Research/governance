angular.module('governanceControllers').controller('generatorController', ['$scope', '$routeParams', '$sce', 'governanceService',
	function($scope, $routeParams, $sce, governanceService){

		governanceService.convertFromURL($routeParams.code).then(
			function(result) {
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
			},
			function(reason) {
                $scope.governanceEnGen = "There is an error in your URL";
                $scope.governanceDSLGen = $sce.trustAsHtml("There is an error in your URL");
			}
		);
	}
])
