package com.exallium.rx.subjects

import com.exallium.rx.Observable
import com.exallium.rx.Observer

expect class PublishSubject<T> : Observable<T> {
    companion object
}

//<editor-fold desc="Creational">
expect fun <T> PublishSubject.Companion.create(): PublishSubject<T>
//</editor-fold>

//<editor-fold desc="Conversion">
expect fun <T> PublishSubject<T>.toObserver(): Observer<T>
//</editor-fold>
