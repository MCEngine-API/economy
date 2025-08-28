package io.github.mcengine.api.economy.enums;

/**
 * Logical currency buckets supported by the Economy API.
 */
public enum MCEngineEconomyApiType {
    /** Aggregate currency representing the player's total spendable balance. */
    COIN,

    /** Base-denomination currency (e.g., smallest unit). */
    COPPER,

    /** Mid-tier denomination between copper and gold. */
    SILVER,

    /** High-tier denomination; typically the most valuable unit. */
    GOLD
}
