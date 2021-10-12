package com.denis.appForSibersTeam.app.modules

import com.denis.appForSibersTeam.network.RemoteDataSource
import com.denis.appForSibersTeam.network.Repository
import com.denis.appForSibersTeam.viewModels.Model
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(model: Model, remoteDataSource: RemoteDataSource): Repository {
        return Repository(model, remoteDataSource)
    }

    @Singleton
    @Provides
    fun provideModel(): Model {
        return Model
    }

    @Singleton
    @Provides
    fun provideRemoteDataSource(): RemoteDataSource {
        return RemoteDataSource
    }

}