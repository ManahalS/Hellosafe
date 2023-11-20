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
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

@Composable
fun SearchScreen(
    query: String?,
    popBackStack: () -> Unit,
    popUpToHome: () -> Unit,
    navigateToFriendships2: (Int, Boolean) -> Unit,
    navigateToFriendships3: (Int, Boolean) -> Unit,

    ) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))

        Text("Online friendships and relationships", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("In today's world, staying in touch with friends both old and new is super easy, due to messaging apps and social medias which can connect people across the globe. This is fantastic, and an extremely useful tool for humanity to possess. A side effect of this means that you can connect with people you've never met before, through apps like Snapchat that have a 'quick add' feature to add people you have mutual friends with - or none at all! \n" +
                "\n" +
                "As you can engage with stranger's content, such as commenting on a TikToker's video, this enables room to talk, 'follow' or 'add' a stranger. Although this can seem very innocent, such as if someone comments 'I love this! Where is that coat from?' on a video and the creator replies 'Thank you so much, if you add me I can show you! My username is: []' they can therefore talk freely. Due to the anonymity being online provides, people feel like they can get away with more, such as racially charged comments during the World Cup. This also enables pedophiles to more easily groom children as they can anonymously talk to them with ease, and face less consequences as it is harder to track them down. \n" +
                "\n" +
                "Many creators or 'fandoms' (the fanbase of a certain thing, such as popular horror franchise Five Nights at Freddy's) have Discord servers where fans can converse and share their opinions and love for whatever they are a fan of. These often have moderators, who can be volunteers from the community, yet it is very difficult to prevent people from adding each other and talk outside of moderated chats on direct messaging channels. The app allowing this, like Snapchat or Discord, do not read chats as this would be virtually impossible for them to do, and unless an authority figure demands it, cannot be accessed outside of whoever is on these chats. This means it is very easy to talk to, call, and possibly meet up with strangers. Although this can be completely harmless and just be two kids befriending eachother which everyone does, the only difference between it happens online, this can also be sinister as it is very easy to fake your age and pretend to be a kid, then luring a child to meet an adult, or groom them by sending sexually explicit messages and blackmail them into not saying anything. This happens far too often, and I myself know of people who have positive and negative experiences with strangers online. It is very common to talk to people you do not know, such as in game chats and online forums, but usually these conversations are brief, only sometimes leading to chats being moved to other platforms where they can more freely talk.  \n" +
                "\n" +
                "It is important to note not everyone on the internet is out to harm your child, and there are other children like your child who want to make friends, and find it easier to do this online. Many online friendships are real, safe and strong, connecting over thousands of kilometres away, but it is very tricky to know if your child is in an online friendship vs a real-life friendship, where if anything happens you can contact the school, or parents, of said child. \n" +
                "\n" +
                " ", fontSize = 35.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(20.dp))

        BigButton(
            text = "How to prevent dangerous online friendships from forming",
            onClick = { navigateToFriendships2(1,true)}
        )
        Spacer(modifier = Modifier.height(10.dp))

        BigButton(
            text = "What to do if your child is chatting to a stranger",
            onClick = { navigateToFriendships3(1,true)}
        )
        Spacer(modifier = Modifier.height(15.dp))

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
            SearchScreen(
                query = "hellosafe",
                popBackStack = {},
                popUpToHome = {},
                navigateToFriendships2 = { _, _ -> },
                navigateToFriendships3 = { _, _ -> },

                )
        }
    }
}