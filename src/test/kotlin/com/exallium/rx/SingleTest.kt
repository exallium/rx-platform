package com.exallium.rx

import kotlin.test.Test
import kotlin.test.assertEquals

class SingleTest {
    @Test
    fun test() {
        val expected = 42
        val obs = Single.just(expected)
        val actual = obs.blockingGet()
        assertEquals(expected, actual)
    }

    @Test
    fun simpleFlatMap() {
        val expected = 42
        val obs = Single.just(40).flatMap { Single.just(it + 2) }
        assertEquals(expected, obs.blockingGet())
    }
}