package data.remote

import io.ktor.client.HttpClient

expect class KtorClient() {
    fun create(): HttpClient
}