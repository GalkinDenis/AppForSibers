// Generated by Dagger (https://dagger.dev).
package com.denis.appForSibersTeam.app.modules;

import com.denis.appForSibersTeam.network.RemoteDataSource;
import com.denis.appForSibersTeam.network.Repository;
import com.denis.appForSibersTeam.viewModels.Model;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideRepositoryFactory implements Factory<Repository> {
  private final Provider<Model> modelProvider;

  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  public RepositoryModule_ProvideRepositoryFactory(Provider<Model> modelProvider,
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    this.modelProvider = modelProvider;
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public Repository get() {
    return provideRepository(modelProvider.get(), remoteDataSourceProvider.get());
  }

  public static RepositoryModule_ProvideRepositoryFactory create(Provider<Model> modelProvider,
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new RepositoryModule_ProvideRepositoryFactory(modelProvider, remoteDataSourceProvider);
  }

  public static Repository provideRepository(Model model, RemoteDataSource remoteDataSource) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideRepository(model, remoteDataSource));
  }
}
