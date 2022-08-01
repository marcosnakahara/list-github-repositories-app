package me.dio.bootcamp.android.github.repositories.data.repositories

import kotlinx.coroutines.flow.flow
import me.dio.bootcamp.android.github.repositories.core.RemoteException
import me.dio.bootcamp.android.github.repositories.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService): RepoRepository {

    companion object {
        private const val NOT_FOUND: Int = 404
    }

    override suspend fun listRespositories(user: String) = flow {

        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            val message: String = if(ex.message == null) "Não foi possível fazer a busca no momento"
            else if (ex.code() == NOT_FOUND) "Usuário inexistente"
            else ex.message!!

            throw RemoteException(message)
        }
    }
}