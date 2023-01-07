package com.example.entrainementkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.entrainementkotlin.ui.theme.EntrainementKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EntrainementKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Body()
                }
            }
        }
    }
}

@Composable
fun Body() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.kart_mario),
                contentDescription = "Kart Mario",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
            )
            Text(
                text = "Mario",
                style = MaterialTheme.typography.h1
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Depuis 1981, Mario nous régale dans de nombreux jeux.\nEnnemi juré de Bowser et toujours prêt pour sauver la princesse Peach.\nVoici un petit florilège des possibilités dans Mario Kart !!",
            modifier = Modifier.padding(22.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Here we go !!!!",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            style = MaterialTheme.typography.h1,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(50.dp))
        RowDesc(
            id = R.drawable.banane_mario_kart,
            text = "La banane: Balancer sur la route et vos adversaires feront des 360° à n'en plus finir!! Hihihi..."
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.bombe_mario_kart),
                contentDescription = null,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
            Text(
                text = "Allez, on fait péter la bombe! Boooummm!!",
                modifier = Modifier.padding(start = 10.dp),
                style = MaterialTheme.typography.body1
            )
        }
        /*RowDesc(
            id = R.drawable.bombe_mario_kart,
            text = "Allez, on fait péter la bombe! Boooummm!!"
        )*/
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.etoile_mario_kart),
                contentDescription = null,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
            Text(
                text = "Et hop, invincible!! Waaouh...",
                modifier = Modifier.padding(start = 10.dp),
                style = MaterialTheme.typography.body1
            )
        }
        /*RowDesc(
            id = R.drawable.etoile_mario_kart,
            text = "Et hop, invincible!! Waaouh..."
        )*/
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.carapace_bleu_mario_kart),
                contentDescription = null,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
            Text(
                text = "LA CARAPACE de la mort qui tue!! Avec ça, le premier peux devenir le dernier...",
                modifier = Modifier.padding(start = 10.dp),
                style = MaterialTheme.typography.body1
            )
        }
        /*RowDesc(
            id = R.drawable.carapace_bleu_mario_kart,
            text = "LA CARAPACE de la mort qui tue!! Avec ça, le premier peux devenir le dernier..."
        )*/
    }
}

@Composable
fun RowDesc(id: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = id),
            contentDescription = null,
            modifier = Modifier.clip(RoundedCornerShape(50.dp))
        )
        Text(
            text = text,
            modifier = Modifier.padding(start = 10.dp),
            style = MaterialTheme.typography.body1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EntrainementKotlinTheme {
        Body()
    }
}