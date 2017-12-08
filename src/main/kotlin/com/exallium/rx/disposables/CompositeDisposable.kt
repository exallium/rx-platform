package com.exallium.rx.disposables

expect class CompositeDisposable : Disposable {
    companion object
}
expect operator fun CompositeDisposable.Companion.invoke(): CompositeDisposable
expect fun CompositeDisposable.add(disposable: Disposable): Boolean
expect fun CompositeDisposable.addAll(vararg disposable: Disposable): Boolean
expect fun CompositeDisposable.remove(disposable: Disposable): Boolean
expect fun CompositeDisposable.delete(disposable: Disposable): Boolean
expect fun CompositeDisposable.clear()
expect fun CompositeDisposable.size(): Int

operator fun CompositeDisposable.plusAssign(disposable: Disposable) {
    this.add(disposable)
}
