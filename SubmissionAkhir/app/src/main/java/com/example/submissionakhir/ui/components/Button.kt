package com.example.submissionakhir.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
fun ButtonApp(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    androidx.compose.material3.Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tema_aplikasi)),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .height(50.dp)
            .width(155.dp)

    ) {
        Text(
            text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = AppTypography.poppinsFontFamily,
            modifier = Modifier.align(androidx.compose.ui.Alignment.CenterVertically),

        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    MaterialTheme {
        ButtonApp(text = "Login") {

        }
    }
}