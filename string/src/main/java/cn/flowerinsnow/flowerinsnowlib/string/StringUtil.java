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

package cn.flowerinsnow.flowerinsnowlib.string;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Arrays;
import java.util.Objects;

/// [String] 相关内容
public final class StringUtil {
    private StringUtil() {
    }

    /// 返回出现 `count` 次数指定次数 `repeat` 的 [String]
    ///
    /// @param repeat 需要重复的字符串
    /// @param count 需要重复的次数
    /// @return 出现 `count` 次数指定次数 `repeat` 的 [String]
    /// @throws IllegalArgumentException 当 `count < 0`
    @Contract(pure = true)
    public static @NotNull String repeat(char repeat, @Range(from = 0, to = Integer.MAX_VALUE) int count) throws IllegalArgumentException {
        //noinspection ConstantValue
        if (count < 0) {
            throw new IllegalArgumentException("count is negative: " + count);
        }
        if (count == 0) {
            return "";
        }
        if (count == 1) {
            return Character.toString(repeat);
        }
        char[] result = new char[count];
        Arrays.fill(result, repeat);
        return new String(result);
    }

    /// 返回出现 `count` 次数指定次数 `repeat` 的 [String]
    ///
    /// @param repeat 需要重复的字符串
    /// @param count 需要重复的次数
    /// @return 出现 `count` 次数指定次数 `repeat` 的 [String]
    /// @throws IllegalArgumentException 当 `count < 0`
    @Contract(pure = true)
    public static @NotNull String repeat(@NotNull String repeat, @Range(from = 0, to = Integer.MAX_VALUE) int count) throws IllegalArgumentException {
        Objects.requireNonNull(repeat, "repeat");
        //noinspection ConstantValue
        if (count < 0) {
            throw new IllegalArgumentException("count is negative: " + count);
        }
        if (count == 0) {
            return "";
        }
        if (count == 1) {
            return repeat;
        }
        char[] charArray = repeat.toCharArray();
        int len = charArray.length;
        char[] result = new char[len * count];
        for (int i = 0; i < count; i++) {
            System.arraycopy(charArray, 0, result, i * len, len);
        }
        return new String(result);
    }
}
