package presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import domain.repositories.ICardsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import presentation.states.CardsListState

class CardsListViewModel(
    private val cardsRepository: ICardsRepository
): ViewModel() {

    private val _state = MutableStateFlow<CardsListState>(CardsListState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val result = cardsRepository.getCardList()
            _state.value = CardsListState(cardsList = result.cards)
        }
    }
}