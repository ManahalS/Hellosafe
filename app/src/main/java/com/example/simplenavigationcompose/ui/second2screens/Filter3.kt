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
fun eAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Search engine filtration",textAlign = TextAlign.Center)
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
fun Filter3Screen(
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

        eAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("Search engine filtration", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("Search engine filtration allows you to control user activities without the need for any VPNs or client-side software. When these filters are enabled, search engines will only return results that are in line with what you want. Inappropriate content that has not been explicitly restricted by you but is deemed harmful by the filter organization may also be blocked. However, it is important to remember that this is not the same as URL filtration - if your child already knows the URL of a website that is not specifically blocked may still be able to access it without having to use a search engine. \n" +
                "\n" +
                "Browser extensions/web portals like Funamo, MM Guardian and Securly work using search engine filtration, which whittles down someone's search options to whatever the manager allows them to see. They attach to a browser and block any content via firewalls and mass block lists, ie blocking anything that is registered as sexual content, or games. ", fontSize = 20.sp, textAlign = TextAlign.Center)


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
            eAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Filter3Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}