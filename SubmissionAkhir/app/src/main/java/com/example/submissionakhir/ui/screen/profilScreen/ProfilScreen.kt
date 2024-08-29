package com.example.submissionakhir.ui.screen.profilScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.components.DetailProfil
import com.example.submissionakhir.ui.components.Title
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun ProfilScreen() {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Spacer(modifier = Modifier.height(49.dp))
        HeaderProfileScreen()
        Spacer(modifier = Modifier.height(12.dp))
        Title(judul = "Profile Setting")
        Spacer(modifier = Modifier.height(20.dp))
        DetailProfil(isi = "Password")
        Spacer(modifier = Modifier.height(17.dp))
        DetailProfil(isi = "Username")
        Spacer(modifier = Modifier.height(17.dp))
        DetailProfil(isi = "Poins")
        Spacer(modifier = Modifier.height(17.dp))
        Title(judul = "General Setting")
        Spacer(modifier = Modifier.height(20.dp))
        DetailProfil(isi = "About App")
        Spacer(modifier = Modifier.height(17.dp))
        DetailProfil(isi = "Terms")
        Spacer(modifier = Modifier.height(17.dp))
        DetailProfil(isi = "Privacy Policy")
    }
}

@Composable
fun HeaderProfileScreen() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.image_profil),
            contentDescription = "foto profil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = "Dinusian", fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.main_text_color),
            fontSize = 18.sp,
            fontFamily = AppTypography.poppinsFontFamily
        )
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = "Dinusian@gmail.com", fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.main_text_color),
            fontSize = 14.sp,
            fontFamily = AppTypography.poppinsFontFamily
        )

    }
}

@Preview(showBackground = true)
@Composable
fun ProfilScreenPreview() {
    ProfilScreen()
}