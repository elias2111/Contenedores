package me.EliasCruz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.EliasCruz.ui.theme.ContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ContentScreen() {
    Column(modifier = Modifier
        .background(Color.Gray)
        .padding(18.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .padding(all = 18.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Inicio",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(all = 8.dp)
            )
            Text(
                text = "Perfil",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(all = 8.dp)
            )
            Text(
                text = "Configuracion",
                modifier = Modifier
                    .background(Color.Green)
                    .padding(all = 8.dp)
            )

        }
        Text(
            text = "Encabezado",
            modifier = Modifier
                .background(Color.Red)
                .padding(all = 8.dp)
        )
        Text(
            text = "Cuerpo",
            modifier = Modifier
                .background(Color.Red)
                .padding(all = 8.dp)
        )
        Text(
            text = "Footer",
            modifier = Modifier
                .background(Color.Red)
                .padding(all = 8.dp)
        )

    }
    }


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CheckScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.check),
            contentDescription = "Check",
            modifier = Modifier
                .size(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "All tasks completed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Nice work!",
            fontSize = 14.sp,
            color = Color.Gray
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CuadranteScreen() {

    Column(modifier = Modifier.fillMaxSize()) {

        Row(modifier = Modifier.weight(1f)) {

            QuadrantItem(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )

            QuadrantItem(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(modifier = Modifier.weight(1f)) {

            QuadrantItem(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )

            QuadrantItem(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantItem(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = description
        )
    }
}
