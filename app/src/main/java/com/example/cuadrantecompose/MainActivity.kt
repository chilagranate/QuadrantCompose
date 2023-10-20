package com.example.cuadrantecompose


import android.graphics.Paint.Align
import android.os.Bundle
import android.view.Gravity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()){
        Row (modifier = modifier.weight(1f)){
            InfoCard(
                stringResource(R.string.text1),
                stringResource(R.string.subtext1),
                colorResource(R.color.one),
                modifier = modifier.weight(1f)
            )
            InfoCard(
                stringResource(R.string.text2),
                stringResource(R.string.subtext2),
                colorResource(R.color.two),
                modifier = modifier.weight(1f)
            )

        }
        Row(modifier = modifier.weight(1f)) {
            InfoCard(
                stringResource(R.string.text3),
                stringResource(R.string.subtext3),
                colorResource(R.color.three),
                modifier = modifier.weight(1f)
            )
            InfoCard(
                stringResource(R.string.text4),
                stringResource(R.string.subtext4),
                colorResource(R.color.four),
                modifier = modifier.weight(1f)
            )


        }

    }

}

@Composable
private fun InfoCard(
    tittle: String,
    description: String,
    backgroundColor: Color ,
    modifier: Modifier = Modifier){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)

    ) {
        Text(
            text = tittle,
            modifier = modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.End


        )
        Text(
            text = description,
            modifier = modifier
                .padding(bottom = 16.dp),
            textAlign = TextAlign.Justify
        )

    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        Quadrant()
    }
}