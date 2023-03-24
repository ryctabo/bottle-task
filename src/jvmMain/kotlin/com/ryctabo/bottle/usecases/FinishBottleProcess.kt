package com.ryctabo.bottle.usecases

import com.ryctabo.bottle.domain.Bottle
import com.ryctabo.bottle.domain.BottleService
import com.ryctabo.bottle.domain.BottleState

class FinishBottleProcess(
    private val bottleService: BottleService
) {
    operator fun invoke(bottle: Bottle) {
        if (bottle.state == BottleState.STANDARDIZED) {
            bottle.state = BottleState.FINISHED
            bottleService.save(bottle)
        }
    }
}