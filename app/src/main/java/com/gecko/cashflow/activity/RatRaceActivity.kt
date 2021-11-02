package com.gecko.cashflow.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gecko.cashflow.databinding.ActivityRatRaceBinding

class RatRaceActivity : BaseActivity() {

    val binding by lazy { ActivityRatRaceBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setValues()
        setupEvents()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}