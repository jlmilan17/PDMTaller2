package com.pdmtaller2.JoseLuisMilan_00144723

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdmtaller2.JoseLuisMilan_00144723.ui.navigation.AppNavigation
import com.pdmtaller2.JoseLuisMilan_00144723.ui.theme.FoodSpotByJLMilanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByJLMilanTheme {
                AppNavigation()
            }
        }
    }
}

