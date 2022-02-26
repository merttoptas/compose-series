package com.merttoptas.composeseries

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import com.merttoptas.composeseries.ui.screen.HomeScreen
import com.merttoptas.composeseries.ui.screen.WelcomeScreen
import com.merttoptas.composeseries.ui.theme.ComposeSeriesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSeriesTheme {
                Surface(color = MaterialTheme.colors.background) {
                    WelcomeScreen()
                    //HomeScreen()
                }
            }
        }
    }
}
