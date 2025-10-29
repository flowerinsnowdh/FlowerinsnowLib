package cn.flowerinsnow.flowerinsnowlib.array;

import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

/// 针对 [java.util.Arrays] 的补充
/// @author 冬花ice
/// @since 1.0.0
public final class ArrayUtil {
    /// 封锁构造方法
    private ArrayUtil() {
    }
    
    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final boolean @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final byte @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final short @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final int @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final long @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final char @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final float @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static boolean isEmpty(final double @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    ///
    /// @param array 要检查的数组
    /// @param <T> 该数组的类型
    /// @return 如果 `array` 中没有任何元素（即长度为`0`），返回 `true`
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    @Contract(pure = true)
    public static <T> boolean isEmpty(final T @NotNull [] array) {
        Objects.requireNonNull(array, "array");
        return array.length == 0;
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static boolean getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final boolean @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static byte getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final byte @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static short getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final short @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static int getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final int @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static long getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final long @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static char getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final char @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static float getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final float @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static double getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final double @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的第一个元素
    /// 
    /// @param array 数组
    /// @param <T> 该数组的类型
    /// @return 数组 `array` 中的第一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static <T> T getFirst(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final T @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[0];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static boolean getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final boolean @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static byte getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final byte @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static short getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final short @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static int getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final int @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static long getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final long @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static char getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final char @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static float getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final float @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static double getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final double @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 返回数组 `array` 中的最后一个元素
    ///
    /// @param array 数组
    /// @param <T> 该数组的类型
    /// @return 数组 `array` 中的最后一个元素
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @throws ArrayIndexOutOfBoundsException 当数组 `array` 没有任何元素（即长度为`0`）时抛出
    @Contract(pure = true)
    public static <T> T getLast(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET) final T @NotNull [] array
    ) throws ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(array, "array");
        return array[array.length - 1];
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Boolean @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final boolean @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Boolean[] copy = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Byte @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final byte @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Byte[] copy = new Byte[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Short @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final short @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Short[] copy = new Short[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Integer @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final int @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Integer[] copy = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Long @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final long @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Long[] copy = new Long[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Character @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final char @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Character[] copy = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Float @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final float @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Float[] copy = new Float[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将基础类型转为包装类型
    ///
    /// @param array 需要复制并转为包装类型数组的数组
    /// @return 从 `array` 复制出来的包装类型数组
    @Contract(pure = true)
    public static Double @NotNull [] box(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final double @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final Double[] copy = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static boolean @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Boolean @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final boolean[] copy = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static byte @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Byte @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final byte[] copy = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static short @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Short @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final short[] copy = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static int @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Integer @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static long @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Long @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final long[] copy = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static char @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Character @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final char[] copy = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static float @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Float @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final float[] copy = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 复制一份 `array`，并将包装类型转为基础类型
    ///
    /// @param array 需要复制并转为基础类型数组的数组
    /// @return 从 `array` 复制出来的基础类型数组
    @Contract(pure = true)
    public static double @NotNull [] unbox(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) final Double @NotNull [] array
    ) {
        Objects.requireNonNull(array, "array");
        final double[] copy = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    /// 返回元素为指定值 `array` 的包装类顺序 [Stream]
    /// 
    /// @param array 需要转为 [Stream] 的指定值
    /// @return 元素为指定值 `array` 的包装类顺序 [Stream]
    @Contract(pure = true)
    public static @NotNull Stream<Boolean> streamBoxed(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) boolean[] array
    ) {
        return Arrays.stream(box(array));
    }

    /// 返回元素为指定值 `array` 的包装类顺序 [Stream]
    ///
    /// @param array 需要转为 [Stream] 的指定值
    /// @return 元素为指定值 `array` 的包装类顺序 [Stream]
    @Contract(pure = true)
    public static @NotNull Stream<Byte> streamBoxed(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) byte[] array
    ) {
        return Arrays.stream(box(array));
    }

    /// 返回元素为指定值 `array` 的包装类顺序 [Stream]
    ///
    /// @param array 需要转为 [Stream] 的指定值
    /// @return 元素为指定值 `array` 的包装类顺序 [Stream]
    @Contract(pure = true)
    public static @NotNull Stream<Short> streamBoxed(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) short[] array
    ) {
        return Arrays.stream(box(array));
    }

    /// 返回元素为指定值 `array` 的包装类顺序 [Stream]
    ///
    /// @param array 需要转为 [Stream] 的指定值
    /// @return 元素为指定值 `array` 的包装类顺序 [Stream]
    @Contract(pure = true)
    public static @NotNull Stream<Character> streamBoxed(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) char[] array
    ) {
        return Arrays.stream(box(array));
    }

    /// 返回元素为指定值 `array` 的包装类顺序 [Stream]
    ///
    /// @param array 需要转为 [Stream] 的指定值
    /// @return 元素为指定值 `array` 的包装类顺序 [Stream]
    @Contract(pure = true)
    public static @NotNull Stream<Float> streamBoxed(
            @Flow(sourceIsContainer = true, target = Flow.RETURN_METHOD_TARGET, targetIsContainer = true) float[] array
    ) {
        return Arrays.stream(box(array));
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// boolean[] array = {false, true, true};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final boolean @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// byte[] array = {(byte) 0, (byte) 1, (byte) 2};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final byte @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// short[] array = {(short) 0, (short) 1, (short) 2};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final short @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// int[] array = {0, 1, 2};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final int @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// long[] array = {0L, 1L, 2L};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final long @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// char[] array = {'0', '1', '2'};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final char @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// float[] array = {0.0F, 1.0F, 2.0F};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final float @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// double[] array = {0.0, 1.0, 2.0};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static boolean isLastIndex(final double @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }

    /// 返回 `index` 是否是数组 `array` 的最后一个下标
    ///
    /// 例如：
    /// ```java
    /// String[] array = {"0", "1", "2"};
    /// ArrayUtil.isLastIndex(array, 1); // false
    /// ArrayUtil.isLastIndex(array, 2); // true
    /// ArrayUtil.isLastIndex(array, 3); // false
    /// ```
    ///
    /// @param array 需要判断的数组
    /// @param index 需要判断的下标
    /// @return 如果 `index` 是数组 `array` 的最后一个下标，返回 true
    /// @throws IllegalArgumentException 当参数 `index` 为负数时抛出
    /// @throws NullPointerException 当非空参数传入 `null` 时抛出
    /// @since 1.0.1
    @Contract(pure = true)
    public static <T> boolean isLastIndex(final T @NotNull [] array, @Range(from = 0L, to = Integer.MAX_VALUE) final int index) {
        Objects.requireNonNull(array, "array");
        if (array.length == 0) {
            return false;
        }
        //noinspection ConstantValue
        if (index < 0) {
            throw new IllegalArgumentException("The param \"index\" must be a non-negative integer");
        }
        return index == array.length - 1;
    }
}
