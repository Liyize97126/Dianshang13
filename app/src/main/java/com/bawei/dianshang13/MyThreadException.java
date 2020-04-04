package com.bawei.dianshang13;

import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 自定义异常捕获类
 * 实现Thread.UncaughtExceptionHandler，重写uncaughtException(Thread t, Throwable e)；
 * 在方法中进行打印和保存文件
 */
public class MyThreadException implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
        //打印错误日志
        Log.e("Tag","发生了异常！\n" + e.getMessage());
        e.printStackTrace();
        try {
            //保存日志至文件
            File file = new File(Environment.getExternalStorageDirectory() + "/Dianshang13/log.txt");
            //输出流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //写入
            fileOutputStream.write(e.getMessage().getBytes());
            //刷新缓存并关闭流
            fileOutputStream.flush();
            fileOutputStream.close();
            System.exit(0);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
