package com.example.birthdayapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(400.dp)) {

        Image(painter = painterResource(id = R.drawable.birthday_image), contentDescription = "")
        Text(
            text = "Happy Birthday $name!",
            fontSize = 30.sp
        )

        TODO("Add another text that states who sent the birthday greetings")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthDayApplicationTheme {
        BirthDayGreetingsWithImage("Android")
    }
}