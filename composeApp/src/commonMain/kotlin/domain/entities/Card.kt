package domain.entities

data class Card(
    val id: String,
    val name: String,
    val image: Images
)

data class Images(
    val small: String,
    val large: String
)