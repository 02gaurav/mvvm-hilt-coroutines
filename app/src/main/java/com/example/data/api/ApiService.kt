package com.example.data.api

import com.example.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}