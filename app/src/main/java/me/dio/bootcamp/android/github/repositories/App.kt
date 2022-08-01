package me.dio.bootcamp.android.github.repositories

import android.app.Application
import me.dio.bootcamp.android.github.repositories.data.di.DataModule
import me.dio.bootcamp.android.github.repositories.domain.di.DomainModule
import me.dio.bootcamp.android.github.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }
        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}