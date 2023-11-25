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
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme
@Composable
fun tAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Digital footprint importance",textAlign = TextAlign.Center)
            },
            backgroundColor =  MaterialTheme.colors.primarySurface,
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
fun Footprint2Screen(
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
        tAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("The importance of a digital footprint", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))
        Text("A digital footprint is permanent and when their data goes public, it is very hard to control how the data is used and who sees it. Your data is visible to: advertisers, internet providers, employers, hackers, and the people around you/ your peers.  \n", fontSize = 20.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))
        Text("Oversharing of your information online, can make you vulnerable to hackers. They can steal your identity, and access your accounts, such as bank accounts and email accounts which are confidential and very important. ",fontSize=20.sp,textAlign=TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))
        Text("Stores etc. use your online activity and search history to give you targeted advertisements. They use behavioural targeting to show items and other things that they know you will like. This can sometimes encourage a habit of online spending and shopping. \n",fontSize=20.sp,textAlign=TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))
        Text("As future employers can also see your digital footprint online it is very important to be careful of what you post, like etc. Employers might be able to judge you based on your online activity, meaning that sometimes they might make the decision to not hire you. ",fontSize=20.sp,textAlign=TextAlign.Center)


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
            tAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Footprint2Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}