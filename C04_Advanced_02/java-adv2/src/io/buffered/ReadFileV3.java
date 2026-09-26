package io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.BUFFERED_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV3 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis, BUFFERED_SIZE);

        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while (-1 != (data = bis.read())) {
            fileSize++;
        }
        bis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File name: " + FILE_NAME);
        System.out.println("File size: " + (fileSize / 1024 / 1024) + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
