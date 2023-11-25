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
import com.example.simplenavigationcompose.ui.common.BiggestButton
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

@Composable
fun RecruitmentScreen(
    id: Int,
    showDetails: Boolean,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToRecruitment2: (Int, Boolean) -> Unit,
    navigateToRecruitment3: (Int, Boolean) -> Unit,
    navigateToRecruitment4: (Int, Boolean) -> Unit,



    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("Recruitment by extremist and terrorist groups", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("Online radicalization is defined  as a process in which individuals are exposed to, copy, and absorb extremist beliefs and attitudes via the Internet, particularly social media and other kinds of online communication. Such  individuals are considered as being more likely to commit transgressions that may take the form of violence, causing harm and death to many, as in violent acts of terrorism.", fontSize = 20.sp, textAlign = TextAlign.Center)

        BigButton(
            text = "How can an individual be exposed to extremist or terrorist ideologies",
            onClick = { navigateToRecruitment2(1,true)}
        )

        BiggestButton(
            text = "What to do if your child has had their beliefs changed by an extremist or terrorist organisation",
            onClick = { navigateToRecruitment3(1,true)}
        )

        BigButton(
            text = "How can you stop the spread of extremist ideologies",
            onClick = { navigateToRecruitment4(1,true)}
        )

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
            RecruitmentScreen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {},
                navigateToRecruitment2 = { _, _ -> },
                navigateToRecruitment3 = { _, _ -> },
                navigateToRecruitment4 = { _, _ -> },
                )
        }
    }
}