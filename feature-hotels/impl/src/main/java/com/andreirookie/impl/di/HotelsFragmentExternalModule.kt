package com.andreirookie.impl.di

import com.andreirookie.api.HotelsFragmentMediator
import com.andreirookie.impl.HotelsFragmentMediatorImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface HotelsFragmentExternalModule {

    @Binds
    @IntoMap
    @ClassKey(HotelsFragmentMediator::class)
    fun bindMediator(impl: HotelsFragmentMediatorImpl): Any
}