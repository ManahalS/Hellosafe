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
fun TAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Violent content - what to do?",textAlign = TextAlign.Center)
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
fun Violent3Screen(
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
        TAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("What to do if your child has seen potentially upsetting violent content", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("If your child has seen potentially upsetting content, the first thing to do is check in on them. remind them that they're safe - many children could immediately think, \"this could happen to me.\" although violence does occur anywhere, reassure your kids that they are safe at the moment. younger brains interpret the world in a different way than more mature brains, so allow your child to express themselves as much as they need to because there is a lot to take in. as you respond to any questions they might have, express your support for their feelings. tell them it's acceptable to feel any feeling, including anger, shock, fear, or numbness. keep an eye on how your child is responding to the events of the week - if they consistently express fear or anxiety, speak with them once more. if you're unsure about how to help, you might also want to speak with their pediatrician, school counselor, or a mental health specialist.", fontSize = 35.sp, textAlign = TextAlign.Center)


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
            TAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Violent3Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}