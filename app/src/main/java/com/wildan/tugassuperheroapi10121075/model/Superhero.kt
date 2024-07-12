package com.wildan.tugassuperheroapi10121075.model

data class Superhero(
    val name: String,
    val powerstats: Powerstats,
    val biography: Biography,
    val appearance: Appearance,
    val work: Work,
    val image: Image
)

data class Biography(
    val aliases: List<String>,
    val alignment: String,
    val publisher: String
)

data class Appearance(
    val gender: String,
    val race: String
)

data class Work(
    val occupation: String,
    val base: String
)

data class Powerstats(
    val intelligence: String,
    val strength: String,
    val speed: String,
    val durability: String,
    val power: String,
    val combat: String
)

data class Image(
    val url: String
)
