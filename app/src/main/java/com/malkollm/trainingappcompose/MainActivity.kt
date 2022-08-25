package com.malkollm.trainingappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.malkollm.trainingappcompose.training_app.presentation.navigation.NavigationGraph
import com.malkollm.trainingappcompose.ui.theme.TrainingAppComposeTheme
import com.malkollm.trainingappcompose.training_app.presentation.navigation.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TrainingAppComposeTheme {
        App()
    }
}