package com.example.submissionakhir.ui.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splashScreen")
    object WelcomingPage1 : Screen("welcomingPage1")
    object OnBoardingScreen : Screen("onboardingScreen")
    object LoginScreen : Screen("loginScreen")
    object SignupScreen : Screen("signupScreen")
    object HomeScreen : Screen("homeScreen")
    object RiwayatScreen : Screen("riwayatScreen")
    object ProfilScreen : Screen("profilScreen")
    object DetailScreen : Screen("detailScreen/{menuId}") {
        fun createRoute(menuId: Long) = "detailScreen/$menuId"
    }
}