package data.repositories

import data.entities.CardListResponse
import data.mappers.mapToDomain
import data.remote.TCGApi
import domain.entities.CardList
import domain.repositories.ICardsRepository
import io.ktor.client.call.body

class CardsRepository(private val api: TCGApi): ICardsRepository {

    override suspend fun getCardList(): CardList {
        val result = api.getListOfCards()
        return result.body<CardListResponse>().mapToDomain()
    }
}