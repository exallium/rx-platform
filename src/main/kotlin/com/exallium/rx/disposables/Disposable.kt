package com.exallium.rx.disposables

interface IDisposable {
    fun isDisposed(): Boolean
    fun dispose()
}

expect open class Disposable : IDisposable