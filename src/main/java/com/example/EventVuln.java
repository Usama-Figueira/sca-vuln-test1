package com.example;

import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;

public class EventVuln {
    public static void run() {
        try {
            byte[] key = new byte[16];
            PaddedBufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new AESEngine());
            cipher.init(false, new KeyParameter(key));
            byte[] input = new byte[16];
            cipher.processBytes(input, 0, input.length, new byte[16], 0);
            cipher.doFinal(new byte[16], 0);
        } catch (InvalidCipherTextException e) {
            System.out.println("Padding oracle exception caught: " + e.getMessage());
        }
    }
}
