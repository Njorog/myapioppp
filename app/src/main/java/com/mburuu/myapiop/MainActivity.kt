package com.mburuu.myapiop

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.mburuu.myapiop.ui.theme.MyApiopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()


        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting() {

LazyColumn {
    item {


            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally){


                var subj by remember {
                    mutableStateOf(TextFieldValue(""))

                }
                TextField(value = subj,
                    onValueChange = {subj=it},
                    modifier = Modifier.padding(20.dp),
                    textStyle = TextStyle(Color.LightGray),
                    leadingIcon = { Icon(imageVector = Icons.Default.AccountBox , contentDescription = "") },
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




















                Spacer(modifier = Modifier.height(60.dp))






                val result = remember { mutableStateOf<Uri?>(null) }
                val launcher = rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) {
                    result.value = it
                }

                Column {
                    Button(onClick = {
                        launcher.launch(
                            PickVisualMediaRequest(mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly)
                        )
                    }) {
                        Text(text = "Select Image")
                    }

                    result.value?.let { image ->

                        val painter = rememberAsyncImagePainter(
                            ImageRequest
                                .Builder(LocalContext.current)
                                .data(data = image)
                                .build()
                        )
                        Image(
                            painter = painter,
                            contentDescription = null,
                            modifier = Modifier
                                .size(150.dp, 150.dp)
                                .padding(16.dp)
                        )
                    }

                    val rig = LocalContext.current
                    Button(onClick = { rig.startActivity(Intent(rig , webite::class.java)) }) {
                        Text(text = " click here")

                    }


                }

                Spacer(modifier = Modifier.width(100.dp))





















Spacer(modifier = Modifier.height(60.dp))


                Card {

                    Row {
                        Image(painter = painterResource(id = R.drawable.untitled), contentDescription = null)

                    }




                }
                
                Spacer(modifier = Modifier.height(30.dp))
                Card {




                }



                Row {


                    AsyncImage(
                        model = "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/u_126ab356-44d8-4a06-89b4-fcdcc8df0245,c_scale,fl_relative,w_1.0,h_1.0,fl_layer_apply/7d8ca40f-a751-464a-98e9-b82f0e20be0c/air-jordan-1-low-shoes-6Q1tFM.png",
                        contentDescription = null,
                    )

                }


















            }


        Spacer(modifier = Modifier.height(70.dp))






    }


}
}
































