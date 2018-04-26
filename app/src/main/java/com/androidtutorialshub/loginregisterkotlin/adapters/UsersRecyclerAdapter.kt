package com.androidtutorialshub.loginregisterkotlin.adapters

import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidtutorialshub.loginregisterkotlin.R
import com.androidtutorialshub.loginregisterkotlin.model.User


class UsersRecyclerAdapter(private val listUsers: List<User>) : RecyclerView.Adapter<UsersRecyclerAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        // inflating recycler item view
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_user_recycler, parent, false)

        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.textViewName.text = listUsers[position].name
        holder.textViewEmail.text = listUsers[position].email
        holder.textViewPassword.text = listUsers[position].password
    }

    override fun getItemCount(): Int {
        return listUsers.size
    }


    /**
     * ViewHolder class
     */
    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var textViewName: AppCompatTextView
        var textViewEmail: AppCompatTextView
        var textViewPassword: AppCompatTextView

        init {
            textViewName = view.findViewById<View>(R.id.textViewName) as AppCompatTextView
            textViewEmail = view.findViewById<View>(R.id.textViewEmail) as AppCompatTextView
            textViewPassword = view.findViewById<View>(R.id.textViewPassword) as AppCompatTextView
        }
    }


}
