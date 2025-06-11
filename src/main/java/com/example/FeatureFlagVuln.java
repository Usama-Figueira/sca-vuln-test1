package com.example;

import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;

public class FeatureFlagVuln {
    public static void run() {
        Transformer[] transformers = new Transformer[] {
                input -> {
                    System.out.println("Commons-Collections vulnerability triggered: " + input);
                    return input;
                }
        };

        Transformer chain = new ChainedTransformer(transformers);
        chain.transform("Exploit");
    }
}
