pluginManagement {
    repositories {
        maven { setUrl("https://www.jitpack.io") }

        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { setUrl("https://www.jitpack.io") }
        google()
        mavenCentral()
    }
}

rootProject.name = "ScrollGalleryViewNew"
include(":app")
include(":scrollgalleryview")
