package com.example.labo7_00170517.database.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.labo7_00170517.database.daos.GithubRepoDAO
import com.example.labo7_00170517.database.entities.GithubRepo

class GithubRepoRepository(private val repoDAO : GithubRepoDAO) {

    fun getAll() : LiveData<List<GithubRepo>> = repoDAO.getAll()

    fun delete() = repoDAO.delete()

    @WorkerThread
    suspend fun insert(repo : GithubRepo) = repoDAO.insert(repo)

}