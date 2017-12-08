package com.exallium.rx

import com.exallium.rx.disposables.Disposable
import kotlin.reflect.KClass

actual open class Observable<T>(internal open val wrapped: io.reactivex.Observable<T>) {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> Observable.Companion.just(t: T): Observable<T> = Observable(io.reactivex.Observable.just(t))

actual fun <T> Observable.Companion.create(onSubscribe: ObservableOnSubscribe<T>): Observable<T>
        = Observable(io.reactivex.Observable.create { e: io.reactivex.ObservableEmitter<T> -> onSubscribe(ObservableEmitter(e)) })
//</editor-fold>

//<editor-fold desc="Transformative Operators">
actual fun <T, R> Observable<T>.map(fn: (T) -> R): Observable<R> = Observable(this.wrapped.map(fn))

actual fun <T, R> Observable<T>.flatMap(fn: (T) -> Observable<R>): Observable<R> = Observable(this.wrapped.flatMap { fn(it).wrapped })

actual fun <T, R> Observable<T>.scan(initialValue: R, scanFn: (R, T) -> R): Observable<R> = Observable(wrapped.scan(initialValue, scanFn))

actual fun <T> Observable<T>.startWith(t: T): Observable<T> = Observable(wrapped.startWith(t))

actual fun <T> Observable<T>.filter(p: Predicate<T>): Observable<T> = Observable(wrapped.filter(p))
//</editor-fold>

//<editor-fold desc="Utilities">
actual fun <T> Observable<T>.blockingFirst(): T = this.wrapped.blockingFirst()
//</editor-fold>

//<editor-fold desc="Subscriptions">
actual fun <T> Observable<T>.subscribe(): Disposable = Disposable(wrapped.subscribe())

actual fun <T> Observable<T>.subscribe(onNext: (T) -> (Unit),
                                       onError: (Throwable) -> (Unit),
                                       onComplete: () -> (Unit)): Disposable = Disposable(wrapped.subscribe(onNext, onError, onComplete))
//</editor-fold>