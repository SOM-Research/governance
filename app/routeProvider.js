angular.module("governanceGenerator").config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl : 'app/partials/form.html',
			controller : 'formController'
		})
		.when('/generate/:code', {
			templateUrl : 'app/partials/generator.html',
			controller : 'generatorController'
		})
		.otherwise(
			{
				redirectTo : '/'
			}
		);
}])