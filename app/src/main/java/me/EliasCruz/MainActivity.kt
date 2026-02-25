package me.EliasCruz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
