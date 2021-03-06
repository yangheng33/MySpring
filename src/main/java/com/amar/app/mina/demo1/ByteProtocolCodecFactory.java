package com.amar.app.mina.demo1;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class ByteProtocolCodecFactory implements ProtocolCodecFactory
{
	protected ProtocolEncoder encoder;

	protected ProtocolDecoder decoder;

	public ByteProtocolCodecFactory()
	{
		encoder = new ByteEncode();

		decoder = new ByteDecode();
	}

	@Override
	public ProtocolEncoder getEncoder( IoSession session ) throws Exception
	{
		return encoder;
	}

	@Override
	public ProtocolDecoder getDecoder( IoSession session ) throws Exception
	{
		return decoder;
	}

}
