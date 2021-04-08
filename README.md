
# Rapport Assignment 2 - Webview

För Assignment 2 har det gjorts både commit och push till github för varje liten avklarad del i uppgiften.

```
 <string name="app_name">My WebViewApp</string>
 ```
Appen tilldelas ett nytt namn i strings.xml filen.

```
<uses-permission android:name="android.permission.INTERNET" />
```
Ger internet access för appen i AndroidManifest.xml.

```
 <WebView
        android:id="@+id/my_webview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginTop="70dp"
        app:layout_constraintTop_toTopOf="parent"
        tools:layout_editor_absoluteX="0dp"/>
```
Skapar ett Webview element i layout filen content_main.xml och ger elementet namnet "my_webview".


//Created private member variable
```
    private WebView myWebView;
```
Skapar en privat medlems variabel i MainActicity som heter "myWebView" av typen WebView.

```
myWebView = (WebView) findViewById(R.id.my_webview);
```
Den privata medlems variabeln instancieras i onCreate() och lokaliserar WebView elementet "my_webview".

```
WebViewClient myWebViewClient = new WebViewClient();
myWebView.setWebViewClient(myWebViewClient);
```
Skapar en webbclient för myWebView för att kunna surfa på webben i appen.

```
WebSettings webSettings = myWebView.getSettings();
webSettings.setJavaScriptEnabled(true);
```
//Enabled Javascript för webclient genom att använda funktionen getSettings() och setJavaScriptEnabled().

```
    public void showInternalWebPage(){
        // TODO: Add your code for showing internal web page here
        myWebView.loadUrl("file:///android_asset/internalwebpage.html");
    }
```
Skapade en assets mapp med en html fil "internalwebpage.html". Filen laddas i myWebView med .loadUrl(filnamn...);
när funktionen showInternalWebPage() körs.

```
    public void showExternalWebPage(){
        // TODO: Add your code for showing external web page here
        myWebView.loadUrl("https://www.his.se/");
    }
```
När man väljer "External Web Page" i "app menyn" så körs ovanstående kod,
där högskolan i skövdes hemsida laddas upp (extern webb sida).


```
 if (id == R.id.action_external_web) {
            showExternalWebPage();
            Log.d("==>","Will display external web page");
            return true;
  }

 if (id == R.id.action_internal_web) {
    showInternalWebPage();
    Log.d("==>","Will display internal web page");
    return true;
 }
```
För att dessa funktioner ska kallas så läggs de i respektive if satser i
"public boolean onOptionsItemSelected(MenuItem item) { ... }".


Screenshots av internal och external pages i appen:

Bilder läggs i samma mapp som markdown-filen.

![](mobileapp-programming-webview\Screenshot_1617881225.png)
![](mobileapp-programming-webview\Screenshot_1617881222.png)

