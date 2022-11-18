package com.sosdeveloper.blogapp

import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box {
            Row {
                Text(
                    text = "Exclusive: Bill Gates In Kenya \nTo Hold Series Of Public\n Engagements",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h4,
                    fontSize = 20.sp
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.padding(top = 90.dp, end = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.news_banner),
                    contentDescription = "News",
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .width(600.dp)
                        .height(100.dp)
                        .clip(RoundedCornerShape(10.dp))

                )
            }
        }


        Column(modifier = Modifier.padding(top = 10.dp, start = 10.dp)) {

            Spacer(modifier = Modifier.height(1.dp))
            Row {
                Text(
                    text = "American Businessman and Microsoft Company Owner " +
                            "Bill Gates is in Kenya," +
                            "where he will hold a series of public engagements."
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(
                    text = "On Tuesday Gates will tour Makueni County and is expected to meet " +
                            "Governor Mutula Kilonzo at his office."
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(
                    text = "Healthcare is at the top of the Businessman's visit in Kenya." +
                            "He is expected to visit the Makueni Mother and Child  Hospital which " +
                            "mainly deals with mother and child healthcare and later visit Kathonzweri " +
                            "Health Center where he is expected to meet a section of Health volunteers. "
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(
                    text = "Gates will later meet two farmers in Kathonzweri who are " +
                            "championing for Climate Change and are farming through irrigation."
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(
                    text = "On Thursday, November 17th, Bill Gates is expected to give a talk on " +
                            "Innovating for Food Security and Climate Change in Africa." +
                            "The event will be streamed live from the University of Nairobi"
                )
            }
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(start = 130.dp)){
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Favorite,"My icon",
                       tint = Color.Red
                    )

                }
            }
        }
    }
}

@Preview
@Composable
fun BlogPreview(){
    MainPage()
}