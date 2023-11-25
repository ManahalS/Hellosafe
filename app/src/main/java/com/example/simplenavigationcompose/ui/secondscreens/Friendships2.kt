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
fun uAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("   Dangerous online friendships",textAlign = TextAlign.Center)
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
fun Friendships2Screen(
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
        uAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("How to prevent dangerous online friendships from forming", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("Very young children should not be allowed to access any sites that permit chatting, as they would not understand the consequences and dangers, and this can be managed with firewalls and softwares that allow the parent/guardian to see what sites the child is accessing, and monitor/limit their access to it. This is why most chatting apps are 13+, as this is a commonly agreed on age where children are able to understand risks, and can have more responsibility over their life. However, as an adult, it is still important to monitor their online activities to make sure they are not coming under harm. Many parental softwares permit parents to see what their child is saying, and more importantly, who too.  \n" +
                " \n" +
                "You should talk to your child and stress the importance of online privacy, and how it is very dangerous to reveal certain details like age, address, gender, full name etc. Online, even if the person asking for it seems nice, as this can easily be leaked leading to horrible consequences like threats or blackmail. It is important to allow your child to play online however, so do not restrict their access completely. Games like Roblox or Animal Jam have very limited chatting features, and strict filtering systems, to ensure multiplayer gaming which is fun for all involved. Make sure your child is aware of consequences and what to avoid, and when to terminate an online conversation. \n" +
                " \n" +
                "In today's world, being connected is a crucial aspect. If you are playing a team game, you need to be able to communicate with your team. This should be monitored by the game itself if it is a child-friendly game, and should not be a cause of grand concern. However, outside of communicating about activities, your child should not be talking about themselves outside of games and the online world as this can be dangerous and leak personal information. This is why it is important to monitor online chatting, as it is very easy to talk to people you do not know, but also because you should see what your child is saying to people they know too, to monitor bullying or other malicious activity from other children they know, or adults they do not.  ", fontSize = 20.sp, textAlign = TextAlign.Center)


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
            uAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Friendships2Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}