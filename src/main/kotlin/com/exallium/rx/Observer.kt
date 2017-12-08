package com.exallium.rx

interface IObserver<in T> {
    fun onNext(t: T)
    fun onError(t: Throwable)
    fun onComplete()
}

expect open class Observer<in T> : IObserver<T>