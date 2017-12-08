package com.exallium.rx

actual class Observable<T> {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> Observable.Companion.just(t: T): Observable<T> = TODO()
actual fun <T> Observable.Companion.create(onSubscribe: ObservableOnSubscribe<T>): Observable<T> = TODO()
//</editor-fold>

//<editor-fold desc="Transformative Operators">
actual fun <T, R> Observable<T>.map(fn: (T) -> R): Observable<R> = TODO()
actual fun <T, R> Observable<T>.flatMap(fn: (T) -> Observable<R>): Observable<R> = TODO()
//</editor-fold>

//<editor-fold desc="Utilities">
actual fun <T> Observable<T>.blockingFirst(): T = TODO()
//</editor-fold>