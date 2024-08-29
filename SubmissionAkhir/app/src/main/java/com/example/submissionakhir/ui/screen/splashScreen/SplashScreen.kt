package com.example.submissionakhir.ui.screen.splashScreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.submissionakhir.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(modifier: Modifier = Modifier,navigateToWelcomingPage: () -> Unit) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.logo_app),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(103.dp)
                .width(289.dp)
                .align(Alignment.Center)
        )
    }
    LaunchedEffect(Unit) {
        delay(4000L)
        navigateToWelcomingPage()
    }
}

