package com.dhiren.SampleTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by dhirendra.thakur on 26/10/14.
 */
public class Test {

    public static void main(String[] ar) throws IOException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        String finalApkPath = classpathRoot.getAbsolutePath();

        System.out.println("Initial Path : " + finalApkPath);
        String path = finalApkPath.substring(0, finalApkPath.lastIndexOf('/'));


        System.out.println("Path of the project : " + path);

    }
}
