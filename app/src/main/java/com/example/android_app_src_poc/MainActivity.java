package com.example.android_app_src_poc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*
            Uri uri=Uri.parse("content://com.alipay.ali.authlogin/aliuser_sdk_sso");
            Cursor cursor=getContentResolver().query(uri, null, null, null, null);
            if(cursor!=null){
                String id=cursor.getString(cursor.getColumnIndex("loginId"));
                String img=cursor.getString(cursor.getColumnIndex("headImg"));
                String token=cursor.getString(cursor.getColumnIndex("alipaySsoToken"));
                System.out.println(id);
                //Toast.makeText(context, id+""+img+""+token, Toast.LENGTH_SHORT);
            }

            cursor.close();
            */
                //Intent v2=new Intent("com.xx.idlefish.DATA_EXPORT");
                Intent v2=new Intent();
                v2.setClassName("xx.xx.xx", "xx.xx.xx.xxx.xxx.xxx");
                //v2.setClassName("tv.xx.bili", "com.mall.ui.base.MallSigalTaskWebFragmentLoadActivity");
                //v2.addCategory("android.intent.category.BROWSABLE");
                //v2.putExtra("id", "a");
                //v2.putExtra("c", "exportData");

                //v2.putExtra("_fragment", "com.mall.base.web.MallWebFragment");
                //v2.setData(Uri.parse("file:///storage/emulated/0/tencent/MicroMsg/Download/2.html"));
                //v2.putExtra("intent_bundle_nameintent_bundle_name","a");
                //v2.putExtra("bundle_select_limit_num",1);
                //v2.setData(Uri.parse(""));
                startActivity(v2);
                //startService(v2);
                //sendBroadcast(v2);
            }
        });
    }
}