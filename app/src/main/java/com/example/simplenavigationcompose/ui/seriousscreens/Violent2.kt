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
fun SAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("Prevent children from seeing violent content",textAlign = TextAlign.Center)
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
fun Violent2Screen(
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
        SAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("How to prevent your children from seeing violent content", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("One way to prevent your child from seeing violent content is via installing content filters that prevent your child from accessing anything that's upsetting or inappropriate. check out our page on content filters to find out how.\n" +
                "\n" +
                "However, with some apps, it may not always be possible to download content filters that can filter out inappropriate content. one way is to download the child - friendly version of that app - for example, YouTube kids or Netflix kids. in most cases though, it's important to be aware of the shows and games your children watch and play. especially in the case of younger children, make sure to watch what your children are watching - know what they're viewing and discuss it with them. where possible, for younger children, keep televisions and devices out of your children's bedrooms as it diminished your ability to monitor them in there. be especially careful of viewing just before bedtime as motion-invoking images may linger and intrude into sleep. describe the effects of exposure to violence. what parent hasn't heard the justification \"but there's no blood\" when their child wants to watch a movie or play a video game? emphasize the real costs of violence and highlight how improbable it is for someone to get away with acting violently. pay attention to the time. don't expose them to virtual violence for too long. their exposure to violent material has a higher impact and influence the longer they are exposed to it.\n" +
                "\n" +
                "Children from two to four frequently witness cartoon violence. however, keep kids away from anything that uses physical force to resolve disputes since they will emulate what they see.\n" +
                "\n" +
                "Cartoon rough-and-tumble and fantasy violence are ok for children aged 5 to 7, but violence that could cause death or serious injury is too frightful.\n" +
                "\n" +
                "Action-hero sword combat or gunplay is ok for children aged between the ages of 8 and 10 as long as there is no blood.\n" +
                "\n" +
                "Historical action, such as battles, fantasy conflicts, and duels, is acceptable for 11 to 12-year-olds. close-ups of blood or graphic violence, whether they are shown separately or in conjunction with sexual settings or racial stereotypes, are not advised.\n" +
                "\n" +
                "\n" +
                "\n", fontSize = 35.sp, textAlign = TextAlign.Center)


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
            SAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Violent2Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}