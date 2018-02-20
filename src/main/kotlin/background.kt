import menus.CreateProperties
import webextensions.browser

fun main(args: Array<String>) {
    browser.menus.create(CreateProperties(
            id = "search-kotlin",
            title = "Search in Kotlin Docs",
            contexts = arrayOf("selection")
    ))

    browser.menus.onClicked.addListener { info, tab ->
        when (info.menuItemId) {
            "search-kotlin" -> {
                browser.tabs.create(tabs.CreateProperties(
                        url = "http://kotlinlang.org/?q=${info.selectionText}&p=0"
                ))
            }
        }
    }
}