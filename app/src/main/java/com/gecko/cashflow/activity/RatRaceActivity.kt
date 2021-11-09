package com.gecko.cashflow.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.provider.Settings
import android.view.View
import android.widget.Toast
import androidx.core.view.updatePadding
import androidx.core.widget.addTextChangedListener
import com.gecko.cashflow.databinding.ActivityRatRaceBinding
import kotlin.concurrent.thread

class RatRaceActivity : BaseActivity() {

    val binding by lazy { ActivityRatRaceBinding.inflate(layoutInflater) }

    var isSalaryEdtEmpty: Boolean = true
    var isPassiveIncomeEdtEmpty: Boolean = true
    var isTotalExpenses: Boolean = true

    var salary = 0
    var passiveIncome = 0
    var totalIncome = 0
    var totalExpenses = 0
    var cashFlow = 0

    lateinit var job: String
    lateinit var dream: String
    lateinit var auditor: String

    val handlerUserInputOk = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            binding.totalIncomeEdt.setText("testing...")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setValues()
        setupEvents()


    }

    override fun onResume() {
        super.onResume()
//        thread {
//            if (!isSalaryEdtEmpty && !isPassiveIncomeEdtEmpty && !isTotalExpenses) {
//                handlerUserInputOk.sendEmptyMessage(0)
//            }
//        }.start()
    }

    override fun setupEvents() {
        binding.salaryEdt.addTextChangedListener {
            if (it.toString() != "") {
                isSalaryEdtEmpty = false
                salary = binding.salaryEdt.text.toString().toInt()
            }
        }
        binding.passiveIncomeEdt.addTextChangedListener {
            if (it.toString() != "") {
                isPassiveIncomeEdtEmpty = false
                passiveIncome = binding.passiveIncomeEdt.text.toString().toInt()
            }
        }
        binding.passiveIncomeEdt.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            if (!b && !isSalaryEdtEmpty && !isPassiveIncomeEdtEmpty) {
                totalIncome = salary + passiveIncome
                binding.totalIncomeEdt.text = totalIncome.toString()
            }
        }
        
        binding.totalExpensesEdt.addTextChangedListener {
            if (it.toString() != "") {
                isTotalExpenses = false
                totalExpenses = binding.totalExpensesEdt.text.toString().toInt()
            }

        }
        binding.totalExpensesEdt.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            if (!b && totalIncome != 0) {
                cashFlow = totalIncome - totalExpenses
                binding.cashFlowEdt.text = cashFlow.toString()
            }
        }
        
    }

    override fun setValues() {
        job = intent.getStringExtra("job").toString()
        dream = intent.getStringExtra("dream").toString()
        auditor = intent.getStringExtra("auditor").toString()
        binding.jobTxt.text = job
        binding.dreamTxt.text = dream
        binding.auditorTxt.text = auditor
    }
}