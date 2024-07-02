package presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil3.ImageLoader
import coil3.PlatformContext
import coil3.annotation.ExperimentalCoilApi
import coil3.compose.setSingletonImageLoaderFactory
import coil3.request.crossfade
import coil3.util.DebugLogger
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import presentation.screens.cardlist.CardListScreen
import presentation.screens.cardlist.CardsListViewModel
import presentation.theme.MyAppTheme
import presentation.utils.getAsyncImageLoader


@OptIn(KoinExperimentalAPI::class, ExperimentalCoilApi::class)
@Composable
@Preview
fun App() {
    MyAppTheme {
        KoinContext {
            setSingletonImageLoaderFactory {
                getAsyncImageLoader(context = it)
            }
            NavHost(
                navController = rememberNavController(),
                startDestination = "cardList"
            ) {
                composable(
                    route = "cardList"
                ) {
                    val viewModel = koinViewModel<CardsListViewModel>()
                    CardListScreen(
                        modifier = Modifier.fillMaxSize(),
                        viewModel = viewModel
                    )
                }
            }
        }
    }
}
