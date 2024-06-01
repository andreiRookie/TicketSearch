package com.andreirookie.ticketsearchapp

import android.app.Application
import android.content.Context
import com.andreirookie.api.AppContextProvider
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface AppContextComponent : AppContextProvider {

    companion object {

        private var appContextProvider: AppContextProvider? = null

        fun getComponent(app: Application): AppContextProvider {
            return appContextProvider ?: DaggerAppContextComponent
                .builder()
                .bindContext(app.applicationContext)
                .build().also {
                    appContextProvider = it
                }
        }
    }

    @Component.Builder
    interface Builder {

        fun build(): AppContextComponent

        @BindsInstance
        fun bindContext(context: Context): Builder
    }
}