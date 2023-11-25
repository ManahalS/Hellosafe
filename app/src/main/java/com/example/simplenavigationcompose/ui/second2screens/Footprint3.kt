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
fun hAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Reduce your digital footprint",textAlign = TextAlign.Center)
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
fun Footprint3Screen(
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

        hAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("Reduce your digital footprint", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("You can reduce your digital footprint by: \n" +
                "\n" +
                "Searching up your own name online and see what comes up.  \n" +
                "\n" +
                "Deleting old social media accounts which you don't use or don't reflect the person that you are now \n" +
                "\n" +
                "Not oversharing on social media, as even when you delete things, there is a record somewhere out there \n" +
                "\n" +
                "Not visiting unsecure websites as they can sometimes steal your data while you are browsing. For more information on how to spot fake and unsecure websites, visit our section on disinformation and fake news \n" +
                "\n" +
                " \n" +
                "\n" +
                " ", fontSize = 20.sp, textAlign = TextAlign.Center)


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
            hAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Footprint3Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}