package com.example.blackdragon.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.blackdragon.R
import com.example.blackdragon.ui.theme.Typography
import com.example.blackdragon.ui.theme.circleColor

@Composable
fun BottomFixBar(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp),
            contentAlignment = Alignment.Center // Center content within the Box
        ) {
            Image(
                painter = painterResource(id = R.drawable.thik_hai),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { /* Handle Home click */ },modifier= Modifier
                        .clip(shape = CircleShape)
                        .background(
                            circleColor
                        )) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Home",
                            tint = Color.White,
                        )

                    }
                    Text(text = "Home", fontSize = Typography.labelSmall.fontSize)

                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { /* Handle Favorite click */ },modifier= Modifier
                        .clip(shape = CircleShape)
                        .background(
                            circleColor
                        ) ){
                        Icon(Icons.Filled.ShoppingCart, contentDescription = "Favorite", tint = Color.White)

                    }
                    Text(text = "Cart", fontSize = Typography.labelSmall.fontSize)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    IconButton(onClick = { /* Handle Favorite click */ },modifier= Modifier
                        .clip(shape = CircleShape)
                        .background(
                            circleColor
                        ) ){
                        Icon(Icons.Filled.Favorite, contentDescription = "Favorite", tint = Color.White)
                    }
                    Text(text = "Saved", fontSize = Typography.labelSmall.fontSize)
                }

                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    IconButton(onClick = { /* Handle Settings click */ },modifier= Modifier
                        .clip(shape = CircleShape)
                        .background(
                            circleColor
                        ) ){
                        Icon(Icons.Filled.Notifications, contentDescription = "Settings", tint = Color.White)
                    }
                    Text(text = "Notification", fontSize = 8.sp)
                }

            }

        }

    }

}

@Preview
@Composable
private fun test() {
    BottomFixBar()

}