package org.example.lesson_11classesAndProperties

class Category(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val recipes: List<Recipe>,
)

class Recipe(
    val id: Int,
    val title: String,
    val description: String,
    val cookingTime: Int,
    val ingredients: List<Ingredient>,
    val steps: List<String>,
    val imageUrl: String?,
    val categoryId: Int,
)

class Ingredient(
    val id: Int,
    val name: String,
    val quantity: Double,
    val unit: String,
)