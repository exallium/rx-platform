package com.exallium.rx

import com.exallium.rx.disposables.Disposable

actual class ObservableEmitter<T>

actual fun <T> ObservableEmitter<T>.setDisposable(d: Disposable?) { TODO() }
actual fun <T> ObservableEmitter<T>.setCancellable(c: () -> (Unit)) { TODO() }
actual fun <T> ObservableEmitter<T>.isDisposed(): Boolean = TODO()
actual fun <T> ObservableEmitter<T>.serialize(): ObservableEmitter<T> = TODO()
actual fun <T> ObservableEmitter<T>.tryOnError(t: Throwable): Boolean = TODO()