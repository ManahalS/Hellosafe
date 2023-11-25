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
fun aAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("  Spot signs of cyberbullying",textAlign = TextAlign.Center)
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
fun Cyberbullying3Screen(
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

        aAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text("How to spot the signs of your child being cyberbullied", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("Many children that are cyberbullied don't want to tell a trusted adult (such as a parent or teacher) as they fear that their devices could be taken away from them. Therefore, it is important to look out for obvious signs that your child may be being cyberbullied. Some of the more visible signs include:\n" +
                "\n" +
                "Looking sad or being emotionally unstable after or while using a device - your child may be nervous or jumpy when getting a message, text, or email, or slam their device shut or throw it mid-use\n" +
                "\n" +
                "Being unnecessarily secretive about their digital life (i.e. Avoiding discussions about computer or phone activities)\n" +
                "\n" +
                "Spending more time than usual in their room\n" +
                "\n" +
                "Withdrawal from or lack of interest in family members, friends, and activities\n" +
                "\n" +
                "Being uneasy about going to school - your child may continuously ask you if they can skip school by staying home, or they may make calls asking to come home early during the school day\n" +
                "\n" +
                "Avoiding group gatherings, or apparently having 'busy' (or vanishing) friends\n" +
                "\n" +
                "Slipping grades and being angry at home\n" +
                "\n" +
                "Changes in mood, behavior, sleep, or appetite\n" +
                "\n" +
                "Suddenly wanting to stop using the computer or device\n" +
                "\n" +
                "\n" +
                "However, it's important to remember that not all of these are signs of cyberbullying and could be something different, or nothing at all. Just remember to keep an eye on your children and not jump to false conclusions as these may unnecessarily upset or irritate your child.", fontSize = 20.sp, textAlign = TextAlign.Center)

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
            aAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Cyberbullying3Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}