package com.example.simplenavigationcompose.ui.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.theme.lightest


@Composable
fun AIconButton(
    text: String,
    onClick: () -> Unit
) {
    Spacer(modifier = Modifier.height(5.dp))
    Button(
        onClick = onClick,
        modifier = Modifier.size(width = 350.dp, height = 80.dp)) {
        Spacer(modifier = Modifier.width(20.dp))
        Text(text, fontSize = 20.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.width(30.dp))

        Icon(
            Icons.Filled.Face,
            contentDescription = "Search",
            tint = lightest,
            modifier = Modifier.size(50.dp)
        )

    }
}
