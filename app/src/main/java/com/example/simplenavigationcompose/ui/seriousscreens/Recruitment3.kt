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
fun QAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("   What to do about extremism",textAlign = TextAlign.Center)
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
fun Recruitment3Screen(
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
        QAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("What to do if your child has had their beliefs changed by an extremist or terrorist organisation", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("There are four main stages of radicalization;\n" +
                "\n" +
                "Stage 1 - low risk\n" +
                "Low risk behaviors involve holding strong opinions, criticizing government policies, adopting visible signs to express identity, being active on social media, taking an interest in national and international affairs, supporting causes like animal rights, showing new interest in political ideology or religion, and holding conservative values or practices, (unless they cause harm to a child or others, such as female genital mutilation)\n" +
                "\n" +
                "If you think your child is at low risk, think about informally discussing changes in behavior, allowing debate on controversial issues in a safe space, and providing online safety information.\n" +
                "\n" +
                "Stage 2 - at risk\n" +
                "At risk behavior involves engaging in conspiracy theories, isolating from family and friends, viewing inappropriate online content, having uncontrolled internet access, expressing concerns about victimization, discriminating against others, experiencing a sudden change in behavior, showing interest in extremists, and expressing views that divide us, such as discussing 'us' and 'them'.\n" +
                "\n" +
                "If you think your child is at risk, first ask yourself if you have enough information to make a comprehensive assessment - is this an isolated incident; are there any contextual factors. After this, have a chat similar to the one recommended for children at low risk, and then note down the behavior of the child and talk about it to another trusted adult e.g. the child's other carer or parent.\n" +
                "\n" +
                "Stage 3 - medium risk\n" +
                "Medium risk behavior involves committing acts of violence to defend ideology or cause, accessing extremist websites, expressing dehumanizing views, traveling to conflict zones, being in contact with groups supporting violent extremist ideologies, persistent intolerance towards perceived 'others', demonstrating a fixation on weaponry or explosives, and obsessing with mass violence without targeting a specific group. This behavior can be based on protected characteristics like gender, religion, or ethnicity, and may involve posing in concerning photographs or videos with weaponry without reasonable explanation.\n" +
                "\n" +
                "If you think your child is at medium risk, first ask yourself if you have enough information to make a comprehensive assessment - is this an isolated incident; are there any contextual factors; is the child likely to harm others or be at harm. If your child  is suffering from or is at risk of harm including vulnerability to radicalization, you should act immediately and tell a counsellor, trusted teacher or even the police. Consider talking to your child about or recruiting your child to Channel, a multi-agency partnership that supports people identified as at risk of being drawn into terrorism. Think about getting your child some help from a mental health professional.\n" +
                "\n" +
                "Stage 4 - high risk\n" +
                "High-risk criminal behavior includes attacking someone based on race, religion, or sexuality, committing violent acts guided by extremist ideologies or groups, participating in proscribed violent extremist groups, having a detailed plan for mass violence, producing or sharing terrorist material, and recruiting others to a proscribed terrorist group or organization.\n" +
                "\n" +
                "Tell the police immediately if you think your child is about to put themselves or others in immediate danger, or appears to be involved in planning to carry out a criminal offence", fontSize = 35.sp, textAlign = TextAlign.Center)


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
            QAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Recruitment3Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}