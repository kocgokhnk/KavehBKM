package com.example.test;

import java.security.SecureRandom;

public class Utils {
    public static void OsGetRandom(byte[] output, int len) {
        SecureRandom sr = new SecureRandom();
        if (output.length == len) {
            sr.nextBytes(output);
            return;
        }
        byte[] o = new byte[len];
        sr.nextBytes(o);
        System.arraycopy(o, 0, output, 0, len);
    }
}
