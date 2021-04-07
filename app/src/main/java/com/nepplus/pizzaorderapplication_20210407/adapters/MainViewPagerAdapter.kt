package com.nepplus.pizzaorderapplication_20210407.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.pizzaorderapplication_20210407.fragments.MyProfileFragment
import com.nepplus.pizzaorderapplication_20210407.fragments.PizzaStoreFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }


    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PizzaStoreFragment()
            else -> MyProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }


}