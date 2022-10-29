# deep-link-dispatch-android

Se utilizo libreria creada por arbnb para el manejo de Deeplinks
Url repositorio: https://github.com/airbnb/DeepLinkDispatch

Para probarlo:
Abrir terminal y dirigirse al sdk de Android para ejecuar comandos con adb

cd /Users/victoriaaloy/Library/Android/sdk
cd platform-tools
./adb -d shell
am start -W -a android.intent.action.VIEW -d "dld://methodDeepLink/abc123" com.valoy.deeplink
