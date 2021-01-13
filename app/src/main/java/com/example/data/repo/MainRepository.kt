package com.example.data.repo

import com.example.data.api.ApiHelper
import com.example.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}