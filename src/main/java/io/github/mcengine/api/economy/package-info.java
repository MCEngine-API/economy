/**
 * Provides the API for the economy system in the MCEngine plugin.
 * <p>
 * This package exposes interfaces and classes for managing player balances,
 * transactions, and integrations with other modules. The economy supports
 * multiple denominations (e.g., Copper, Silver, Gold, and an aggregate Coin),
 * enabling plugins to interact with balances in a flexible, modular way.
 * </p>
 *
 * <h2>Key Features</h2>
 * <ul>
 *   <li>Support for multiple currency denominations (copper/silver/gold/coin).</li>
 *   <li>Backend-agnostic storage interfaces (e.g., SQLite, MySQL, PostgreSQL, MongoDB).</li>
 *   <li>API methods to create, adjust, transfer, and query balances.</li>
 *   <li>Extension points for AddOns, Libraries, DLCs, Agents, and Skripts.</li>
 * </ul>
 *
 * <p><strong>Threading &amp; Safety:</strong> Implementations should ensure atomic updates
 * for balance mutations and idempotent lifecycle operations.</p>
 *
 * @author
 *     MCEngine
 */
package io.github.mcengine.api.economy;
