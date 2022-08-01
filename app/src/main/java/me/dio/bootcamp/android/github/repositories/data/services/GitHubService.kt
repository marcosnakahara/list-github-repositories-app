package me.dio.bootcamp.android.github.repositories.data.services

import me.dio.bootcamp.android.github.repositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}