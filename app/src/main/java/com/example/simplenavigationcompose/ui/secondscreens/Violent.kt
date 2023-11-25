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
fun JAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Cyberbullying - homepage",textAlign = TextAlign.Center)
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
fun ViolentScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToViolent2: (Int, Boolean) -> Unit,
    navigateToViolent3: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        JAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("Violent content", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("Wherever children and young people can view or share content, there is a risk that they will see something distressing or worrying.\n" +
                "\n" +
                "Many apps and sites have moderators in place to help remove content, however some don’t.\n", fontSize = 20.sp, textAlign = TextAlign.Center)

        DefaultButton(
            text = "How to prevent your children from seeing violent content",
            onClick = { navigateToViolent2(1,true)}
        )

        BigButton(
            text = "What to do if your child has seen potentially upsetting violent content",
            onClick = { navigateToViolent3(1,true)}
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
            JAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            ViolentScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToViolent2 = { _, _ -> },
                navigateToViolent3 = { _, _ -> },
                )
        }
    }
}