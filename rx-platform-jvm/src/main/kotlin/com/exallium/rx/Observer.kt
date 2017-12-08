package com.exallium.rx

actual open class Observer<in T>(private val wrapped: io.reactivex.Observer<T>) : IObserver<T> {
    override fun onNext(t: T) = wrapped.onNext(t)

    override fun onError(t: Throwable) = wrapped.onError(t)

    override fun onComplete() = wrapped.onComplete()
}