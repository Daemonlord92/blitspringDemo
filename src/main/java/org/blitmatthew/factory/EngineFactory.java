package org.blitmatthew.factory;

import org.blitmatthew.entity.Engine;
import org.blitmatthew.entity.V6Engine;
import org.blitmatthew.entity.V8Engine;

public class EngineFactory {
    public static Engine createEngine(String engineType) {
        if ("V8".equalsIgnoreCase(engineType)) {
            return new V8Engine();
        } else if ("V6".equalsIgnoreCase(engineType)) {
            return new V6Engine();
        } else {
            throw new IllegalArgumentException("Invalid Engine Type: " + engineType);
        }
    }
}
