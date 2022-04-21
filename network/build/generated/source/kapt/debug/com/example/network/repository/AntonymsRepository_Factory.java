// Generated by Dagger (https://dagger.dev).
package com.example.network.repository;

import com.example.network.api.AntonymsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AntonymsRepository_Factory implements Factory<AntonymsRepository> {
  private final Provider<AntonymsApi> antonymsApiProvider;

  public AntonymsRepository_Factory(Provider<AntonymsApi> antonymsApiProvider) {
    this.antonymsApiProvider = antonymsApiProvider;
  }

  @Override
  public AntonymsRepository get() {
    return newInstance(antonymsApiProvider.get());
  }

  public static AntonymsRepository_Factory create(Provider<AntonymsApi> antonymsApiProvider) {
    return new AntonymsRepository_Factory(antonymsApiProvider);
  }

  public static AntonymsRepository newInstance(AntonymsApi antonymsApi) {
    return new AntonymsRepository(antonymsApi);
  }
}
