package com.exallium.rx.subjects

import com.exallium.rx.Observable
import com.exallium.rx.Observer

actual class PublishSubject<T> : Observable<T>() {
    actual companion object
}

//<editor-fold desc="Creational">
actual fun <T> PublishSubject.Companion.create(): PublishSubject<T> = TODO()
//</editor-fold>

//<editor-fold desc="Conversion">
actual fun <T> PublishSubject<T>.toObserver(): Observer<T> = TODO()
//</editor-fold>