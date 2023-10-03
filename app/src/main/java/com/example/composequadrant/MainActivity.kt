package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier.fillMaxHeight().fillMaxWidth(0.5f)) {
    Column(modifier = modifier, horizontalAlignment = Alignment.Start,
        content = {
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.weight(0.5f).background(color = Color(0xFFEADDFF)).padding(16.dp),
                content = {
                    commonTextComposables(headingResourceId = R.string.quadrant1_heading, bodyResourceId = R.string.quadrant1_body)
                }
            )
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.weight(0.5f).background(color = Color(0xFFB69DF8)).padding(16.dp),
                content = {
                    commonTextComposables(headingResourceId = R.string.quadrant2_heading, bodyResourceId = R.string.quadrant2_body)
                }
            )
        }
    )
    Column(modifier = modifier, horizontalAlignment = Alignment.End,
        content = {
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.weight(0.5f).background(color = Color(0xFFD0BCFF)).padding(16.dp),
                content = {
                    commonTextComposables(headingResourceId = R.string.quadrant3_heading, bodyResourceId = R.string.quadrant3_body)
                }
            )
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.weight(0.5f).background(color = Color(0xFFF6EDFF)).padding(16.dp),
                content = {
                    commonTextComposables(R.string.quadrant4_heading, R.string.quadrant4_body)
                }
            )
        }
    )
}

@Composable
fun commonTextComposables(headingResourceId: Int, bodyResourceId: Int, modifier: Modifier = Modifier) {
    Text(text = stringResource(headingResourceId), color = Color.Black, fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify, modifier = modifier.padding(bottom = 16.dp))
    Text(text = stringResource(bodyResourceId), color = Color.Black, textAlign = TextAlign.Justify)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}