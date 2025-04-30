package com.pdmtaller2.JoseLuisMilan_00144723.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.JoseLuisMilan_00144723.ui.data.restaurants
import com.pdmtaller2.JoseLuisMilan_00144723.ui.screens.MenuScreen
import com.pdmtaller2.JoseLuisMilan_00144723.ui.screens.OrdersScreen
import com.pdmtaller2.JoseLuisMilan_00144723.ui.screens.PrincipalScreen
import com.pdmtaller2.JoseLuisMilan_00144723.ui.screens.SearchScreen


sealed class Screen(val route: String, val title: String) {
    object Home : Screen("home", "Restaurantes")
    object Search : Screen("search", "Buscar")
    object Orders : Screen("orders", "Mis Órdenes")
    object Menu : Screen("menu/{restaurantId}", "Menú") {
        fun createRoute(restaurantId: String) = "menu/$restaurantId"
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.Home.route) {

        composable(Screen.Home.route) {
            PrincipalScreen(
                restaurants = restaurants,
                onRestaurantClick = { selectedRestaurant ->
                    navController.navigate(Screen.Menu.createRoute(selectedRestaurant.id))
                },
                navController = navController
            )
        }

        composable(Screen.Menu.route) { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getString("restaurantId")
            val restaurant = restaurants.find { it.id == restaurantId }

            restaurant?.let {
                MenuScreen(
                    restaurant = it,
                    navController = navController,
                    onBack = { navController.popBackStack() }
                )
            }
        }
        composable(Screen.Search.route) {
            SearchScreen(navController = navController)
        }
        composable(Screen.Orders.route) {
            OrdersScreen(navController = navController)
        }
    }
}