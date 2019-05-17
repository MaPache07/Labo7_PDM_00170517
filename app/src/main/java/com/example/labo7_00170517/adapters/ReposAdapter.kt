package com.example.labo7_00170517.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labo7_00170517.R
import com.example.labo7_00170517.database.entities.GithubRepo
import kotlinx.android.synthetic.main.repo_cardview.view.*

class ReposAdapter(var repos : List<GithubRepo>) : RecyclerView.Adapter<ReposAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repo_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = repos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(repos[position])
    }

    fun updateList(newRepo : List<GithubRepo>){
        this.repos = newRepo
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bind(repos : GithubRepo) = with(itemView){
            text_card.text = repos.name
        }

    }
}