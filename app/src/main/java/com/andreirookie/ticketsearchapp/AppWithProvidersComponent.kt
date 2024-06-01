package com.andreirookie.ticketsearchapp

import android.app.Application
import com.andreirookie.api.AppContextProvider
import com.andreirookie.api.ProvidersFacade
import com.andreirookie.impl.di.HotelsFragmentExternalModule
import com.andreirookie.impl.di.SearchFragmentExternalModule
import dagger.Component

@Component(
    dependencies = [AppContextProvider::class],
    modules = [
        SearchFragmentExternalModule::class,
        HotelsFragmentExternalModule::class
    ]
)
interface AppWithProvidersComponent : ProvidersFacade {
    companion object {
        fun init(app: Application): AppWithProvidersComponent {
            return DaggerAppWithProvidersComponent.builder()
                .appContextProvider(AppContextComponent.getComponent(app))
                .build()
        }
    }
}