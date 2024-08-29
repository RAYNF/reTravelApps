package com.example.submissionakhir.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun ComponenWelcomingPage2(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .width(328.dp)
            .height(227.dp)
            .background(
                color = colorResource(id = R.color.container).copy(alpha = 0.9f),
                shape = RoundedCornerShape(8.dp),
            )
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Ayo Bergabung",
                fontSize = 24.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = AppTypography.poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 26.dp)
            )
            Text(
                text = "Temukan Rekomendasi Wisata Alam, Kuliner, Paket Wisata Impianmu",
                fontSize = 14.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = AppTypography.poppinsFontFamily,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
            )
            Spacer(Modifier.height(10.dp))
            ButtonApp(text = "Mulai", onClick = onClick)
        }
    }
}