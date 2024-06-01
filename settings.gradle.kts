pluginManagement {
    repositories {
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
        google()
        mavenCentral()
    }
}

rootProject.name = "TicketSearchApp"
include(":app")
include(":activity-main")
include(":core")
include(":tickets:api")
include(":core:impl")
include(":core:api")
include(":bridge")
include(":core:bridge")
include(":feature-search")
include(":feature-search:api")
include(":feature-search:impl")
include(":feature-hotels")
include(":feature-hotels:api")
include(":feature-hotels:impl")
include(":uikit")
