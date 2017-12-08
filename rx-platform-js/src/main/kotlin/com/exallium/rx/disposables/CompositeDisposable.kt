package com.exallium.rx.disposables

actual class CompositeDisposable : Disposable() {

    override fun isDisposed(): Boolean = TODO()
    override fun dispose(): Unit = TODO()

    actual companion object
}

actual operator fun CompositeDisposable.Companion.invoke(): CompositeDisposable = TODO()
actual fun CompositeDisposable.add(disposable: Disposable): Boolean = TODO()
actual fun CompositeDisposable.addAll(vararg disposable: Disposable): Boolean = TODO()
actual fun CompositeDisposable.remove(disposable: Disposable): Boolean = TODO()
actual fun CompositeDisposable.delete(disposable: Disposable): Boolean = TODO()
actual fun CompositeDisposable.clear(): Unit = TODO()
actual fun CompositeDisposable.size(): Int = TODO()
