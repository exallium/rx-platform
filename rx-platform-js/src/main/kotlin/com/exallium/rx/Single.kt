package com.exallium.rx

actual class Single<T> {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> Single.Companion.just(t: T): Single<T> = TODO()
actual fun <T> Single.Companion.fromCallable(c: Callable<T>): Single<T> = TODO()
//</editor-fold>

//<editor-fold desc="Transformative Operators">
actual fun <T, R> Single<T>.map(fn: (T) -> R): Single<R> = TODO()
actual fun <T, R> Single<T>.flatMap(fn: (T) -> Single<R>): Single<R> = TODO()
actual fun <T, R, U> Single<T>.zipWith(s: Single<R>, zipFn: (T, R) -> U): Single<U> = TODO()
//</editor-fold>

//<editor-fold desc="Utilities">
actual fun <T> Single<T>.blockingGet(): T = TODO()
actual fun <T> Single<T>.doOnSuccess(fn: (T) -> Unit): Single<T> = TODO()
//</editor-fold>
