package presentation.components.patterns

import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import domain.entities.Card

@Composable
fun CollectionList(
    modifier: Modifier = Modifier,
    cardList: List<Card>,
    onCardClick: (Card) -> Unit,
    onButtonClick: (Card) -> Unit
) {
    LazyColumn(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
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