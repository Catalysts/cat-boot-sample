# cat-boot-sample
Sample application for [cat-boot](https://github.com/Catalysts/cat-boot)
and [cat-gradle-plugins](https://github.com/Catalysts/cat-gradle-plugins).

## Highlights

### Turbocharge your enums
![cat-boot-sample in action](cat-boot-sample-1.png)

Select control automatically populated from a Java enum:

    public enum Operation {
        Addition,
        Multiplication,
        Division
    }

With translations provided in a simple format:

    enum.Operation.Addition = Addieren
    enum.Operation.Multiplication = Multiplizieren
    enum.Operation.Division = Dividieren

And extremely simple usage from an AngularJS view:

    <select class="form-control" cb-enum="Operation" ng-model="demoInputOperation"></select>

### Proliferate your WebJars

Keep your WebJar versions in your gradle build files and refer to them from html:

    <script webjars:src="system.js:dist/system.js"></script>

And from less:

    @import "@{webjars-bootstrap}/less/bootstrap";

## All features

### [cat-boot-javamelody](https://github.com/Catalysts/cat-boot/tree/master/cat-boot-javamelody)
Effortless integration of javamelody monitoring into Spring-Boot applications.

### [cat-boot-i18n and cat-boot-i18n-angular](https://github.com/Catalysts/cat-boot#i18n-handling)
* Access to Spring's MessageSource from Angular.
* Select controls based on Java enums with translation.

### [cat-boot-thymeleaf](https://github.com/Catalysts/cat-boot/tree/master/cat-boot-thymeleaf)
Usage of webjars from Thymeleaf with the version in a single location.

### [cat-gradle-buildinfo-plugin](https://github.com/Catalysts/cat-gradle-plugins#buildinfo)
Access to the build version number from code.

### [cat-gradle-less-plugin](https://github.com/Catalysts/cat-gradle-plugins#less)
Usage of webjars from less with the version in a single location.

### [cat-gradle-systemjs-plugin](https://github.com/Catalysts/cat-gradle-plugins#systemjs)
Automated generation of a SystemJS bundle from an input directory.

### [cat-gradle-webjars-plugin](https://github.com/Catalysts/cat-gradle-plugins#webjars)
Glue between cat-boot-thymeleaf and the actual webjars.
