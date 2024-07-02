package presentation.screens.cardlist.states

import domain.entities.Card

data class CardsListState(
    var isLoading: Boolean = true,
    var cardsList: List<Card> = emptyList()
)
