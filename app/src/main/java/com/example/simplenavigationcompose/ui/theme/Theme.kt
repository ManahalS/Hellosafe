package com.example.simplenavigationcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = blue,
    primaryVariant = darkest_blue,
    secondary = black,
    onBackground = darkest_blue
)

private val LightColorPalette = lightColors(
    primary = blue,
    primaryVariant = darkest_blue,
    secondary = lightest,
    onBackground = darkest_blue,
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
    darkTheme: Boolean = isSystemInDarkTheme(),
    useSystemUiController: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    if (useSystemUiController) {
        val systemUiController = rememberSystemUiController()
        systemUiController.setStatusBarColor(
            color = colors.primaryVariant
        )
        systemUiController.setNavigationBarColor(
            color = colors.primaryVariant
        )
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}


