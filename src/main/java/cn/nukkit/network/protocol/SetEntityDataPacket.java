package cn.nukkit.network.protocol;

import cn.nukkit.entity.data.EntityMetadata;
import cn.nukkit.utils.Binary;

/**
 * author: MagicDroidX Nukkit Project
 */
public class SetEntityDataPacket extends DataPacket
{

	public static final byte NETWORK_ID = ProtocolInfo.SET_ENTITY_DATA_PACKET;

	public long eid;

	public EntityMetadata metadata;

	@Override
	public byte pid()
	{
		return NETWORK_ID;
	}

	@Override
	public void decode()
	{

	}

	@Override
	public void encode()
	{
		this.reset();
		this.putVarLong(this.eid);
		this.put(Binary.writeMetadata(this.metadata));
	}

}
