package com.example.administrator.jnihello;

/**
 * Native方法
 * Created by ${LiuTao} on 2017/10/9/009.
 */

public class HelloJni {
    static {
        System.loadLibrary("nativeTest");
    }
    public static native int sayhello(int t);
    public static native String returnString();

}
