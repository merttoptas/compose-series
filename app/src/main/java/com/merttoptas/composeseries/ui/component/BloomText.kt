package com.merttoptas.composeseries.ui.component

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun BloomText(
    modifier: Modifier,
    text: String,
    color: Color = MaterialTheme.colors.secondaryVariant,
    fontSize: TextUnit = TextUnit.Unspecified,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    style: TextStyle = MaterialTheme.typography.subtitle2,
    lineHeight: TextUnit = TextUnit.Unspecified,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Text(
        text = AnnotatedString(text),
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        letterSpacing = letterSpacing,
        textAlign = textAlign,
        style = style,
        lineHeight = lineHeight,
        maxLines = maxLines,
        overflow = overflow
    )
}

@Preview
@Composable
private fun BodyPreview() {
    BloomText(Modifier, "Bloom Text")
}