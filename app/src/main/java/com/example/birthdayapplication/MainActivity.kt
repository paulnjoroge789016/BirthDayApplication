package com.example.birthdayapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdayapplication.ui.theme.BirthDayApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthDayApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthDayGreetingsWithImage("Paul")
                }
            }
        }
    }
}

@Composable
fun BirthDayGreetingsWithImage(name: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
    ) {

//        Image(painter = painterResource(id = R.drawable.birthday_image), contentDescription = "")

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Hello Paul",
                    fontSize = 20.sp
                )
                Text(
                    text = "Explore your favorite movies",
                    fontSize = 15.sp
                )

            }
            Image(modifier = Modifier.size(64.dp).clip(CircleShape), painter = painterResource(id = R.drawable.birthday_image), contentDescription = "")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthDayApplicationTheme {
        BirthDayGreetingsWithImage("Android")
    }
}