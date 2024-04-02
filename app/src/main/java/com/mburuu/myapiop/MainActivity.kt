package com.mburuu.myapiop

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mburuu.myapiop.ui.theme.MyApiopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {




        Box(modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.paper ), contentDescription = null, modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)


            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally){
                var jina by remember { mutableStateOf(TextFieldValue("")) }
                TextField(value = jina,
                    onValueChange = {jina=it},
                    label = { Text(text = "Enter Name")})

                Spacer(modifier = Modifier.height(15.dp))


                var subj by remember {
                    mutableStateOf(TextFieldValue(""))

                }
                TextField(value = subj,
                    onValueChange = {subj=it},
                    label = { Text(text = "Enter E-mail")})


                val abit= LocalContext.current
                Button(onClick = { abit.startActivity(Intent(abit,InputActivity3::class.java)) }) {
                    Text(text = "CLICK HERE")

                }

            }
            Spacer(modifier = Modifier.height(70.dp))

            Row {

                Text(text = "Explore the world here")
                Spacer(modifier = Modifier.height(40.dp))
                Text(text = "The best travel app in 2021.")
                Text(text = "Answer of traveler to find their journey")

                Spacer(modifier = Modifier.height(40.dp))

                var fill= LocalContext.current
                Button(onClick = {fill.startActivity(Intent(fill, InputActivity3::class.java))})   {
                    Text(text = "Create Account")

                }



            }




        }


















    }











