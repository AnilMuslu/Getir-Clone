package com.example.getirclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.layout.windowInsetsStartWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.getirclone.ui.theme.GetirBlack
import com.example.getirclone.ui.theme.GetirCloneTheme
import com.example.getirclone.ui.theme.GetirPurple1
import com.example.getirclone.ui.theme.GetirWhite
import com.example.getirclone.ui.theme.GetirYellow1
import com.example.getirclone.ui.theme.Purple40
import com.example.getirclone.ui.theme.Purple80


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GetirCloneTheme {
                FirstScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(){
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CenterAlignedTopAppBar(
                    title = { Text(text = "Ev, Girne Mah. 530.sokak")},
                    modifier = Modifier.windowInsetsStartWidth(WindowInsets(left = 300.dp)),
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = GetirWhite,
                        titleContentColor = GetirBlack
                    )
                )
                CenterAlignedTopAppBar(
                    title = { Text(text = "TVS        14 dk", fontWeight = FontWeight.Bold)},
                    modifier = Modifier.windowInsetsEndWidth(WindowInsets(right = 120.dp)),
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = GetirYellow1,
                        titleContentColor = GetirPurple1
                    )
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.promotion),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                Alignment.TopCenter
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Top
            ) {
                GetirBigCardChip()
                GetirBigCardChip()
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Top
            ) {
                GetirBigCardChip()
                GetirBigCardChip()
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Top
            ) {
                GetirBigCardChip()
                GetirBigCardChip()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    GetirCloneTheme {
        FirstScreen()
    }
}