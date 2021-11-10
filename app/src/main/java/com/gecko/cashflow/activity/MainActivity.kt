package com.gecko.cashflow.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.gecko.cashflow.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val jobData = arrayOf("Doctor(의사)", "Airline Pilot(비행기 조종사)", "Lawyer(변호사)", "Engineer(공학자)",
        "Business MGR(비즈니스 매니저)", "Teacher(교사)", "Nurse(간호사)", "Police Officer(경찰관)",
        "Secretary(비서)", "Truck Driver(트럭 운전사)", "Mechanic(정비공)", "Janitor(관리인)")

    private val dreamData = arrayOf("Buy a forest", "Premier league season ticket", "Research center for covid19 & epidemic",
        "Biz school for kid", "Yacht racing", "A world tour in a camping car", "House with garden", "Mini-farm in the city",
        "Buy a ferrari", "The power of 5 campaign", "Dinner with elon musk", "Heli-board the new zealand",
        "NBA basketball team acquisition", "Save the ocean", "Children\'s hospital", "Golf around the world",
        "Buy a personal jet", "Sponsorship of an art contest", "Southeast asia spa & yoga trip", "Hawaii island fantasy",
        "Capitalists\'peace corps", "Private cruise the mediterranean", "Cultural space for young people")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setValues()
        setupEvents()
    }

    override fun setupEvents() {
        binding.startBtn.setOnClickListener {
            val myIntent = Intent(mContext, RatRaceActivity::class.java)
            myIntent.putExtra("job", jobData[binding.jobSpinner.selectedItemId.toInt()])
            myIntent.putExtra("dream", dreamData[binding.dreamSpinner.selectedItemId.toInt()])
            myIntent.putExtra("auditor", binding.auditorEdt.text.toString())
            startActivity(myIntent)
            finish()
        }
        binding.jobSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                binding.jobTxt.text = "선택된 직업: ${jobData[p2]}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        binding.dreamSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                binding.dreamTxt.text = "선택된 꿈: ${dreamData[p2]}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    override fun setValues() {
        val jobAdapter = ArrayAdapter(mContext, android.R.layout.simple_list_item_1, jobData)
        val dreamAdapter = ArrayAdapter(mContext, android.R.layout.simple_list_item_1, dreamData)
        binding.jobSpinner.adapter = jobAdapter
        binding.dreamSpinner.adapter = dreamAdapter
    }

}