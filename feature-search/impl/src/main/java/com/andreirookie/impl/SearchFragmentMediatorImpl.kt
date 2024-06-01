package com.andreirookie.impl

import androidx.fragment.app.FragmentManager
import com.andreirookie.api.SearchFragmentMediator
import javax.inject.Inject

class SearchFragmentMediatorImpl
@Inject constructor() : SearchFragmentMediator {

    override fun openSearchFragment(containerId: Int, fragmentManager: FragmentManager) {
        fragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(containerId, SearchFragment())
            .addToBackStack("search")
            .commit()
    }

}