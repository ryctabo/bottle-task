package com.ryctabo.bottle.usecases

import com.ryctabo.bottle.domain.BottleService

class ReprocessNoStandardBottle(
    private val bottleService: BottleService,
    private val processBottle: ProcessBottle
) {
    operator fun invoke(size: Int) {
        val bottle = bottleService.pop()
        bottle.size = size
        processBottle(bottle)
    }
}