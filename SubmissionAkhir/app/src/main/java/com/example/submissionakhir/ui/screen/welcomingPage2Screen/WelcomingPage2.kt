package com.example.submissionakhir.ui.screen.welcomingPage2Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.components.ComponenWelcomingPage2

@Composable
fun WelcomingPage2(modifier: Modifier = Modifier,navigateToOnboardingPage: () -> Unit) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background_welcomingpage2),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 95.dp),
            contentAlignment = Alignment.BottomCenter // Mengatur agar konten berada di tengah
        ) {
            // Memanggil ComponentWelcomingPage2 di tengah layar
            ComponenWelcomingPage2(onClick = navigateToOnboardingPage)
        }
    }
}