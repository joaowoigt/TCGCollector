package presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primaryVariant = Black,
    secondary = OffWhite,
    background = Blue,
    onBackground = Black
)

private val LightColorPalette = darkColors(
    primaryVariant = Black,
    secondary = OffWhite,
    background = Blue,
    onBackground = Black
)

@Composable
fun MyAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = DarkColorPalette.takeIf { darkTheme } ?: LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}