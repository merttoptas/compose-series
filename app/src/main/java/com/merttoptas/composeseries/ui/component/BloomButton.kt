package com.merttoptas.composeseries.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BloomButton(
    modifier: Modifier,
    onClick: () -> Unit,
    colors: ButtonColors = ButtonDefaults.outlinedButtonColors(),
    borderColor: Color,
    text: String,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp),
        enabled = enabled,
        colors = colors,
        shape = RoundedCornerShape(50),
        border = BorderStroke(
            width = 1.dp,
            color = borderColor
        ),
    ) {
        BloomText(
            modifier = Modifier,
            text = text,
            style = MaterialTheme.typography.subtitle1,
            color = Color.White
        )
    }
}
