package com.merttoptas.composeseries.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.rememberImagePainter
import com.merttoptas.composeseries.data.DummyData
import com.merttoptas.composeseries.data.Plant
import com.merttoptas.composeseries.data.Theme
import com.merttoptas.composeseries.ui.component.BloomTextField

@Composable
fun HomeScreen() {
    Surface(color = MaterialTheme.colors.background, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            LazyColumn(modifier = Modifier.fillMaxSize(), content = {
                item { Spacer(modifier = Modifier.height(20.dp)) }

                item {
                    SearchEditText(
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }

                item {
                    BrowseThemesText(Modifier.paddingFromBaseline(top = 32.dp, bottom = 8.dp))
                }

                item {
                    BloomThemesCard(list = DummyData.themes)
                }

                item {
                    PlantListTitle(modifier = Modifier.fillMaxWidth())
                }

                items(DummyData.plants) { plant ->
                    Plant(
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp), plant
                    )
                }
            })
        }
    }
}

@Composable
fun SearchEditText(modifier: Modifier) {
    BloomTextField(
        modifier = modifier,
        value = "",
        onValueChange = {},
        placeholder = {
            com.merttoptas.composeseries.ui.component.BloomText(
                modifier = modifier,
                text = "Search",
                style = MaterialTheme.typography.body1
            )
        },
        visualTransformation = VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                modifier = Modifier.size(18.dp),
            )
        }
    )
}

@Composable
fun BrowseThemesText(modifier: Modifier) {
    Text(text = "Browse themes", style = MaterialTheme.typography.h1, modifier = modifier)
}

@Composable
fun BloomThemesCard(list: List<Theme>) {
    LazyRow(
        contentPadding = PaddingValues(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(list) { theme ->
            Card(
                modifier = Modifier
                    .size(136.dp)
                    .clickable { },
                elevation = 5.dp,
                shape = MaterialTheme.shapes.small,
            ) {
                Column {
                    Image(
                        painter = rememberImagePainter(theme.image),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(96.dp),
                        contentScale = ContentScale.Crop,
                    )
                    Row(
                        modifier = Modifier.fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = theme.name,
                            modifier = Modifier
                                .padding(horizontal = 16.dp),
                            style = MaterialTheme.typography.h2,
                            maxLines = 2,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun PlantListTitle(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Text(
            text = "Design your home garden",
            modifier = Modifier
                .paddingFromBaseline(top = 32.dp, bottom = 12.dp),
            style = MaterialTheme.typography.h1,
        )
        Icon(
            imageVector = Icons.Filled.FilterList,
            contentDescription = null,
            modifier = Modifier
                .width(24.dp)
                .aspectRatio(1.0f),
        )
    }
}

@Composable
fun Plant(modifier: Modifier, plant: Plant) {
    ConstraintLayout(modifier = modifier) {
        val (image, title, description, checkbox, divider) = createRefs()
        Image(
            painter = rememberImagePainter(plant.image),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .clip(MaterialTheme.shapes.small)
                .constrainAs(image) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                },
            contentScale = ContentScale.Crop,
        )

        Text(
            text = plant.name,
            modifier = Modifier
                .constrainAs(title) {
                    top.linkTo(parent.top)
                    start.linkTo(image.end, margin = 16.dp)
                }
                .paddingFromBaseline(top = 24.dp),
            style = MaterialTheme.typography.h2
        )
        Text(
            text = plant.description,
            modifier = Modifier
                .constrainAs(description) {
                    top.linkTo(title.bottom)
                    start.linkTo(title.start)
                },
            style = MaterialTheme.typography.body1
        )

        Checkbox(
            checked = plant.isChecked,
            onCheckedChange = { },
            modifier = Modifier.constrainAs(checkbox) {
                top.linkTo(parent.top, margin = 16.dp)
                bottom.linkTo(parent.bottom, margin = 24.dp)
                end.linkTo(parent.end)
            }
        )

        Divider(
            modifier = Modifier
                .height(1.dp)
                .constrainAs(divider) {
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                },
            thickness = 0.5.dp,
            color = MaterialTheme.colors.secondary,
            startIndent = 72.dp
        )
    }
}