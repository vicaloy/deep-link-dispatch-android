Se utilizo libreria creada por arbnb para el manejo de Deeplinks
Url repositorio: 

Para probarlo:

Abrir terminarl y dirigirse al sdk de Android para ejecuar comandos con adb

cd /Users/victoriaaloy/Library/Android/sdk
cd platform-tools
./adb -d shell
am start -W -a android.intent.action.VIEW -d "dld://methodDeepLink/abc123" com.valoy.deeplink