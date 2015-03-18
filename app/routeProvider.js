angular.module("governanceGenerator").config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl : 'app/partials/main.html',
			controller : 'formController'
		})
		.when('/generate/:code', {
			templateUrl : 'app/partials/generator.html',
			controller : 'generatorController'
		})
		.when('/contact', {
			templateUrl : 'app/partials/contact.html',
			controller : 'contractController'
		})
		.otherwise(
			{
				redirectTo : '/'
			}
		);
}])