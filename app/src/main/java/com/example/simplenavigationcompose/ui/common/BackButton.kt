package com.example.simplenavigationcompose.ui.screens



import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


private val MaterialTheme.colorScheme: Any
    get() {
        TODO("Not yet implemented")
    }

@Composable
fun BackButton(
    text: String,
    onClick: () -> Unit
) {
    Spacer(modifier = Modifier.height(5.dp))
    Button(
        onClick = onClick,
        modifier = Modifier.size(width = 70.dp, height = 70.dp)) {
        Text(text, fontSize = 15.sp)

    }
    var backgroundColor = MaterialTheme.colors
    var textColor = MaterialTheme.colors


}