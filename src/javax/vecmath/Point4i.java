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
 * A 4 element point represented by signed integer x,y,z,w
 * coordinates.
 *
 * @since Java 3D 1.2
 */
public class Point4i extends Tuple4i implements java.io.Serializable {

    // Combatible with 1.2
    static final long serialVersionUID = 620124780244617983L;

    /**
     * Constructs and initializes a Point4i from the specified
     * x, y, z, and w coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param w the w coordinate
     */
    public Point4i(int x, int y, int z, int w) {
	super(x, y, z, w);
    }


    /**
     * Constructs and initializes a Point4i from the array of length 4.
     * @param t the array of length 4 containing x, y, z, and w in order.
     */
    public Point4i(int[] t) {
	super(t);
    }


    /**
     * Constructs and initializes a Point4i from the specified Tuple4i.
     * @param t1 the Tuple4i containing the initialization x, y, z,
     * and w data.
     */
    public Point4i(Tuple4i t1) {
	super(t1);
    }


    /**
     * Constructs and initializes a Point4i to (0,0,0,0).
     */
    public Point4i() {
	super();
    }

}
