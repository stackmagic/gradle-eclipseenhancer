package net.swisstech.gradle.eclipseenhancer

import org.slf4j.*

import org.gradle.api.*
import org.gradle.api.plugins.*
import org.gradle.api.artifacts.*

/** some enhancements for eclipse */
class EclipseEnhancerPlugin implements Plugin<Project> {

	void apply(Project project) {

		project.afterEvaluate {
			project.configure(project) {

				// add plugin if missing, no need to specify enhancer+eclipse itself in
				// a simple setup. if the user want to do something fancy with the eclipse
				// plugin, he can - we're running in afterEvaluate anyway
				if (!project.plugins.hasPlugin('eclipse')) {
					apply plugin: 'eclipse'
				}

				// creating all directories eclipse expects to be present
				eclipseProject.doLast {
					boolean hasJava   = project.plugins.hasPlugin('java')
					boolean hasGroovy = project.plugins.hasPlugin('groovy')
					if (hasJava) {              sourceSets*.java.srcDirs*.each      { it.mkdirs() } }
					if (hasGroovy) {            sourceSets*.groovy.srcDirs*.each    { it.mkdirs() ; sourceSets.main.java.srcDirs += it } }
					if (hasJava || hasGroovy) { sourceSets*.resources.srcDirs*.each { it.mkdirs() } }
				}

				// make sure the eclipse output directory is gone
				project.tasks.maybeCreate('mrproper').doLast {
					project.delete(project.eclipse.classpath.defaultOutputDir)
				}
			}
		}
	}
}
