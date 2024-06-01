package com.andreirookie.api.mediators

import javax.inject.Provider

interface MediatorsProvider {
    fun provideMediators(): Map<Class<*>, @JvmSuppressWildcards Provider<Any>>
}