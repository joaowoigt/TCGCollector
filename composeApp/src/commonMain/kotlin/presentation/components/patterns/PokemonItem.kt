package presentation.components.patterns

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import domain.entities.Card
import presentation.components.CaptureButton
import presentation.components.PokemonCard

@Composable
fun PokemonItem(
    card: Card,
    onCardClick: (Card) -> Unit,
    onButtonClick: (Card) -> Unit
) {
    PokemonCard(
        card = card,
        onClick = {
            onCardClick.invoke(card)
        }
    )
    CaptureButton(
        text = {
            Text(
                text = "Catch this pokemon!",
                color = Color.Black,
            )
        },
        content = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add pokemon",
                tint = Color.Black
            )
        }
    ) {
        onButtonClick.invoke(card)
    }
}
