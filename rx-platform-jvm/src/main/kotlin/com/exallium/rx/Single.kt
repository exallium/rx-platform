package com.exallium.rx

actual class Single<T>(internal val obs: io.reactivex.Single<T>) {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> Single.Companion.just(t: T): Single<T> = Single(io.reactivex.Single.just(t))
//</editor-fold>

//<editor-fold desc="Transformative Operators">
actual fun <T, R> Single<T>.map(fn: (T) -> R): Single<R> = Single(this.obs.map(fn))
actual fun <T, R> Single<T>.flatMap(fn: (T) -> Single<R>): Single<R> = Single(this.obs.flatMap { fn(it).obs })
//</editor-fold>

//<editor-fold desc="Utilities">
actual fun <T> Single<T>.blockingGet(): T = this.obs.blockingGet()
//</editor-fold>