package presentation.components.patterns

import androidx.compose.runtime.Composable
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
    CaptureButton {
        onButtonClick.invoke(card)
    }
}
