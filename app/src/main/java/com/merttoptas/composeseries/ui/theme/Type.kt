package com.merttoptas.composeseries.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.merttoptas.composeseries.R

val Poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.W500),
    Font(R.font.poppins_semi_bold, FontWeight.W600)
)

val Typography = Typography(
    h3 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W600,
        fontSize = 32.sp
    ),
    h4 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
    ),
    h5 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W600,
        fontSize = 22.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W600,
        fontSize = 18.sp,
    ),
    subtitle2 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
    ),
    body1 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
    ),
    overline = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 10.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.W500,
        fontSize = 18.sp,
    )
)