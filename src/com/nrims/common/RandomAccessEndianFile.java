/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package com.nrims.common;

import java.io.*;

/**
 *
 * @author bepstein
 */
public class RandomAccessEndianFile extends RandomAccessFile
{
    /* Constructors */
    /**
     * Initialises the object
     * @param file
     * @param mode
     * @throws FileNotFoundException
     */
    public RandomAccessEndianFile(File file, String mode)
            throws FileNotFoundException
    {
        super(file, mode);
        init_local_variables();
    }

    /**
     * Initializes the object.
     * @param name
     * @param mode
     * @throws FileNotFoundException
     */
    public RandomAccessEndianFile(String name, String mode)
            throws FileNotFoundException
    {
        super(name, mode);
        init_local_variables();
    }

    /* public variables */

    /* public methods */
    public void setBigEndianFlag(boolean flag)
    {
        big_endian_flag = flag;
    }

    public boolean getBigEndianFlag()
    {
        return( big_endian_flag );
    }

    public double readDoubleEndian()
            throws IOException
    {
        double ret_value;
        ret_value = super.readDouble();

        if ( ! getBigEndianFlag() )
        {
            ret_value = DataUtilities.doubleReverseByteOrder(ret_value);
        }

        return( ret_value );
    }

    public float readFloatEndian()
            throws IOException
    {
        float ret_value;
        ret_value = super.readFloat();

        if ( ! getBigEndianFlag() )
        {
            ret_value = DataUtilities.floatReverseByteOrder(ret_value);
        }

        return( ret_value );
    }

    public short readShortEndian()
            throws IOException
    {
        short ret_value;
        ret_value = super.readShort();
        
        if ( ! getBigEndianFlag() )
        {
            ret_value = DataUtilities.shortReverseByteOrder(ret_value);
        }

        return( ret_value );
    }

    public int readIntEndian()
            throws IOException
    {
        int ret_value;
        ret_value = super.readInt();

        if ( ! getBigEndianFlag() )
        {
            ret_value = DataUtilities.intReverseByteOrder(ret_value);
        }

        return( ret_value );
    }

    public long readLongEndian()
            throws IOException
    {
        long ret_value;
        ret_value = super.readLong();

        if ( ! getBigEndianFlag() )
        {
            ret_value = DataUtilities.longReverseByteOrder(ret_value);
        }

        return( ret_value );
    }

    /* private constants */

    /* private variables */
    private boolean big_endian_flag;

    /* private methods */
    private void init_local_variables()
    {
        setBigEndianFlag( true );
    }
}
