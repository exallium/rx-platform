package com.exallium.rx

import com.exallium.rx.disposables.Disposable

actual class ObservableEmitter<T>(val wrapped: io.reactivex.ObservableEmitter<T>)

actual fun <T> ObservableEmitter<T>.setDisposable(d: Disposable?) = wrapped.setDisposable(d?.disposable)
actual fun <T> ObservableEmitter<T>.setCancellable(c: Cancellable) = wrapped.setCancellable(c)
actual fun <T> ObservableEmitter<T>.isDisposed(): Boolean = wrapped.isDisposed
actual fun <T> ObservableEmitter<T>.serialize(): ObservableEmitter<T> = ObservableEmitter(wrapped.serialize())
actual fun <T> ObservableEmitter<T>.tryOnError(t: Throwable): Boolean = wrapped.tryOnError(t)