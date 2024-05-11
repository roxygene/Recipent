package com.roksanagulewska.recipent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.roksanagulewska.recipent.ui.theme.RecipentTheme
import com.roksanagulewska.recipent.Recipe

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun RecipeCard(painter: Painter, recipe: Recipe) {

    //recipe name
    //picture (opt)
    //tags (not all)
    //preparation time (opt)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecipentTheme {
        //RecipeCard()
    }
}