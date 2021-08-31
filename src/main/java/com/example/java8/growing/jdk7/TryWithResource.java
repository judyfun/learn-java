package com.example.java8.growing.jdk7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        String path = TryWithResource.class.getResource("/test.js").getPath();
        try (BufferedReader br = new BufferedReader(new FileReader(path));
        ) {
            String str = br.readLine();
            while (null != str) {
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
