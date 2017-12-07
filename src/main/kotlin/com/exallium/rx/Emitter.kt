package com.exallium.rx

interface Emitter<in T> {
    fun onNext(next: T)
    fun onError(throwable: Throwable)
    fun onComplete()
}