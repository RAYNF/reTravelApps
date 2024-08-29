package com.example.submissionakhir.ui.screen.onboardingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.submissionakhir.ui.navigation.Screen
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier,navigateToLoginPage: () -> Unit,navigateToSignupPage: () -> Unit) {
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
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Selamat Datang di Aplikasi ",
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.main_text_color),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                fontFamily = AppTypography.poppinsFontFamily,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "ReTravel ",
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.main_text_color),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                fontFamily = AppTypography.poppinsFontFamily,
            )
            Spacer(modifier = Modifier.height(210.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_app),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(103.dp)
                    .width(289.dp)
            )
            Spacer(modifier = Modifier.height(144.dp))
            ButtonApp(text = "Login", onClick = {navigateToLoginPage()})
            Spacer(Modifier.height(38.dp))
            ButtonApp(text = "SignUp", onClick = {navigateToSignupPage()})

        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ScreenOnBoardingScreenPreview(){
//    OnBoardingScreen()
//}
