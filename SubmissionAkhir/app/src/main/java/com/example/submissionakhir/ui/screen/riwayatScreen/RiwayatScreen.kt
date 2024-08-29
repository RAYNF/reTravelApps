package com.example.submissionakhir.ui.screen.riwayatScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.navigation.Screen
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun RiwayatScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Coming Soon", fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            fontFamily = AppTypography.poppinsFontFamily,
            color = colorResource(id = R.color.main_text_color)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RiwayatScreenPreview() {
    RiwayatScreen()
}
