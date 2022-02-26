package com.merttoptas.composeseries.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.merttoptas.composeseries.R
import java.util.*

@Composable
fun WelcomeScreen() {
    Surface(color = MaterialTheme.colors.primary, modifier = Modifier.fillMaxSize()) {
          Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            WelcomeBackground(modifier = Modifier)
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                WelcomeLeafImageBackground(
                    modifier = Modifier
                        .padding(top = 72.dp)
                        .offset(x = 88.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    BloomLogo()
                    BloomText(modifier = Modifier)
                    CreateAccountButton(modifier = Modifier)
                    LogInTextButton(modifier = Modifier)
                }
            }
        }

        /*
        Way two
     WelcomeBackground(modifier = Modifier)
     Column(
         modifier = Modifier.fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally,
     ) {
         WelcomeLeafImageBackground(modifier = Modifier
             .offset(x = 88.dp)
             .padding(top = 72.dp)
         )
         Spacer(modifier = Modifier.height(48.dp))
         BloomLogo()
         BloomText(modifier = Modifier)
         CreateAccountButton(modifier = Modifier)
         Spacer(modifier = Modifier.height(8.dp))
         LogInTextButton(modifier = Modifier)
     }

      */

    }
}

@Composable
fun WelcomeBackground(modifier: Modifier) {
    Image(
        modifier = modifier.fillMaxWidth(),
        painter = painterResource(id = R.drawable.ic_light_welcome_bg),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
    )
}

@Composable
fun WelcomeLeafImageBackground(modifier: Modifier) {
    Image(
        modifier = modifier
            .fillMaxWidth(),
        painter = painterResource(id = R.drawable.ic_light_welcome_illos),
        contentDescription = null,
        contentScale = ContentScale.Inside,
    )
}

@Composable
fun BloomLogo() {
    Image(
        painter = painterResource(id = R.drawable.ic_light_logo),
        contentDescription = null,
        contentScale = ContentScale.Fit,
    )
}

@Composable
fun BloomText(modifier: Modifier) {
    Text(
        modifier = modifier.paddingFromBaseline(top = 32.dp, bottom = 40.dp),
        text = "Beautiful home garden solutions",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.subtitle1
    )
}

@Composable
fun LogInTextButton(modifier: Modifier) {
    TextButton(
        onClick = {},
        modifier = modifier
            .padding(horizontal = 32.dp)
            .defaultMinSize(minHeight = 50.dp),
        content = {
            Text(text = "Log in", color = MaterialTheme.colors.secondary)
        }
    )
}

@Composable
fun CreateAccountButton(modifier: Modifier) {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.onPrimary),
    ) {
        Text(text = "Create Account", color = Color.White)
    }
}
