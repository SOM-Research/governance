angular.module('governanceServices').factory('governanceService', ['$http', '$q',
	function($http, $q) {
		var collaborationType_values = ["Bug", "Enhancement", "All"];
		var collaborationPhase_values = ["CollaborationAcceptance", "PatchAcceptance", "ReleaseAcceptance"];
		var boolean_values = [false, true];
		var strategy_values = ["unanimous", "voting"];
		var democracyRange_values = ["qualified", "present"];

		var service = {
			generateRule : function(data) {
				var deferred = $q.defer();
				$http({
	                method : "POST",
	                url : governanceURL + "/generator",
	                data : data
	                //headers : { "Content-Type" : "application/x-www-form-urlencoded"}
	            }).success(function(data) {
					deferred.resolve(data);
	            }).error(function(data, status, headers, config) {
					deferred.reject(data);
	            });
				return deferred.promise;
			},
			convertFromURL : function(code) {
				var deferred = $q.defer();
				if(code.length == 22) {
					result = {
			            collaborationType : collaborationType_values[code[0]],
			            collaborationPhase : collaborationPhase_values[code[1]],
			            people : {
				            leader: boolean_values[code[2]],
				            projectBoard: boolean_values[code[3]],
				            contributors: boolean_values[code[4]],
				            users: boolean_values[code[5]],
				            other: boolean_values[code[6]],
				            otherRole: "" // TODO: Support for this!
			            },
			            strategy : strategy_values[code[7]],
			            democracyRange: democracyRange_values[code[8]],
			            democracyRatio: code.substring(9,12),
			            democracyMinVotes: code.substring(12,15),
			            deadlineDays: code.substring(15,18),
			            deadlineHours: code.substring(18,21),
			            noDeadline: boolean_values[code[21]]
			        };
		            deferred.resolve(result);
			    } else {
			    	deferred.reject("Wrong code");
			    }
				return deferred.promise;
			},
			convertToURL : function(rule) {
				var collaborationType = collaborationType_values.indexOf(rule.collaborationType);
				var collaborationPhase = collaborationPhase_values.indexOf(rule.collaborationPhase);
				var people_leader = (rule.people.leader) ? "1" : "0";
				var people_projectBoard = (rule.people.projectBoard) ? "1" : "0";
				var people_contributors = (rule.people.contributors) ? "1" : "0";
				var people_users = (rule.people.users) ? "1" : "0";
				var people_other = (rule.people.other) ? "1" : "0";
				var people_otherRole = ""; // TODO Support this!
				var strategy =  strategy_values.indexOf(rule.strategy);
				var democracyRange = (rule.democracyRange == undefined) ? "0" : democracyRange_values.indexOf(rule.democracyRange);
				var democracyRatio = (rule.democracyRatio < 100) ? ((rule.democracyRatio < 10) ? "00" + rule.democracyRatio : "0" + rule.democracyRatio) : rule.democracyRatio;
				var democracyMinVotes = (rule.democracyMinVotes < 100) ? ((rule.democracyMinVotes < 10) ? "00" + rule.democracyMinVotes : "0" + rule.democracyMinVotes) : rule.democracyMinVotes;
				var deadlineDays = (rule.deadlineDays < 100) ? ((rule.deadlineDays < 10) ? "00" + rule.deadlineDays : "0" + rule.deadlineDays) : rule.deadlineDays;
				var deadlineHours = (rule.deadlineHours < 100) ? ((rule.deadlineHours < 10) ? "00" + rule.deadlineHours : "0" + rule.deadlineHours) : rule.deadlineHours;
				var noDeadline = (rule.noDeadline) ? "1" : "0";

				var result = "" + collaborationType + collaborationPhase + 
							people_leader + people_projectBoard + people_contributors + people_users + people_other + people_otherRole + 
							strategy + democracyRange + democracyRatio + democracyMinVotes + 
							deadlineDays + deadlineHours + noDeadline;

				var deferred = $q.defer();
				deferred.resolve(result);
				return deferred.promise;
			}

		};
		return service;
	}
]);