import androidx.compose.ui.window.ComposeUIViewController
import di.initKoin
import presentation.App

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}