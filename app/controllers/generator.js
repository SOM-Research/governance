angular.module('governanceControllers').controller('generatorController', ['$scope', '$routeParams', '$sce', 'governanceService',
	function($scope, $routeParams, $sce, governanceService){
		governanceService.convertFromURL($routeParams.code).then(
			function(result) {
				var dataEn = {
	            	language : "en",
	                rule : result
	            };

	            governanceService.generateRule(dataEn).then(
	                function(response) {
	                    $scope.governanceEnGen = response;
	                },
	                function(response) {
	                    $scope.governanceEnGen = "Ouch! There was an error generating the governance rule";
	                }
	            );
	            
				var dataDSL = {
	            	language : "dsl",
	                rule : result
	            };

	            governanceService.generateRule(dataDSL).then(
	                function(response) {
	                    $scope.governanceDSLGen = $sce.trustAsHtml(response);
	                },
	                function(response) {
	                    $scope.governanceDSLGen = $sce.trustAsHtml("Ouch! There was an error generating the governance rule");
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
