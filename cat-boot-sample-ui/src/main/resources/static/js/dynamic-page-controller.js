define([
    'angular',
    'catBootEnum'
], function (angular,
             catBootEnumModule) {
    'use strict';

    function DynamicPageController($scope, $location, cbEnumService) {
        $scope.demoInput1 = 4;
        $scope.demoInput2 = 6;
        $scope.demoInputOperation = null;

        $scope.result = function() {
            switch ($scope.demoInputOperation) {
                case 'Addition':
                    return $scope.demoInput1 + $scope.demoInput2;
                case 'Multiplication':
                    return $scope.demoInput1 * $scope.demoInput2;
                case 'Division':
                    return $scope.demoInput1 / $scope.demoInput2;
            }
            return '';
        };

        $scope.switchToPage = function(page) {
            $location.path(page);
        };
    }

    return angular.module('catBootSampleApp.DynamicPageController', [
            catBootEnumModule
        ])
        .controller('DynamicPageCtrl', [
            '$scope',
            '$location',
            'cbEnumService',
            DynamicPageController
        ])
        .name;
});
