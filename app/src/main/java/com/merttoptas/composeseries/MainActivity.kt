package com.merttoptas.composeseries

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.merttoptas.composeseries.ui.theme.ComposeSeriesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSeriesTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Text(
            text = "Hello $name!",
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.secondary
        )
        // Use merge style
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "This is merge style text",
            color = MaterialTheme.colors.primary,
            style = MaterialTheme.typography.subtitle1.merge(
                TextStyle(
                    fontFamily = FontFamily(
                        Font(resId = R.font.poppins_semi_bold)
                    )
                )
            ),
        )

        //Use shape
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /*TODO*/ },
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primaryVariant),
            content = {
                Text(text = "Simple Button")
            }
        )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSeriesTheme {
        Greeting("Android")
    }
}