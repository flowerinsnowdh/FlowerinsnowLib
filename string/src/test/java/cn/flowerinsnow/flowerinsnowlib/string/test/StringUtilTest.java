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

package cn.flowerinsnow.flowerinsnowlib.string.test;

import cn.flowerinsnow.flowerinsnowlib.string.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    public void test() {
        {
            final char testValueChar = '!';
            Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat(testValueChar, -1));
            Assertions.assertEquals("", StringUtil.repeat(testValueChar, 0));
            Assertions.assertEquals(Character.toString(testValueChar), StringUtil.repeat(testValueChar, 1));
            Assertions.assertEquals(Character.toString(testValueChar) + testValueChar + testValueChar + testValueChar + testValueChar, StringUtil.repeat(testValueChar, 5));
        }
        {
            final String testValueString = "TEST_VALUE";
            Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat(testValueString, -1));
            Assertions.assertEquals("", StringUtil.repeat(testValueString, 0));
            Assertions.assertEquals(testValueString, StringUtil.repeat(testValueString, 1));
            Assertions.assertEquals(testValueString + testValueString + testValueString + testValueString + testValueString, StringUtil.repeat(testValueString, 5));
        }
    }
}
