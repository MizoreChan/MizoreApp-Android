package tk.mizore.app.mizoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mweb = (WebView)findViewById(R.id.mizweb);
        mweb.getSettings().setJavaScriptEnabled(true);
        mweb.setWebViewClient(new WebViewClient());
        mweb.loadUrl("https://mizore.tk");

    }
}
