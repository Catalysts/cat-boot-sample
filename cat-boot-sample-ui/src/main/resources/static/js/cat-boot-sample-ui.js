/**
 * @author Thomas Scheinecker, Catalysts GmbH
 */

define([], function () {
    'use strict';

    // make sure jquery is loaded before angular and bootstrap
    System.config({
        meta: {
            'webjars/angular/angular.min.js': {
                deps: ['jquery']
            },
            'webjars/bootstrap/dist/js/bootstrap.min.js': {
                deps: ['jquery']
            }
        }
    });

    // declare some short aliases for easier reference
    var currentLocale = document.getElementsByName('current-locale')[0].content;
    currentLocale = currentLocale.replace('_', '-').toLocaleLowerCase();
    System.config({
        map: {
            angular: 'webjars/angular/angular.min.js',
            'angular-i18n': 'webjars/angular-i18n/angular-locale_' + currentLocale + '.js',
            bootstrap: 'webjars/bootstrap/dist/js/bootstrap.min.js',
            catBootI18n: 'webjars/cat-boot-i18n-angular/cat-boot-i18n.js',
            catBootEnum: 'webjars/cat-boot-i18n-angular/cat-boot-enum/cat-boot-enum.js',
            catBootUtil: 'cat-boot-util/cat-boot-util.js',
            jquery: 'webjars/jquery/dist/jquery.min.js'
        }
    });

    System.amdDefine('angular-route', [
        'angular',
        'webjars/angular-route/angular-route.min.js'
    ], function () {
        return 'ngRoute';
    });

    System.amdDefine('angular-ui-bootstrap', [
        'angular',
        'webjars/angular-ui-bootstrap-bower/ui-bootstrap-tpls.min.js'
    ], function () {
        return 'ui.bootstrap';
    });

    // init our actual application
    return System.import('js/app.js').then(null, window.console.error.bind(window.console));
});