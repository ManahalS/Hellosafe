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
fun OAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("    Help out your child",textAlign = TextAlign.Center)
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
fun Messages2Screen(
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
        OAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("What to do if your child needs help in these situations", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("After receiving messages telling them to hurt themselves, your child might be destroyed emotionally and lash out not on others, but themselves. Here are the things to look out for in your child after receiving such messages: therapy can be extremely beneficial as it can help your child talk through any deep-set issues that have upset them. \n" +
                "\n" +
                "Remind your child that if they need help, ChildLine is always available on 0800 1111 or via the 24/7 online chat. \n" +
                "\n" +
                " \n" +
                "\n" +
                "Signs that your child might be self harming include: \n" +
                "\n" +
                "-Unexplained wounds, burns, bite marks, bruises, or bald patches \n" +
                "\n" +
                "-Wearing long sleeves or pants even in hot weather \n" +
                "\n" +
                "-Refusing to change clothing in front of others, or avoiding activities such as swimming \n" +
                "\n" +
                "-Bloody tissues in garbage bins retreating from friends and family \n" +
                "\n" +
                "-Blaming oneself for difficulties, or expressing sentiments of failure, uselessness, or hopelessness \n" +
                "\n" +
                "-Outbursts of rage or argumentation \n" +
                "\n" +
                "Remember that self harm is not limited to cutting. It can include: \n" +
                "\n" +
                "-Cutting themselves \n" +
                "\n" +
                "-Scratching skin with fingernails \n" +
                "\n" +
                "-Burning skin \n" +
                "\n" +
                "-Biting skin \n" +
                "\n" +
                "-Hitting themselves, or banging their head or another part of their body on a wall \n" +
                "\n" +
                "-Pulling hair out from their head, eyebrows or eyelashes \n" +
                "\n" +
                "I-nserting objects into their body \n" +
                "\n" +
                "Your child may be experiencing suicidal thoughts if they: \n" +
                "\n" +
                "-Express sentiments of worthlessness, hopelessness, sadness, remorse, and shame \n" +
                "\n" +
                "-Spend a lot of time alone, not wanting to be around people, or not visiting friends \n" +
                "\n" +
                "-Lose interest in daily life or activities that they normally enjoy \n" +
                "\n" +
                "-Use phrases such as \"i wish I wasn't here\" , \"i can't go on\" , \"i can't take it anymore\" , and \"people would be better off without me\" \n" +
                "\n" +
                "-Give away their stuff \n" +
                "\n" +
                "-Appear anxious and/or behave in unusual or out-of-character ways \n" +
                "\n" +
                "-Exhibit changes such as eating or sleeping more or less than normal, or a lack of interest in their appearance \n" +
                "\n" +
                "-Turn to drugs or alcohol to help them deal with complex emotions, which can amplify their thoughts, feelings, and impulsive decisions. \n" +
                "\n" +
                "If you think your child is suicidal, talk through it with a professional. Papyrus (prevention of young suicide) can help parents who are worried that their children are suicidal. You can contact them via their hopeline by phone to speak to an advisor online. If you don't think your child is at immediate risk, speak to your gp or doctor as soon as you can. They can provide information or advice and discuss the options around treatment or support with you. They may also refer your child for an assessment by a mental health specialist. \n" +
                "\n" +
                "Advice in case of emergency situations \n" +
                "\n" +
                "If the situation is not life threatening, call your local NHS helpline (only available for England) or 111 for urgent advice. \n" +
                "\n" +
                "If you don't feel like your child is safe or if they are at risk of making a suicide attempt, call the emergency services or take them to accident & emergency. \n" +
                "\n" +
                "If your child has made a suicide attempt, call the police and/or ambulance straight away. In the case of the UK, this is 999. You may need to call the emergency services if there is a risk of other people being hurt. \n" +
                "\n" +
                " ", fontSize = 35.sp, textAlign = TextAlign.Center)


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
            OAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Messages2Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}