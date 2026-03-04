package cn.flowerinsnow.flowerinsnowlib.object.test;

import cn.flowerinsnow.flowerinsnowlib.object.mutableobject.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MutableObjectTest {
    @Test
    public void test() {
        {
            MutableBoolean a = MutableBoolean.create(true);
            Assertions.assertTrue(a.get());
            a.set(false);
            Assertions.assertFalse(a.get());
            MutableBoolean b = MutableBoolean.create(false);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableBoolean.class.getSimpleName() + "[value=" + false + "]");
        }

        {
            final byte testValueA = 11;
            final byte testValueB = 111;
            MutableByte a = MutableByte.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableByte b = MutableByte.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableByte.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final short testValueA = 1111;
            final short testValueB = 11111;
            MutableShort a = MutableShort.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableShort b = MutableShort.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableShort.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final char testValueA = '!';
            final char testValueB = '@';
            MutableChar a = MutableChar.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableChar b = MutableChar.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableChar.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final int testValueA = 111111111;
            final int testValueB = 1111111111;
            MutableInt a = MutableInt.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableInt b = MutableInt.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableInt.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final long testValueA = 111111111111111111L;
            final long testValueB = 1111111111111111111L;
            MutableLong a = MutableLong.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableLong b = MutableLong.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableLong.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final float testValueA = 1.1111F;
            final float testValueB = 1.11111F;
            MutableFloat a = MutableFloat.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableFloat b = MutableFloat.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableFloat.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final double testValueA = 1.1111111111F;
            final double testValueB = 1.1111111111F;
            MutableDouble a = MutableDouble.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableDouble b = MutableDouble.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableDouble.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final String testValueA = null;
            final String testValueB = "TEST_VALUE_B";
            MutableObject<String> a = MutableObject.create(testValueA);
            Assertions.assertEquals(testValueA, a.get());
            a.set(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            MutableObject<String> b = MutableObject.create(testValueB);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableObject.class.getSimpleName() + "[value=" + testValueB + "]");
        }

        {
            final String testValueA = null;
            final String testValueB = "TEST_VALUE_B";
            final String testValueC = "TEST_VALUE_C";
            //noinspection DataFlowIssue,ConstantValue
            Assertions.assertThrows(NullPointerException.class, () -> MutableNotNullObject.create(testValueA));
            MutableNotNullObject<String> a = MutableNotNullObject.create(testValueB);
            Assertions.assertEquals(testValueB, a.get());
            a.set(testValueC);
            Assertions.assertEquals(testValueC, a.get());
            MutableNotNullObject<String> b = MutableNotNullObject.create(testValueC);
            Assertions.assertEquals(a, b);
            Assertions.assertEquals(a.toString(), MutableNotNullObject.class.getSimpleName() + "[value=" + testValueC + "]");
        }
    }
}
