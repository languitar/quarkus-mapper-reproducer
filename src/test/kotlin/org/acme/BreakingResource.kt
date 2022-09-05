package org.acme

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager
import io.vertx.core.json.JsonObject

class BreakingResource : QuarkusTestResourceLifecycleManager {
    override fun start(): MutableMap<String, String> {
        JsonObject.mapFrom(Model(42)).toString()
        println("Breaking the code now")
        return mutableMapOf()
    }

    override fun stop() {
    }
}
