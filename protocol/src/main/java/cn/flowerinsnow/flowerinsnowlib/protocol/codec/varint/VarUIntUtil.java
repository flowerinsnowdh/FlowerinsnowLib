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
