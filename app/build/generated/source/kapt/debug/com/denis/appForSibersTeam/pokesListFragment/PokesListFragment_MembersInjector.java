// Generated by Dagger (https://dagger.dev).
package com.denis.appForSibersTeam.pokesListFragment;

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
public final class PokesListFragment_MembersInjector implements MembersInjector<PokesListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PokesListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PokesListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PokesListFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PokesListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.denis.appForSibersTeam.pokesListFragment.PokesListFragment.viewModelFactory")
  public static void injectViewModelFactory(PokesListFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
