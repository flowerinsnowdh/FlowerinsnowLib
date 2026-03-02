package cn.flowerinsnow.flowerinsnowlib.string.test;

import cn.flowerinsnow.flowerinsnowlib.string.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    public void test() {
        {
            final char testValueChar = '!';
            Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat(testValueChar, -1));
            Assertions.assertEquals("", StringUtil.repeat(testValueChar, 0));
            Assertions.assertEquals(Character.toString(testValueChar), StringUtil.repeat(testValueChar, 1));
            Assertions.assertEquals(Character.toString(testValueChar) + testValueChar + testValueChar + testValueChar + testValueChar, StringUtil.repeat(testValueChar, 5));
        }
        {
            final String testValueString = "TEST_VALUE";
            Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat(testValueString, -1));
            Assertions.assertEquals("", StringUtil.repeat(testValueString, 0));
            Assertions.assertEquals(testValueString, StringUtil.repeat(testValueString, 1));
            Assertions.assertEquals(testValueString + testValueString + testValueString + testValueString + testValueString, StringUtil.repeat(testValueString, 5));
        }
    }
}
