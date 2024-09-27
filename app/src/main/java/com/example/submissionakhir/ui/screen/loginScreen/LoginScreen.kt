package com.example.submissionakhir.ui.screen.loginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.components.ButtonApp
import com.example.submissionakhir.ui.utils.AppTypography


@Composable
fun LoginScreen(modifier: Modifier = Modifier,navigateToSignupnPage: ()-> Unit,navigateToHomePage: () -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background_gradasi),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                text = "Login",
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.main_text_color),
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                fontFamily = AppTypography.poppinsFontFamily,
            )
            Spacer(modifier = Modifier.height(102.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(328.dp),
                value = email,
                onValueChange = { newInput -> email = newInput },
                label = {
                    androidx.compose.material.Text(
                        text = "Masukan Email Anda"
                    )
                })
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(328.dp),
                value = password,
                onValueChange = { newInput -> password = newInput },
                label = {
                    androidx.compose.material.Text(
                        text = "Masukan Password Anda"
                    )
                })
            Spacer(modifier = Modifier.height(80.dp))
            ButtonApp(text = "Login", onClick = { navigateToHomePage()})
            Spacer(modifier = Modifier.height(60.dp))
            Row(modifier = Modifier) {
                Text(
                    text = "Belum punya akun?",
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.main_text_color),
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    fontFamily = AppTypography.poppinsFontFamily,
                    modifier = Modifier.padding(top = 12.dp)
                )
                TextButton(onClick = { navigateToSignupnPage() }) {
                    Text(
                        text = "Sign Up",
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        fontFamily = AppTypography.poppinsFontFamily
                    )

                }
            }
        }
    }
}
