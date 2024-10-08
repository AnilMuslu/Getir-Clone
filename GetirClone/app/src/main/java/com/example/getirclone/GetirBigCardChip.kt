package com.example.getirclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.getirclone.ui.theme.GetirWhite

@Composable
fun GetirBigCardChip(onClick: () -> Unit){
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(180.dp)
            .padding(8.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        border = CardDefaults.outlinedCardBorder()
    ) {
        Column(Modifier.background(GetirWhite)) {
            Image(painter = painterResource(id = R.drawable.getirbigcard), contentDescription = null,
                modifier = Modifier.fillMaxSize())
        }
        //Text(text = "Getir Büyük", modifier = Modifier.padding(16.dp), color = Purple40)
    }
}