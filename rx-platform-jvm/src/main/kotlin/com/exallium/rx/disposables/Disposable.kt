package com.exallium.rx.disposables

actual class Disposable(internal val disposable: io.reactivex.disposables.Disposable)
actual fun Disposable.isDisposed(): Boolean = disposable.isDisposed
actual fun Disposable.dispose() = disposable.dispose()
