package com.lawerly.rajatmareclbeck.lawerly

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MainAdapter(fm: FragmentManager, itemCount: Int) : FragmentStatePagerAdapter(fm) {

   private var itemCount: Int = itemCount
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItem(position: Int): Fragment = when (position) {
        0 -> ListFragment.newInstance()
        1 -> ListFragment.newInstance()
        2 -> ListFragment.newInstance()
        else -> ListFragment.newInstance()
    }

    override fun getCount() = itemCount
}