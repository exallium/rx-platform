package com.exallium.rx

import com.exallium.rx.disposables.Disposable

actual open class Observable<T> {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> Observable.Companion.just(t: T): Observable<T> = TODO()
actual fun <T> Observable.Companion.create(onSubscribe: ObservableOnSubscribe<T>): Observable<T> = TODO()
//</editor-fold>

//<editor-fold desc="Transformative Operators">
actual fun <T, R> Observable<T>.map(fn: (T) -> R): Observable<R> = TODO()
actual fun <T, R> Observable<T>.flatMap(fn: (T) -> Observable<R>): Observable<R> = TODO()
actual fun <T, R> Observable<T>.scan(initialValue: R, scanFn: (R, T) -> R): Observable<R> = TODO()
actual fun <T> Observable<T>.startWith(t: T): Observable<T> = TODO()
actual fun <T> Observable<T>.filter(p: Predicate<T>): Observable<T> = TODO()
//</editor-fold>

//<editor-fold desc="Utilities">
actual fun <T> Observable<T>.blockingFirst(): T = TODO()
//</editor-fold>

//<editor-fold desc="Subscriptions">
actual fun <T> Observable<T>.subscribe(): Disposable = TODO()
actual fun <T> Observable<T>.subscribe(onNext: (T) -> (Unit), onError: (Throwable) -> (Unit), onComplete: () -> (Unit)): Disposable = TODO()
//</editor-fold>