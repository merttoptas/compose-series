package com.merttoptas.composeseries.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Pink100,
    secondary = Pink900,
    background = Color.White,
    onSurface = Gray900,
    onPrimary = Gray900
)

private val LightColorPalette = lightColors(
    primary = Pink100,
    secondary = Pink900,
    background = Color.White,
    onSurface = Gray900,
    onPrimary = Gray900
)

@Composable
fun ComposeSeriesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}