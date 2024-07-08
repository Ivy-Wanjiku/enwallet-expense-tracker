package com.example.enwalletexpensetracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwalletexpensetracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager=LinearLayoutManager(this)
        displayExpenses()

    }
    fun displayExpenses(){
        val expense1=Expenses("Salary"," kes 40,000","","1 July 2024")
        val expense2=Expenses("Salary"," kes 40,000","","1 July 2024")
        val expense3=Expenses("Salary"," kes 40,000","","1 July 2024")
        val expense4=Expenses("Salary"," kes 40,000","","1 July 2024")
        val expense5=Expenses("Salary"," kes 40,000","","1 July 2024")
        val expense6=Expenses("Salary"," kes 40,000","","1 July 2024")
        val expense7=Expenses("Salary"," kes 40,000","","1 July 2024")
        val myExpenses= listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7)
        val expensesAdapter=ExpenseAdapter(myExpenses)
        binding.rvExpenses.adapter=expensesAdapter





    }
}