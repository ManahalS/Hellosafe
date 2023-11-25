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
fun IAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Online spending",textAlign = TextAlign.Center)
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
fun SpendingScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToSpending2: (Int, Boolean) -> Unit,
    navigateToSpending3: (Int, Boolean) -> Unit,
    navigateToSpending4: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        IAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("ONLINE SPENDING", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Online spending is spending real money on either digital or physical items, such as buying clothes online that you can physically possess, or buying ingame currencies like V-Bucks (Fortnite) which have no physical counterpart. Almost everyone has bought something online before, especially when this is more convenient than going to the shops, as the range of things you can buy is almost endless and it is all available at a mere search and click of the 'buy' button. For busy adults, or anyone really, this is a very useful thing, as it means you can buy anything you need with ease without having to go yourself, and have it arrive at your door. The issue arises when children gain access to this. There are many cases of children accidentally spending their parents' credit cards because they do not understand the concept of real life money vs in game currency, and it is all too easy for children to be able to do this. Most games, such as Genshin Impact pictured below, are marketed towards children yet almost always have in-game purchases available. If the child's device has a card linked, then it is very easy for them to simply buy whatever they want without realising consequences.", fontSize = 20.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(20.dp))

        DefaultButton(
            text = "Statistics",
            onClick = {navigateToSpending2(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BigButton(
            text = "How can I tell when my child is spending my money online?",
            onClick = { navigateToSpending3(1,true)}
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
            IAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            SpendingScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToSpending2 = { _, _ -> },
                navigateToSpending3 = { _, _ -> },
                navigateToSpending4 = {_, _ -> },

                )
        }
    }
}