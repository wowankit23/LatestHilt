// Generated by Dagger (https://dagger.dev).
package com.test.codeglo.viewModel;

import com.test.codeglo.repository.Repository;
import com.test.codeglo.utility.NetworkHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public MainViewModel_Factory(Provider<Repository> repositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.repositoryProvider = repositoryProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get(), networkHelperProvider.get());
  }

  public static MainViewModel_Factory create(Provider<Repository> repositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new MainViewModel_Factory(repositoryProvider, networkHelperProvider);
  }

  public static MainViewModel newInstance(Repository repository, NetworkHelper networkHelper) {
    return new MainViewModel(repository, networkHelper);
  }
}
