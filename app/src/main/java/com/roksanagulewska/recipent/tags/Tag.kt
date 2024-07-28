package com.roksanagulewska.recipent.tags

abstract class Tag(val tagName: String, val category: TagCategory) {
    val color = category.tagColor
    companion object {
        //Recipe category tags
        val breakfastDefaultTag = DefaultTag(RecipeCategory.BREAKFAST.categoryName, TagCategory.MEAL)
        val lunchOrDinnerDefaultTag = DefaultTag(RecipeCategory.LUNCH_OR_DINNER.categoryName, TagCategory.MEAL)
        val dessertDefaultTag = DefaultTag(RecipeCategory.DESSERT.categoryName, TagCategory.MEAL)
        val sideDefaultTag = DefaultTag(RecipeCategory.SIDE.categoryName, TagCategory.MEAL)
        val soupDefaultTag = DefaultTag(RecipeCategory.SOUP.categoryName, TagCategory.MEAL)
        val snackDefaultTag = DefaultTag(RecipeCategory.SNACK.categoryName, TagCategory.MEAL)
        val sauceDefaultTag = DefaultTag(RecipeCategory.SAUCE.categoryName, TagCategory.MEAL)
        val basicDefaultTag = DefaultTag(RecipeCategory.BASIC.categoryName, TagCategory.MEAL)
        val drinkDefaultTag = DefaultTag(RecipeCategory.DRINK.categoryName, TagCategory.MEAL)
        val otherDefaultTag = DefaultTag(RecipeCategory.OTHER.categoryName, TagCategory.MEAL)

        // Diet tags
        val vegetarianDefaultTag = DefaultTag("vegetarian", TagCategory.DIET)
        val veganDefaultTag = DefaultTag("vegan", TagCategory.DIET)
        val ketoDefaultTag = DefaultTag("keto", TagCategory.DIET)
        val paleoDefaultTag = DefaultTag("paleo", TagCategory.DIET)
        val lowCarbDefaultTag = DefaultTag("low_carb", TagCategory.DIET)
        val lowFatDefaultTag = DefaultTag("low_fat", TagCategory.DIET)
        val highProteinDefaultTag = DefaultTag("high_protein", TagCategory.DIET)
        val dairyFreeDefaultTag = DefaultTag("dairy_free", TagCategory.DIET)
        val glutenFreeDefaultTag = DefaultTag("gluten_free", TagCategory.DIET)

        // Ingredients tags
        val tomatoDefaultTag = DefaultTag("tomato", TagCategory.VEGETABLES)
        val potatoDefaultTag = DefaultTag("potato", TagCategory.VEGETABLES)
        val onionDefaultTag = DefaultTag("onion", TagCategory.VEGETABLES)
        val garlicDefaultTag = DefaultTag("garlic", TagCategory.VEGETABLES)
        val bellPepperDefaultTag = DefaultTag("bell_pepper", TagCategory.VEGETABLES)
        val cucumberDefaultTag = DefaultTag("cucumber", TagCategory.VEGETABLES)
        val carrotDefaultTag = DefaultTag("carrot", TagCategory.VEGETABLES)
        val spinachDefaultTag = DefaultTag("spinach", TagCategory.VEGETABLES)
        val lettuceDefaultTag = DefaultTag("lettuce", TagCategory.VEGETABLES)
        val broccoliDefaultTag = DefaultTag("broccoli", TagCategory.VEGETABLES)
        val mushroomDefaultTag = DefaultTag("mushroom", TagCategory.MUSHROOMS)

        val chickenDefaultTag = DefaultTag("chicken", TagCategory.MEAT)
        val beefDefaultTag = DefaultTag("beef", TagCategory.MEAT)
        val porkDefaultTag = DefaultTag("pork", TagCategory.MEAT)
        val fishDefaultTag = DefaultTag("fish", TagCategory.SEAFOOD)
        val shrimpDefaultTag = DefaultTag("shrimp", TagCategory.SEAFOOD)

        val eggDefaultTag = DefaultTag("egg", TagCategory.DAIRY)
        val cheeseDefaultTag = DefaultTag("cheese", TagCategory.DAIRY)
        val butterDefaultTag = DefaultTag("butter", TagCategory.DAIRY)
        val milkDefaultTag = DefaultTag("milk", TagCategory.DAIRY)

        val basilDefaultTag = DefaultTag("basil", TagCategory.SPICES)
        val oreganoDefaultTag = DefaultTag("oregano", TagCategory.SPICES)
        val thymeDefaultTag = DefaultTag("thyme", TagCategory.SPICES)
        val rosemaryDefaultTag = DefaultTag("rosemary", TagCategory.SPICES)
        val cilantroDefaultTag = DefaultTag("cilantro", TagCategory.SPICES)
        val parsleyDefaultTag = DefaultTag("parsley", TagCategory.SPICES)
        val dillDefaultTag = DefaultTag("dill", TagCategory.SPICES)
        val gingerDefaultTag = DefaultTag("ginger", TagCategory.SPICES)
        val turmericDefaultTag = DefaultTag("turmeric", TagCategory.SPICES)
        val cinnamonDefaultTag = DefaultTag("cinnamon", TagCategory.SPICES)
        val nutmegDefaultTag = DefaultTag("nutmeg", TagCategory.SPICES)
        val cloveDefaultTag = DefaultTag("clove", TagCategory.SPICES)
        val vanillaDefaultTag = DefaultTag("vanilla", TagCategory.SPICES)

        val sugarDefaultTag = DefaultTag("sugar", TagCategory.ADDITIVES)

        val oliveOilDefaultTag = DefaultTag("olive_oil", TagCategory.FATS)

        val lemonDefaultTag = DefaultTag("lemon", TagCategory.FRUITS)
        val limeDefaultTag = DefaultTag("lime", TagCategory.FRUITS)
        val orangeDefaultTag = DefaultTag("orange", TagCategory.FRUITS)
        val appleDefaultTag = DefaultTag("apple", TagCategory.FRUITS)
        val bananaDefaultTag = DefaultTag("banana", TagCategory.FRUITS)
        val kiwiDefaultTag = DefaultTag("kiwi", TagCategory.FRUITS)
        val pineappleDefaultTag = DefaultTag("pineapple", TagCategory.FRUITS)

        val riceDefaultTag = DefaultTag("rice", TagCategory.GRAINS)
        val pastaDefaultTag = DefaultTag("pasta", TagCategory.GRAINS)
        val breadDefaultTag = DefaultTag("bread", TagCategory.GRAINS)
        val flourDefaultTag = DefaultTag("flour", TagCategory.GRAINS)
    }
}