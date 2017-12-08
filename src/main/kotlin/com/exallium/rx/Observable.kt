package com.exallium.rx

expect class Observable<T> {
    companion object

}

//<editor-fold desc="Creational">
expect fun <T> Observable.Companion.just(t: T): Observable<T>
expect fun <T> Observable.Companion.create(onSubscribe: ObservableOnSubscribe<T>): Observable<T>
//</editor-fold>

//<editor-fold desc="Transformative Operators">
expect fun <T, R> Observable<T>.map(fn: (T) -> R): Observable<R>
expect fun <T, R> Observable<T>.flatMap(fn: (T) -> Observable<R>): Observable<R>
//</editor-fold>

//<editor-fold desc="Utilities">
expect fun <T> Observable<T>.blockingFirst(): T
//</editor-fold>
