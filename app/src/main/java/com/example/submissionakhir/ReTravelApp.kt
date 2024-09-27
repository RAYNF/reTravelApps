package com.example.submissionakhir

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.submissionakhir.ui.model.NavigationItem
import com.example.submissionakhir.ui.navigation.Screen
import com.example.submissionakhir.ui.screen.detailScreen.DetailScreen
import com.example.submissionakhir.ui.screen.homeScreen.HomeScreen
import com.example.submissionakhir.ui.screen.loginScreen.LoginScreen
import com.example.submissionakhir.ui.screen.onboardingScreen.OnBoardingScreen
import com.example.submissionakhir.ui.screen.profilScreen.ProfilScreen
import com.example.submissionakhir.ui.screen.riwayatScreen.RiwayatScreen
import com.example.submissionakhir.ui.screen.signupScreen.SignupScreen
import com.example.submissionakhir.ui.screen.splashScreen.SplashScreen
import com.example.submissionakhir.ui.screen.welcomingPage1Screen.WelcomingPage1
import com.example.submissionakhir.ui.utils.AppTypography

@Composable
fun ReTravelApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute == Screen.HomeScreen.route) {
                BottomBar(navController = navHostController)
            } else if (currentRoute == Screen.RiwayatScreen.route) {
                BottomBar(navController = navHostController)
            } else if (currentRoute == Screen.ProfilScreen.route) {
                BottomBar(navController = navHostController)
            }
        },
        topBar = {
            if (currentRoute == Screen.RiwayatScreen.route) {
                TopBar()
            }
            if (currentRoute == Screen.DetailScreen.route) {
                TopBarDetailScreen(onBackClick = { navHostController.navigateUp() })
            }
        },

        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navHostController,
            startDestination = Screen.SplashScreen.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.SplashScreen.route) {
                SplashScreen(navigateToWelcomingPage = {
                    navHostController.navigate(Screen.WelcomingPage1.route)
                })
            }
            composable(Screen.WelcomingPage1.route) {
                WelcomingPage1(navigateToOnboardingPage = {
                    navHostController.navigate(Screen.OnBoardingScreen.route)
                })
            }
            composable(Screen.OnBoardingScreen.route) {
                OnBoardingScreen(
                    navigateToLoginPage = { navHostController.navigate(Screen.LoginScreen.route) },
                    navigateToSignupPage = { navHostController.navigate(Screen.SignupScreen.route) })
            }
            composable(Screen.LoginScreen.route) {
                LoginScreen(
                    navigateToSignupnPage = { navHostController.navigate(Screen.SignupScreen.route) },
                    navigateToHomePage = { navHostController.navigate(Screen.HomeScreen.route) })
            }
            composable(Screen.SignupScreen.route) {
                SignupScreen(navigateToLoginPage = { navHostController.navigate(Screen.LoginScreen.route) })
            }
            composable(Screen.HomeScreen.route) {
                HomeScreen(navigateToDetail = { menuId ->
                    println("Navigating to detail with menuId: $menuId")
                    navHostController.navigate(
                        Screen.DetailScreen.createRoute(
                            menuId
                        )
                    )
                })
            }
            composable(Screen.RiwayatScreen.route) {
                RiwayatScreen()
            }
            composable(Screen.ProfilScreen.route) {
                ProfilScreen()
            }
            composable(
                Screen.DetailScreen.route,
                arguments = listOf(navArgument("menuId") { type = NavType.LongType })
            ) {
                val menuId = it.arguments?.getLong("menuId") ?: null
                println("Navigating to detail with menuId: $menuId")
                if (menuId != null) {
                    DetailScreen(menuId = menuId)
                } else {
                    println("error")
                }
            }
        }


    }

}

@Composable
private fun BottomBar(navController: NavController, modifier: Modifier = Modifier) {
    NavigationBar(modifier = modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavigationItem(title = "Home", icon = Icons.Default.Home, screen = Screen.HomeScreen),
            NavigationItem(
                title = "Riwayat",
                icon = Icons.Default.ShoppingCart,
                screen = Screen.RiwayatScreen
            ),
            NavigationItem(
                title = "Profil",
                icon = Icons.Default.AccountCircle,
                screen = Screen.ProfilScreen
            )
        )

        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Riwayat", fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                fontFamily = AppTypography.poppinsFontFamily,
                color = colorResource(id = R.color.primary)
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(id = R.color.tema_aplikasi))
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBarDetailScreen(onBackClick: () -> Unit) {
    TopAppBar(navigationIcon = {
        IconButton(onClick = { onBackClick() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "back")
        }
    }, actions = {
        IconButton(onClick = { }) {
            Icon(Icons.Default.Favorite, contentDescription = "save")

        }
    },
        title = {},
        colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(id = R.color.tema_aplikasi))
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}
