package com.exallium.rx.disposables

expect class Disposable
expect fun Disposable.isDisposed(): Boolean
expect fun Disposable.dispose()
