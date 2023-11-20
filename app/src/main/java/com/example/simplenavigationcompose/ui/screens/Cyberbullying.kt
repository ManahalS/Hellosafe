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
fun ProfileScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToCyberbullying2: (Int, Boolean) -> Unit,
    navigateToCyberbullying3: (Int, Boolean) -> Unit,
    navigateToCyberbullying4: (Int, Boolean) -> Unit,
    navigateToCyberbullying5: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("Cyberbullying", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))

        Text("Cyberbullying is repeated behavior (designed to anger, hurt, scare or shame a target) that takes place on any form of digital technology. It can take place on social media, gaming apps and messaging apps.", fontSize = 35.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))

        BigButton(
            text = "what are the most common examples of cyberbullying?",
            onClick = { navigateToCyberbullying2(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BigButton(
            text = "how to spot the signs of your child being cyberbullied",
            onClick = { navigateToCyberbullying3(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BigButton(
            text = "how to confront a child you may suspect is being cyberbullied",
            onClick = { navigateToCyberbullying4(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BigButton(
            text = "how to help a cyberbullied child",
            onClick = { navigateToCyberbullying5(1,true)}
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
            ProfileScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToCyberbullying2 = { _, _ -> },
                navigateToCyberbullying3 = { _, _ -> },
                navigateToCyberbullying4 = { _, _ -> },
                navigateToCyberbullying5 = { _, _ -> },

                )
        }
    }
}