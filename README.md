gradle-eclipseenhancer
======================

gradle plugin to create source/resources directories expected by eclipse (but they may be missing for some reason). also enables to remove the eclipse output directory.


[ ![TravicCI](https://travis-ci.org/stackmagic/gradle-eclipseenhancer.svg?branch=master) ](https://travis-ci.org/stackmagic/gradle-eclipseenhancer)
[ ![Download](https://api.bintray.com/packages/stackmagic/maven/gradle-eclipseenhancer/images/download.svg) ](https://bintray.com/stackmagic/maven/gradle-eclipseenhancer/_latestVersion)

setup (gradle 2.1 or higher)
============================

```groovy
plugins {
  id 'net.swisstech.eclipseenhancer'
}
```

setup (gradle-1.7 or higher)
============================

```groovy
buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        compile 'net.swisstech:gradle-eclipseenhancer:+'
    }
}

apply plugin: 'net.swisstech.eclipseenhancer'
```

usage
=====

to have the folders created, just run `gradle cleanEclipse eclipse`.

to remove the eclipse output directory, just run `gradle mrproper`

todo
====

