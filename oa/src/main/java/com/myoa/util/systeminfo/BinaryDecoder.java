package com.myoa.util.systeminfo;

import org.apache.commons.codec.Decoder;
import org.apache.commons.codec.DecoderException;

public abstract interface BinaryDecoder extends Decoder
{
  public abstract byte[] decode(byte[] paramArrayOfByte)
    throws DecoderException;
}

