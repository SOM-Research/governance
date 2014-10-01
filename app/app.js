var webpageURL = "http://localhost:8000/"
var governanceURL = 'http://localhost:8080/fr.inria.atlanmod.governance.survey.web';

angular.module("governanceGenerator", 
	[
		"ngRoute",
		"ui.bootstrap",
		'governanceServices',
		'governanceControllers'
	]
);