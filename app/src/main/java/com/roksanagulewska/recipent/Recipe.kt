package com.roksanagulewska.recipent

import android.media.Image
import com.roksanagulewska.recipent.tags.Tag
import com.roksanagulewska.recipent.tags.RecipeCategory

class Recipe(var name: String, var ingredients: List<String>, var preparationMethod: String, var category: RecipeCategory) {
    val NO_TIME_ADDED = 0
    var tags = mutableListOf<Tag>()
    var preparationTime: Int = NO_TIME_ADDED
    lateinit var picture: Image
}