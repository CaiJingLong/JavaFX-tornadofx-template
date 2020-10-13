package top.kikt.tornadofx

import top.kikt.tornadofx.view.Index
import tornadofx.launch

fun main() {
    launch<App>()
}

class App : tornadofx.App(Index::class)