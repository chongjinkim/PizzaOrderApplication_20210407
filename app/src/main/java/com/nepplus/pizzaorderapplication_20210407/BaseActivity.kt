package com.nepplus.pizzaorderapplication_20210407

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    val mContext = this

    abstract fun setUpEvents()
    abstract fun setValue()
}