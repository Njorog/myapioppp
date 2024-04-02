package com.mburuu.myapiop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mburuu.myapiop.ui.theme.MyApiopTheme

class InputActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting2()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting2() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background ), contentDescription = null, modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)

        LazyColumn(modifier = Modifier.fillMaxSize())  {
            item {


            Column (modifier = Modifier.fillMaxSize()){
                var jina by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = jina,
                    modifier = Modifier.padding(20.dp),
                    onValueChange = {jina=it},
                    label = { Text(text = "Enter Name")})

                Spacer(modifier = Modifier.height(15.dp))


                var subj by remember {
                    mutableStateOf(TextFieldValue(""))

                }
                TextField(value = subj,
                    onValueChange = {subj=it},
                    modifier = Modifier.padding(20.dp),
                    textStyle = TextStyle(Color.LightGray),
                    leadingIcon = { Icon(imageVector = Icons.Default.AccountBox , contentDescription = "")},
                    label = { Text(text = "Enter E-mail")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    colors= TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Blue,
                        unfocusedBorderColor = Color.Unspecified,
                        focusedLabelColor = Color.Blue,
                        unfocusedLabelColor = Color.Green,
                        cursorColor = Color.Black,
                        focusedLeadingIconColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Green,





                        ))
                var num by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                TextField(value = num, onValueChange = {num=it},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.padding(20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Blue,
                        unfocusedBorderColor = Color.Unspecified,
                        focusedLabelColor = Color.Blue,
                        unfocusedLabelColor = Color.Green,
                        cursorColor = Color.Black,
                        focusedLeadingIconColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Green,



                        )
                )


            }
            Spacer(modifier = Modifier.height(70.dp))






        }

        }



    }


















}







