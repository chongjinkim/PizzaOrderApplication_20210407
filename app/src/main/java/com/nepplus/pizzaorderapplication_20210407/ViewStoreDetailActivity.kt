package com.nepplus.pizzaorderapplication_20210407

import android.Manifest
import android.content.Intent
import android.content.Intent.ACTION_CALL
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import com.nepplus.pizzaorderapplication_20210407.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.store_list_item.*


class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setUpEvents()
        setValue()
    }

    override fun setUpEvents() {

        callBtn.setOnClickListener {

            val p1 = object : PermissionListener {
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${mStore.phoneNum}")
                    val myIntent = Intent(ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext, "전화 연결 불가", Toast.LENGTH_SHORT).show()
                }


            }

            TedPermission.with(mContext)
                    .setPermissionListener(p1)
                    .setDeniedMessage("[설정]에서 전화 권환을 허용해주세요")
                    .setPermissions(Manifest.permission.CALL_PHONE)
                    .check()

        }

    }

    override fun setValue() {

        mStore = intent.getSerializableExtra("pizza") as Store

        Glide.with(mContext).load(mStore.logoURL).into(logoImage)
        storeName.text = mStore.name
        phoneNumber.text = mStore.phoneNum

    }
}