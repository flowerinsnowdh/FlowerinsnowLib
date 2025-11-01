package cn.flowerinsnow.flowerinsnowlib.protocol.codec.varint.test;

import cn.flowerinsnow.flowerinsnowlib.protocol.codec.varint.VarUInt28;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class VarUInt28Test {
    @Test
    void test() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            VarUInt28 value = VarUInt28.create(random.nextInt(VarUInt28.MAX_VALUE));
            byte[] encode = value.encode();
            int decode = VarUInt28.parse(encode).intValue();
            byte[] encode2 = VarUInt28.create(decode).encode();
            Assertions.assertArrayEquals(encode, encode2);
            Assertions.assertEquals(value.intValue(), decode);
        }
    }
}