package com.nc.autumn2020.solutions.additional;

import java.io.*;
import java.util.Base64;

public class task1 {
    public static void run(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Saint\\Desktop\\123.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fis, 200);

        int i;
        StringBuilder stringTooLong = new StringBuilder();

        while((i = bufferedInputStream.read())!= -1) {
            stringTooLong.append((char) i);
        }
        //System.out.println(stringTooLong);

        Base64.Decoder dec = Base64.getDecoder();
        byte[] decBytes = dec.decode(stringTooLong.toString().getBytes());
        File file = new File("C:\\Users\\Saint\\Desktop\\1234.png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(decBytes);
        fileOutputStream.close();
    }
}
