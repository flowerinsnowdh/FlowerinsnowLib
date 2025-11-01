package cn.flowerinsnow.flowerinsnowlib.protocol.codec.varint;

/// 工具类，为了实现：可变长度整数，类似 protobuf 的 Varint
/// 每个字节最高位为 1 表示“还有后续”，剩余 7 位为数据
/// @author 冬花ice
/// @since 1.3.0
public final class VarUIntUtil {
    private VarUIntUtil() {
    }

    /// 判断该字节是否“还有后续”
    ///
    /// 每个字节最高位为 1 表示“还有后续”，剩余 7 位为数据
    ///
    /// @param b 该字节
    /// @return 如果该字节是否“还有后续”，返回 `true`
    public static boolean hasRemaining(byte b) {
        return (b & 0x80) != 0;
    }
}
