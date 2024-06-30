package domain.repositories

import domain.entities.CardList

interface ICardsRepository {

    suspend fun getCardList(): CardList
}