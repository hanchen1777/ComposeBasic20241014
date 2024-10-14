package com.example.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "楊涵真",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var count =  remember { mutableStateOf(0) }
    Column {
        Row {
            Button(
                modifier = modifier,
                onClick = {
                    count.value=0
                }
            ) {
                Text("歸零")
                Image(
                    painter = painterResource(id = R.drawable.mango),
                    contentDescription = "芒果",
                    modifier = modifier.size(50.dp)
                )
            }
            Button(
                modifier = modifier,
                onClick = {
                    count.value *=2
                }
            ) {
            Text("兩倍")
                Image(
                painterResource(id = R.drawable.mmmango),
                contentDescription = "mamgo照片",
                modifier = Modifier.size(20.dp)

            Text(
                text = stringResource(R.string.author),
                color = Color.Gray,
                fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.www),
                modifier = modifier
            )
                Image(
                    painter = painterResource(id = R.drawable.mmmango),
                    contentDescription = "mmmango照片",
                    modifier = modifier.size(50.dp)
                )
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            var count = remember { mutableStateOf(0) }
            Text(
                text = count.value.toString(),
                fontSize = 50.sp,
                modifier = Modifier.clickable { count.value += 1 })
        }



        @Composable
        fun Greeting(name : String,modifier: Modifier = Modifier) {
            var count = remember { mutableStateOf(0) }
            Column {
                Button(
                    onClick = { count.value },
                    colors = buttonColors(Color.Gray),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, Color.Blue),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 10.dp,
                        pressedElevation = 15.dp,
                        disabledElevation = 0.dp
                    )
                ) {


                }
            }
        }
        }
    }
}


