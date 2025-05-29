package org.example.lesson_11

class recipeCategory(
    val id: Int,
    val name: String,
    var photo: String,
    var listOfCards: List<recipeCard>,
) {
    fun addNewCard(card: recipeCard) {
        listOfCards += card
    }
}

class recipeCard(
    val id: Int,
    val name: String,
    var description: String,
    var listOfIngredients: List<ingredients>,
    var isFavorite: Boolean = false,
) {
    fun addIngredient(ingredient: ingredients) {
        listOfIngredients += ingredient
    }

    fun AddToFavorite() {
        isFavorite = true
    }

    fun RemoveFromFavorite() {
        isFavorite = false
    }
}

class ingredients(
    val id: Int,
    val name: String,
)
