
package me.jerson.mobile.ads;

import android.content.Intent;
import android.util.Log;

import com.adscendmedia.sdk.ui.MarketResearchActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

public class RNAdscendMediaModule extends ReactContextBaseJavaModule {

  private static final String TAG = "RNAdscendMedia";
  private final ReactApplicationContext reactContext;

  public RNAdscendMediaModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAdscendMedia";
  }


  @ReactMethod
  public void showIntentForMarketResearch(String publisherId, String profileId, String subid1) {
      Log.d(TAG, "showIntentForMarketResearch:" + publisherId + profileId + subid1);

      if (reactContext.getCurrentActivity() != null) {
          Intent intent = MarketResearchActivity.getIntentForMarketResearch(reactContext.getCurrentActivity(), publisherId, profileId, subid1);
          intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
          reactContext.startActivity(intent);
          Log.w(TAG, "getIntentForMarketResearch");

      } else {
          Log.w(TAG, "init");
      }

  }
}