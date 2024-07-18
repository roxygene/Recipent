package com.roksanagulewska.recipent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roksanagulewska.recipent.ui.theme.RecipentTheme
import com.roksanagulewska.recipent.Recipe
import com.roksanagulewska.recipent.tags.RecipeCategory
import androidx.compose.ui.unit.sp
import com.roksanagulewska.recipent.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
        }
    }
}

@Composable
fun RecipeCard(painter: Painter, recipe: Recipe, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp),
            shape = RoundedCornerShape(15.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(width = 2.dp, color = MaterialTheme.colorScheme.outline)

    ) {
        Column(modifier.fillMaxSize()) {

        }

        /*Box(modifier = Modifier.height(200.dp).background(Yellow)) {//to stack content (first element is on the bottom of stack)
            Image( //dish pic
                painter = painter,
                contentDescription = "Picture of ${recipe.name}",
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopCenter

            )
            *//*Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(recipe.name, style = TextStyle(color = Black, fontSize = 16.sp))
            }*//*

        }*/
    }
    //recipe name
    //picture (opt)
    //tags (not all)
    //preparation time (opt)
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun RecipeCardPreview() {
    val painter = painterResource(id = R.drawable.spaghetti_bolognese)
    val ingredients = listOf<String>("pasta", "tomato", "beef", "mozarella")
    val recipe = Recipe("Spaghetti bolognese", ingredients, "some method", RecipeCategory.DINNER)
    RecipeCard(painter, recipe)
}