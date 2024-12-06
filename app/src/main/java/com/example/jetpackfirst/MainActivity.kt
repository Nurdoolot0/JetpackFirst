package com.example.jetpackfirst

import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackfirst.ui.theme.JetpackFirstTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackFirstTheme {
                ProfileScreen()

            }
        }
    }
}
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = "Profile",
            fontSize = 24.sp,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 100.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.tobey),
            contentDescription = "Profile Picture",
            modifier = Modifier.padding(bottom = 30.dp)
                .size(170.dp)
                .background(Color.Gray, CircleShape)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Имя Пользователя",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 0.dp)
        )

        Text(
            text = "Описание",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 250.dp)
                .padding(vertical = 8.dp)
                .fillMaxWidth()
        )

        Button(
            onClick = { },
            modifier = Modifier.padding(bottom = 50.dp)
        ) {
            Text("Edit Profile")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    JetpackFirstTheme {
        ProfileScreen()
    }
}