/*
 * $RCSfile$
 *
 * Copyright (c) 2005 Sun Microsystems, Inc. All rights reserved.
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
 * A 3 element point represented by signed integer x,y,z
 * coordinates.
 *
 * @since Java 3D 1.2
 */
public class Point3i extends Tuple3i implements java.io.Serializable {

    // Compatible with 1.2
    static final long serialVersionUID = 6149289077348153921L;

    /**
     * Constructs and initializes a Point3i from the specified
     * x, y, and z coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Point3i(int x, int y, int z) {
	super(x, y, z);
    }


    /**
     * Constructs and initializes a Point3i from the array of length 3.
     * @param t the array of length 3 containing x, y, and z in order.
     */
    public Point3i(int[] t) {
	super(t);
    }


    /**
     * Constructs and initializes a Point3i from the specified Tuple3i.
     * @param t1 the Tuple3i containing the initialization x, y, and z
     * data.
     */
    public Point3i(Tuple3i t1) {
	super(t1);
    }


    /**
     * Constructs and initializes a Point3i to (0,0,0).
     */
    public Point3i() {
	super();
    }

}
