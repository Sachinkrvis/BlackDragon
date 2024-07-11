package com.example.blackdragon.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.blackdragon.R
import com.example.blackdragon.Utils.ImageWithDetails
import com.example.blackdragon.ui.theme.Typography
import com.example.blackdragon.ui.theme.darkBackground
import com.example.blackdragon.ui.theme.textHighlights


val itemCoffee = listOf(
    ImageWithDetails(R.drawable.newcoffee, "Dalgona Whipped", "₹349", "4.7"),
    ImageWithDetails(R.drawable.newcoffee2, "Chinnamon &Cocoa", "₹199", "4.6"),
    ImageWithDetails(R.drawable.newcoffee, "Caramel Drizzled", "₹249", "4.8"),
    ImageWithDetails(R.drawable.newcoffee, "latte", "₹249", "4.5"),
)


@Composable
fun itemsSelect(modifier: Modifier = Modifier) {
    Column {
        val img = painterResource(id = R.drawable.coffee12)
        Row {
            Image(painter = img, contentDescription = "", modifier = Modifier.size(25.dp))
            Text(text = "All Cappuccinos", color = Color.White)
        }
        LazyRow {
            items(itemCoffee) {
                Box(
                    modifier = Modifier
                        .size(120.dp, 170.dp)
                        .background(darkBackground)
                        .clickable {  }
                ) {
                    Card(
                        modifier = Modifier
                            .size(120.dp, 170.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 20.dp,
                                    topEnd = 20.dp,
                                    bottomStart = 20.dp,
                                    bottomEnd = 80.dp
                                )
                            )
                            .clickable {  }
                    ) {
                        
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center

                        ) {
                            Box(
                                modifier = Modifier
                                    .size(75.dp)
                                    .clip(shape = CircleShape)
                            ) {
                                val img = painterResource(id = it.image)
                                Image(painter = img, contentDescription = "")
                            }
                        }
                        Column(modifier=Modifier) {
                            Box(modifier = Modifier
                                .fillMaxWidth(1f)
                                .height(30.dp)){
                                Text(
                                    text = it.name,
                                    fontSize = Typography.labelSmall.fontSize,
                                    modifier = Modifier.padding(2.dp)
                                )
                            }
                            Text(text = it.price, fontSize = Typography.labelSmall.fontSize)
                            Row(modifier = Modifier,
                                verticalAlignment = Alignment.CenterVertically) {
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", modifier = Modifier.size(20.dp), tint = textHighlights)
                                Text(text = it.rating, fontSize = Typography.labelSmall.fontSize)
                            }
                        }
                    }


                    //floating Addbtn
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(1f),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "",
                                modifier = Modifier.size(40.dp),
                                tint = Color.Black
                            )
                        }
                    }


                }
                Spacer(modifier = Modifier.size(20.dp))
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun test() {
    itemsSelect()
}