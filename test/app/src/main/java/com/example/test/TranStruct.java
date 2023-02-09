package com.example.test;

public class TranStruct {

    public static TranStruct gTrns = new TranStruct();
    public static TranStruct GetTranData() {
        return gTrns;
    }


    public int MsgTypeId;
    public int OrgMsgTypeId;
    public int ProcessingCode;
    public byte[] DateTime = new byte[8];
    public byte[] OrgDateTime = new byte[8];
    public byte[] AcqId = new byte[2];
    public byte[] IssId = new byte[2];
    public byte[] TermId = new byte[8];
    public byte[] MercId = new byte[15];


    //Key Exchannge
    public byte[] MSK = new byte[16];            //Message Session Key
    public byte[] TCN = new byte[8];                //Terminal Challenge Number
    public byte[] HCN = new byte[8];                //Host Challenge Number
    public short RSAKeyBlkLen;
    public byte[] RSAKeyBlk = new byte[128];        //MSK(RSA Key Block)
    public byte[] TMK = new byte[16];            //Terminal Master Key
    public byte TMKInd;                //0: Current Terminal Master Key 1: New Terminal Master Key
    public byte[] TPK = new byte[16];            //Terminal Pin Encryption Key
    public byte[] OKK = new byte[16];            //Offline Card No Encryption Key
}
