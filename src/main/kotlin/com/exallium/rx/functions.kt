package com.exallium.rx

typealias Cancellable = () -> (Unit)
typealias ObservableOnSubscribe<T> = (ObservableEmitter<T>) -> (Unit)