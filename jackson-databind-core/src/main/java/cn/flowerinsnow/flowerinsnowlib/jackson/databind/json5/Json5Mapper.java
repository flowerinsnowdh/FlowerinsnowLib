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

package cn.flowerinsnow.flowerinsnowlib.jackson.databind.json5;

import org.jetbrains.annotations.NotNull;
import tools.jackson.core.json.JsonReadFeature;
import tools.jackson.core.json.JsonWriteFeature;
import tools.jackson.databind.json.JsonMapper;

/// 开启了 JSON5 功能的 [JsonMapper] 构造器
public final class Json5Mapper {
    private Json5Mapper() {
    }

    /// 预构建的开启了 JSON5 功能的 [JsonMapper] 对象
    private static final JsonMapper SHARED = builder().build();

    /// 开启了 JSON5 功能的 [JsonMapper] 构造器
    ///
    /// @return 开启了 JSON5 功能的 [JsonMapper] 构造器
    public static @NotNull JsonMapper.Builder builder() {
        return JsonMapper.builder()
                .enable(JsonReadFeature.ALLOW_JAVA_COMMENTS, JsonReadFeature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, JsonReadFeature.ALLOW_SINGLE_QUOTES, JsonReadFeature.ALLOW_RS_CONTROL_CHAR, JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS, JsonReadFeature.ALLOW_UNQUOTED_PROPERTY_NAMES, JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS, JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS, JsonReadFeature.ALLOW_LEADING_ZEROS_FOR_NUMBERS, JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS, JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS, JsonReadFeature.ALLOW_MISSING_VALUES, JsonReadFeature.ALLOW_TRAILING_COMMA)
                .disable(JsonWriteFeature.QUOTE_PROPERTY_NAMES, JsonWriteFeature.WRITE_NAN_AS_STRINGS);
    }

    /// 预构建的开启了 JSON5 功能的 [JsonMapper] 对象
    ///
    /// @return 预构建的开启了 JSON5 功能的 [JsonMapper] 对象
    public static @NotNull JsonMapper shared() {
        return SHARED;
    }
}
