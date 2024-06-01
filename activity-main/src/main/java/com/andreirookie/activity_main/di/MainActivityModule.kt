package com.andreirookie.activity_main.di

import com.andreirookie.api.HotelsFragmentMediator
import com.andreirookie.api.SearchFragmentMediator
import dagger.Module
import dagger.Provides
import javax.inject.Provider

@Module
interface MainActivityModule {
    companion object {

        @Provides
        fun provideSearchFragmentMediator(map: Map<Class<*>, @JvmSuppressWildcards Provider<Any>>): SearchFragmentMediator {
            return map[SearchFragmentMediator::class.java]!!.get() as SearchFragmentMediator
        }

        @Provides
        fun provideHotelsFragmentMediator(map: Map<Class<*>, @JvmSuppressWildcards Provider<Any>>): HotelsFragmentMediator {
            return map[HotelsFragmentMediator::class.java]!!.get() as HotelsFragmentMediator
        }
    }
}