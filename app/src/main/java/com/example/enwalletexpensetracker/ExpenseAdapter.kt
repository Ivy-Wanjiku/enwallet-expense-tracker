package com.example.enwalletexpensetracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class ExpenseAdapter(var expense_list:List<Expenses>):RecyclerView.Adapter<ExpenseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
val itemView=LayoutInflater.from(parent.context).inflate(R.layout.expense_tracker,parent,false)
        return  ExpenseViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
       val trackExpense=expense_list[position]
        holder.tvExpense=trackExpense.name
        holder.tvExpenseName=trackExpense.expensePhoto
        holder.tvDate=trackExpense.date
        holder.tvPrice=trackExpense.expensesPrice
    }

    override fun getItemCount(): Int {
        return  expense_list.size
    }
}
class ExpenseViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvExpense=itemView.findViewById<TextView>(R.id.tvExpense1)
    var tvExpenseName=itemView.findViewById<TextView>(R.id.tvExpenseName)
    var tvDate=itemView.findViewById<TextView>(R.id.tvExpenseDate1)
    var tvPrice =itemView.findViewById<TextView>(R.id.tvExpensePrice)
}