package com.ryctabo.bottle.domain

interface BottleService {
    fun save(bottle: Bottle)
    fun pop(): Bottle
    fun getByState(state: BottleState): List<Bottle>
    fun get(index: Int): Bottle?
}