import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.initKoin
import presentation.App

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "TCGcolector",
        ) {
            App()
        }
    }
}