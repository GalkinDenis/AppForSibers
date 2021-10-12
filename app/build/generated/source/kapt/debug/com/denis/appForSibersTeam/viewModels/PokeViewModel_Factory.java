// Generated by Dagger (https://dagger.dev).
package com.denis.appForSibersTeam.viewModels;

import com.denis.appForSibersTeam.data.ItemDao;
import com.denis.appForSibersTeam.network.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PokeViewModel_Factory implements Factory<PokeViewModel> {
  private final Provider<ItemDao> daoProvider;

  private final Provider<Repository> repositoryProvider;

  public PokeViewModel_Factory(Provider<ItemDao> daoProvider,
      Provider<Repository> repositoryProvider) {
    this.daoProvider = daoProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PokeViewModel get() {
    return newInstance(daoProvider.get(), repositoryProvider.get());
  }

  public static PokeViewModel_Factory create(Provider<ItemDao> daoProvider,
      Provider<Repository> repositoryProvider) {
    return new PokeViewModel_Factory(daoProvider, repositoryProvider);
  }

  public static PokeViewModel newInstance(ItemDao dao, Repository repository) {
    return new PokeViewModel(dao, repository);
  }
}
