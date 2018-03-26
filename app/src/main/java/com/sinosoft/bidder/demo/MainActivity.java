package com.sinosoft.bidder.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "123456";
//        byte[] decode = Base64.decode(str,0);
//        System.out.println(decode.toString());
        String encode = Base64.encodeToString(str.getBytes(), 0);
        System.out.println("加密："+encode);
        
        System.out.println("11111111111");
    }
}
