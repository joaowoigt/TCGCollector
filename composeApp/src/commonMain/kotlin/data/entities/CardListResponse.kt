package data.entities

import kotlinx.serialization.Serializable

@Serializable
data class CardListResponse(
    val data: List<CardResponse>,
    val page: Int,
    val pageSize: Int,
    val count: Int,
    val totalCount: Int
)
