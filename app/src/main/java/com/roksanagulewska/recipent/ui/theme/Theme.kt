package com.roksanagulewska.recipent.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    //TODO
    background = Black,

    primary = Orange900,
    onPrimary = White,
    primaryContainer = Orange600,
    onPrimaryContainer = Orange1000,

    secondary = Purple600,
    onSecondary = White,
    secondaryContainer = Purple300,
    onSecondaryContainer = Purple1000,

    surface = Grey500,
    onSurface = Black,
    surfaceVariant = Grey400,
    onSurfaceVariant = Grey700,

    error = Red,
    onError = White,
    errorContainer = LightRed,
    onErrorContainer = DarkRed,

    outline = Grey700,
    outlineVariant = Grey500

)

private val LightColorScheme = lightColorScheme(
    background = White,

    primary = Orange900,
    onPrimary = White,
    primaryContainer = Orange600,
    onPrimaryContainer = Orange1000,

    secondary = Purple600,
    onSecondary = White,
    secondaryContainer = Purple300,
    onSecondaryContainer = Purple1000,

    surface = White,
    onSurface = Black,
    surfaceVariant = Grey400,
    onSurfaceVariant = Grey700,

    error = Red,
    onError = White,
    errorContainer = LightRed,
    onErrorContainer = DarkRed,

    outline = Grey700,
    outlineVariant = Grey500

)

@Composable
fun RecipentTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}