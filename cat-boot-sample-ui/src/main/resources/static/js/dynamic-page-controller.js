define([
    'angular'
], function (angular) {
    'use strict';

    function DynamicPageController($scope, $location) {
        $scope.demoInput1 = 4;
        $scope.demoInput2 = 6;

        $scope.product = function() {
            return $scope.demoInput1 * $scope.demoInput2;
        };

        $scope.switchToPage = function(page) {
            $location.path(page);
        };
    }

    return angular.module('catBootSampleApp.DynamicPageController', [
        ])
        .controller('DynamicPageCtrl', [
            '$scope',
            '$location',
            DynamicPageController
        ])
        .name;
});
