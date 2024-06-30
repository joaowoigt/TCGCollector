package data.entities

import kotlinx.serialization.Serializable

@Serializable
data class CardResponse(
    val id: String,
    val name: String,
    val images: ImagesResponse
)

@Serializable
data class ImagesResponse(
    val small: String,
    val large: String
)
