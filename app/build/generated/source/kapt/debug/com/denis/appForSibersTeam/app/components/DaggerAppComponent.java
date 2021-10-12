// Generated by Dagger (https://dagger.dev).
package com.denis.appForSibersTeam.app.components;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.denis.appForSibersTeam.app.modules.DataModule_ProvideDaoFactory;
import com.denis.appForSibersTeam.app.modules.DataModule_ProvideDataBaseFactory;
import com.denis.appForSibersTeam.app.modules.RepositoryModule_ProvideModelFactory;
import com.denis.appForSibersTeam.app.modules.RepositoryModule_ProvideRemoteDataSourceFactory;
import com.denis.appForSibersTeam.app.modules.RepositoryModule_ProvideRepositoryFactory;
import com.denis.appForSibersTeam.data.ItemDao;
import com.denis.appForSibersTeam.data.ItemRoomDatabase;
import com.denis.appForSibersTeam.describeFragment.DescriberPoke;
import com.denis.appForSibersTeam.describeFragment.DescriberPoke_MembersInjector;
import com.denis.appForSibersTeam.network.RemoteDataSource;
import com.denis.appForSibersTeam.network.Repository;
import com.denis.appForSibersTeam.pokesListFragment.PokesListFragment;
import com.denis.appForSibersTeam.pokesListFragment.PokesListFragment_MembersInjector;
import com.denis.appForSibersTeam.viewModels.DescribeViewModel;
import com.denis.appForSibersTeam.viewModels.DescribeViewModel_Factory;
import com.denis.appForSibersTeam.viewModels.Model;
import com.denis.appForSibersTeam.viewModels.PokeViewModel;
import com.denis.appForSibersTeam.viewModels.PokeViewModel_Factory;
import com.denis.appForSibersTeam.viewModels.ViewModelFactory;
import com.denis.appForSibersTeam.viewModels.ViewModelFactory_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ViewModel> provideDescribeViewModelProvider;

  private Provider<Context> applicationContextProvider;

  private Provider<ItemRoomDatabase> provideDataBaseProvider;

  private Provider<ItemDao> provideDaoProvider;

  private Provider<Model> provideModelProvider;

  private Provider<RemoteDataSource> provideRemoteDataSourceProvider;

  private Provider<Repository> provideRepositoryProvider;

  private Provider<PokeViewModel> pokeViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

  private DaggerAppComponent(Context applicationContextParam) {

    initialize(applicationContextParam);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Context applicationContextParam) {
    this.provideDescribeViewModelProvider = DoubleCheck.provider((Provider) DescribeViewModel_Factory.create());
    this.applicationContextProvider = InstanceFactory.create(applicationContextParam);
    this.provideDataBaseProvider = DoubleCheck.provider(DataModule_ProvideDataBaseFactory.create(applicationContextProvider));
    this.provideDaoProvider = DoubleCheck.provider(DataModule_ProvideDaoFactory.create(provideDataBaseProvider));
    this.provideModelProvider = DoubleCheck.provider(RepositoryModule_ProvideModelFactory.create());
    this.provideRemoteDataSourceProvider = DoubleCheck.provider(RepositoryModule_ProvideRemoteDataSourceFactory.create());
    this.provideRepositoryProvider = DoubleCheck.provider(RepositoryModule_ProvideRepositoryFactory.create(provideModelProvider, provideRemoteDataSourceProvider));
    this.pokeViewModelProvider = PokeViewModel_Factory.create(provideDaoProvider, provideRepositoryProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(2).put(DescribeViewModel.class, provideDescribeViewModelProvider).put(PokeViewModel.class, (Provider) pokeViewModelProvider).build();
    this.viewModelFactoryProvider = ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider);
    this.bindViewModelFactoryProvider = DoubleCheck.provider((Provider) viewModelFactoryProvider);
  }

  @Override
  public AddPokesFragmentViewModelComponent.Factory createUserFragmentViewModelComponent() {
    return new AddPokesFragmentViewModelComponentFactory();
  }

  @Override
  public AddDescribeViewModelComponent.Factory createUserCardViewModelComponent() {
    return new AddDescribeViewModelComponentFactory();
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(Context applicationContext) {
      Preconditions.checkNotNull(applicationContext);
      return new DaggerAppComponent(applicationContext);
    }
  }

  private final class AddPokesFragmentViewModelComponentFactory implements AddPokesFragmentViewModelComponent.Factory {
    @Override
    public AddPokesFragmentViewModelComponent create() {
      return new AddPokesFragmentViewModelComponentImpl();
    }
  }

  private final class AddPokesFragmentViewModelComponentImpl implements AddPokesFragmentViewModelComponent {
    private AddPokesFragmentViewModelComponentImpl() {

    }

    @Override
    public void injectPokesListFragment(PokesListFragment fragment) {
      injectPokesListFragment2(fragment);
    }

    private PokesListFragment injectPokesListFragment2(PokesListFragment instance) {
      PokesListFragment_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.bindViewModelFactoryProvider.get());
      return instance;
    }
  }

  private final class AddDescribeViewModelComponentFactory implements AddDescribeViewModelComponent.Factory {
    @Override
    public AddDescribeViewModelComponent create() {
      return new AddDescribeViewModelComponentImpl();
    }
  }

  private final class AddDescribeViewModelComponentImpl implements AddDescribeViewModelComponent {
    private AddDescribeViewModelComponentImpl() {

    }

    @Override
    public void injectDescribeFragment(DescriberPoke fragment) {
      injectDescriberPoke(fragment);
    }

    private DescriberPoke injectDescriberPoke(DescriberPoke instance) {
      DescriberPoke_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.bindViewModelFactoryProvider.get());
      return instance;
    }
  }
}