/*
 * $RCSfile$
 *
 * Copyright (c) 2004 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * $Revision$
 * $Date$
 * $State$
 */

package javax.vecmath;

import java.lang.Math;

/**
 * A 2-element vector that is represented by single-precision floating 
 * point x,y coordinates.
 *
 */
public class TexCoord2f extends Tuple2f implements java.io.Serializable {

    // Combatible with 1.1
    static final long serialVersionUID = 7998248474800032487L;

    /**
     * Constructs and initializes a TexCoord2f from the specified xy coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public TexCoord2f(float x, float y)
    {
         super(x,y);
    }


    /**
     * Constructs and initializes a TexCoord2f from the specified array.
     * @param v the array of length 2 containing xy in order
     */
    public TexCoord2f(float[] v)
    {
         super(v);
    }


    /**
     * Constructs and initializes a TexCoord2f from the specified TexCoord2f.
     * @param v1 the TexCoord2f containing the initialization x y data
     */
    public TexCoord2f(TexCoord2f v1)
    {
        super(v1);
    }


    /**
     * Constructs and initializes a TexCoord2f from the specified Tuple2f.
     * @param t1 the Tuple2f containing the initialization x y data
     */ 
    public TexCoord2f(Tuple2f t1) 
    {
       super(t1);
    }


    /**
     * Constructs and initializes a TexCoord2f to (0,0).
     */
    public TexCoord2f()
    {
       super();
    }


}
