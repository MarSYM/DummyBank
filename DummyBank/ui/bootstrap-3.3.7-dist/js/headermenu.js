var routerApp = angular.module('routerApp', [ 'ui.router' ]);

routerApp.config(function($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise('/sendDrawdownTrans');

	$stateProvider

	// HOME STATES AND NESTED VIEWS ========================================
	.state('sendDrawdownTrans', {
		url : '/sendDrawdownTrans',
		templateUrl : '/ng-template/sendDrawdownTrans.html'
	})

	//        
	// // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
	// .state('about', {
	// url: '/about',
	// views: {
	// '': { templateUrl: 'partial-about.html' },
	// 'columnOne@about': { template: 'Look I am a column!' },
	// 'columnTwo@about': {
	// templateUrl: 'table-data.html',
	// controller: 'scotchController'
	// }
	// }
	//            
	// });

});