package com.exallium.rx

import com.exallium.rx.disposables.Disposable
import io.reactivex.functions.BiFunction

actual class Single<T>(internal val obs: io.reactivex.Single<T>) {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> Single.Companion.just(t: T): Single<T> = Single(io.reactivex.Single.just(t))
actual fun <T> Single.Companion.fromCallable(c: Callable<T>): Single<T> = Single(io.reactivex.Single.fromCallable(c))
//</editor-fold>

//<editor-fold desc="Transformative Operators">
actual fun <T, R> Single<T>.map(fn: (T) -> R): Single<R> = Single(this.obs.map(fn))
actual fun <T, R> Single<T>.flatMap(fn: (T) -> Single<R>): Single<R> = Single(this.obs.flatMap { fn(it).obs })
actual fun <T, R, U> Single<T>.zipWith(s: Single<R>, zipFn: (T, R) -> U): Single<U> = Single(this.obs.zipWith<R, U>(s.obs, BiFunction(zipFn)))
//</editor-fold>

//<editor-fold desc="Utilities">
actual fun <T> Single<T>.blockingGet(): T = this.obs.blockingGet()
actual fun <T> Single<T>.doOnSuccess(fn: (T) -> Unit): Single<T> = Single(obs.doOnSuccess(fn))
//</editor-fold>

//<editor-fold desc="Subscriptions">
actual fun <T> Single<T>.subscribe(): Disposable = Disposable(obs.subscribe())
actual fun <T> Single<T>.subscribe(onSuccess: (T) -> (Unit), onError: (Throwable) -> (Unit)): Disposable = Disposable(obs.subscribe(onSuccess, onError))
//</editor-fold>