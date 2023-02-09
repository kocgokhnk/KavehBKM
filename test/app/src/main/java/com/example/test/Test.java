package com.example.test;

import static com.example.test.TranStruct.GetTranData;

import android.util.Log;
public class Test {
    byte[] ITMK = new byte[16];

    public static void main(String[] args) {
        GetTranData().MsgTypeId = 800;
        GetTranData().ProcessingCode = 810000;
        Utils.OsGetRandom(GetTranData().TCN, 8);
    }

}
