package com.andreirookie.api

import androidx.annotation.IdRes
import androidx.fragment.app.FragmentManager

interface HotelsFragmentMediator {
    fun openHotelsFragment(@IdRes containerId: Int, fragmentManager: FragmentManager)

}
