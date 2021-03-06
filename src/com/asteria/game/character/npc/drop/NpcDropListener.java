package com.asteria.game.character.npc.drop;

import com.asteria.game.character.player.Player;

/**
 * The listener that will be executed upon successful and unsuccessful dynamic
 * and rare drop calculations for {@link NpcDropTable}s.
 * 
 * @author lare96 <http://github.org/lare96>
 */
public interface NpcDropListener {

    /**
     * Executed when a successful or unsuccessful drop from the dynamic table is
     * calculated.
     * 
     * @param player
     *            the player this is being dropped for.
     * @param drop
     *            the drop that is being calculated.
     * @param successful
     *            if the drop was successful; or in other words, if the drop was
     *            dropped for the player.
     */
    public void onDynamicDrop(Player player, NpcDrop drop, boolean successful);

    /**
     * Executed when a successful or unsuccessful drop from the rare table is
     * calculated.
     * 
     * @param player
     *            the player this is being dropped for.
     * @param drop
     *            the drop that is being calculated.
     * @param successful
     *            if the drop was successful; or in other words, if the drop was
     *            dropped for the player.
     */
    public void onRareDrop(Player player, NpcDrop drop, boolean successful);

}
