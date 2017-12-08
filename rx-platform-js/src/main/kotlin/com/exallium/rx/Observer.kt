package com.exallium.rx

actual open class Observer<in T> : IObserver<T> {
    override fun onNext(t: T) {
        TODO("not implemented")
    }

    override fun onError(t: Throwable) {
        TODO("not implemented")
    }

    override fun onComplete() {
        TODO("not implemented")
    }
}