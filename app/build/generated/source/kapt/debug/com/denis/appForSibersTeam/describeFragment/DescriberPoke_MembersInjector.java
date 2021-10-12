// Generated by Dagger (https://dagger.dev).
package com.denis.appForSibersTeam.describeFragment;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DescriberPoke_MembersInjector implements MembersInjector<DescriberPoke> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public DescriberPoke_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<DescriberPoke> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new DescriberPoke_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(DescriberPoke instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.denis.appForSibersTeam.describeFragment.DescriberPoke.viewModelFactory")
  public static void injectViewModelFactory(DescriberPoke instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}