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
fun PeerScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToPeer2: (Int, Boolean) -> Unit,
    navigateToPeer3: (Int, Boolean) -> Unit,
    navigateToPeer4: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("Peer Pressure", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Peer pressure is when you \"feel like you have to do something because people around you want you to or expect you to.\" {Childline).  \n" +
                "\n" +
                "If your child expresses that they are being influenced by the people around them into doing things that they may not want to do, it is helpful to have a conversation with them and to explain what peer pressure is. \n" +
                "\n" +
                "Teenagers and tweens are especially vulnerable to peer pressure as they think that it will make them \"more popular\" or fit in more. Make sure to explain to your child that they should be their true and aithentic self and shouldn't have to change to fit in. \n" +
                "\n" +
                " ", fontSize = 35.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))

        DefaultButton(
            text = "Examples of giving in to peer pressure online",
            onClick = { navigateToPeer2(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Keeping your child safe from peer pressure",
            onClick = { navigateToPeer3(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BigButton(
            text = "Prevent your child from succumbing to peer pressure",
            onClick = { navigateToPeer4(1,true)}
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
            PeerScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToPeer2 = { _, _ -> },
                navigateToPeer3 = { _, _ -> },
                navigateToPeer4 = { _, _ -> },
                )
        }
    }
}