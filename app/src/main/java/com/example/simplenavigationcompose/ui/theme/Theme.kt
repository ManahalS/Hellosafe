package com.example.simplenavigationcompose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController



private val LightColorPalette = lightColors(
    primary = third_lightest,
    primaryVariant = darkest_blue,
    secondary = lightest,
    background = darkest_blue,
    surface = darkest_blue
    /* Other default colors to override

    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun SimpleNavComposeAppTheme(
    useSystemUiController: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = {
        LightColorPalette
    }

    if (useSystemUiController) {
        val systemUiController = rememberSystemUiController()
        systemUiController.setStatusBarColor(
            color = lightest
        )
        systemUiController.setNavigationBarColor(
            color = next_lightest
        )
    }

    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}



