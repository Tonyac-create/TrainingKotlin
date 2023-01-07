package com.example.entrainementkotlin.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.entrainementkotlin.R

val marioFont = FontFamily(Font(R.font.mario))
val philoFont = FontFamily(
    Font(R.font.philosopher_regular),
    Font(R.font.philosopher_bold, weight = FontWeight.Bold),
    Font(R.font.philosopher_italic, style = FontStyle.Italic),
    Font(R.font.philosopher_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = philoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        color = LIGHT_RED,
        fontFamily = marioFont,
        fontSize = 26.sp,
        letterSpacing = 0.1.em
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)