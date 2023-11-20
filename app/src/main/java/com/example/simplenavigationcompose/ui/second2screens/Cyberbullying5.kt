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
fun Cyberbullying5Screen(
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
        Spacer(modifier = Modifier.height(20.dp))

        Text("how to help a cyberbullied child", fontSize = 60.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(20.dp))
        Text("These tips can be applied to children being bullied in real life too!\n" +
                "\n" +
                "One of the main things to remember when speaking to a child about cyberbullying is that communication is key. Speaking to a child about their emotions is crucial.\n" +
                "\n" +
                "1. Offer comfort and support.\n" +
                "Often, children feel isolated when they get cyberbullied. Letting them know that they are not alone in this helps more than you might think it does. Talking to your child about any experiences you have previously had with bullies may help them. Let your child know its not their fault and remind your child you're in this together. Reassure them that you'll figure out what to do.\n" +
                "\n" +
                "2. Encourage your child to not respond to the cyberbullying.\n" +
                "Doing so can just make the situation worse, and in moments of extreme hurt and anger, a child can lash out with hurtful words of their own. These can be used as 'evidence' against them by bullies in the instance that you report the bullying. For example, the bully may claim that the harsh words sent in their direction are evidence that the bullying was simply 'banter' as the two children were exchanging remarks of a similar manner. This could lead to both children, even your child, being reprimanded for impolite speech and potentially upsetting language. Remind your child that cyberbullying says so much more about the bullies than the victims, and that staying calm and polite will make the situation easier to handle.\n" +
                "\n" +
                "3. Refrain from having a parent to parent talk.\n" +
                "While it may seem that contacting the bully’s parent and setting up a time to talk can immediately stop cyberbullying  (as a lot of the time, parents are unaware of their children's actions online and this can be detrimental to others), some parents confronted with accusations that their child is engaging in cyberbullying may become defensive. They therefore will not be receptive to your thoughts as their main instinct is to protect their child over anything else. Avoid additional drama and possible retaliation where possible as this could make the situation worse for your child.\n" +
                "\n" +
                "4. Notify the school.\n" +
                "If the bullying doesn't stop, informing the child's school about what has happened is crucial. Cyberbullying can often mix in with face to face bullying at educational institutions, and this can have negative impacts on a child's performance when it comes to schoolwork and their social confidence. Tell the principal, a counselor or a teacher about the situation - as many schools and sports clubs have rules for responding to cyberbullying and can often enforce punishments or even suspend the bullies. However, before reporting the problem, let your child know that you plan to do so - this enables you to work out a plan that makes you both feel comfortable.\n" +
                "\n" +
                "5. Keep records.\n" +
                "Always keep records of the cyberbullying. Take and keep screen shots of the texts or pictures. These can be used as evidence with the bully's parents, school, or even the police in case situations get out of hand.\n" +
                "\n" +
                "6. Get your child some help.\n" +
                "No matter the severity of the situation, counselling or therapy can help a child open up about all the feelings they have potentially been hiding. Doing counselling at school (even with the bully) can help your child feel better about the situation, and outside of school therapy can help your child preserve a sense of anonymity in case they don't wish for the greater school community to find out about the situation.\n" +
                "\n" +
                "\n" +
                "Here are some ways to prevent any further cyberbullying in the future\n" +
                "\n" +
                "\n" +
                "7. Encourage your child to block the bullies, or do it for them.\n" +
                "In case the children do not make up, or the bullying persists, encourage your child to block the bullies as this can put a sense of finality to the situation or put an end to the bullying and prevent future incidents.\n" +
                "\n" +
                "8.  Limit access to technology if needed.\n" +
                "If the situation worsens to the point where grades have dropped and eating or sleeping habits have been altered, consider limiting your child's access to technology. Although it can be hurtful, many bullied children cannot resist the desire to check websites or apps for new messages. Keep the child's computer in a public area of the house and limit the usage of cellphones and video games. If this seems to extreme, you may be able to disable apps and other services during specific hours by setting screen time limits.\n" +
                "\n" +
                "9. Put rules in writing and give rewards.\n" +
                "Especially for younger children, enforcing rules can be difficult. Therefore, consider writing smartphone and social media contracts for your kids that you're willing to enforce. Make sticker charts for daily mobile usage and for every day ignoring the bullies, add a sticker. At the end of a successful week, consider giving your child a reward.\n" +
                "\n" +
                "10. Consider monitoring your child's online presence and social media usage.\n" +
                "Another alternative to limiting screen time usage is using parental control tools that can allow you to monitor your children's communications and online activities - but be careful with these as if your child finds out, they may see it as an infringement of their privacy and find ways to circumvent these. If this seems too invasive, follow your child on social media. This allows you to monitor activity and see who your child is friends with without actively going into your child's social media accounts. More significantly, you may verify that your child's account is private and that their profiles do not reveal personal information. While you won't know if your child is receiving malicious messages privately, you will be able to observe how others are interacting with your child online", fontSize = 35.sp, textAlign = TextAlign.Center)


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
            Cyberbullying5Screen(
                id = 1,
                showDetails = true,
                popBackStack = {},
                popUpToHome = {}
            )
        }
    }
}