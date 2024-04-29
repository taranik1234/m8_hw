package com.example.m8_hw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.m8_hw.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green
                ) {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ProfileSection(fullName = "Tarani Kudaravalli")
                        ContactSection(modifier = Modifier)
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome $name!",
        modifier = modifier
    )
}

@Composable
fun ProfileSection(fullName: String, modifier: Modifier = Modifier) {

    val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        Box(
            modifier = modifier
                .background(color = Color.Red)
        ) {
            Image(
                painter = image,
                contentDescription = "Android Logo",
                modifier = Modifier
                    .size(250.dp)

            )
        }
        Spacer(modifier = Modifier.size(15.dp))




    }
}

@Composable
fun ContactSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Row(
                modifier = modifier.weight(0.6f),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    Icons.Outlined.Phone, contentDescription = "Phone Icon",
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            }
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = ":",
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "+123 456 3457",
                )
            }

        }
        Spacer(modifier = Modifier.size(4.dp))
        Row(
            modifier = modifier
                .fillMaxWidth(),

            ) {
            Row(
                modifier = modifier.weight(0.6f),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = "Social Icon",
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            }

            Row(
                modifier = Modifier.weight(1f),
            ) {
                Text(
                    text = ":",
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "tara_k",
                )

            }
        }
        Spacer(modifier = Modifier.size(4.dp))

        Row(
            modifier = modifier
                .fillMaxWidth(),


            ) {
            Row(
                modifier = modifier.weight(0.6f),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    Icons.Outlined.Email, contentDescription = "Phone Icon",
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            }


            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = ":",
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "kudaravalliv1.com",
                )
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Greeting("Android")
    }
}