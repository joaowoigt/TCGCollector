package di

import data.remote.KtorClient
import data.remote.TCGApi
import data.repositories.CardsRepository
import domain.repositories.ICardsRepository
import io.ktor.client.HttpClient
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import presentation.CardsListViewModel

val sharedModule = module {

    single<HttpClient> { KtorClient().create() }
    single { TCGApi(client = get()) }

    // Repositories
    single<ICardsRepository> { CardsRepository(api = get()) }

    // ViewModels
    viewModel { CardsListViewModel(cardsRepository = get()) }
}

expect val platformModule: Module