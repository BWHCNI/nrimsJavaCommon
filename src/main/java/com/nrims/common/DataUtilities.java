/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nrims.common;

/**
 * Container class for utility functions.
 * @author bepstein
 */
public class DataUtilities {

    /**
     * 
     * @param in_arr
     * @param length
     * @return 
     */
    public static byte[] adjustAndNullTerminateByteArray(
            byte[] in_arr,
            int length
            )
    {
        int i;
        int copy_limit;
        byte[] ret_value = null;
        final byte null_byte = 0;

        if ( length <= 0 )
            return( ret_value );

        ret_value = new byte[length];
        ret_value[ length - 1 ] = null_byte;

        if (in_arr.length >= length - 1)
        {
            copy_limit = length - 1;
        } else {
            copy_limit = in_arr.length;

            for (i = copy_limit; i < length - 1; i++)
                ret_value[i] = null_byte;
        }

        for (i = 0; i < copy_limit; i++)
            ret_value[i] = in_arr[i];

        return( ret_value );
    }

    public static void reverseByteOrder(byte[] bytes_in_out)
    {
        byte temp_b;
        int i, j, k;

        for (i = 0; i < bytes_in_out.length; i = i + 2)
        {
            j = i / 2;
            k = bytes_in_out.length - j - 1;

            if ( j >= k )
                break;

            temp_b = bytes_in_out[j];
            bytes_in_out[j] = bytes_in_out[k];
            bytes_in_out[k] = temp_b;
        }
    }

    public static short byteToShort(byte b)
    {
        short ret_value = 0;

        byte bit1_mask = (byte)0x01;
        byte bit2_mask = (byte)0x02;
        byte bit3_mask = (byte)0x04;
        byte bit4_mask = (byte)0x08;
        byte bit5_mask = (byte)0x10;
        byte bit6_mask = (byte)0x20;
        byte bit7_mask = (byte)0x40;
        byte bit8_mask = (byte)0x80;

        short bit1_mask_short = 0x0001;
        short bit2_mask_short = 0x0002;
        short bit3_mask_short = 0x0004;
        short bit4_mask_short = 0x0008;
        short bit5_mask_short = 0x0010;
        short bit6_mask_short = 0x0020;
        short bit7_mask_short = 0x0040;
        short bit8_mask_short = 0x0080;

        if ( (b & bit1_mask)  != 0 )
            ret_value = (short)(ret_value | bit1_mask_short);

        if ( (b & bit2_mask)  != 0 )
            ret_value = (short)(ret_value | bit2_mask_short);

        if ( (b & bit3_mask) != 0 )
            ret_value = (short)(ret_value | bit3_mask_short);

        if ( (b & bit4_mask)  != 0 )
            ret_value = (short)(ret_value | bit4_mask_short);

        if ( (b & bit5_mask)  != 0 )
            ret_value = (short)(ret_value | bit5_mask_short);

        if ( (b & bit6_mask)  != 0 )
            ret_value = (short)(ret_value | bit6_mask_short);

        if ( (b & bit7_mask)  != 0 )
            ret_value = (short)(ret_value | bit7_mask_short);

        if ( (b & bit8_mask)  != 0 )
            ret_value = (short)(ret_value | bit8_mask_short);

        return( ret_value );
    }

