package presentation.screens.cardlist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import presentation.components.patterns.CollectionList
import presentation.screens.loading.LoadingScreen

@Composable
fun CardListScreen(
    modifier: Modifier = Modifier,
    viewModel: CardsListViewModel,
) {
    val state = viewModel.state.collectAsState()
    val cardList = state.value.cardsList

    Scaffold(
        modifier = modifier,
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            if (state.value.isLoading) {
                LoadingScreen()
            } else {
                CollectionList(
                    cardList = cardList,
                    onCardClick = { card ->
                        println("Abrindo a pokedex para ${card.name}")
                        viewModel.getSavedCard()
                    },
                    onButtonClick = { card ->
                        viewModel.addCard(card)
                        println("Você capturou ${card.name}")
                    }
                )
            }
        }
    }
}