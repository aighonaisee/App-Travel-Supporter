package com.example.travelsupport.module.screen.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.travelsupport.R

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listofNavItem: List<NavItem> = listOf(
    NavItem(
        label ="Khám phá",
        icon = Icons.Default.Home,
        route =Screens.HomeScreen.name
    ),
    NavItem(
        label ="Yêu thích",
        icon = Icons.Default.Favorite,
        route =Screens.FavoriteScreen.name
    ),
    NavItem(
        label ="Ghi chú",
        icon = Icons.Default.Create,
        route =Screens.PlanScreen.name
    ),
    NavItem(
        label ="Tài khoản",
        icon = Icons.Default.AccountCircle,
        route =Screens.AccountScreen.name
    )
)