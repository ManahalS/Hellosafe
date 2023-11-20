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
fun FilterScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToFilter2: (Int, Boolean) -> Unit,
    navigateToFilter3: (Int, Boolean) -> Unit,
    navigateToFilter4: (Int, Boolean) -> Unit,
    navigateToFilter5: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("Setting content filters", fontSize = 60.sp)

        Spacer(modifier = Modifier.height(5.dp))
        Text( "Content filters limit access to age inappropriate content. Usage controls constrain the usage of devices such as placing time-limits or forbidding certain types of usage. Software can be downloaded on a child's device to perform a range of different functions. Monitoring (usually a software or app) can track location and activity when a child is using a device. Many types of app combine all of these aspects into all-encompassing content filters and trackers", fontSize = 35.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))

        DefaultButton(
            text = "Client-side filtration",
            onClick = { navigateToFilter2(1,true)}
        )

        Spacer(modifier = Modifier.height(10.dp))


        DefaultButton(
            text = "Search engine filtration",
            onClick = { navigateToFilter3(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "ISP-level filtration and server-side filtration",
            onClick = { navigateToFilter4(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Pre-prepared search engines for children",
            onClick = { navigateToFilter5(1,true)}
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
            FilterScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToFilter2 = { _, _ -> },
                navigateToFilter3 = { _, _ -> },
                navigateToFilter4 = { _, _ -> },
                navigateToFilter5 = { _, _ -> },

                )
        }
    }
}