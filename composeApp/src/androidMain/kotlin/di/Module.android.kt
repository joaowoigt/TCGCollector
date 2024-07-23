package di

import data.database.CardDao
import data.database.CardDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.core.module.Module
import org.koin.dsl.module
import org.woigt.tcgcolector.database.getCardDatabase

actual val platformModule = module {


    single<CardDao> { getCardDatabase(context = androidApplication()).cardDao() }
}