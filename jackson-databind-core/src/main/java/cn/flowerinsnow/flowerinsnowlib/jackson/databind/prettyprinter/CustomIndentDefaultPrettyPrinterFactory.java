// SPDX-License-Identifier: LGPL-3.0-or-later
// SPDX-SnippetCopyrightText: 2026 flowerinsnow <flowerimsnow@gmail.com>

// Copyright (C) 2026  flowerinsnow <flowerimsnow@gmail.com>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

package cn.flowerinsnow.flowerinsnowlib.jackson.databind.prettyprinter;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;
import tools.jackson.core.util.DefaultIndenter;
import tools.jackson.core.util.DefaultPrettyPrinter;

/// 带自定义对象 [tools.jackson.core.util.DefaultPrettyPrinter.Indenter] 的 [DefaultPrettyPrinter] 构造器
///
/// 示例使用 4 个空格缩进：
/// ```java
/// JsonMapper.shared().writer()
///         .with(CustomIndentDefaultPrettyPrinterImpl.instance().createSpaces(4))
///         .writeValueAsString(node);
/// ```
///
/// @see DefaultPrettyPrinter
public abstract class CustomIndentDefaultPrettyPrinterFactory {
    /// 不允许除子类外的类创建实例
    protected CustomIndentDefaultPrettyPrinterFactory() {
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义对象 [tools.jackson.core.util.DefaultPrettyPrinter.Indenter]
    ///
    /// @param indenter 自定义对象缩进器
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see DefaultPrettyPrinter#DefaultPrettyPrinter()
    /// @see DefaultPrettyPrinter#indentObjectsWith(DefaultPrettyPrinter.Indenter)
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter create(@NotNull final DefaultPrettyPrinter.Indenter indenter) {
        final DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(indenter);
        return pp;
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义对象缩进字符和自定义的行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param indent Indentation String to prepend for a single level of indentation
    /// @param eol End-of-line marker to use after indented line
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(DefaultPrettyPrinter.Indenter)
    /// @see DefaultIndenter#DefaultIndenter(String, String)
    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter create(@NotNull final String indent, final String eol) {
        return create(new DefaultIndenter(indent, eol));
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义对象缩进字符和系统默认行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param indent Indentation String to prepend for a single level of indentation
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(DefaultPrettyPrinter.Indenter)
    /// @see DefaultIndenter#DefaultIndenter(String, String)
    /// @see DefaultIndenter#SYS_LF
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter create(@NotNull final String indent) {
        return create(new DefaultIndenter(indent, DefaultIndenter.SYS_LF));
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义对象缩进字符和 LF 行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param indent Indentation String to prepend for a single level of indentation
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(DefaultPrettyPrinter.Indenter)
    /// @see DefaultIndenter#DefaultIndenter(String, String)
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter createLF(@NotNull final String indent) {
        return create(new DefaultIndenter(indent, "\n"));
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义对象缩进字符和 CRLF 行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param indent Indentation String to prepend for a single level of indentation
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(DefaultPrettyPrinter.Indenter)
    /// @see DefaultIndenter#DefaultIndenter(String, String)
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter createCRLF(@NotNull final String indent) {
        return create(new DefaultIndenter(indent, "\r\n"));
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义数量空格对象缩进字符和自定义行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param count 对象缩进空格字符数量
    /// @param eol 行分隔符
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(String, String)
    @Contract(value = "_, _ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter createSpaces(@Range(from = 0L, to = Integer.MAX_VALUE) final int count, @NotNull final String eol) {
        return create(this.spaces(count), eol);
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义数量空格对象缩进字符和系统默认行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param count 对象缩进空格字符数量
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(String)
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter createSpaces(@Range(from = 0L, to = Integer.MAX_VALUE) final int count) {
        return create(this.spaces(count));
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义数量空格对象缩进字符和 LF 行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param count 对象缩进空格字符数量
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#createLF(String)
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter createSpacesLF(@Range(from = 0L, to = Integer.MAX_VALUE) final int count) {
        return createLF(this.spaces(count));
    }

    /// 创建 [DefaultPrettyPrinter]，指定自定义数量空格对象缩进字符和 CRLF 行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param count 对象缩进空格字符数量
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#createCRLF(String)
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter createSpacesCRLF(@Range(from = 0L, to = Integer.MAX_VALUE) final int count) {
        return createCRLF(this.spaces(count));
    }

    /// 创建 [DefaultPrettyPrinter]，指定制表符对象缩进字符和自定义行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @param eol 行分隔符
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(String, String)
    @Contract(value = "_ -> new", pure = true)
    public @NotNull DefaultPrettyPrinter createTab(@NotNull final String eol) {
        return create("\t", eol);
    }

    /// 创建 [DefaultPrettyPrinter]，指定制表符对象缩进字符和系统默认行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#create(String)
    @Contract(value = "-> new", pure = true)
    public @NotNull DefaultPrettyPrinter createTab() {
        return create("\t");
    }

    /// 创建 [DefaultPrettyPrinter]，指定制表符对象缩进字符和 LF 行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#createLF(String)
    @Contract(value = "-> new", pure = true)
    public @NotNull DefaultPrettyPrinter createTabLF() {
        return createLF("\t");
    }

    /// 创建 [DefaultPrettyPrinter]，指定制表符对象缩进字符和 CRLF 行分隔符
    ///
    /// 会通过 `indent` 和 `eol` 自动构造一个 [DefaultIndenter]
    ///
    /// @return 创建出的 [DefaultPrettyPrinter]
    /// @see CustomIndentDefaultPrettyPrinterFactory#createCRLF(String)
    @Contract(value = "-> new", pure = true)
    public @NotNull DefaultPrettyPrinter createTabCRLF() {
        return createCRLF("\t");
    }

    /// 指定数量的空格
    ///
    /// @param count 数量
    /// @return 指定数量的空格
    @Contract(value = "_ -> new", pure = true)
    protected abstract @NotNull String spaces(@Range(from = 0L, to = Integer.MAX_VALUE) final int count);
}
