package com.mburuu.myapiop

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mburuu.myapiop.ui.theme.MyApiopTheme

class AssignmentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting3()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting3() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)

    ) {
        item {
            Column(
                modifier = Modifier.fillMaxSize(),


                horizontalAlignment = Alignment.CenterHorizontally,


                ) {
                Row {
                    Image(imageVector = Icons.Default.AccountBox, contentDescription = null)
                    Spacer(modifier = Modifier.width(100.dp))
                    Text(text = "Current location")
                    Spacer(modifier = Modifier.width(100.dp))

                    Image(imageVector = Icons.Default.Settings, contentDescription = null)


                }
                Row(modifier = Modifier.padding(10.dp)) {

                    var hotel = LocalContext.current

                    Button(
                        onClick = {
                            hotel.startActivity(
                                Intent(
                                    hotel,
                                    InputActivity3::class.java
                                )
                            )
                        },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),


                        shape = RectangleShape,
                    ) {
                        Image(imageVector = Icons.Default.Home, contentDescription = null)
                        Text(text = "Hotel", fontWeight = FontWeight.Bold, color = Color.Black)

                    }

                    Spacer(modifier = Modifier.width(40.dp))


                    var taxi = LocalContext.current
                    Button(
                        onClick = { taxi.startActivity(Intent(taxi, InputActivity3::class.java)) },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RectangleShape
                    ) {
                        Image(imageVector = Icons.Default.Home, contentDescription = null)
                        Text(
                            text = "Holiday", fontWeight = FontWeight.Bold, color = Color.Black
                        )

                    }


                }


                Row(modifier = Modifier.padding(20.dp)) {


                    var harbour = LocalContext.current
                    Button(
                        onClick = { harbour.startActivity(Intent(harbour, InputActivity3::class.java)) },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RectangleShape,
                    ) {
                        Image(imageVector = Icons.Default.Home, contentDescription = null)
                        Text(text = "Harbour", fontWeight = FontWeight.Bold, color = Color.Black)

                    }

                    Spacer(modifier = Modifier.width(40.dp))


                    var airplane = LocalContext.current
                    Button(
                        onClick = {
                            airplane.startActivity(
                                Intent(
                                    airplane,
                                    InputActivity3::class.java
                                )
                            )
                        },
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RectangleShape,
                    ) {
                        Image(imageVector = Icons.Default.Home, contentDescription = null)
                        Text(text = "Airplane", fontWeight = FontWeight.Bold, color = Color.Black)

                    }


                }
            }



            Row(modifier = Modifier.padding(20.dp)) {

                var hotel = LocalContext.current
                Button(
                    onClick = { hotel.startActivity(Intent(hotel, InputActivity3::class.java)) },
                    modifier = Modifier.padding(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape,

                    ) {
                    Image(imageVector = Icons.Default.Home, contentDescription = null)
                    Text(text = "Ticket", fontWeight = FontWeight.Bold, color = Color.Black)

                }

                Spacer(modifier = Modifier.width(80.dp))


                var taxi = LocalContext.current
                Button(
                    onClick = { taxi.startActivity(Intent(taxi, InputActivity3::class.java)) },
                    modifier = Modifier.padding(10.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape,


                    ) {
                    Image(imageVector = Icons.Default.Home, contentDescription = null)
                    Text(text = "Taxi", fontWeight = FontWeight.Bold, color = Color.Black)

                }






                Spacer(modifier = Modifier.height(70.dp))


            }
            Row {
                Text(text = "Popular in town", modifier = Modifier.padding(0.dp))

                Spacer(modifier = Modifier.width(200.dp))
                var hij = LocalContext.current
                Text(text = "view all", Modifier.clickable { hij.startActivity(Intent(hij, InputActivity3::class.java)) }, color = Color.Blue
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(modifier = Modifier.padding(40.dp)) {


                Spacer(modifier = Modifier.height(10.dp))
                Card() {
                    Image(painterResource(id = R.drawable.car1), contentDescription = null)

                    Text(text = "Ferrari", fontStyle = FontStyle.Italic, color = Color.Black)


                }
                Spacer(modifier = Modifier.width(90.dp))

                Card {
                    Image(painterResource(id = R.drawable.car4), contentDescription = null)

                    Text(text = "Veneno", fontStyle = FontStyle.Italic, color = Color.Black)


                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.padding(40.dp)) {


                Card {
                    Image(painterResource(id = R.drawable.car3), contentDescription = null)


                    Text(text = "Lambo", fontStyle = FontStyle.Italic, color = Color.Black)

                }

                Spacer(modifier = Modifier.width(90.dp))
                Card {
                    Image(painterResource(id = R.drawable.untitled), contentDescription = null)


                    Text(text = "Audi", fontStyle = FontStyle.Italic, color = Color.Black)

                }

            }
        }




















            }


        }








