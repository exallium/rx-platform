package com.exallium.rx.disposables

actual open class Disposable(internal val disposable: io.reactivex.disposables.Disposable) : IDisposable {
    override fun isDisposed(): Boolean = disposable.isDisposed
    override fun dispose() = disposable.dispose()
}
