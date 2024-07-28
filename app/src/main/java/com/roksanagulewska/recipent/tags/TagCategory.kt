package com.roksanagulewska.recipent.tags

import androidx.compose.ui.graphics.Color
import com.roksanagulewska.recipent.ui.theme.*

enum class TagCategory (val categoryName: String, val tagColor: Color) {
    DIET("type of diet", Blue),
    MEAL("meal type", Pink),
    VEGETABLES("vegetables", Green),
    MUSHROOMS("mushrooms", Green),
    FRUITS("fruits", Green),
    MEAT("meat", Red),
    SEAFOOD("seafood", Red),
    DAIRY("dairy", Yellow),
    SPICES("spices", Purple),
    FATS("fats", Purple),
    ADDITIVES("additives", Purple),
    GRAINS("grain products", Orange600)
}