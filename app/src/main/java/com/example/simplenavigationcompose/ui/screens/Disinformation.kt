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
fun DisinformationScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToDisinformation2: (Int, Boolean) -> Unit,
    navigateToDisinformation3: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("DISINFORMATION AND FAKE NEWS", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Fake news is news or stories which are on the internet which are not true", fontSize = 20.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Fake news is everywhere and children especially are very vulnerable to believing this news. \n" +
                "\n" +
                "The first thing to explain to your child is that not everything that they read online is true", fontSize = 20.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))
        Text("There are two types of fake news:\n" +
                "\n" +
                "1. Fake news that is deliberately published to make people believe untrue things.\n" +
                "\n" +
                "2.News and stories that may be partly true but some of the information might be exaggerated or untrue.",fontSize=20.sp,textAlign=TextAlign.Left)

        Spacer(modifier = Modifier.height(20.dp))

        DefaultButton(
            text = "How to avoid and spot fake news",
            onClick = { navigateToDisinformation2(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Trustable news outlets",
            onClick = { navigateToDisinformation3(1,true)}
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
        Spacer(modifier = Modifier.height(10.dp))

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
            DisinformationScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToDisinformation2 = { _, _ -> },
                navigateToDisinformation3 = { _, _ -> },

                )
        }
    }
}