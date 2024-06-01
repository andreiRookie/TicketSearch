package com.andreirookie.impl

import androidx.fragment.app.FragmentManager
import com.andreirookie.api.HotelsFragmentMediator
import javax.inject.Inject

class HotelsFragmentMediatorImpl
@Inject constructor() : HotelsFragmentMediator {
        override fun openHotelsFragment(containerId: Int, fragmentManager: FragmentManager) {
        fragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(containerId, HotelsFragment())
            .addToBackStack("hotels")
            .commit()
    }
}