define([
    'angular'
], function (angular) {
    'use strict';

    function DynamicPageController($scope, $location) {
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
