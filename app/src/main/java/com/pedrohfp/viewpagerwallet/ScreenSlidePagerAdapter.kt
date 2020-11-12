package com.pedrohfp.viewpagerwallet

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ScreenSlidePagerAdapter(
    fm: FragmentManager
) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragmentList = listOf(
        ViewPagerVO(ViewTypeEnum.BUTTON, ButtonFragment()),
        ViewPagerVO(ViewTypeEnum.BUTTON, ButtonFragment()),
        ViewPagerVO(ViewTypeEnum.CARD, CardFragment()),
        ViewPagerVO(ViewTypeEnum.CARD, CardFragment()),
        ViewPagerVO(ViewTypeEnum.CARD, CardFragment())
    )

    override fun getCount(): Int = fragmentList.size

    override fun getItem(position: Int): Fragment {
        return fragmentList[position].fragment
    }

    override fun getPageWidth(position: Int): Float {
        return when(fragmentList[position].viewType) {
            ViewTypeEnum.BUTTON -> 0.55f
            ViewTypeEnum.CARD -> 1f
        }
    }
}