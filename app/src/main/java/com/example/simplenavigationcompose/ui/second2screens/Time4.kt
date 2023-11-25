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
fun oAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Monitor screen time",textAlign = TextAlign.Center)
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
fun Time4Screen(
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

        oAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("How can I monitor my child's screen time?", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("On most phones, there is a built-in screen time limiter that allows you to monitor and reduce your child's screen time. It can easily be accessed by going to Settings. You can usually control a number of features including time allowed on different apps, time allowed on the phone overall, and weekly time allowed on a phone. if you don't want to limit your child's screen time, you can also see statistics for how much time your child has spent on different apps and their overall times, as well as suggestions for how to reduce screen time. If you don't want to use the built - in app for whatever reason, there are many apps available on the Play Store or App Store.",fontSize=20.sp,textAlign=TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("On laptops, there is a different procedure. On Apple devices, go to Settings and then Screen Time to find your child's screen time. On Windows devices, add your child to your family by going to start then settings. Choose Accounts > Family & other people. You will have two options. To add people to your family, click on the (+) plus icon and input the Outlook account of the users you wish to add. You can view all family members on the list below. To manage family settings online, go to the Family & other people tab and select \"Manage family settings online.\" Click on Screen Time and set a schedule for all Windows devices. Go to \"PC screen time limits\" and block children's desktop access for 30 minutes to 12 hours. Approve requests and set specific days for screen time restrictions.",fontSize=20.sp,textAlign=TextAlign.Center)



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
            oAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Time4Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}

