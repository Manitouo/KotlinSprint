package org.example.lesson_11

class recipeCategory(
    val id: Int,
    val name: String,
    var photo: String,
    var listOfCards: MutableList<recipeCard>,
) {
    fun addNewCard(card: recipeCard) {
        listOfCards.add(card)
    }
}

class recipeCard(
    val id: Int,
    val name: String,
    var description: String,
    var listOfIngredients: MutableList<ingredients>,
    var isFavorite: Boolean = false,
) {
    fun addIngredient(ingredient: ingredients) {
        listOfIngredients.add(ingredient)
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
    var count: Int,
    val type: String,
)
