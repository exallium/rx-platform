@file:JvmName("JVMCompositeDisposable")
package com.exallium.rx.disposables

actual class CompositeDisposable(internal val wrapped: io.reactivex.disposables.CompositeDisposable) : Disposable(wrapped) {

    override fun isDisposed(): Boolean = wrapped.isDisposed
    override fun dispose() = wrapped.dispose()

    actual companion object
}

actual operator fun CompositeDisposable.Companion.invoke(): CompositeDisposable = CompositeDisposable(io.reactivex.disposables.CompositeDisposable())
actual fun CompositeDisposable.add(disposable: Disposable): Boolean = wrapped.add(disposable.disposable)
actual fun CompositeDisposable.addAll(vararg disposable: Disposable): Boolean = wrapped.addAll(*disposable.map { it.disposable }.toTypedArray())
actual fun CompositeDisposable.remove(disposable: Disposable): Boolean = wrapped.remove(disposable.disposable)
actual fun CompositeDisposable.delete(disposable: Disposable): Boolean = wrapped.delete(disposable.disposable)
actual fun CompositeDisposable.clear() = wrapped.clear()
actual fun CompositeDisposable.size(): Int = wrapped.size()
