//
// Created by Administrator on 2018/5/28/028.
//
#include<com_example_administrator_jnihello_HelloJni.h>
JNIEXPORT jint JNICALL Java_com_example_administrator_jnihello_HelloJni_sayhello
  (JNIEnv *env, jclass obj, jint a){
    return a*2;
  }

  JNIEXPORT jstring JNICALL Java_com_example_administrator_jnihello_HelloJni_returnString
    (JNIEnv *env, jclass obj){
    return env->NewStringUTF((char *)"HelloWorld 我是用jni调用出来的字符串");
  }
