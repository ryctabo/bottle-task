package com.ryctabo.bottle.infrastructure.service

import com.ryctabo.bottle.domain.Bottle
import com.ryctabo.bottle.domain.BottleService
import com.ryctabo.bottle.domain.BottleState
import java.util.*

class DefaultBottleService : BottleService {
    private val stack = Stack<Bottle>()
    private val items = mutableListOf<Bottle>()

    override fun save(bottle: Bottle) {
        if (stack.contains(bottle) || items.contains(bottle)) {
            return
        }

        if (bottle.state == BottleState.NO_STANDARD) {
            stack.push(bottle)
        } else {
            items.add(bottle)
        }
    }

    override fun pop(): Bottle {
        return stack.pop()
    }

    override fun getByState(state: BottleState): List<Bottle> {
        if (state == BottleState.NO_STANDARD) {
            return stack
        }
        return items.filter { it.state == state }
    }

    override fun get(index: Int): Bottle? {
        return items[index]
    }
}