# 🔗 Deep Link Dispatch for Android

This project demonstrates the implementation of deep linking in an Android application using the DeepLinkDispatch library by Airbnb. Deep links allow you to navigate directly to specific content or functionality within your app using custom URLs.

Airbnb library: https://github.com/airbnb/DeepLinkDispatch


## 🧪 Testing the Deep Link
To test the deep link, follow these steps:

Open your terminal and navigate to the Android SDK's platform-tools directory:
- cd /Users/victoriaaloy/Library/Android/sdk/platform-tools  

Execute the following ADB command:
- ./adb -d shell am start -W -a android.intent.action.VIEW -d "dld://methodDeepLink/abc123" com.valoy.deeplink  

- Replace com.valoy.deeplink with your app's package name if different.

Observe the result:
The app should open and navigate to the specified screen, handling the deep link.
