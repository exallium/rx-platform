package com.exallium.rx

import com.exallium.rx.disposables.Disposable

expect open class Observable<T> {
    companion object
}

//<editor-fold desc="Creational">
expect fun <T> Observable.Companion.just(t: T): Observable<T>
expect fun <T> Observable.Companion.create(onSubscribe: ObservableOnSubscribe<T>): Observable<T>
//</editor-fold>

//<editor-fold desc="Transformative Operators">
expect fun <T, R> Observable<T>.map(fn: (T) -> R): Observable<R>
expect fun <T, R> Observable<T>.flatMap(fn: (T) -> Observable<R>): Observable<R>
expect fun <T, R> Observable<T>.scan(initialValue: R, scanFn: (R, T) -> R): Observable<R>
expect fun <T> Observable<T>.startWith(t: T): Observable<T>
expect fun <T> Observable<T>.filter(p: Predicate<T>): Observable<T>
//</editor-fold>

//<editor-fold desc="Utilities">
expect fun <T> Observable<T>.blockingFirst(): T
//</editor-fold>

//<editor-fold desc="Subscriptions">
expect fun <T> Observable<T>.subscribe(): Disposable
expect fun <T> Observable<T>.subscribe(onNext: (T) -> (Unit), onError: (Throwable) -> (Unit), onComplete: () -> (Unit)): Disposable
//</editor-fold>