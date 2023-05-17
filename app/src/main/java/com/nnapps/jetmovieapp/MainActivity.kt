package com.nnapps.jetmovieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.nnapps.jetmovieapp.navigation.MovieNavigation
import com.nnapps.jetmovieapp.ui.theme.JetMovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    JetMovieAppTheme(darkTheme = false) {
        content()
    }
}
