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
    /// Constructs a new runtime exception with `null` as its detail message.  The cause is not initialized, and may subsequently be initialized by a call to [#initCause(Throwable)].
    public LogicUnreachableException() {
        super();
    }

    /// Constructs a new runtime exception with the specified detail message. The cause is not initialized, and may subsequently be initialized by a call to [#initCause(Throwable)].
    ///
    /// @param message the detail message. The detail message is saved for later retrieval by the [#getMessage()] method.
    public LogicUnreachableException(String message) {
        super(message);
    }

    /// Constructs a new runtime exception with the specified detail message and cause.
    ///
    /// Note that the detail message associated with `cause` is *not* automatically incorporated in this runtime exception's detail message.
    ///
    /// @param message the detail message (which is saved for later retrieval by the [#getMessage()] method).
    /// @param cause the cause (which is saved for later retrieval by the [#getCause()] method).  (A `null` value is permitted, and indicates that the cause is nonexistent or unknown.)
    public LogicUnreachableException(String message, Throwable cause) {
        super(message, cause);
    }

    /// Constructs a new runtime exception with the specified cause and a detail message of `(cause==null ? null : cause.toString())` (which typically contains the class and detail message of `cause`).  This constructor is useful for runtime exceptions that are little more than wrappers for other throwables.
    ///
    /// @param cause cause the cause (which is saved for later retrieval by the [#getCause()] method).  (A `null` value is permitted, and indicates that the cause is nonexistent or unknown.)
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
