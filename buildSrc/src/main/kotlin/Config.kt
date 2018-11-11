object Config {

  val latestGradleVersion = Versions.Gradle.currentVersion

   val pluginsResolution : Map<String, String> = mapOf(
    "kotlin-android" to Libs.kotlin_gradle_plugin,
    "kotlin-dce-js" to Libs.kotlin_gradle_plugin,
    "kotlin2js" to Libs.kotlin_gradle_plugin)
 } 