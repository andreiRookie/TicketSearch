package com.andreirookie.impl.di

import com.andreirookie.api.SearchFragmentMediator
import com.andreirookie.impl.SearchFragmentMediatorImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface SearchFragmentExternalModule {

    @Binds
    @IntoMap
    @ClassKey(SearchFragmentMediator::class)
    fun bindMediator(impl: SearchFragmentMediatorImpl): Any
}