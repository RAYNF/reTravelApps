package com.example.submissionakhir.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.model.Menu
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun MenuItem(menu: Menu, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .height(195.dp)
            .width(156.dp), shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(contentColor = colorResource(id = R.color.secondary))
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = menu.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(122.dp)
            )
            Column(modifier = Modifier.padding(vertical = 5.dp)) {
                Text(
                    text = menu.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    fontFamily = AppTypography.poppinsFontFamily,
                    color = colorResource(id = R.color.main_text_color)
                )
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = menu.location, maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    fontFamily = AppTypography.poppinsFontFamily,
                    color = colorResource(id = R.color.main_text_color)
                )
                
            }
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun MenuPreview() {
//    MenuItem(
//        menu = Menu(
//            R.drawable.image_lokasi_bromo,
//            title = "Gunung Bromo",
//            location = "Probolinggo"
//        )
//    )
//}