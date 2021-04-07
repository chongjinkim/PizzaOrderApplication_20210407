
package com.nepplus.pizzaorderapplication_20210407

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.pizzaorderapplication_20210407.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mViewPagerAdapter : MainViewPagerAdapter

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValue()
    }

    override fun setUpEvents() {

    }

    override fun setValue() {

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)
    }

}