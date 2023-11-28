package com.example.simplenavigationcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.common.AIconButton
import com.example.simplenavigationcompose.ui.common.BIconButton
import com.example.simplenavigationcompose.ui.common.CIconButton
import com.example.simplenavigationcompose.ui.common.DIconButton
import com.example.simplenavigationcompose.ui.common.EIconButton
import com.example.simplenavigationcompose.ui.common.FIconButton
import com.example.simplenavigationcompose.ui.common.GIconButton
import com.example.simplenavigationcompose.ui.common.HIconButton
import com.example.simplenavigationcompose.ui.common.HyperlinkText
import com.example.simplenavigationcompose.ui.common.IIconButton
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme
import com.example.simplenavigationcompose.ui.theme.darkest_blue

@Composable
fun HomeScreen(
    navigateToProfile: (Int, Boolean) -> Unit,
    navigateToSearch: (String) -> Unit,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToFind: () -> Unit,

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

        AIconButton(
            text = "Cyberbullying",
            onClick = { navigateToProfile(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BIconButton(
            text = "Online Friendships",
            onClick = { navigateToSearch("hellosafe")}
        )
        Spacer(modifier = Modifier.height(10.dp))

        CIconButton(
            text = "Disinformation",
            onClick = {navigateToDisinformation(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        DIconButton(
            text = "Content filters",
            onClick = {navigateToFilter(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        EIconButton(
            text = "Digital Footprint",
            onClick = {navigateToFootprint(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        FIconButton(
            text = "Peer Pressure",
            onClick = { navigateToPeer(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        GIconButton(
            text = "Serious Issues",
            onClick = { navigateToSerious(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))


        HIconButton(
            text = "Online Spending",
            onClick = {navigateToSpending(1,true)}

        )

        Spacer(modifier = Modifier.height(10.dp))

        IIconButton(
            text = "Screen Time",
            onClick = {navigateToTime(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BIconButton(
            text = "Search",
            onClick = {navigateToFind()}
        )


        Spacer(modifier = Modifier.height(25.dp))


        HyperlinkText(
            fullText =
            " If you have any queries, Childline is available 24/7 at: 0800 1111.  For urgent matters, please contact the authorities.",
            hyperLinks = mutableMapOf(
                "Childline" to "https://www.childline.org.uk/",
                "0800 1111" to "tel://08001111",
            ),

            textStyle = TextStyle(
                textAlign = TextAlign.Center,
                color = Color.Black
            ),
            linkTextColor = Color.Blue,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(15.dp))



    }
}



@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SimpleNavComposeAppTheme(useSystemUiController = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = darkest_blue,
        ) {
            HomeScreen(
                navigateToProfile = { _, _ -> },
                navigateToSearch = {},
                navigateToFind = {},
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