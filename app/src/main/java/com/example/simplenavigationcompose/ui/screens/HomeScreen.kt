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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

@Composable
fun HomeScreen(
    navigateToProfile: (Int, Boolean) -> Unit,
    navigateToSearch: (String) -> Unit,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,

    navigateToDisinformation: (Int, Boolean) -> Unit,
    navigateToFilter: (Int, Boolean) -> Unit,
    navigateToFootprint: (Int, Boolean) -> Unit,
    navigateToPeer: (Int, Boolean) -> Unit,
    navigateToSerious: (Int, Boolean) -> Unit,
    navigateToSpending: (Int, Boolean) -> Unit,
    navigateToTime: (Int, Boolean) -> Unit,
) {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(15.dp))

        Text("How can we help you today?", fontSize = 30.sp)

        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Cyberbullying",
            onClick = { navigateToProfile(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Online Friendships",
            onClick = { navigateToSearch("hellosafe")}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Disinformation",
            onClick = {navigateToDisinformation(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Content filters",
            onClick = {navigateToFilter(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Digital Footprint",
            onClick = {navigateToFootprint(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Peer Pressure",
            onClick = { navigateToPeer(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Serious Issues",
            onClick = { navigateToSerious(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))


        DefaultButton(
            text = "Online Spending",
            onClick = {navigateToSpending(1,true)}

        )

        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Screen Time",
            onClick = {navigateToTime(1,true)}
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
            HomeScreen(
                navigateToProfile = { _, _ -> },
                navigateToSearch = {},
                popBackStack = {},
                popUpToHome = {},
                navigateToDisinformation = { _, _ -> },
                navigateToFilter = { _, _ -> },
                navigateToFootprint = { _, _ -> },
                navigateToPeer = { _, _ -> },
                navigateToSerious = { _, _ -> },
                navigateToSpending = { _, _ -> },
                navigateToTime = { _, _ -> }
            )
        }
    }
}