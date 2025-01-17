package cn.nukkit.event.entity;

import cn.nukkit.entity.item.EntityItem;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;

/**
 * author: MagicDroidX Nukkit Project
 */
public class ItemDespawnEvent extends EntityEvent implements Cancellable
{

	private static final HandlerList handlers = new HandlerList();

	public ItemDespawnEvent(EntityItem item)
	{
		this.entity = item;
	}

	public static HandlerList getHandlers()
	{
		return handlers;
	}

	@Override
	public EntityItem getEntity()
	{
		return (EntityItem) this.entity;
	}

}
