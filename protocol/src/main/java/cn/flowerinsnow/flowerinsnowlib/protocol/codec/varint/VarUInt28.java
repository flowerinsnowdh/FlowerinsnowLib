package cn.flowerinsnow.flowerinsnowlib.protocol.codec.varint;

import cn.flowerinsnow.flowerinsnowlib.array.ArrayUtil;
import cn.flowerinsnow.flowerinsnowlib.exception.LogicUnreachableException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.StringJoiner;

/// 可变长度整数，类似 protobuf 的 Varint
/// 每个字节最高位为 1 表示“还有后续”，剩余 7 位为数据
/// 理论上无最大值，但为了效率，最大值设为 `0xFFFFFFF`
/// @author 冬花ice
/// @since 1.3.0
public final class VarUInt28 extends Number {
    /// [VarUInt28] 的最小值
    public static final int MIN_VALUE = 0;
    /// [VarUInt28] 的最大值
    public static final int MAX_VALUE = 0xFFFFFFF;
    /// 数值
    private final int value;

    /// 通过数值构建 [VarUInt28]
    ///
    /// @param value 数值
    private VarUInt28(@Range(from = 0, to = MAX_VALUE) int value) {
        this.value = value;
    }

    /// 通过数值创建 VarInt
    ///
    /// @param value 数值，不得 `< 0`
    /// @return 创建出的 [VarUInt28]
    /// @throws IllegalArgumentException 当 `value < 0` 或 `value > `时抛出
    public static @NotNull VarUInt28 create(@Range(from = 0, to = MAX_VALUE) int value) {
        //noinspection ConstantValue
        if (value < 0) {
            throw new IllegalArgumentException(value + " < " + MIN_VALUE);
        } else //noinspection ConstantValue
            if (value > MAX_VALUE) {
            throw new IllegalArgumentException(value + " > " + MAX_VALUE);
        }
        return new VarUInt28(value);
    }

    /// 从数据解析 [VarUInt28]
    ///
    /// @param data 数据
    /// @return 解析出的 [VarUInt28]
    /// @throws IllegalArgumentException 当数据不合法时抛出
    public static @NotNull VarUInt28 parse(byte @NotNull [] data) throws IllegalArgumentException {
        if (data.length == 0) {
            throw new IllegalArgumentException("Empty data");
        }
        if (data.length > 4) {
            throw new IllegalArgumentException("Data too large. (" + data.length + "b > 4b)");
        }
        int value = 0;
        for (int i = 0; i < data.length; i++) {
            if (ArrayUtil.isLastIndex(data, i) && VarUIntUtil.hasRemaining(data[i]) || !ArrayUtil.isLastIndex(data, i) && !VarUIntUtil.hasRemaining(data[i])) {
                throw new IllegalArgumentException("Illegal data of VarUInt");
            }
            value = (value << 7) | (data[i] & 0x7F);
        }
        return create(value);
    }

    /// 编码该数字为二进制数据
    ///
    /// @return 编码后的数据
    public byte @NotNull [] encode() {
        if (this.value < 0x7F) { // 1字节，7位
            return new byte[]{(byte) this.value};
        } else if (this.value < 0x3FFF) { // 2字节，14位
            return new byte[]{(byte) (((this.value >>> 7) & 0x7F) | 0x80), (byte) (this.value & 0x7F)};
        } else if (this.value < 0x1FFFFF) { // 3字节，21位
            return new byte[]{(byte) (((this.value >>> 14) & 0x7F) | 0x80), (byte) (((this.value >>> 7) & 0x7F) | 0x80), (byte) (this.value & 0x7F)};
        } else if (this.value < 0xFFFFFFF) {// 4字节，28位
            return new byte[]{(byte) (((this.value >>> 21) & 0x7F) | 0x80), (byte) (((this.value >>> 14) & 0x7F) | 0x80), (byte) (((this.value >>> 7) & 0x7F) | 0x80), (byte) (this.value & 0x7F)};
        } else {
            throw LogicUnreachableException.shouldNeverHappen("VarUInt28 instance is larger than " + MAX_VALUE);
        }
    }


    /// Returns the value of the specified number as an `int`.
    ///
    /// @return the numeric value represented by this object after conversion to type `int`.
    /// @see Number#intValue()
    @Override
    public int intValue() {
        return this.value;
    }

    /// Returns the value of the specified number as a `long`.
    ///
    /// @return the numeric value represented by this object after conversion to type `long`.
    /// @see Number#longValue()
    @Override
    public long longValue() {
        return this.value;
    }

    /// Returns the value of the specified number as a `float`.
    ///
    /// @return the numeric value represented by this object after conversion to type `float`.
    /// @see Number#floatValue()
    @Override
    public float floatValue() {
        return this.value;
    }

    /// Returns the value of the specified number as a `double`.
    ///
    /// @return the numeric value represented by this object after conversion to type `double`.
    /// @see Number#doubleValue()
    @Override
    public double doubleValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        VarUInt28 that = (VarUInt28) o;
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", VarUInt28.class.getSimpleName() + "{", "}")
                .add("value=" + value)
                .toString();
    }
}
