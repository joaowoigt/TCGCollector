package presentation.states

import domain.entities.Card

data class CardsListState(
    var isLoading: Boolean = false,
    var cardsList: List<Card> = emptyList()
)
