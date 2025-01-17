package cn.nukkit.event.block;

import cn.nukkit.block.Block;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;

public class BlockFromToEvent extends BlockEvent implements Cancellable
{

	private static final HandlerList handlers = new HandlerList();

	private final Block to;

	public BlockFromToEvent(
		Block block,
		Block to
	)
	{
		super(block);
		this.to = to;
	}

	public static HandlerList getHandlers()
	{
		return handlers;
	}

	public Block getTo()
	{
		return to;
	}

}