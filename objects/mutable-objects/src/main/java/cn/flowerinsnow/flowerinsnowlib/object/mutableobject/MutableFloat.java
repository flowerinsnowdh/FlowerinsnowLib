/*
 * Copyright (C) 2026  flowerinsnow
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package cn.flowerinsnow.flowerinsnowlib.object.mutableobject;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.StringJoiner;

/// 可在任意地方改变的共享 `float` 值，类似指针的读值与写值
/// 此类**不是**安全设计的，若您在寻找安全设计的同类型类，请参阅 [java.util.concurrent.atomic.AtomicReference]
/// @author flowerinsnow
/// @since 1.6.0
@ApiStatus.AvailableSince("1.6.0")
public class MutableFloat {
    /// 值
    protected float value;

    /// 指定值的构造器
    /// @param value 值
    protected MutableFloat(float value) {
        this.value = value;
    }

    /// 指定值的工厂方法
    /// @param value 值
    /// @return 构造出的类
    @Contract(value = "_ -> new", pure = true)
    public static @NotNull MutableFloat create(float value) {
        return new MutableFloat(value);
    }

    /// 获取值
    /// @return 值
    @Contract(pure = true)
    public float get() {
        return this.value;
    }

    /// 设置值
    /// @param value  值
    /// @return 当前对象
    @Contract(value = "_ -> this", mutates = "this")
    public @NotNull MutableFloat set(float value) {
        this.value = value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MutableFloat that = (MutableFloat) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MutableFloat.class.getSimpleName() + "[", "]")
                .add("value=" + this.value)
                .toString();
    }
}
