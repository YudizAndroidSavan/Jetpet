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

package com.example.jetpet.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpet.R
import com.example.jetpet.model.PetCollection
import com.example.jetpet.model.PetRepo
import com.example.jetpet.ui.components.JetpetDivider
import com.example.jetpet.ui.components.JetPetSurface
import com.example.jetpet.ui.components.PetCollection
import com.example.jetpet.ui.theme.JetpetTheme

@Composable
fun Feed(
    onPetClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    val petCollections = remember { PetRepo.getPets() }
    Feed(
        petCollections,
        onPetClick,
        modifier
    )
}

@Composable
private fun Feed(
    petCollections: List<PetCollection>,
    onPetClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    JetPetSurface(modifier = modifier.fillMaxSize()) {
        Box {
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier
                        .padding(20.dp)
                        .heightIn(30.dp)
                )
                PetCollectionList(petCollections, onPetClick)
            }
        }
    }
}

@Composable
private fun PetCollectionList(
    petCollections: List<PetCollection>,
    onPetClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        itemsIndexed(petCollections) { index, petCollection ->
            if (index > 0) {
                JetpetDivider(thickness = 2.dp)
            }
            PetCollection(
                petCollection = petCollection,
                onPetClick = onPetClick,
                index = index
            )
        }
    }
}

@Preview("Home")
@Composable
fun HomePreview() {
    JetpetTheme {
        Feed(onPetClick = { })
    }
}

@Preview("Home • Dark Theme")
@Composable
fun HomeDarkPreview() {
    JetpetTheme(darkTheme = true) {
        Feed(onPetClick = { })
    }
}
