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
fun GAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("More serious issues",textAlign = TextAlign.Center)
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
fun SeriousScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToExploitation: (Int, Boolean) -> Unit,
    navigateToMessages: (Int, Boolean) -> Unit,
    navigateToRecruitment: (Int, Boolean) -> Unit,
    navigateToViolent: (Int, Boolean) -> Unit,
) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        GAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text("MORE SERIOUS ISSUES", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))

        DefaultButton(
            text = "Messages invoking self harm and suicide",
            onClick = { navigateToMessages(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Online sexual exploitation and abuse",
            onClick = { navigateToExploitation(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Violent content",
            onClick = { navigateToViolent(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "Recruitment by extremist and terrorist groups",
            onClick = { navigateToRecruitment(1,true)}
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
            GAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            SeriousScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToExploitation = { _, _ -> },
                navigateToMessages = { _, _ -> },
                navigateToRecruitment = { _, _ -> },
                navigateToViolent = { _, _ -> },
            )
        }
    }
}