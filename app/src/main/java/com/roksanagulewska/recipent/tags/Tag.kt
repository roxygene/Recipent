package com.roksanagulewska.recipent.tags

abstract class Tag(name: String, color: TagColor) {
    companion object {
        //Recipe category tags
        val breakfastDefaultTag = DefaultTag(RecipeCategory.BREAKFAST.name, TagColor.YELLOW)
        val dinnerDefaultTag = DefaultTag(RecipeCategory.DINNER.name, TagColor.BLUE)
        val dessertDefaultTag = DefaultTag(RecipeCategory.DESSERT.name, TagColor.PINK)
        val sideDefaultTag = DefaultTag(RecipeCategory.SIDE.name, TagColor.GREEN)
        val soupDefaultTag = DefaultTag(RecipeCategory.SOUP.name, TagColor.ORANGE)
        val snackDefaultTag = DefaultTag(RecipeCategory.SNACK.name, TagColor.PURPLE)
        val sauceDefaultTag = DefaultTag(RecipeCategory.SAUCE.name, TagColor.ORANGE)
        val basicDefaultTag = DefaultTag(RecipeCategory.BASIC.name, TagColor.YELLOW)
        val drinkDefaultTag = DefaultTag(RecipeCategory.DRINK.name, TagColor.BLUE)
        val otherDefaultTag = DefaultTag(RecipeCategory.OTHER.name, TagColor.PURPLE)

        //Diet tags
        val vegetarianDefaultTag = DefaultTag(DefaultFoodTag.VEGETARIAN.name, TagColor.GREEN)
        val veganDefaultTag = DefaultTag(DefaultFoodTag.VEGAN.name, TagColor.GREEN)
        val ketoDefaultTag = DefaultTag(DefaultFoodTag.KETO.name, TagColor.YELLOW)
        val paleoDefaultTag = DefaultTag(DefaultFoodTag.PALEO.name, TagColor.RED)
        val lowCarbDefaultTag = DefaultTag(DefaultFoodTag.LOW_CARB.name, TagColor.PURPLE)
        val lowFatDefaultTag = DefaultTag(DefaultFoodTag.LOW_FAT.name, TagColor.BLUE)
        val highProteinDefaultTag = DefaultTag(DefaultFoodTag.HIGH_PROTEIN.name, TagColor.RED)
        val dairyFreeDefaultTag = DefaultTag(DefaultFoodTag.DAIRY_FREE.name, TagColor.ORANGE)
        val glutenFreeDefaultTag = DefaultTag(DefaultFoodTag.GLUTEN_FREE.name, TagColor.PINK)

        //Ingredients tags
        val tomatoDefaultTag = DefaultTag(DefaultFoodTag.TOMATO.name, TagColor.GREEN)
        val potatoDefaultTag = DefaultTag(DefaultFoodTag.POTATO.name, TagColor.GREEN)
        val onionDefaultTag = DefaultTag(DefaultFoodTag.ONION.name, TagColor.GREEN)
        val garlicDefaultTag = DefaultTag(DefaultFoodTag.GARLIC.name, TagColor.GREEN)
        val bellPepperDefaultTag = DefaultTag(DefaultFoodTag.BELL_PEPPER.name, TagColor.GREEN)
        val cucumberDefaultTag = DefaultTag(DefaultFoodTag.CUCUMBER.name, TagColor.GREEN)
        val carrotDefaultTag = DefaultTag(DefaultFoodTag.CARROT.name, TagColor.GREEN)
        val spinachDefaultTag = DefaultTag(DefaultFoodTag.SPINACH.name, TagColor.GREEN)
        val lettuceDefaultTag = DefaultTag(DefaultFoodTag.LETTUCE.name, TagColor.GREEN)
        val broccoliDefaultTag = DefaultTag(DefaultFoodTag.BROCCOLI.name, TagColor.GREEN)

        val mushroomDefaultTag = DefaultTag(DefaultFoodTag.MUSHROOM.name, TagColor.GREEN)

        val chickenDefaultTag = DefaultTag(DefaultFoodTag.CHICKEN.name, TagColor.RED)
        val beefDefaultTag = DefaultTag(DefaultFoodTag.BEEF.name, TagColor.RED)
        val porkDefaultTag = DefaultTag(DefaultFoodTag.PORK.name, TagColor.RED)

        val fishDefaultTag = DefaultTag(DefaultFoodTag.FISH.name, TagColor.BLUE)
        val shrimpDefaultTag = DefaultTag(DefaultFoodTag.SHRIMP.name, TagColor.BLUE)

        val eggDefaultTag = DefaultTag(DefaultFoodTag.EGG.name, TagColor.YELLOW)
        val cheeseDefaultTag = DefaultTag(DefaultFoodTag.CHEESE.name, TagColor.YELLOW)
        val butterDefaultTag = DefaultTag(DefaultFoodTag.BUTTER.name, TagColor.YELLOW)
        val milkDefaultTag = DefaultTag(DefaultFoodTag.MILK.name, TagColor.YELLOW)

        val basilDefaultTag = DefaultTag(DefaultFoodTag.BASIL.name, TagColor.PURPLE)
        val oreganoDefaultTag = DefaultTag(DefaultFoodTag.OREGANO.name, TagColor.PURPLE)
        val thymeDefaultTag = DefaultTag(DefaultFoodTag.THYME.name, TagColor.PURPLE)
        val rosemaryDefaultTag = DefaultTag(DefaultFoodTag.ROSEMARY.name, TagColor.PURPLE)
        val cilantroDefaultTag = DefaultTag(DefaultFoodTag.CILANTRO.name, TagColor.PURPLE)
        val parsleyDefaultTag = DefaultTag(DefaultFoodTag.PARSLEY.name, TagColor.PURPLE)
        val dillDefaultTag = DefaultTag(DefaultFoodTag.DILL.name, TagColor.PURPLE)
        val gingerDefaultTag = DefaultTag(DefaultFoodTag.GINGER.name, TagColor.PURPLE)
        val turmericDefaultTag = DefaultTag(DefaultFoodTag.TURMERIC.name, TagColor.PURPLE)
        val cinnamonDefaultTag = DefaultTag(DefaultFoodTag.CINNAMON.name, TagColor.PURPLE)
        val nutmegDefaultTag = DefaultTag(DefaultFoodTag.NUTMEG.name, TagColor.PURPLE)
        val cloveDefaultTag = DefaultTag(DefaultFoodTag.CLOVE.name, TagColor.PURPLE)
        val vanillaDefaultTag = DefaultTag(DefaultFoodTag.VANILLA.name, TagColor.PURPLE)

        val lemonDefaultTag = DefaultTag(DefaultFoodTag.LEMON.name, TagColor.PINK)
        val limeDefaultTag = DefaultTag(DefaultFoodTag.LIME.name, TagColor.PINK)
        val orangeDefaultTag = DefaultTag(DefaultFoodTag.ORANGE.name, TagColor.PINK)
        val appleDefaultTag = DefaultTag(DefaultFoodTag.APPLE.name, TagColor.PINK)
        val bananaDefaultTag = DefaultTag(DefaultFoodTag.BANANA.name, TagColor.PINK)
        val kiwiDefaultTag = DefaultTag(DefaultFoodTag.KIWI.name, TagColor.PINK)
        val pineappleDefaultTag = DefaultTag(DefaultFoodTag.PINEAPPLE.name, TagColor.PINK)

        val riceDefaultTag = DefaultTag(DefaultFoodTag.RICE.name, TagColor.ORANGE)
        val pastaDefaultTag = DefaultTag(DefaultFoodTag.PASTA.name, TagColor.ORANGE)
        val breadDefaultTag = DefaultTag(DefaultFoodTag.BREAD.name, TagColor.ORANGE)
        val oliveOilDefaultTag = DefaultTag(DefaultFoodTag.OLIVE_OIL.name, TagColor.ORANGE)
        val sugarDefaultTag = DefaultTag(DefaultFoodTag.SUGAR.name, TagColor.ORANGE)
        val flourDefaultTag = DefaultTag(DefaultFoodTag.FLOUR.name, TagColor.ORANGE)
    }
}