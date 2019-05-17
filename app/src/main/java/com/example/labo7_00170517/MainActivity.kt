package com.example.labo7_00170517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.labo7_00170517.adapters.ReposAdapter
import com.example.labo7_00170517.database.entities.GithubRepo
import com.example.labo7_00170517.database.viewmodels.GithubRepoViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ReposAdapter
    lateinit var viewModel : GithubRepoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
    }

    fun bind(){
        adapter = ReposAdapter(ArrayList())
        //viewModel = ViewModelProviders.of(this).get(GithubRepoViewModel::class.java)
        recycler.apply {
            adapter = this@MainActivity.adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        btn_add.setOnClickListener {
            viewModel.insert(GithubRepo(et_repo_name.text.toString()))
        }
    }
}