    public static int byteToInt(byte b)
    {
        int ret_value = 0;

        byte bit1_mask = (byte)0x01;
        byte bit2_mask = (byte)0x02;
        byte bit3_mask = (byte)0x04;
        byte bit4_mask = (byte)0x08;
        byte bit5_mask = (byte)0x10;
        byte bit6_mask = (byte)0x20;
        byte bit7_mask = (byte)0x40;
        byte bit8_mask = (byte)0x80;

        int bit1_mask_int = 0x00000001;
        int bit2_mask_int = 0x00000002;
        int bit3_mask_int = 0x00000004;
        int bit4_mask_int = 0x00000008;
        int bit5_mask_int = 0x00000010;
        int bit6_mask_int = 0x00000020;
        int bit7_mask_int = 0x00000040;
        int bit8_mask_int = 0x00000080;

        if ( (b & bit1_mask)  != 0 )
            ret_value = ret_value | bit1_mask_int;

        if ( (b & bit2_mask)  != 0 )
            ret_value = ret_value | bit2_mask_int;

        if ( (b & bit3_mask) != 0 )
            ret_value = ret_value | bit3_mask_int;

        if ( (b & bit4_mask)  != 0 )
            ret_value = ret_value | bit4_mask_int;

        if ( (b & bit5_mask)  != 0 )
            ret_value = ret_value | bit5_mask_int;

        if ( (b & bit6_mask)  != 0 )
            ret_value = ret_value | bit6_mask_int;

        if ( (b & bit7_mask)  != 0 )
            ret_value = ret_value | bit7_mask_int;

        if ( (b & bit8_mask)  != 0 )
            ret_value = ret_value | bit8_mask_int;

        return( ret_value );
    }

    public static long byteToLong(byte b)
    {
        long ret_value = 0;

        byte bit1_mask = (byte)0x01;
        byte bit2_mask = (byte)0x02;
        byte bit3_mask = (byte)0x04;
        byte bit4_mask = (byte)0x08;
        byte bit5_mask = (byte)0x10;
        byte bit6_mask = (byte)0x20;
        byte bit7_mask = (byte)0x40;
        byte bit8_mask = (byte)0x80;

        long bit1_mask_long = 0x0000000000000001L;
        long bit2_mask_long = 0x0000000000000002L;
        long bit3_mask_long = 0x0000000000000004L;
        long bit4_mask_long = 0x0000000000000008L;
        long bit5_mask_long = 0x0000000000000010L;
        long bit6_mask_long = 0x0000000000000020L;
        long bit7_mask_long = 0x0000000000000040L;
        long bit8_mask_long = 0x0000000000000080L;

        if ( (b & bit1_mask)  != 0 )
            ret_value = ret_value | bit1_mask_long;

        if ( (b & bit2_mask)  != 0 )
            ret_value = ret_value | bit2_mask_long;

        if ( (b & bit3_mask) != 0 )
            ret_value = ret_value | bit3_mask_long;

        if ( (b & bit4_mask)  != 0 )
            ret_value = ret_value | bit4_mask_long;

        if ( (b & bit5_mask)  != 0 )
            ret_value = ret_value | bit5_mask_long;

        if ( (b & bit6_mask)  != 0 )
            ret_value = ret_value | bit6_mask_long;

        if ( (b & bit7_mask)  != 0 )
            ret_value = ret_value | bit7_mask_long;

        if ( (b & bit8_mask)  != 0 )
            ret_value = ret_value | bit8_mask_long;

        return( ret_value );
    }

    public static long byte8ToLong(byte[] bytes_in){
        long ret_value = 0;
        int i, j;
        long curr_byte;

        if (bytes_in.length != 8)
            return( ret_value);

        for (i = 0; i < 8; i++)
        {
            curr_byte = byteToLong( bytes_in[i] );

            for (j = 0; j < i; j++)
                curr_byte = curr_byte << 8;

            ret_value = ret_value | curr_byte;
        }

        return( ret_value );
    }

    public static short byte2ToShort(byte[] bytes_in)
    {
        short ret_value = 0;
        int i, j;
        short curr_byte_short;

        if ( bytes_in.length != 2 )
            return( ret_value );

        for (i = 0; i < 2; i++ )
        {
            curr_byte_short = byteToShort( bytes_in[i] );

            for (j = 0; j < i; j++)
                curr_byte_short = (short)(curr_byte_short << 8);

            ret_value = (short)(ret_value | curr_byte_short);
        }

        return( ret_value );
    }

