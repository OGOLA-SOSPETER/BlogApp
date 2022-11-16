package com.sosdeveloper.blogapp

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainPage() {
    Column(modifier=Modifier.padding(start = 10.dp,top = 5.dp)) {
        Row {
            Text(
                text = "Exclusive: Bill Gates In Kenya To Hold Series Of Public Engagements",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h4,
                fontSize = 20.sp
            )
        }
    }
    Column(modifier = Modifier.padding(top = 60.dp, start = 10.dp)) {

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
    }
}


@Preview
@Composable
fun BlogPreview(){
    MainPage()
}