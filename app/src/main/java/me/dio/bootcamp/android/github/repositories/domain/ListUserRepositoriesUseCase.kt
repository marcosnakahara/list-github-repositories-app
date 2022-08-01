package me.dio.bootcamp.android.github.repositories.domain

import kotlinx.coroutines.flow.Flow
import me.dio.bootcamp.android.github.repositories.core.UseCase
import me.dio.bootcamp.android.github.repositories.data.model.Repo
import me.dio.bootcamp.android.github.repositories.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
): UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRespositories(param)
    }
}