package com.example.blackdragon.View

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blackdragon.R
import com.example.blackdragon.coloredText
import com.example.blackdragon.ui.theme.Typography
import com.example.blackdragon.ui.theme.textHighlights

@Composable
fun todaySpecial(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(1f)
            .height(130.dp)
            .clickable {  }
    ) {
        //innerCard which will be clip
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 70.dp, bottomStart = 40.dp, bottomEnd = 120.dp))
                .clickable { }
        ) {
            // row for image and Details
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Card(
                    modifier = Modifier
                        .size(130.dp)
                ) {
                    val img = painterResource(id = R.drawable._dcoffee)
                    Image(
                        painter = img,
                        contentDescription = "3dImage",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(130.dp)
                            .height(130.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize(1f),
                    verticalArrangement = Arrangement.Top
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(1f),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        coloredText(text = "Today's special", wordToColor = "Today's special")
                        Icon(imageVector = Icons.Rounded.Star, contentDescription = "")
                    }
                    // name of the Today's special
                    Text(text = "Bursting Blueberry", fontSize = Typography.labelSmall.fontSize)
                    Row (modifier=Modifier,
                        verticalAlignment = Alignment.CenterVertically){
                        Text(
                            text = "₹349",
                            style = androidx.compose.ui.text.TextStyle(textDecoration = TextDecoration.LineThrough),
                            fontSize = 8.sp
                        )
                        Text(
                            text = "₹249",
                            modifier = Modifier,
                            fontSize = Typography.bodySmall.fontSize
                        )
                    }
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = textHighlights)
                        Text(text = "4.8")
                    }
                }
            }
        }
        Column(
            modifier = Modifier.fillMaxSize(1f),
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "",
                    modifier = Modifier.size(50.dp),
                    tint = Color.Black
                )
            }
        }
    }
}


@Preview
@Composable
private fun preview() {
    todaySpecial()
}