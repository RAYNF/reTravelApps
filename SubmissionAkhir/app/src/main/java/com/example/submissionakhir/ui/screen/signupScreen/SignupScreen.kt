package com.example.submissionakhir.ui.screen.signupScreen

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.components.ButtonApp
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun SignupScreen(modifier: Modifier = Modifier,navigateToLoginPage: () -> Unit) {
    var email by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var nomer by remember { mutableStateOf("") }
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
                text = "Sign Up",
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.main_text_color),
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                fontFamily = AppTypography.poppinsFontFamily,
            )
            Spacer(modifier = Modifier.height(90.dp))
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
                value = nama,
                onValueChange = { newInput -> nama = newInput },
                label = {
                    androidx.compose.material.Text(
                        text = "Masukan Nama Anda"
                    )
                })
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(328.dp),
                value = nomer,
                onValueChange = { newInput -> nomer = newInput },
                label = {
                    androidx.compose.material.Text(
                        text = "Masukan Nomer Anda"
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
            Spacer(modifier = Modifier.height(40.dp))
            ButtonApp(text = "Login", onClick = { })
            Spacer(modifier = Modifier.height(60.dp))
            Row(modifier = Modifier) {
                Text(
                    text = "Sudah punya akun?",
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.main_text_color),
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    fontFamily = AppTypography.poppinsFontFamily,
                    modifier = Modifier.padding(top = 12.dp)
                )
                TextButton(onClick = navigateToLoginPage) {
                    Text(
                        text = "Login",
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        fontFamily = AppTypography.poppinsFontFamily
                    )

                }
            }
        }
    }
}


