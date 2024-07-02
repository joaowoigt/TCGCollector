package presentation.components.patterns

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import domain.entities.Card

@Composable
fun CollectionList(
    modifier: Modifier = Modifier,
    cardList: List<Card>,
    onCardClick: (Card) -> Unit,
    onButtonClick: (Card) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(cardList) { card ->
            PokemonItem(
                card = card,
                onCardClick = {
                    onCardClick.invoke(card)
                },
                onButtonClick = {
                    onButtonClick.invoke(card)
                }
            )
        }
    }
}