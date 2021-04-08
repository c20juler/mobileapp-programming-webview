package com.example.webviewapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //Created private member variable
    private WebView myWebView;

    public void showExternalWebPage(){
        // TODO: Add your code for showing external web page here
        myWebView.loadUrl("https://www.his.se/");
    }

    public void showInternalWebPage(){
        // TODO: Add your code for showing internal web page here
        myWebView.loadUrl("https://dugga.iit.his.se/DuggaSys/courseed.php");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Instantiated private member variable 'myWebView'
        myWebView = (WebView) findViewById(R.id.my_webview);

        //Enabled Javascript in webclient
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Log.d("==>", "Appen har startat.");

        //Kan rendera webbinnehåll
        WebViewClient myWebViewClient = new WebViewClient();
        myWebView.setWebViewClient(myWebViewClient);

        //Laddat en sida i WebView
        myWebView.loadUrl("https://his.se");



        /*
        * CHECK Rename app...
        * CHECK Enable Internet access for your App. Tip: Manifest
        * CHECK Create a WebView element in the layout file content_main.xml
        * CHECK Give the WebView element ID "my_webview"
        -- CHECK Commit and push to your github fork
        * CHECK Create a private member variable called "myWebView" of type WebView
        * CHECK - Locate the WebView element created in step 1 using the ID created in step 2
        * CHECK Create a new WebViewClient to attach to our WebView. This allows us to
          browse the web inside our app.
        -- CHECK Commit and push to your github fork
        * CHECK Enable Javascript execution in your WebViewClient
        *CHECK Enter the url to load in our WebView
        -- CHECK Commit and push to your github fork
        * CHECK Move the code that loads a URL into your WebView into the two methods
          "showExternalWebPage()" and "showInternalWebPage()".
        *CHECK Call the "showExternalWebPage()" / "showInternalWebPage()" methods
          when you select menu options "External Web Page" or "Internal Web Page"
          respectively
        -- CHECK Commit and push to your github fork
        * Take two screenshots using the "Take a screenshot" tool in the AVD
           showing your App. One (1) screenshot showing your internal web page and
           one (1) screenshot showing your external web page.
           *

        //HAVE YOU DONE THESE CORRECTLY/FULLY COMPLETED?:
        * ??? findViewById??? - Locate the WebView element created in step 1 using the ID created in step 2
        * YOU ARE HERE?! Enter the url to load in our WebView
        * Move the code that loads a URL into your WebView into the two methods
          "showExternalWebPage()" and "showInternalWebPage()".
        * Call the "showExternalWebPage()" / "showInternalWebPage()" methods
          when you select menu options "External Web Page" or "Internal Web Page"
          respectively
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
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

        return super.onOptionsItemSelected(item);
    }
}
