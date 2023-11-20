package com.example.simplenavigationcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

@Composable
fun FootprintScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToFootprint2: (Int, Boolean) -> Unit,
    navigateToFootprint3: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("Digital Footprint", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Digital footprint is the data that an individual creates through their online activities. There are two types of digital footprints: \n" +
                "\n" +
                "Active digital footprints: Data that someone leaves behind purposely and is aware that they are posting online. For example, a social media post on Instagram \n" +
                "\n" +
                "Passive digital footprints: This is data that a person leaves behind on the internet unintentionally. Such as search history an online purchases. This data is collected without consent. \n" +
                "\n" +
                " ", fontSize = 35.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(20.dp))

        DefaultButton(
            text = "The importance of a digital footprint",
            onClick = { navigateToFootprint2(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "How to reduce your digital footprint ",
            onClick = { navigateToFootprint3(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BackButton(
            text = "Back",
            onClick = popBackStack
        )
        HomeButton(
            text = "Home",
            onClick = popUpToHome
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SimpleNavComposeAppTheme(useSystemUiController = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            FootprintScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToFootprint2 = { _, _ -> },
                navigateToFootprint3 = { _, _ -> },

                )
        }
    }
}