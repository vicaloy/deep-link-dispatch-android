package com.valoy.deeplinkdispatch.sample;

import android.app.Activity;
import android.os.Bundle;

import com.airbnb.deeplinkdispatch.DeepLinkHandler;

import java.util.HashMap;
import java.util.Map;

@DeepLinkHandler({SampleModule.class})
public class DeepLinkActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //    Debug.startMethodTracing("deeplink.trace",90000000);
    Map configurablePlaceholdersMap = new HashMap();
    configurablePlaceholdersMap.put("configPathOne", "somePathThree");
    configurablePlaceholdersMap.put("configurable-path-segment-one", "");
    configurablePlaceholdersMap.put("configurable-path-segment", "");
    configurablePlaceholdersMap.put("configurable-path-segment-two", "");
    configurablePlaceholdersMap.put("configPathOne", "somePathOne");

    DeepLinkDelegate deepLinkDelegate = new DeepLinkDelegate(
      new SampleModuleRegistry(), configurablePlaceholdersMap);
    deepLinkDelegate.dispatchFrom(this);
    //    Debug.stopMethodTracing();
    finish();
  }
}
