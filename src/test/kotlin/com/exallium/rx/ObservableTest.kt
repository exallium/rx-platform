package com.exallium.rx

import kotlin.test.Test
import kotlin.test.assertEquals

class ObservableTest {

    @Test
    fun test() {
        val expected = 42
        val obs = Observable.just(expected)
        val actual = obs.blockingFirst()
        assertEquals(expected, actual)
    }

}