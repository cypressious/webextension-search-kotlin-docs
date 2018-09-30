import menus.CreateProperties
import webextensions.browser

const val URL_SEARCH = "http://kotlinlang.org/?q=[query]&p=0"

fun main(args: Array<String>) {
    browser.menus.create(CreateProperties(
            title = "Search in Kotlin Docs"
    ))

    browser.menus.onClicked.addListener { info, _ ->
        browser.tabs.create(tabs.CreateProperties(
                url = URL_SEARCH.replace("[query]", info.selectionText ?: return@addListener)
        ))
    }
}
