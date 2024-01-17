pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {url = uri ("https://jitpack.io")}
    }
}

rootProject.name = "MAD Assignment"
include(":app")
include(":sharedmodel_assignment")
