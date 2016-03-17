define([
    'angular',
    'angular-i18n',
    'angular-ui-bootstrap',
    'angular-route',
    'catBootI18n',
    'catBootEnum',
    './dynamic-page-controller.js'
], function (angular,
             angularI18n,
             angularUiBootstrap,
             angularRoute,
             catBootI18nModule,
             catBootEnumModule,
             dynamicPageControllerModule) {
    'use strict';

    angular
        .module('catBootSampleApp', [
            angularRoute,
            angularUiBootstrap,
            catBootI18nModule,
            catBootEnumModule,
            dynamicPageControllerModule
        ])
        .config(['$routeProvider', function ($routeProvider) {
            $routeProvider
                .when('/', {
                    redirectTo: '/dynamic-page-1'
                })
                .when('/dynamic-page-1', {
                    templateUrl: 'views/dynamic-page-view-1.html',
                    controller: 'DynamicPageCtrl'
                })
                .when('/dynamic-page-2', {
                    templateUrl: 'views/dynamic-page-view-2.html',
                    controller: 'DynamicPageCtrl'
                })
                .otherwise({
                    redirectTo: '/404'
                });
        }])
        .config(['$httpProvider', function ($httpProvider) {
            $httpProvider.defaults.withCredentials = true;
        }])
        .run(['cbI18nService', function (catBootI18nService) {
            catBootI18nService
                .resolve()
                .then(function () {
                    angular.element('.i18n-hidden').removeClass('i18n-hidden');
                });
        }]);

    angular.element(document).ready(
        function () {
            angular.bootstrap(document, ['catBootSampleApp'], {strictDi: true});
        }
    );
});
