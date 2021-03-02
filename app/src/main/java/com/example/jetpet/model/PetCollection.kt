/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jetpet.model

import androidx.compose.runtime.Immutable

@Immutable
data class PetCollection(
    val id: Long,
    val name: String,
    val pets: List<Pet>,
    val type: CollectionType = CollectionType.Normal
)

enum class CollectionType { Normal, Highlight }

/**
 * A fake repo
 */
object PetRepo {
    fun getPets(): List<PetCollection> = petCollections
    fun getPet(petId: Long) = pets.find { it.id == petId }!!
}

/**
 * Static data
 */

private val popular = PetCollection(
    id = 2L,
    name = "Popular",
    pets = pets
)

private val wfhFavs = popular.copy(
    id = 3L,
    name = "Favourites"
)

private val newlyAdded = popular.copy(
    id = 4L,
    name = "Newly Added"
)

private val petCollections = listOf(
    popular,
    wfhFavs,
    newlyAdded,
)
