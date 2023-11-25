package com.example.simplenavigationcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme
import com.example.simplenavigationcompose.ui.theme.darkest_blue
import kotlin.system.exitProcess


@Composable
fun VerifyScreen(
    navigateToHome: () -> Unit,
) {
    MaterialTheme {
        Column {
            Spacer(modifier = Modifier.height(400.dp))


            val openDialog = remember { mutableStateOf(false)  }
            Button(onClick = {
                openDialog.value = true
            }) {
                Text("    Welcome to Hellosafe!    ",fontSize = 30.sp)
            }

            if (openDialog.value) {
                AlertDialog(
                    onDismissRequest = {
                        // Dismiss the dialog when the user clicks outside the dialog or on the back
                        // button. If you want to disable that functionality, simply use an empty
                        // onCloseRequest.
                        openDialog.value = true;

                    },
                    title = {
                        Text(text = "            Age verification required",textAlign = TextAlign.Right)
                    },
                    text = {
                        Text("Due to the covering of some sensitive issues within this app, we need to verify that you are over 18.", textAlign = TextAlign.Center)
                    },
                    confirmButton = {
                        Button(
                            onClick = navigateToHome,
                            )
                        {
                            openDialog.value = true;
                            Text("I am over 18     ",textAlign = TextAlign.Center);
                        }
                    },


                    dismissButton = {
                        Button(
                            onClick = {
                                openDialog.value = false;
                                exitProcess(-1)
                            }) {
                            Text("    I am under 18",textAlign = TextAlign.Center,)
                        }
                    }
                )
            }
        }

    }
}




@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SimpleNavComposeAppTheme(useSystemUiController = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = darkest_blue
        ) {
            VerifyScreen (
                navigateToHome = {},
            )
        }
    }
}