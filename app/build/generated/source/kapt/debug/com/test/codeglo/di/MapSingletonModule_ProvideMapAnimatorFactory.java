// Generated by Dagger (https://dagger.dev).
package com.test.codeglo.di;

import android.content.Context;
import com.test.codeglo.utility.maputility.MapAnimator;
import com.test.codeglo.utility.maputility.RouteEvaluator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapSingletonModule_ProvideMapAnimatorFactory implements Factory<MapAnimator> {
  private final Provider<Context> contextProvider;

  private final Provider<RouteEvaluator> routeEvaluatorProvider;

  public MapSingletonModule_ProvideMapAnimatorFactory(Provider<Context> contextProvider,
      Provider<RouteEvaluator> routeEvaluatorProvider) {
    this.contextProvider = contextProvider;
    this.routeEvaluatorProvider = routeEvaluatorProvider;
  }

  @Override
  public MapAnimator get() {
    return provideMapAnimator(contextProvider.get(), routeEvaluatorProvider.get());
  }

  public static MapSingletonModule_ProvideMapAnimatorFactory create(
      Provider<Context> contextProvider, Provider<RouteEvaluator> routeEvaluatorProvider) {
    return new MapSingletonModule_ProvideMapAnimatorFactory(contextProvider, routeEvaluatorProvider);
  }

  public static MapAnimator provideMapAnimator(Context context, RouteEvaluator routeEvaluator) {
    return Preconditions.checkNotNullFromProvides(MapSingletonModule.INSTANCE.provideMapAnimator(context, routeEvaluator));
  }
}
