package me.dio.bootcamp.android.github.repositories.data.repositories

import kotlinx.coroutines.flow.Flow
import me.dio.bootcamp.android.github.repositories.data.model.Repo

interface RepoRepository {
    suspend fun listRespositories(user: String): Flow<List<Repo>>
}