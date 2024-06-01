package com.andreirookie.api

import androidx.annotation.IdRes
import androidx.fragment.app.FragmentManager

interface SearchFragmentMediator {
    fun openSearchFragment(@IdRes containerId: Int, fragmentManager: FragmentManager)
}