    public static int byte4ToInt(byte[] bytes_in)
    {
        int ret_value = 0;
        int curr_byte_int, i, j;

        if (bytes_in.length != 4)
            return( ret_value);

        for (i = 0; i < 4; i++)
        {
            curr_byte_int = byteToInt( bytes_in[i] );

            for (j = 0; j < i; j++)
                curr_byte_int = curr_byte_int << 8;

            ret_value = ret_value | curr_byte_int;
        }

        return( ret_value );
    }

    public static float byte4ToFloat(byte[] bytes_in)
    {
        int ivalue = byte4ToInt(bytes_in);
        return( Float.intBitsToFloat(ivalue) );
    }

    public static double byte8ToDouble(byte[] bytes_in)
    {
        long lvalue = byte8ToLong(bytes_in);
        return( Double.longBitsToDouble(lvalue) );
    }

    public static byte[] shortToByteArr(short svalue)
    {
        byte ret_arr[] = new byte[2];

        ret_arr[0] = (byte)(svalue & 0x00ff);
        ret_arr[1] = (byte)((svalue & 0xff00) >> 8);

        return( ret_arr );
    }

    public static byte[] intToByteArr(int intvalue)
    {
        byte ret_arr[] = new byte[4];

        ret_arr[0] = (byte)(intvalue & 0x00000ff);
        ret_arr[1] = (byte)((intvalue & 0x0000ff00) >> 8);
        ret_arr[2] = (byte)((intvalue & 0x00ff0000) >> 16);
        ret_arr[3] = (byte)((intvalue & 0xff000000) >> 24);
        
        return( ret_arr );
    }

    public static byte[] longToByteArr(long longvalue)
    {
        byte ret_arr[] = new byte[8];

        ret_arr[0] = (byte)(longvalue & 0x00000000000000ffL);
        ret_arr[1] = (byte)((longvalue & 0x000000000000ff00L) >> 8);
        ret_arr[2] = (byte)((longvalue & 0x0000000000ff0000L) >> 16);
        ret_arr[3] = (byte)((longvalue & 0x00000000ff000000L) >> 24);
        ret_arr[4] = (byte)((longvalue & 0x000000ff00000000L) >> 32);
        ret_arr[5] = (byte)((longvalue & 0x0000ff0000000000L) >> 40);
        ret_arr[6] = (byte)((longvalue & 0x00ff000000000000L) >> 48);
        ret_arr[7] = (byte)((longvalue & 0xff00000000000000L) >> 56);

        return( ret_arr );
    }

    public static byte[] floatToByteArr(float fvalue)
    {
        return( intToByteArr( Float.floatToIntBits(fvalue) ) );
    }

    public static byte[] doubleToByteArr(double dvalue)
    {
        return( longToByteArr( Double.doubleToRawLongBits(dvalue) ) );
    }

    public static short shortReverseByteOrder(short svalue)
    {
        byte as_bytes[] = shortToByteArr( svalue );
        reverseByteOrder( as_bytes );
        return( byte2ToShort(as_bytes) );
    }

    public static int intReverseByteOrder(int ivalue)
    {
        byte as_bytes[] = intToByteArr( ivalue );
        reverseByteOrder( as_bytes );
        return( byte4ToInt(as_bytes) );
    }

    public static long longReverseByteOrder(long lvalue)
    {
        byte as_bytes[] = longToByteArr( lvalue );
        reverseByteOrder( as_bytes );
        return( byte8ToLong (as_bytes));
    }

    public static float floatReverseByteOrder(float fvalue)
    {
        byte[] as_bytes = floatToByteArr( fvalue );
        reverseByteOrder( as_bytes );
        return( byte4ToFloat( as_bytes));
    }

    public static double doubleReverseByteOrder(double dvalue)
    {
        byte[] as_bytes = doubleToByteArr( dvalue );
        reverseByteOrder( as_bytes );
        return( byte8ToDouble( as_bytes ) );
    }
}
