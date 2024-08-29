package com.example.submissionakhir.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun DetailProfil(isi: String,modifier: Modifier = Modifier) {
    Row (modifier = Modifier.fillMaxWidth(),Arrangement.SpaceBetween){
        Text(
            text = isi, fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.main_text_color),
            fontSize = 14.sp,
            fontFamily = AppTypography.poppinsFontFamily,
            modifier = Modifier.padding(top = 15.dp, start = 10.dp)
        )
        IconButton(onClick = {}) {
            Icon(Icons.Default.KeyboardArrowRight, contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailProfilPreview() {
DetailProfil(isi = "Password")
}