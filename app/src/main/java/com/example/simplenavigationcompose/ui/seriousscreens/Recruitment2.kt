package com.example.simplenavigationcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme
import com.example.simplenavigationcompose.ui.theme.next_lightest

@Composable
fun PAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("How does extremism spread",textAlign = TextAlign.Center)
            },
            backgroundColor =  next_lightest,
            navigationIcon = {
                IconButton(onClick = popBackStack) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = popUpToHome) {
                    Icon(Icons.Filled.Home, null)
                }
            })

    }
}
@Composable
fun Recruitment2Screen(
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
        PAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("How can an individual be exposed to extremist or terrorist ideologies", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("Terrorist organizations often face challenges due to the illegal nature of their content and membership. Encryption can provide high levels of secrecy, but it limits outreach to recruits and sympathizers. Access to extremist materials online can be widespread, but digital files leave traces on individuals' devices, making downloading certain materials potentially lead to detection and prosecution. As a result, terrorist groups have shown adaptability and flexibility in their use of online services and platforms. A common strategy to overcome restrictions is using entry points on mainstream sites to guide interested individuals to other digital locations, such as encrypted services or dedicated websites. \n" +
                "\n" +
                "It's not only terrorist groups that operate online, however - the Internet plays an integral role in the generation, consumption and spread of extremist propaganda too. Whether it be by social media (posts with the aim to sway the minds of the readers one way or another) or people online chatting with others or leaving comments aimed to incite arguments and spread the propaganda, extremist views can be found all over the internet. This can have negative effects on young, easily swayable minds that can assume extremist ideologies without even knowing the full possible effects of their dangerous beliefs. ", fontSize = 35.sp, textAlign = TextAlign.Center)


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
            PAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Recruitment2Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}