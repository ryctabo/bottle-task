package com.ryctabo.bottle.usecases

import com.ryctabo.bottle.domain.Bottle
import com.ryctabo.bottle.domain.BottleService
import com.ryctabo.bottle.domain.BottleState

class ProcessBottle(private val bottleService: BottleService) {
    operator fun invoke(bottle: Bottle) {
        if (bottle.type.size == bottle.size) {
            bottle.state = BottleState.STANDARDIZED
        }
        bottleService.save(bottle)
    }
}