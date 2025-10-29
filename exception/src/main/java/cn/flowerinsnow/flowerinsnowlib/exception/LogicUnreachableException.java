package cn.flowerinsnow.flowerinsnowlib.exception;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/// 代表逻辑上永远也不可能触发该异常的占位符异常，强调该代码路径在逻辑上无法到达，以达到快速失败的目的
///
/// 出现该异常时，不是系统、IO 或外部异常，而是逻辑层面的错误
///
/// 例如：
/// ```java
/// String getTeam(int id) {
///     if (id < 0 || id > 4) {
///         throw new NoSuchElementException("id: " + id);
///     }
///     return switch (id) {
///         case 0 -> "红队";
///         case 1 -> "黄队";
///         case 2 -> "蓝队";
///         case 3 -> "绿队";
///         default -> throw LogicUnreachableException.shouldNeverHappen("All possibilities have been exhausted");
///     }
/// }
/// ```
///
/// @author 冬花ice
/// @since 1.2.0
public class LogicUnreachableException extends RuntimeException {
    public LogicUnreachableException() {
        super();
    }

    public LogicUnreachableException(String message) {
        super(message);
    }

    public LogicUnreachableException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicUnreachableException(Throwable cause) {
        super(cause);
    }

    /// 创建一个 [LogicUnreachableException] 异常对象，表示遇到了永远也不该发生的错误
    ///
    /// 返回一个错误消息为 `msg` + `, it should never happen!` 的异常对象
    ///
    /// 例如：
    /// ```java
    /// LogicUnreachableException.shouldNeverHappen("All possibilities have been exhausted")
    /// ```
    /// 得到
    /// ```plain
    /// All possibilities have been exhausted, it should never happen!
    /// ```
    ///
    /// @param msg 错误消息
    /// @return 一个错误消息为 `msg` + `, it should never happen!` 的异常对象
    @Contract(value = "_ -> new", pure = true)
    public static @NotNull LogicUnreachableException shouldNeverHappen(@NotNull String msg) {
        Objects.requireNonNull(msg, "msg");
        return new LogicUnreachableException(msg + ", it should never happen!");
    }
}
