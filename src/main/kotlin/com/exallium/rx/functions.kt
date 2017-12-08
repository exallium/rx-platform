package com.exallium.rx

typealias Cancellable = () -> (Unit)
typealias Callable<T> = () -> T
typealias ObservableOnSubscribe<T> = (ObservableEmitter<T>) -> (Unit)