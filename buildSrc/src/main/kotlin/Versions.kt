import kotlin.String

/**
 * Find which updates are available by running
 *     `$ ./gradlew syncLibs`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val webextensions_declarations: String = "v0.3"

    const val com_gradle_build_scan_gradle_plugin: String = "1.16"

    const val jmfayard_github_io_gradle_kotlin_dsl_libs_gradle_plugin: String = "0.2.6" 

    const val org_jetbrains_kotlin: String = "1.3.0"

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "4.10.2"

        const val currentVersion: String = "4.10.2"

        const val nightlyVersion: String = "5.1-20181111000030+0000"

        const val releaseCandidate: String = "5.0-rc-1"
    }
}
