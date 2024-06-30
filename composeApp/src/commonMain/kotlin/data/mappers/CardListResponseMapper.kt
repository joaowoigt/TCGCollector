package data.mappers

import data.entities.CardListResponse
import domain.entities.CardList

internal fun CardListResponse.mapToDomain() = CardList(
    cards = data.map { it.mapToDomain() }
)