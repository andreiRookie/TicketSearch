package com.andreirookie.ticketsearchapp

import android.app.Application
import com.andreirookie.api.AppWithProvidersFacadeProvider
import com.andreirookie.api.ProvidersFacade

class TicketSearchApp : Application(), AppWithProvidersFacadeProvider {

    companion object {
        private var appWithProvidersComponent: AppWithProvidersComponent? = null
    }

    override fun provideFacade(): ProvidersFacade {
        return appWithProvidersComponent ?: AppWithProvidersComponent.init(this)
            .also { appWithProvidersComponent = it }
    }

    override fun onCreate() {
        super.onCreate()
        provideFacade()
    }


}