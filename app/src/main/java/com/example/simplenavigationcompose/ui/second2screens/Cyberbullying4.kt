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
fun Cyberbullying4Screen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("How to confront a child you may suspect is being cyberbullied", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("1. Keep devices in communal areas.\n" +
                "While it is important to not come across as a helicopter parent, overly anxious and suspicious about what your child is doing on their mobile device, keeping all your family's devices in a communal area can help. Try to communicate with other members of your household as well so it can seem like a joint effort. This means that without being pushy or spying, you can check in on your child while they are online, and also look for signs that your child may be involved in cyberbullying.\n" +
                "\n" +
                "2. Come across as concerned, not angry.\n" +
                "Rather than coming across as a frustrated parent eager to get this conversation over with, talk to your child gently. Bring up the conversation gently, at a time when they seem more unburdened. Ask them what they know about cyberbullying, and what the possible consequences of cyberbullying are. If they don't mention anything about their own situation, keep going gently, mentioning that you've been worried about them recently. If they still refuse to cooperate, don't push it as this will make your child trust you less. Simply distract their attention and try another time.\n" +
                "\n" +
                "3. Communication is key.\n" +
                "Once your child opens up about the bullying, engage your child in conversation about what is going on in a calm manner. Refrain from freaking out, and take the time to learn exactly what happened, as well as the context in which it occurred. Don't try to play devil's advocate and don’t try to downplay the situation,", fontSize =20.sp, textAlign = TextAlign.Center)


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
            Cyberbullying5Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}