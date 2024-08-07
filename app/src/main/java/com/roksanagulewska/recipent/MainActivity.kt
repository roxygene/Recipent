package com.roksanagulewska.recipent

import android.graphics.ColorFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roksanagulewska.recipent.ui.theme.RecipentTheme
import com.roksanagulewska.recipent.Recipe
import com.roksanagulewska.recipent.tags.RecipeCategory
import androidx.compose.ui.unit.sp
import com.roksanagulewska.recipent.tags.Tag
import com.roksanagulewska.recipent.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipentTheme {
                Scaffold(
                    //drawer
                    //floating action button
                    //content
                    content = {padding ->
                        Text("Test", modifier = Modifier.padding(2.dp))
                    }
                )
            }
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun RecipeCard(painter: Painter, recipe: Recipe, modifier: Modifier = Modifier) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.outline),
            elevation =  CardDefaults.cardElevation(
                defaultElevation = 3.dp
            )
        ) {
            Column() {
                Box(modifier = Modifier
                    .weight(3F)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant)) {
                    Image(
                        modifier = modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(10.dp)),
                        painter = painter,
                        contentDescription = "Picture of ${recipe.name}",
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.Center
                    )
                    Box(modifier = Modifier
                        .align(Alignment.TopEnd)
                        .size(60.dp)) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Favourite heart icon",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(30.dp))
                    }
                }
                Row(modifier = modifier
                    .weight(2F)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface)) {
                    Column(Modifier.weight(8F)) {
                        Text(text = recipe.name, color = MaterialTheme.colorScheme.onSecondaryContainer,)
                        FlowRow(
                            horizontalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            recipe.tags.forEach{element ->  TagItem(tag = element)}

                        }
                    }
                    Column(Modifier.weight(2F)) {
                        Text(text = recipe.preparationTime.toString(), color = MaterialTheme.colorScheme.onSurface)
                        Text(text = recipe.rating.toString(), color = MaterialTheme.colorScheme.onSurface)
                    }
                }
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = false)
    @Composable
    fun RecipeCardPreview() {
        val painter = painterResource(id = R.drawable.spaghetti_bolognese)
        val ingredients = listOf<String>("pasta", "tomato", "beef", "mozarella")
        val recipe = Recipe("Spaghetti bolognese", ingredients, "some method", RecipeCategory.LUNCH_OR_DINNER)
        recipe.tags.add(Tag.lunchOrDinnerDefaultTag)
        recipe.tags.add(Tag.tomatoDefaultTag)
        recipe.tags.add(Tag.pastaDefaultTag)

        RecipentTheme {
            RecipeCard(painter, recipe)
        }
    }

    @Composable
    fun TagItem(tag: Tag) {
        Surface(color = tag.color,
            shape = RoundedCornerShape(10.dp),
            shadowElevation = 10.dp,
            modifier = Modifier.padding(2.dp)
        ) {
            Text(text = tag.tagName, modifier = Modifier.padding(start = 6.dp, end = 6.dp, top = 3.dp, bottom = 3.dp))
        }
    }

    @Preview(showBackground = true, showSystemUi = false)
    @Composable
    fun TagItemPreview() {
        RecipentTheme {
            TagItem(Tag.dessertDefaultTag)
        }
    }




}

