package di

import data.database.CardDao
import data.database.CardDatabase
import data.database.getCardDatabase
import org.koin.dsl.module

actual val platformModule = module {

    single<CardDao> { getCardDatabase().cardDao() }

}