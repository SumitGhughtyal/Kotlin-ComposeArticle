package com.example.composoearticle

import android.media.Image
import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composoearticle.ui.theme.ComposoeArticleTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposoeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleImage(getString(R.string.Heading), Para1 = getString(R.string.Para1), Para2 = getString(R.string.Para2))
                }
            }
        }
    }
}

@Composable
fun ComposeArticleText(Heading : String, Para1: String, Para2: String, modifier : Modifier= Modifier){
    Column(
        modifier =  modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = Heading,
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )

        Text(
            text = Para1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = Para2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
    }


}


@Composable
fun ComposeArticleImage(Heading: String, Para1: String, Para2: String , modifier : Modifier = Modifier) {

        Column {
            val image = painterResource(R.drawable.bg_compose_background)
            Image(
                painter = image,
                contentDescription = null,


                )
            ComposeArticleText(Heading = Heading, Para1 = Para1, Para2 = Para2)
        }



}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposoeArticleTheme {
        ComposeArticleImage(stringResource(R.string.Heading), stringResource(R.string.Para1), stringResource(R.string.Para2))
    }
}