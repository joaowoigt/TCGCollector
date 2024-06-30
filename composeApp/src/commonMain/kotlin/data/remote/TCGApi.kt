package data.remote

import data.entities.CardListResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType

private const val BASE_URL = "https://api.pokemontcg.io/v2/"

class TCGApi(private val client: HttpClient) {

    suspend fun getListOfCards(): HttpResponse {
        return client.get {
            url(BASE_URL + "cards")
            contentType(ContentType.Application.Json)
        }
    }
}