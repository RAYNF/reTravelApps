package com.example.submissionakhir.ui.screen.detailScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.ui.model.dummyMenu
import com.example.submissionakhir.ui.navigation.Screen

@Composable
fun DetailScreen(menuId:Long){
    val menu = dummyMenu.find { it.id == menuId }
    println("DetailScreen loaded with menuId: $menuId")
    menu?.let {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = it.title, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text(text = it.deskripsi)
        }
    }
}