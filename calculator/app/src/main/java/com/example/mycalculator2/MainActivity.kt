package com.example.mycalculator2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycalculator2.ui.theme.MyCalculator2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculator2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    CalculatorWithButtons(modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center)
                    )
                }
            }
        }
    }
}

@Composable
fun CalculatorWithButtons(modifier: Modifier = Modifier) {
    var num1:String by remember { mutableStateOf("") }
    var num2:String by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0.0) }
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = num1, onValueChange = { newNum:String ->
            num1=newNum },
            label = { Text("Anna 1. luku")}
        )
        TextField(value = num2, onValueChange = { newNum:String ->
            num2=newNum },
            label = { Text("Anna 2. luku")}
        )
        Row() {
            Button(onClick = { result=num1.toDouble() + num2.toDouble() }) {
                Text("Summa")
            }
            Button(onClick = { result=num1.toDouble() - num2.toDouble() }) {
                Text("Vähennä")
            }
            Button(onClick = { result=num1.toDouble() * num2.toDouble() }) {
                Text("Tulo")
            }
            Button(onClick = { result=num1.toDouble() / num2.toDouble() }) {
                Text("Jakolasku")
            }
        }
        Row() {
            Text("lopputulos on")
            Text(text = ""+result)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCalculator2Theme {
        CalculatorWithButtons(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center))
    }
}