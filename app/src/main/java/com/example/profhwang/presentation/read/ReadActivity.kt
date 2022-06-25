package com.example.profhwang.presentation.read

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.profhwang.R
import com.example.profhwang.databinding.ActivityReadBinding
import com.example.profhwang.util.BaseActivity
import com.example.profhwang.util.enqueueUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayoutMediator
import retrofit2.Call

class ReadActivity : BaseActivity<ActivityReadBinding>({
    ActivityReadBinding.inflate(it) }) {

    private lateinit var imageUrlList: List<String>
    private lateinit var imageViewPagerAdapter: ReadImageViewPagerAdapter
    private lateinit var readId : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initItemId()
    }

    private fun initItemId(){
        readId = intent.getStringExtra("id").toString()

}