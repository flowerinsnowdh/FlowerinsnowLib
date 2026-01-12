package cn.flowerinsnow.flowerinsnowlib.jackson.databind.java11.prettyprinter;

import cn.flowerinsnow.flowerinsnowlib.jackson.databind.prettyprinter.CustomIndentDefaultPrettyPrinter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

/// [CustomIndentDefaultPrettyPrinter] 的 Java 11 实现
/// @see CustomIndentDefaultPrettyPrinter
public class CustomIndentDefaultPrettyPrinterImpl extends CustomIndentDefaultPrettyPrinter {
    private static final CustomIndentDefaultPrettyPrinterImpl INSTANCE = new CustomIndentDefaultPrettyPrinterImpl();

    /// 不允许除子类外的类创建实例
    protected CustomIndentDefaultPrettyPrinterImpl() {
    }

    /// 获取该工具类
    ///
    /// @return 该工具类
    public static @NotNull CustomIndentDefaultPrettyPrinterImpl instance() {
        return INSTANCE;
    }
    /// 指定数量的空格
    ///
    /// @param count 数量
    /// @return 指定数量的空格
    @Override
    protected @NotNull String spaces(@Range(from = 0L, to = Integer.MAX_VALUE) final int count) {
        return " ".repeat(count);
    }
}
