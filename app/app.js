var webpageURL = "http://atlanmod.github.io/governance"
//var webpageURL = "http://localhost:8000"

//var governanceURL = 'http://localhost:8080/fr.inria.atlanmod.governance.survey.web';
var governanceURL = 'http://http://atlanmodexp.info.emn.fr:8800/governance';

angular.module("governanceGenerator", 
	[
		"ngRoute",
		"ui.bootstrap",
		'governanceServices',
		'governanceControllers'
	]
);