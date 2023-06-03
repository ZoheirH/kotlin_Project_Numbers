package com.example.numbers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.numbers.ui.theme.NumbersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NumbersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier
        .background(Color.White),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(text = "1",color=Color.Magenta,fontSize = 30.sp)
        Text(text = "4",color=Color.Magenta,fontSize = 30.sp)
        Text(text = "7",color=Color.Magenta,fontSize = 30.sp)
    }
    Column(modifier = Modifier,

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,

    ) {
        Text(text = "2",color=Color.Magenta,fontSize = 30.sp)
        Text(text = "5",color=Color.Magenta,fontSize = 30.sp)
        Text(text = "8",color=Color.Magenta,fontSize = 30.sp)
    }
    Column(modifier = Modifier,

        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(text = "3",color=Color.Magenta,fontSize = 30.sp)
        Text(text = "6",color=Color.Magenta,fontSize = 30.sp)
        Text(text = "9",color=Color.Magenta,fontSize = 30.sp)
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NumbersTheme {
        Greeting()
    }
}