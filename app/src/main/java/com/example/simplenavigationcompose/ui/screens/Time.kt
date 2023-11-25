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
fun HAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Screen time",textAlign = TextAlign.Center)
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
fun TimeScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToTime2: (Int, Boolean) -> Unit,
    navigateToTime3: (Int, Boolean) -> Unit,
    navigateToTime4: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        HAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("SCREEN TIME", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        Text("What is screen time?", fontSize = 25.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Screen time is a term used for activities done in front of a screen, such as watching TV, working on a computer, or playing video games", fontSize = 20.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))

        DefaultButton(
            text = "The danger of high screen times",
            onClick = { navigateToTime2(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DefaultButton(
            text = "How can I reduce my child's screen time",
            onClick = { navigateToTime3(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BigButton(
            text = "How can I monitor my child's screen time",
            onClick = { navigateToTime4(1,true)}
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
            HAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            TimeScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToTime2 = { _, _ -> },
                navigateToTime3 = { _, _ -> },
                navigateToTime4 = { _, _ -> },
            )
        }
    }
}