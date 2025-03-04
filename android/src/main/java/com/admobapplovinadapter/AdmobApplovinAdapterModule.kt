package com.admobapplovinadapter

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.applovin.sdk.AppLovinPrivacySettings

@ReactModule(name = AdmobApplovinAdapterModule.NAME)
class AdmobApplovinAdapterModule(private val reactContext: ReactApplicationContext) :
  NativeAdmobApplovinAdapterSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  override fun setConsent(consent: Boolean) {
    AppLovinPrivacySettings.setHasUserConsent(true, reactContext)
  }

  companion object {
    const val NAME = "AdmobApplovinAdapter"
  }
}
