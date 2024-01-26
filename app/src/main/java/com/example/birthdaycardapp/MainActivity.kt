package com.example.birthdaycardapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycardapp.ui.theme.BirthdayCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("HDB GOLF", from = "From Kwan" )
                    GreetImage()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String , m: Modifier = Modifier) {
    Column(
        //verticalArrangement = Arrangement.Center
        modifier = m
    ){
        Text(
            text = name,
            fontSize = 100.sp ,
            lineHeight = 80.sp ,
            //textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp)
        )
        Text(
            text = from,
            fontSize = 30.sp ,
            lineHeight = 50.sp ,
            modifier = Modifier
                .align(alignment = Alignment.End)
                .padding(16.dp)
        )
    }
}
@Composable
fun GreetImage(){
    Box(
        contentAlignment = Alignment.Center    )
    {
        Image(
            painter = painterResource(id = R.drawable.androidparty),
            contentDescription = null
        )
        Greeting("HDB GOLF", from = "From Kwan")
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BirthdayCardAppTheme {
        GreetImage()
        //Greeting("HDB GOLF", from = "From Kwan" )
    }
}
//Sutham Hengsuwan
//445868