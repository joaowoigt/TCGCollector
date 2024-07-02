package presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import domain.entities.Card
import presentation.theme.Black
import presentation.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PokemonCard(
    card: Card,
    onClick: (Card) -> Unit = {}
) {
    androidx.compose.material.Card(
        modifier = Modifier
            .padding(24.dp)
            .size(width = 300.dp, height = 420.dp),
        border = BorderStroke(2.dp, Black),
        elevation = 8.dp,
        shape = Shapes.medium,
        onClick = {
            onClick.invoke(card)
        }
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxSize(),
            model = card.image.large,
            contentDescription = ""
        )
    }
}
