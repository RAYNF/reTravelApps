package com.example.submissionakhir.ui.screen.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissionakhir.R
import com.example.submissionakhir.ui.components.CategoryItem
import com.example.submissionakhir.ui.components.MenuItem
import com.example.submissionakhir.ui.model.Menu
import com.example.submissionakhir.ui.model.dummyCategory
import com.example.submissionakhir.ui.model.dummyMenu
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun HomeScreen(navigateToDetail: (Long) -> Unit,modifier: Modifier = Modifier) {
    var searchBar by remember { mutableStateOf("") }

    Column(modifier = Modifier.background(color = colorResource(id = R.color.primary))) {
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = colorResource(id = R.color.tema_aplikasi),
            shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp)
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Spacer(modifier = Modifier.height(20.dp))
                ProfileHomeScreen()
                Spacer(modifier = Modifier.height(4.dp))
                SearchBar(
                    query = "", onQueryChange = {}, modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                CategoryRaw()
                Spacer(modifier = Modifier.height(31.dp))

            }
        }
        Surface(modifier = Modifier.fillMaxSize(), color = colorResource(id = R.color.primary)) {
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Popular Destination",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    fontFamily = AppTypography.poppinsFontFamily,
                    color = colorResource(id = R.color.main_text_color)
                )
                Spacer(modifier = Modifier.height(16.dp))
                MenuColumn(lisMenu = dummyMenu, navigateToDetail = {menuId->
                    navigateToDetail(menuId)
                })
            }
        }
    }
}


@Composable
fun ProfileHomeScreen() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.image_profil),
                contentDescription = "foto profil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .align(Alignment.Top)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(modifier = Modifier) {
                Text(
                    text = "Selamat Pagi",
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.primary),
                    fontSize = 18.sp,
                    fontFamily = AppTypography.poppinsFontFamily
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Rayhan Noor F.",
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.primary),
                    fontSize = 14.sp,
                    fontFamily = AppTypography.poppinsFontFamily
                )
            }
        }

        IconButton(onClick = {}, modifier = Modifier) {
            Icon(Icons.Default.MoreVert, contentDescription = null, tint = Color.White)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(query: String, onQueryChange: (String) -> Unit, modifier: Modifier) {
    androidx.compose.material3.SearchBar(
        query = query,
        onQueryChange = { onQueryChange },
        onSearch = {},
        active = false,
        onActiveChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        placeholder = {
            Text(
                text = "Car rekomendasi tempat wisata",
                fontSize = 14.sp,
                fontFamily = AppTypography.poppinsFontFamily,
                fontWeight = FontWeight.Medium
            )
        },
        shape = MaterialTheme.shapes.small,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 45.dp)
    ) {

    }
}

@Composable
fun CategoryRaw(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .background(colorResource(id = R.color.primary))
            .padding(8.dp)
    ) {
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(dummyCategory, key = { it.textCategory }) { category ->
                CategoryItem(category = category)
            }
        }
    }
}

@Composable
fun MenuColumn(
    lisMenu: List<Menu>,
    modifier: Modifier = Modifier,
    navigateToDetail: (Long) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),

        ) {
        items(lisMenu, key = { it.id }) { menu ->
            MenuItem(menu = menu, modifier = Modifier.clickable {
                navigateToDetail(menu.id)
            })
        }
    }
}



