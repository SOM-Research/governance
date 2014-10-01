angular.module('governanceServices').factory('governanceService', ['$http', '$q',
	function($http, $q) {
		var q1_values = ["Bug", "Enhancement", "All"];
		var q2_values = ["CollaborationAcceptance", "PatchAcceptance", "ReleaseAcceptance"];
		var q3A_values = ["true", "false"];
		var q3B_values = ["true", "false"];
		var q3C_values = ["true", "false"];
		var q3D_values = ["true", "false"];
		var q3E_values = ["true", "false"];
		var q4_values = ["unanimous", "voting"];
		var q4A_values = ["qualified", "present"];
		var q5C_values = ["true", "false"];

		var service = {
			generateRule : function(data) {
				var deferred = $q.defer();
				$http({
	                method : "POST",
	                url : governanceURL + "/generator",
	                data : data,
	                headers : { "Content-Type" : "application/x-www-form-urlencoded"}
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
			        	language : "en",
			            q1 : q1_values[code[0]],
			            q2 : q2_values[code[1]],
			            q3A: q3A_values[code[2]],
			            q3B: q3B_values[code[3]],
			            q3C: q3C_values[code[4]],
			            q3D: q3D_values[code[5]],
			            q3E: q3E_values[code[6]],
			            q3F: "", // TODO: Support for this!
			            q4 : q4_values[code[7]],
			            q4A: q4A_values[code[8]],
			            q4B: code.substring(9,12),
			            q4C: code.substring(12,15),
			            q5A: code.substring(15,18),
			            q5B: code.substring(18,21),
			            q5C: q5C_values[code[21]],
			        };

		            deferred.resolve(result);
			    } else {
			    	deferred.reject("Wrong code");
			    }
				return deferred.promise;
			},
			convertToURL : function(data) {
				var q1 = q1_values.indexOf(data.q1);
				var q2 = q2_values.indexOf(data.q2);
				var q3A = (data.q3A) ? "1" : "0";
				var q3B = (data.q3B) ? "1" : "0";
				var q3C = (data.q3C) ? "1" : "0";
				var q3D = (data.q3D) ? "1" : "0";
				var q3E = (data.q3E) ? "1" : "0";
				var q3F = ""; // TODO Support this!
				var q4 =  q4_values.indexOf(data.q4);
				console.log("-->" + data.q4A);
				var q4A = (data.q4A == undefined) ? "0" : q4A_values.indexOf(data.q4A);
				var q4B = (data.q4B < 100) ? ((data.q4B < 10) ? "00" + data.q4B : "0" + data.q4B) : data.q4B;
				var q4C = (data.q4C < 100) ? ((data.q4C < 10) ? "00" + data.q4C : "0" + data.q4C) : data.q4C;
				var q5A = (data.q5A < 100) ? ((data.q5A < 10) ? "00" + data.q5A : "0" + data.q5A) : data.q5A;
				var q5B = (data.q5B < 100) ? ((data.q5B < 10) ? "00" + data.q5B : "0" + data.q5B) : data.q5B;
				var q5C = (data.q5C) ? "1" : "0";

				var result = "" + q1 + q2 + q3A + q3B + q3C + q3D + q3E + q3F + q4 +q4A + q4B + q4C + q5A + q5B + q5C;

				var deferred = $q.defer();
				deferred.resolve(result);
				return deferred.promise;
			}

		};
		return service;
	}
]);