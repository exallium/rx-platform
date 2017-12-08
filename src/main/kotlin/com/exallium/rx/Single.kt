package com.exallium.rx

expect class Single<T> {
    companion object

}

//<editor-fold desc="Creational">
expect fun <T> Single.Companion.just(t: T): Single<T>
expect fun <T> Single.Companion.fromCallable(c: Callable<T>): Single<T>
//</editor-fold>

//<editor-fold desc="Transformative Operators">
expect fun <T, R> Single<T>.map(fn: (T) -> R): Single<R>
expect fun <T, R> Single<T>.flatMap(fn: (T) -> Single<R>): Single<R>
expect fun <T, R, U> Single<T>.zipWith(s: Single<R>, zipFn: (T, R) -> U): Single<U>
//</editor-fold>

//<editor-fold desc="Utilities">
expect fun <T> Single<T>.blockingGet(): T
expect fun <T> Single<T>.doOnSuccess(fn: (T) -> Unit): Single<T>
//</editor-fold>
