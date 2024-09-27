package com.example.submissionakhir.ui.screen.detailScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
import com.example.submissionakhir.ui.model.dummyMenu
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun DetailScreen(menuId: Long, modifier: Modifier = Modifier) {
    val menu = dummyMenu.find { it.id == menuId }
    println("DetailScreen loaded with menuId: $menuId")
    menu?.let {
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(id = it.image),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(240.dp)
                    .fillMaxWidth()
            )
            DetailLocation(location = it.location, title = it.title)
            Spacer(modifier = Modifier.height(16.dp))
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "General Information",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    fontFamily = AppTypography.poppinsFontFamily,
                    color = colorResource(id = R.color.main_text_color)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = it.deskripsi,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Justify,
                    fontFamily = AppTypography.poppinsFontFamily,
                    color = colorResource(id = R.color.main_text_color)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                ButtonApp(text = "Book", onClick = {})
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun DetailLocation(modifier: Modifier = Modifier, location: String, title: String) {
    Box(
        Modifier
            .fillMaxWidth()
            .shadow(elevation = 10.dp, shape = RoundedCornerShape(8.dp), clip = false)
            .background(colorResource(id = R.color.tema_aplikasi))
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.main_text_color),
                fontSize = 18.sp,
                fontFamily = AppTypography.poppinsFontFamily
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Icon(Icons.Default.LocationOn, contentDescription = null)
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = location, fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.main_text_color),
                    fontSize = 14.sp,
                    fontFamily = AppTypography.poppinsFontFamily
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(menuId = 1)

}