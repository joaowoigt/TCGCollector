package presentation.screens.cardlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.database.CardDao
import domain.entities.Card
import domain.mappers.toCardEntity
import domain.repositories.ICardsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import presentation.screens.cardlist.states.CardsListState

class CardsListViewModel(
    private val cardsRepository: ICardsRepository,
    private val cardDao: CardDao
) : ViewModel() {

    private val _state = MutableStateFlow<CardsListState>(CardsListState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.update {
                it.copy(isLoading = true)
            }
            val result = cardsRepository.getCardList()
            _state.update {
                it.copy(isLoading = false, cardsList = result.cards)
            }
        }
    }

    fun addCard(card: Card) {
        viewModelScope.launch {
            cardDao.upsert(card.toCardEntity())
        }
    }

    fun getSavedCard() {
        viewModelScope.launch {
            cardDao.getAll().collect { cardList ->
                cardList.forEach {
                    println(it.name)
                }
            }
        }
    }
}