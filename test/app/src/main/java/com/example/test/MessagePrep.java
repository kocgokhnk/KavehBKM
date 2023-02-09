package com.example.test;

import static com.example.test.TranStruct.GetTranData;

import android.util.Log;

import com.pax.gl.pack.IIso8583;

public class MessagePrep {

    private static final String TAG = MessagePrep.class.getSimpleName();
    static byte[] MsgBuff = new byte[4096];
    static IIso8583 iso8583;
    static IIso8583.IIso8583Entity isoMsg;
    static final int bkmHeaderLen = 27;

    public static void main(String args[]){
        try {

            Log.d(TAG, String.format("ProcessMsg %s %d %d",  GetTranData().MsgTypeId, GetTranData().ProcessingCode));



        }catch (Exception e){

        }
    }



}
