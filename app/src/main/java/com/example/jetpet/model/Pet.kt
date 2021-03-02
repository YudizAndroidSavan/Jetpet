package com.example.jetpet.model

import androidx.compose.runtime.Immutable

@Immutable
data class Pet(
    val id: Long,
    val name: String,
    val imageUrl: String,
    val price: Long,
    val ageGroup: AgeGroup,
    val gender: Gender
)

enum class AgeGroup {
    Puppy, Adult, Senior
}

enum class Gender {
    Male, Female
}

/**
 * Static data
 */

val pets = listOf(
    Pet(
        id = 1L,
        name = "Meenie",
        ageGroup = AgeGroup.Puppy,
        imageUrl = "https://images.unsplash.com/photo-1583337130417-3346a1be7dee",
        price = 999,
        gender = Gender.Female
    ),
    Pet(
        id = 2L,
        name = "Timsy",
        ageGroup = AgeGroup.Puppy,
        imageUrl = "https://images.unsplash.com/photo-1596797882870-8c33deeac224",
        price = 999,
        gender = Gender.Female
    ),
    Pet(
        id = 3L,
        name = "Mo",
        ageGroup = AgeGroup.Senior,
        imageUrl = "https://images.unsplash.com/photo-1516734212186-a967f81ad0d7",
        price = 999,
        gender = Gender.Male
    ),
    Pet(
        id = 4L,
        name = "Kajal",
        ageGroup = AgeGroup.Adult,
        imageUrl = "https://images.unsplash.com/photo-1517849845537-4d257902454a",
        price = 999,
        gender = Gender.Female
    ),
    Pet(
        id = 5L,
        name = "Yoyo",
        ageGroup = AgeGroup.Senior,
        imageUrl = "https://images.unsplash.com/photo-1553736026-ff14d158d222",
        price = 499,
        gender = Gender.Male
    ),
    Pet(
        id = 6L,
        name = "Curly",
        ageGroup = AgeGroup.Puppy,
        imageUrl = "https://images.unsplash.com/photo-1425082661705-1834bfd09dca",
        price = 999,
        gender = Gender.Female
    ),
    Pet(
        id = 7L,
        name = "Akhrot",
        ageGroup = AgeGroup.Puppy,
        imageUrl = "https://images.unsplash.com/photo-1520087619250-584c0cbd35e8",
        price = 1999,
        gender = Gender.Male
    ),
    Pet(
        id = 8L,
        name = "Rockstar",
        ageGroup = AgeGroup.Adult,
        imageUrl = "https://images.unsplash.com/photo-1505628346881-b72b27e84530",
        price = 999,
        gender = Gender.Male
    ),
    Pet(
        id = 9L,
        name = "Monu",
        ageGroup = AgeGroup.Adult,
        imageUrl = "https://images.unsplash.com/photo-1518020382113-a7e8fc38eac9",
        price = 999,
        gender = Gender.Male
    ),
    Pet(
        id = 10L,
        name = "Joseph",
        ageGroup = AgeGroup.Senior,
        imageUrl = "https://images.unsplash.com/photo-1442605527737-ed62b867591f",
        price = 999,
        gender = Gender.Male
    )
)
