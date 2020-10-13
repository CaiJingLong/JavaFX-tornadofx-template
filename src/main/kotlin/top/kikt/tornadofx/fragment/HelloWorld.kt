package top.kikt.tornadofx.fragment

import javafx.geometry.Pos
import javafx.scene.control.Alert
import tornadofx.*

class HelloWorld : Fragment("Hello world") {
    override val root = vbox {
        prefWidth = 320.0
        prefHeight = 240.0
        alignment = Pos.CENTER

        text("Hello world")
        button {
            text = "Click to show alert"

            action {
                alert(Alert.AlertType.INFORMATION, "Alert", "Hello world")
            }
        }
    }
}
