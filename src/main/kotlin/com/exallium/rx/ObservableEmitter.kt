package com.exallium.rx

import com.exallium.rx.disposables.Disposable

expect class ObservableEmitter<T>

expect fun <T> ObservableEmitter<T>.setDisposable(d: Disposable?)
expect fun <T> ObservableEmitter<T>.setCancellable(c: () -> (Unit))
expect fun <T> ObservableEmitter<T>.isDisposed(): Boolean
expect fun <T> ObservableEmitter<T>.serialize(): ObservableEmitter<T>
expect fun <T> ObservableEmitter<T>.tryOnError(t: Throwable): Boolean