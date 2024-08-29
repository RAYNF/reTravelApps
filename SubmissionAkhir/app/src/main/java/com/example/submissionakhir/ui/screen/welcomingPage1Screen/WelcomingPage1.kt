package com.example.submissionakhir.ui.screen.welcomingPage1Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.screen.welcomingPage2Screen.WelcomingPage2
import com.example.submissionakhir.ui.utils.AppTypography
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun WelcomingPage1(modifier: Modifier = Modifier,navigateToOnboardingPage: () -> Unit) {
    val pagerState = rememberPagerState()

    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(count = 2, state = pagerState, modifier = modifier.fillMaxSize()) { page ->
            when (page) {
                0 -> WelcomingContent()
                1 -> WelcomingPage2(navigateToOnboardingPage = navigateToOnboardingPage)
            }
            HorizontalPagerIndicator(
                pagerState = pagerState,
                activeColor = colorResource(id = R.color.tema_aplikasi),
                inactiveColor = colorResource(id = R.color.secondary),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 60.dp)
            )
        }
    }
}

@Composable
fun WelcomingContent(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background_welcomingpage1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Jelajahi Area",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 38.sp,
                fontFamily = AppTypography.poppinsFontFamily
            )
            Text(
                text = "Wisata Sekitar",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 38.sp,
                fontFamily = AppTypography.poppinsFontFamily
            )
            Spacer(modifier = modifier.height(10.dp))
            Text(
                text = "Temukan destinasi impianmu dan",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                fontFamily = AppTypography.poppinsFontFamily
            )
            Text(
                text = "mulailah perjalanan baru bersama",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                fontFamily = AppTypography.poppinsFontFamily
            )
            Text(
                text = "kami",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                fontFamily = AppTypography.poppinsFontFamily,
                modifier = Modifier.padding(bottom = 105.dp)
            )
        }
    }
}