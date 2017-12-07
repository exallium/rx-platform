package com.exallium.rx

import com.exallium.rx.disposables.Disposable

expect class Observable<T> {
    companion object

}

interface ObservableEmitter<T> : Emitter<T> {
    fun setDisposable(disposable: Disposable?)
    fun setCancellable(onCancel: () -> (Unit))
    fun serialize(): ObservableEmitter<T>
    fun tryOnError(throwable: Throwable)
}

//<editor-fold desc="Creational">
expect fun <T> Observable.Companion.just(t: T): Observable<T>
expect fun <T> Observable.Companion.create(createFn: (emitter: ObservableEmitter<T>) -> (Unit)): Observable<T>
//</editor-fold>

//<editor-fold desc="Transformative Operators">
expect fun <T, R> Observable<T>.map(fn: (T) -> R): Observable<R>
expect fun <T, R> Observable<T>.flatMap(fn: (T) -> Observable<R>): Observable<R>
//</editor-fold>

//<editor-fold desc="Utilities">
expect fun <T> Observable<T>.blockingFirst(): T
//</editor-fold>
