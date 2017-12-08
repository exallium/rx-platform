package com.exallium.rx.subjects

import com.exallium.rx.Observable
import com.exallium.rx.Observer

actual class PublishSubject<T>(override val wrapped: io.reactivex.subjects.PublishSubject<T>) : Observable<T>(wrapped) {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> PublishSubject.Companion.create(): PublishSubject<T> = PublishSubject(io.reactivex.subjects.PublishSubject.create())
//</editor-fold>

//<editor-fold desc="Conversion">
actual fun <T> PublishSubject<T>.toObserver(): Observer<T> = Observer(wrapped)
//</editor-fold>