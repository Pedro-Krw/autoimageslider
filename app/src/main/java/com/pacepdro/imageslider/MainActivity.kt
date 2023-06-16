package com.pacepdro.imageslider

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.ExperimentalPagerApi
import com.pacepdro.imageslider.ui.theme.ImageSliderTheme
import com.pacepdro.imageslider.view.ViewPagerSlider

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageSliderTheme {
                // A surface container using the 'background' color from the theme
                ViewPagerSlider()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImageSliderTheme {
        ViewPagerSlider()
    }
}