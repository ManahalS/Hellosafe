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
fun Disinformation2Screen(
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

        Text("disinformation", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("If you haven't seen the story somewhere else it could be fake and made up. Other places you could look out for this news is outlets that you trust such as: the radio, tv news channels and newspapers. \n" +
                "\n" +
                "Make sure to check where the information is from, the source. If you have never heard of the website, then it could be fake. Some websites might be copycat websites and try and look like other websites with very similar URLs. The end of the URL is also important, most websites will have '.co.uk' or '.com' at the end. Fake websites could have variations on this such as 'com.co'. \n" +
                "\n" +
                "Ask yourself if the videos and pictures look normal. With editing software becoming more and more advanced it is very easy to edit images to give \"evidence\" for fake news.\n" +
                "\n" +
                "Ask yourself whether the story sounds believable.\n" +
                "\n" +
                "Talk to someone who you trust about what you've seen online and ask them about what they think. Talking about online fake news is a very easy way to debunk fake news. This can also help to form your own opinion on the news, make sure that you don't decide what you think straight away.\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "\n" +
                " ", fontSize = 35.sp, textAlign = TextAlign.Center)


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
            Disinformation2Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}