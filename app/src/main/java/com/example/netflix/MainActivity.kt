package com.example.netflix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.netflix.data.DataSource
import com.example.netflix.imagesource.ImageSource
import com.example.netflix.ui.theme.NetflixTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NetflixTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(text = "Welcome to Netflix")
                                },
                                navigationIcon = {
                                    Image(
                                        painter = painterResource(id = R.drawable.netflix),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(20.dp)
                                    )
                                },
                                actions = {
                                    Icon(
                                        imageVector = Icons.Default.AccountCircle,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(15.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = "")
                                }

                            )
                        }
                    ) { padding ->
                        val state = rememberScrollState()
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(padding)
                                .verticalScroll(
                                    state = state,
                                    enabled = true,
                                )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.risesbydogancan),
                                contentDescription = ""
                            )
                            Text(text = "Trending")
                            val allData = ImageSource().getAll()
                            LazyRow(
                                contentPadding = PaddingValues(10.dp)
                            ) {
                                items(allData) { item ->
                                    AffirmationCard(item)
                                }
                            }
                            Text(text = "Action")
                            LazyRow(
                                contentPadding = PaddingValues(10.dp)
                            ) {
                                items(allData) { item ->
                                    AffirmationCard(item)
                                }
                            }
                            Text(text = "Movies of the week")
                            LazyRow(
                                contentPadding = PaddingValues(10.dp)
                            ) {
                                items(allData) { item ->
                                    AffirmationCard(item)
                                }
                            }
                            Text(text = "Movies of the week")
                            LazyRow(
                                contentPadding = PaddingValues(10.dp)
                            ) {
                                items(allData) { item ->
                                    AffirmationCard(item)
                                }
                            }
                            Text(text = "Movies of the week")
                            LazyRow(
                                contentPadding = PaddingValues(10.dp)
                            ) {
                                items(allData) { item ->
                                    AffirmationCard(item)
                                }
                            }
                            Text(text = "Movies of the week")
                            LazyRow(
                                contentPadding = PaddingValues(10.dp)
                            ) {
                                items(allData) { item ->
                                    AffirmationCard(item)
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun AffirmationCard(item: DataSource) {
    Card(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Column {
            Image(painter = painterResource(id = item.imageResId),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(150.dp) )
        }
    }
}
