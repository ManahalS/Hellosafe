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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.common.HyperlinkText
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme
import com.example.simplenavigationcompose.ui.theme.next_lightest

@Composable
fun sAppBarSample(
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    function: () -> Unit,
){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("         Client-side filtration",textAlign = TextAlign.Center)
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
fun Filter2Screen(
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
        sAppBarSample(popBackStack =  popBackStack, popUpToHome = popUpToHome) {
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("Client side filtration", fontSize = 40.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("Client-side filtration involves downloading software onto the your child's system. This means that your child will, most likely, not be able to modify or uninstall the software (which is achieved by password-protecting the program). By restricting the things your child is allowed to do (e.g. blocking websites or applications), you can rest assured that your child will not be able to bypass its restrictions, making these filters well-suited for home usage as they are personalized and easy to manage. You can use processes such as blacklisting and content flagging to ensure your child's safety. Most software allow you to log web activity and can send you an alert in case your child attempts to visit a black-listed site and more. Some content filters even allow you to determine the amount of time your child spends on certain apps or websites, and permits you to set time limits. \n" +
                "\n" +
                "Websites such as Famisafe, Pumpic, Net Nanny and Sophos Endpoint Agent use client-side filtration in their services, which are primilarly geared towards parents, yet this filtering technique can also be used in schools. These websites have both standard and exceptional parental control features, such as geo-fencing (Pumpic), where you can set restricted areas where if your child enters them in real life you are alerted. Once you download these softwares, usually for a fee, you are able to track or restrict certain content. They provide much more control than search engine filtration as they can control many more aspects outside of browser activity, such as location and screen time. \n" +
                "\n", fontSize = 20.sp, textAlign = TextAlign.Center)


        HyperlinkText(
            fullText =
                    "Famisafe - In addition to providing standard parental control features like web filtering, app monitoring, screen time limits, and location tracking, Famisafe also comes with: driving monitoring — Monitor your child’s driving habits and get alerts in case of dangerous driving; reverse location tracking — Kids can see your location and find you in an emergency and TikTok and YouTube monitoring — See what videos your kids have been watching and receive alerts if they’re inappropriate. \n" +
                    "\n" +
                    "Pumpic - While this app is paid, it's worth every single drop of money put in. This app collects data about your phone usage. The gathered information is then displayed in your online dashboard and can be easily accessed from your phone or PC. Some of the top features include: Call history: see incoming and outgoing calls, their durations, and phone numbers of callers; text messages: view all text messages, including iMessages; location history: track your kid’s current location and view location history; photos: check out camera shots and downloaded images; browsing history: see the list of visited websites; calendar activities: reveal your child’s plans by viewing their calendar events; monitor apps: find out what your kid is up to on Skype, Kik, Facebook Messenger, Snapchat, Instagram, and WhatsApp; geo-fencing: set restricted areas on the map and get alerts when your kid enters them; and website blocking: restrict age-inappropriate websites. In case of any emergencies, you can lock and wipe your child's device remotely. \n" +
                    "\n" +
                    "Net Nanny is an older application, set up in the 90s by a citizen concerned about online safety. While it starts at \$37.72 a year, Net Nanny offers lots of parental control features to keep your child safe both online and offline. It has easy-to-use apps, great customer service, and reasonably-priced plans that are backed with a 14-day money-back guarantee. Net Nanny has all industry-standard parental control features like web and app filtering, screen time management, location tracking, and activity reports. It can only block 120+ apps on iOS devices, but it’s able to block access to any app on Android, including apps like phone and camera. It also has extra features that allow it to monitor YouTube activity (only in a browser), lock the settings menu (on Android), and protect the app from being deleted (not available on iOS). \n" +
                    "\n" +
                    "Sophos Endpoint Agent allows you to detect and clean up viruses, Trojans, worms, and spyware, as well as adware and other potentially unwanted application. This may not be a web filter per se, but allows your child to browse the web unharmed of possible malware that could harm them.",
            hyperLinks = mutableMapOf(
                "Famisafe" to "https://famisafe.wondershare.com/",
                "Pumpic" to "https://pumpic.com/",
                "Net Nanny" to "https://www.netnanny.com/",
                "Sophos Endpoint Agent" to "https://www.sophos.com/en-us/products/endpoint-antivirus?utm_source=google&utm_medium=cpc&utm_campaign=2023-uki-en-demg-gog-bra-convr-edr-search-exact&utm_term=sophos%20endpoint%20detection%20and%20response&utm_content=socialproofnone&cmp=7014w000001sYPCAA2&gad_source=1&gclid=EAIaIQobChMIucGhjcbiggMVJ4poCR3WYAKYEAAYAiAAEgJECPD_BwE&gclsrc=aw.ds"

            ),
            textStyle = TextStyle(
                textAlign = TextAlign.Center,
                color = Color.Black
            ),
            linkTextColor = Color.Blue,
            fontSize = 18.sp
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
            sAppBarSample (
                popBackStack = {},
                popUpToHome = {},
            ) {
            }
            Filter2Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}