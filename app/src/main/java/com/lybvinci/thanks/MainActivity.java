package com.lybvinci.thanks;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToAliPay(View view) {
        ClipboardManager myClipboard;
        myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        ClipData myClip;
        String text = "#吱口令#长按复制此条消息，打开支付宝即可添加我为好友qt6hUE955T";
        myClip = ClipData.newPlainText("text", text);
        myClipboard.setPrimaryClip(myClip);
        try {
            Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("com.eg.android.AlipayGphone");
            startActivity(LaunchIntent);
        }catch (Exception e){
            Toast.makeText(this,"没有支付宝？安装一个吧~",Toast.LENGTH_SHORT).show();
        }
    }
}
