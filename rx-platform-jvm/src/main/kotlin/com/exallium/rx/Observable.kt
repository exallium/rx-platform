package com.exallium.rx

actual class Observable<T>(internal val obs: io.reactivex.Observable<T>) {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> Observable.Companion.just(t: T): Observable<T> = Observable(io.reactivex.Observable.just(t))

actual fun <T> Observable.Companion.create(createFn: (emitter: ObservableEmitter<T>) -> (Unit)): Observable<T>
        = Observable(io.reactivex.Observable.create { e: io.reactivex.ObservableEmitter<T> -> createFn(ObservableEmitter(e)) })
//</editor-fold>

//<editor-fold desc="Transformative Operators">
actual fun <T, R> Observable<T>.map(fn: (T) -> R): Observable<R> = Observable(this.obs.map(fn))

actual fun <T, R> Observable<T>.flatMap(fn: (T) -> Observable<R>): Observable<R> = Observable(this.obs.flatMap { fn(it).obs })
//</editor-fold>

//<editor-fold desc="Utilities">
actual fun <T> Observable<T>.blockingFirst(): T = this.obs.blockingFirst()
//</editor-fold>