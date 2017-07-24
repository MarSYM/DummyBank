var myApp = angular.module('myApp',[]);

myApp.controller('Controller', ['$scope','$http', function($scope,$http) {
	
	$scope.output = "first test <3";
	
	$scope.controllerFunction = function() { 
		console.log("asdasd");
		var url = "/book/print/MAR";
		$http.get(url).success(function(response){
			console.log(response.data);
			//$scope.output = JSON.parse(response);
//			var json = JSON.parse(response);
//		$scope.output = response.data;
		});
		
		
        
	};
	
}]);
