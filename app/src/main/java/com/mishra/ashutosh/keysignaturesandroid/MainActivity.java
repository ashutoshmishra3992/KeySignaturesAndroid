package com.mishra.ashutosh.keysignaturesandroid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import com.ashutoshmishra.keysignatures.KeySignatures;

import java.security.MessageDigest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("sha1", KeySignatures.getSHA1(getApplicationContext()));

        Log.v("md5", KeySignatures.getMD5(getApplicationContext()));
    }
}
