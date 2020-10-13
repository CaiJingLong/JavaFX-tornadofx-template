package top.kikt.tornadofx.view

import javafx.event.EventTarget
import javafx.geometry.Pos
import top.kikt.tornadofx.fragment.HelloWorld
import tornadofx.*

class Index : View("Tornadofx example") {

    inline fun <reified T : Fragment> EventTarget.navButton() {
        val fragment = T::class.java.getDeclaredConstructor().newInstance()

        add(
            button {
                text = fragment.title
                action {
                    fragment.openModal()
                }
            }
        )
    }

    override val root = vbox {
        alignment = Pos.CENTER
        prefWidth = 720.0
        prefHeight = 480.0

        text("Click button to show new modal.")

        navButton<HelloWorld>()
    }
}

