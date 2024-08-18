package com.example.getirclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.getirclone.ui.theme.GetirWhite

@Composable
fun GetirRectangleCardChip(){
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(90.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        border = CardDefaults.outlinedCardBorder()
    ) {
        Column(Modifier.background(GetirWhite)) {
            Image(painter = painterResource(id = R.drawable.getirrectanglecard), contentDescription = null,
                modifier = Modifier.fillMaxSize())
        }
    }
}