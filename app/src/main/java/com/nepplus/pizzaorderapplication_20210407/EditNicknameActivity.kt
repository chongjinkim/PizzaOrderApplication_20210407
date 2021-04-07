package com.nepplus.pizzaorderapplication_20210407

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setUpEvents()
        setValue()
    }

    override fun setUpEvents() {
        TODO("Not yet implemented")
    }

    override fun setValue() {

        val newNick = newNickName.text.toString()

        val resultIntent = Intent()

        resultIntent.putExtra("new", newNick)

        setResult(Activity.RESULT_OK, resultIntent)

        finish()


    }
}