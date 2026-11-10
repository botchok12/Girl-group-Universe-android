package com.girlgroupuniverse.app;
import android.app.Activity; import android.os.Bundle; import android.webkit.*; import android.content.Intent; import android.net.Uri; import android.view.KeyEvent;
public class MainActivity extends Activity {
 WebView web;
 @Override public void onCreate(Bundle b){super.onCreate(b); web=new WebView(this); setContentView(web);
  WebSettings w=web.getSettings(); w.setJavaScriptEnabled(true); w.setDomStorageEnabled(true); w.setDatabaseEnabled(true); w.setAllowFileAccess(true); w.setAllowContentAccess(true);
  web.setWebViewClient(new WebViewClient(){@Override public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest r){Uri u=r.getUrl(); if("file".equals(u.getScheme())&&u.getPath()!=null&&u.getPath().startsWith("/android_asset/"))return false; if("http".equals(u.getScheme())||"https".equals(u.getScheme())){startActivity(new Intent(Intent.ACTION_VIEW,u));return true;}return false;}});
  web.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed(){if(web!=null&&web.canGoBack())web.goBack();else super.onBackPressed();}
}
