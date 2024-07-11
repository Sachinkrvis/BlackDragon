package com.example.blackdragon.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.blackdragon.R

val items = listOf(
    R.drawable.vouchercard1,
    R.drawable.vouchercard2,
    R.drawable.vouchercard3,
)

@Composable
fun discountItemList(modifier: Modifier = Modifier) {
    val listItem = ArrayList<Int>()
    for (i in 1..5) {
        listItem.add(items.random())
    }
    LazyRow {
        items(listItem) {
            val painter = painterResource(id = it)
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(100.dp)
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .clickable {  }
            ) {
                Image(painter = painter, contentDescription = "", contentScale = ContentScale.Crop)
            }

        }
    }
}


@Preview
@Composable
private fun forPreview() {
    discountItemList()
}