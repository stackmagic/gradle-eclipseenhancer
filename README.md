gradle-eclipseenhancer
======================

gradle plugin to create source/resources directories expected by eclipse (but they may be missing for some reason). also enables to remove the eclipse output directory.


[ ![TravicCI](https://travis-ci.org/stackmagic/gradle-eclipseenhancer.svg?branch=master) ](https://travis-ci.org/stackmagic/gradle-eclipseenhancer)
[ ![Download](https://api.bintray.com/packages/stackmagic/maven/gradle-eclipseenhancer/images/download.svg) ](https://bintray.com/stackmagic/maven/gradle-eclipseenhancer/_latestVersion)

downloading
===========

this plugin can be downloaded from [plugins.gradle.org](http://plugins.gradle.org/plugin/net.swisstech.eclipseenhancer)

usage
=====

to have the folders created, just run `gradle cleanEclipse eclipse`.

to remove the eclipse output directory, just run `gradle mrproper`
