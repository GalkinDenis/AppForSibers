// Generated by Dagger (https://dagger.dev).
package com.denis.appForSibersTeam.app.modules;

import com.denis.appForSibersTeam.viewModels.Model;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideModelFactory implements Factory<Model> {
  @Override
  public Model get() {
    return provideModel();
  }

  public static RepositoryModule_ProvideModelFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Model provideModel() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideModel());
  }

  private static final class InstanceHolder {
    private static final RepositoryModule_ProvideModelFactory INSTANCE = new RepositoryModule_ProvideModelFactory();
  }
}