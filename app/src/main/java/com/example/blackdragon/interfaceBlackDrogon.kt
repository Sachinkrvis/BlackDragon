package com.example.blackdragon

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blackdragon.View.BottomFixBar
import com.example.blackdragon.View.discountItemList
import com.example.blackdragon.View.itemsSelect
import com.example.blackdragon.View.selectCoffeeType
import com.example.blackdragon.View.todaySpecial
import com.example.blackdragon.ui.theme.AppTheme
import com.example.blackdragon.ui.theme.Typography
import com.example.blackdragon.ui.theme.textHighlights


@Composable
fun coloredText(text: String, wordToColor: String, color: Color = textHighlights) {
    val annotatedString = buildAnnotatedString {
        val startIndex = text.indexOf(wordToColor)
        val endIndex = startIndex + wordToColor.length

        if (startIndex >= 0) { // Check if the word is found
            append(text.substring(0, startIndex)) // Text before the colored word

            // Apply color to the specific word
            withStyle(style = SpanStyle(color = color, fontWeight = FontWeight.Bold)) {
                append(wordToColor)
            }

            append(text.substring(endIndex)) // Text after the colored word
        } else {
            append(text) // Word not found, display the original text
        }
    }

    Text(text = annotatedString, fontSize = 15.sp, color = Color.White)
}


@Composable
fun BlackDragonInterface(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    AppTheme {
        Column(
            modifier
                .padding(5.dp)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            // for first row
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.LocationOn, contentDescription = "location", tint = Color.White)
                    Text(text = "Chandauli, 232110", fontSize = Typography.labelSmall.fontSize, color = Color.White)
                }
                Row {
                    val img = painterResource(id = R.drawable.profile)
                    Image(
                        painter = img, contentDescription = "User Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(40.dp)
                    )
                }

            }
            // for second row
            Row(
                modifier
                    .fillMaxWidth(1f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Row(
                    modifier = Modifier
                ) {
                    Box(
                        modifier = Modifier.width(160.dp)

                    ) {
                        coloredText(
                            text = "It is a great day for the Coffee",
                            wordToColor = "Coffee"
                        )
                    }

                }
                Row {
                    val img = painterResource(id = R.drawable.glass)
                    Box(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(90))
                            .size(40.dp)
                            .clickable {  },
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = img, contentDescription = "User Image",
                            contentScale = ContentScale.FillWidth,
                            modifier = Modifier
                                .size(40.dp)
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Coupons", color = Color.White)
                    val img = painterResource(id = R.drawable.coupon)
                    Spacer(modifier = Modifier.size(2.dp))
                    Image(painter = img, contentDescription = "", modifier = Modifier
                        .size(22.dp)
                        .clickable { })
                }
                Row {
                    Text(text = "View All >", modifier = Modifier.clickable { }, color = Color.White)
                }

            }

            discountItemList()
            selectCoffeeType()
            todaySpecial()
            itemsSelect()
            Spacer(modifier = Modifier.padding(25.dp))

        }
        BottomFixBar()
    }


}


@Preview(showBackground = true)
@Composable
private fun composable() {
    BlackDragonInterface()
}

