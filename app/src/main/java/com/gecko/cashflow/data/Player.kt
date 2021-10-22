package com.gecko.cashflow.data

import android.util.Log

class Player(val name: String, var dream: String, val job: Job) {

    init {
        if (job.name == "doctor") {

        } else if (job.name == "pilot") {

        } else if (job.name == "lawyer") {

        } else if (job.name == "engineer") {

        } else if (job.name == "manager") {

        } else if (job.name == "teacher") {

        } else if (job.name == "nurse") {

        } else if (job.name == "police") {

        } else if (job.name == "driver") {

        } else if (job.name == "secretary") {

        } else if (job.name == "mechanic") {

        } else if (job.name == "janitor") {

        } else {
            Log.d("failure", "직업 초기화 실패")
        }
    }

}