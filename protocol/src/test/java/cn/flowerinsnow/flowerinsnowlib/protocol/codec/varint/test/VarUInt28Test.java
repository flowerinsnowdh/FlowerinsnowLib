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

package cn.flowerinsnow.flowerinsnowlib.protocol.codec.varint.test;

import cn.flowerinsnow.flowerinsnowlib.protocol.codec.varint.VarUInt28;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class VarUInt28Test {
    @Test
    void test() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            VarUInt28 value = VarUInt28.create(random.nextInt(VarUInt28.MAX_VALUE));
            byte[] encode = value.encode();
            int decode = VarUInt28.parse(encode).intValue();
            byte[] encode2 = VarUInt28.create(decode).encode();
            Assertions.assertArrayEquals(encode, encode2);
            Assertions.assertEquals(value.intValue(), decode);
        }
    }
}