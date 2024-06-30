package data.mappers

import data.entities.CardResponse
import data.entities.ImagesResponse
import domain.entities.Card
import domain.entities.Images

internal fun CardResponse.mapToDomain() = Card(
    id = id,
    name = name,
    image = images.mapToDomain()
)

internal fun ImagesResponse.mapToDomain() = Images(
    small = small,
    large = large
)