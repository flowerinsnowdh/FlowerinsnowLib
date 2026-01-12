package cn.flowerinsnow.flowerinsnowlib.jackson.databind.java8.prettyprinter;

import cn.flowerinsnow.flowerinsnowlib.jackson.databind.prettyprinter.CustomIndentDefaultPrettyPrinter;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

/// [CustomIndentDefaultPrettyPrinter] 的 Java 8 实现
/// @see CustomIndentDefaultPrettyPrinter
public class CustomIndentDefaultPrettyPrinterImpl extends CustomIndentDefaultPrettyPrinter {
    /// 指定数量的空格
    ///
    /// @param count 数量
    /// @return 指定数量的空格
    @Override
    protected @NotNull String spaces(@Range(from = 0L, to = Integer.MAX_VALUE) final int count) {
        return StringUtils.repeat(' ', count);
    }
}
