package domain.mappers

import data.database.CardEntity
import domain.entities.Card

fun Card.toCardEntity() = CardEntity(
    id = id,
    name = name,
    imageSmall = image.small,
    imageLarge = image.large
)