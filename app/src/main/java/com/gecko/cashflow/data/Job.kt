package com.gecko.cashflow.data

import android.util.Log

class Job(val name: String) {

    var cash = 0

    // income
    var salary: Int = 0

    // expenses
    var taxes: Int = 0
    var homeMortgagePayment: Int = 0
    var schoolLoansPayment: Int = 0
    var carLoansPayment: Int = 0
    var creditLoansPayment: Int = 0
    var otherExpenses: Int = 0
    var bankLoanPayment: Int = 0
    var expensesPerChild: Int = 0
    var childExpenses: Int = 0

    // Assets
    var savings: Int = 0

    // Liabilities
    var homeMortgage: Int = 0
    var schoolLoans: Int = 0
    var carLoans: Int = 0
    var creditCard: Int = 0

    //
    var passiveIncome = 0
    var totalIncome = 0
    var totalExpenses = 0
    var monthlyCashFlow = 0

    init {
        if (name == "doctor") {

            salary = 13200

            taxes = 3200
            homeMortgagePayment = 1900
            schoolLoansPayment = 700
            carLoansPayment = 300
            creditLoansPayment = 200
            otherExpenses = 2000
            expensesPerChild = 700

            savings = 3500

            homeMortgage = 202000
            schoolLoans = 150000
            carLoans = 19000
            creditCard = 10000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "pilot") {

            salary = 9500

            taxes = 2000
            homeMortgagePayment = 1000
            schoolLoansPayment = 0
            carLoansPayment = 300
            creditLoansPayment = 700
            otherExpenses = 2000
            expensesPerChild = 400

            savings = 2500

            homeMortgage = 90000
            schoolLoans = 0
            carLoans = 15000
            creditCard = 22000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "lawyer") {

            salary = 7500

            taxes = 1800
            homeMortgagePayment = 1100
            schoolLoansPayment = 300
            carLoansPayment = 200
            creditLoansPayment = 200
            otherExpenses = 1500
            expensesPerChild = 400

            savings = 2000

            homeMortgage = 115000
            schoolLoans = 78000
            carLoans = 11000
            creditCard = 7000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "engineer") {

            salary = 4900

            taxes = 1000
            homeMortgagePayment = 700
            schoolLoansPayment = 100
            carLoansPayment = 200
            creditLoansPayment = 200
            otherExpenses = 1000
            expensesPerChild = 200

            savings = 400

            homeMortgage = 75000
            schoolLoans = 12000
            carLoans = 7000
            creditCard = 5000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "manager") {

            salary = 4600

            taxes = 900
            homeMortgagePayment = 700
            schoolLoansPayment = 100
            carLoansPayment = 100
            creditLoansPayment = 200
            otherExpenses = 1000
            expensesPerChild = 300

            savings = 400

            homeMortgage = 75000
            schoolLoans = 12000
            carLoans = 6000
            creditCard = 4000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "teacher") {

            salary = 3300

            taxes = 500
            homeMortgagePayment = 500
            schoolLoansPayment = 100
            carLoansPayment = 100
            creditLoansPayment = 200
            otherExpenses = 700
            expensesPerChild = 200

            savings = 400

            homeMortgage = 50000
            schoolLoans = 12000
            carLoans = 5000
            creditCard = 4000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "nurse") {

            salary = 3100

            taxes = 600
            homeMortgagePayment = 400
            schoolLoansPayment = 100
            carLoansPayment = 100
            creditLoansPayment = 200
            otherExpenses = 600
            expensesPerChild = 200

            savings = 500

            homeMortgage = 47000
            schoolLoans = 6000
            carLoans = 5000
            creditCard = 4000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "police") {

            salary = 3000

            taxes = 600
            homeMortgagePayment = 400
            schoolLoansPayment = 0
            carLoansPayment = 100
            creditLoansPayment = 100
            otherExpenses = 700
            expensesPerChild = 200

            savings = 500

            homeMortgage = 46000
            schoolLoans = 0
            carLoans = 5000
            creditCard = 3000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "driver") {

            salary = 2500

            taxes = 500
            homeMortgagePayment = 400
            schoolLoansPayment = 0
            carLoansPayment = 100
            creditLoansPayment = 100
            otherExpenses = 600
            expensesPerChild = 200

            savings = 800

            homeMortgage = 38000
            schoolLoans = 0
            carLoans = 4000
            creditCard = 3000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "secretary") {

            salary = 2500

            taxes = 500
            homeMortgagePayment = 400
            schoolLoansPayment = 0
            carLoansPayment = 100
            creditLoansPayment = 100
            otherExpenses = 600
            expensesPerChild = 100

            savings = 700

            homeMortgage = 38000
            schoolLoans = 0
            carLoans = 4000
            creditCard = 3000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "mechanic") {

            salary = 2000

            taxes = 400
            homeMortgagePayment = 300
            schoolLoansPayment = 0
            carLoansPayment = 100
            creditLoansPayment = 100
            otherExpenses = 400
            expensesPerChild = 100

            savings = 700

            homeMortgage = 31000
            schoolLoans = 0
            carLoans = 3000
            creditCard = 3000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else if (name == "janitor") {

            salary = 1600

            taxes = 300
            homeMortgagePayment = 200
            schoolLoansPayment = 0
            carLoansPayment = 100
            creditLoansPayment = 100
            otherExpenses = 300
            expensesPerChild = 100

            savings = 600

            homeMortgage = 20000
            schoolLoans = 0
            carLoans = 4000
            creditCard = 3000

            totalIncome = salary + passiveIncome
            totalExpenses = taxes + homeMortgagePayment + schoolLoansPayment + carLoansPayment + creditLoansPayment + otherExpenses
            monthlyCashFlow = totalIncome - totalExpenses

        } else {
            Log.d("failure", "직업 초기화 실패")
        }
    }

}