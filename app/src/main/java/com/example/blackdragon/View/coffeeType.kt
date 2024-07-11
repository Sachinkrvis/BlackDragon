package com.example.blackdragon.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blackdragon.R
import com.example.blackdragon.Utils.ImageWithName

val coffeetype = listOf(
    ImageWithName(R.drawable.coffee_cup1, "Cappucchino"),
    ImageWithName(R.drawable.coffee2, "Espresso"),
    ImageWithName(R.drawable.coffee3, "Americano"),
    ImageWithName(R.drawable.coffee4, "Latte"),
    ImageWithName(R.drawable.coffee5, "Mocha"),
    ImageWithName(R.drawable.coffee6, "Macchia"),
    ImageWithName(R.drawable.coffee7, "StarBuck"),
    ImageWithName(R.drawable.coffee8, "Green Tea"),
    ImageWithName(R.drawable.coffee9, "IndianChai"),
    ImageWithName(R.drawable.coffee10, "Tea")

)

@Composable
fun selectCoffeeType(modifier: Modifier = Modifier) {
    LazyRow {
        items(coffeetype) {
            Card(
                modifier = Modifier
                    .size(80.dp, 80.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 10.dp,
                            topEnd = 30.dp,
                            bottomStart = 30.dp,
                            bottomEnd = 30.dp
                        )
                    )
                    .clickable { }

            ) {
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(70.dp),

                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box {
                        val painter = painterResource(id = it.image)
                        Image(
                            painter = painter,
                            contentDescription = "",
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Text(text = it.name, modifier = Modifier, fontSize = 7.sp)


                }

            }

            Spacer(modifier = modifier.size(7.dp))

        }
    }


}

@Preview(showBackground = true)
@Composable
private fun coffeeType() {
    selectCoffeeType()
}