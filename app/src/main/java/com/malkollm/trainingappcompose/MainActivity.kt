package com.malkollm.trainingappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.malkollm.trainingappcompose.components.statistics.TrainingCardDay
import com.malkollm.trainingappcompose.components.statistics.TrainingChartPushUp
import com.malkollm.trainingappcompose.components.statistics.TrainingStatistic
import com.malkollm.trainingappcompose.ui.theme.TrainingAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarChartScreen()
        }
    }
}

@Composable
fun App() {
    val trainingCounts = listOf(50, 57, 60, 75, 80)

    Column(modifier = Modifier.fillMaxSize()) {
        TrainingChartPushUp(trainingCounts)
        TrainingStatistic(trainingCounts)
        TrainingCardDay(trainingCounts)
    }
}

@Composable
fun BarChartScreen() {
    val navController = rememberNavController()
    val bottomItems = listOf("list", "search", "push")

    Scaffold(
        bottomBar =
        {
            BottomNavigation {
                bottomItems.forEach { screen ->
                    BottomNavigationItem(
                        selected = false,
                        onClick = { navController.navigate(screen) },
                        label = { Text(screen) },
                        icon = {})
                }
            }
        }
    ) {
        NavHost(navController = navController, startDestination = "list") {
            composable("list") { ListScreen(navController) }
            composable("search") { SearchScreen() }
            composable("push") { PushScreen() }
            composable("Details") {
                navController.previousBackStackEntry?.arguments?.getParcelable<Word>("WORD_KEY")
                    ?.let {
                        DetailsScreen(it)
                    }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TrainingAppComposeTheme {
        App()
    }
}