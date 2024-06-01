package com.andreirookie.activity_main.di

import com.andreirookie.activity_main.MainActivity
import com.andreirookie.api.ProvidersFacade
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ProvidersFacade::class],
    modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    fun inject(activity: MainActivity)

    companion object {
        fun create(providersFacade: ProvidersFacade): MainActivityComponent {
            return DaggerMainActivityComponent
                .builder()
                .providersFacade(providersFacade)
                .build()
        }
    }
}