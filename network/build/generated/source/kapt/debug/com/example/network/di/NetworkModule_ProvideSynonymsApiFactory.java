// Generated by Dagger (https://dagger.dev).
package com.example.network.di;

import com.example.network.api.SynonymsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideSynonymsApiFactory implements Factory<SynonymsApi> {
  @Override
  public SynonymsApi get() {
    return provideSynonymsApi();
  }

  public static NetworkModule_ProvideSynonymsApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SynonymsApi provideSynonymsApi() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideSynonymsApi());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideSynonymsApiFactory INSTANCE = new NetworkModule_ProvideSynonymsApiFactory();
  }
}