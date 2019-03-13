/*
 * Copyright 1997-2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 *
 */

package javax.vecmath;


/**
 * A generic 3-element tuple that is represented by single precision-floating
 * point x,y,z coordinates.
 *
 */
public abstract class Tuple3f extends Tuplef<Tuple3f> {

    static final long serialVersionUID=5019834619484343712L;

    /**
     * The x coordinate.
     */
    public	float	x;

    /**
     * The y coordinate.
     */
    public	float	y;

    /**
     * The z coordinate.
     */
    public	float	z;


    /**
     * Constructs and initializes a Tuple3f from the specified xyz coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Tuple3f(float x, float y, float z)
    {
	this.x = x;
	this.y = y;
	this.z = z;
    }


    /**
     * Constructs and initializes a Tuple3f from the array of length 3.
     * @param t the array of length 3 containing xyz in order
     */
    public Tuple3f(float[] t)
    {
	this.x = t[0];
	this.y = t[1];
	this.z = t[2];
    }


    /**
     * Constructs and initializes a Tuple3f from the specified Tuple3f.
     * @param t1 the Tuple3f containing the initialization x y z data
     */
    public Tuple3f(Tuple3f t1)
    {
	this.x = t1.x;
	this.y = t1.y;
	this.z = t1.z;
    }


    /**
     * Constructs and initializes a Tuple3f from the specified Tuple3d.
     * @param t1 the Tuple3d containing the initialization x y z data
     */
    public Tuple3f(Tuple3d t1)
    {
	this.x = (float) t1.x;
	this.y = (float) t1.y;
	this.z = (float) t1.z;
    }


    /**
     * Constructs and initializes a Tuple3f to (0,0,0).
     */
    public Tuple3f()
    {
	this.x = 0.0f;
	this.y = 0.0f;
	this.z = 0.0f;
    }


   /**
     * Returns a string that contains the values of this Tuple3f.
     * The form is (x,y,z).
     * @return the String representation
     */
    @Override
    public String toString() {
	return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }


    /**
     * Sets the value of this tuple to the specified xyz coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public final void set(float x, float y, float z)
    {
	this.x = x;
	this.y = y;
	this.z = z;
    }


    public final void set(float[] t)
    {
	this.x = t[0];
	this.y = t[1];
	this.z = t[2];
    }


    public final void set(Tuple3f t1)
    {
	this.x = t1.x;
	this.y = t1.y;
	this.z = t1.z;
    }


    /**
     * Sets the value of this tuple to the value of tuple t1.
     * @param t1 the tuple to be copied
     */
    public final void set(Tuple3d t1)
    {
	this.x = (float) t1.x;
	this.y = (float) t1.y;
	this.z = (float) t1.z;
    }


    public final void get(float[] t)
    {
       t[0] = this.x;
       t[1] = this.y;
       t[2] = this.z;
    }


    public final void get(Tuple3f t)
    {
       t.x = this.x;
       t.y = this.y;
       t.z = this.z;
    }


    public final void add(Tuple3f t1, Tuple3f t2)
    {
	this.x = t1.x + t2.x;
	this.y = t1.y + t2.y;
	this.z = t1.z + t2.z;
    }


    public final void add(Tuple3f t1)
    {
        this.x += t1.x;
        this.y += t1.y;
        this.z += t1.z;
    }


    public final void sub(Tuple3f t1, Tuple3f t2)
    {
	this.x = t1.x - t2.x;
	this.y = t1.y - t2.y;
	this.z = t1.z - t2.z;
    }


    public final void sub(Tuple3f t1)
    {
        this.x -= t1.x;
        this.y -= t1.y;
        this.z -= t1.z;
    }


    public final void negate(Tuple3f t1)
    {
	this.x = -t1.x;
	this.y = -t1.y;
	this.z = -t1.z;
    }


    public final void negate()
    {
	this.x = -this.x;
	this.y = -this.y;
	this.z = -this.z;
    }


    public final void scale(float s, Tuple3f t1)
    {
	this.x = s*t1.x;
	this.y = s*t1.y;
	this.z = s*t1.z;
    }


    public final void scale(float s)
    {
	this.x *= s;
	this.y *= s;
	this.z *= s;
    }


    public final void scaleAdd(float s, Tuple3f t1, Tuple3f t2)
    {
	this.x = s*t1.x + t2.x;
	this.y = s*t1.y + t2.y;
	this.z = s*t1.z + t2.z;
    }


    public final void scaleAdd(float s, Tuple3f t1)
    {
        this.x = s*this.x + t1.x;
        this.y = s*this.y + t1.y;
        this.z = s*this.z + t1.z;
    }


    public boolean equals(Tuple3f t1)
    {
        try {
           return(this.x == t1.x && this.y == t1.y && this.z == t1.z);
        }
        catch (NullPointerException e2) {return false;}
    }

   /**
     * Returns true if the Object t1 is of type Tuple3f and all of the
     * data members of t1 are equal to the corresponding data members in
     * this Tuple3f.
     * @param t1  the Object with which the comparison is made
     * @return  true or false
     */
    @Override
    public boolean equals(Object t1)
    {
        try {
           Tuple3f t2 = (Tuple3f) t1;
           return(this.x == t2.x && this.y == t2.y && this.z == t2.z);
        }
        catch (NullPointerException e2) {return false;}
        catch (ClassCastException   e1) {return false;}
    }


   /**
     * Returns true if the L-infinite distance between this tuple
     * and tuple t1 is less than or equal to the epsilon parameter,
     * otherwise returns false.  The L-infinite
     * distance is equal to MAX[abs(x1-x2), abs(y1-y2), abs(z1-z2)].
     * @param t1  the tuple to be compared to this tuple
     * @param epsilon  the threshold value
     * @return  true or false
     */
    public boolean epsilonEquals(Tuple3f t1, float epsilon)
    {
       float diff;

       diff = x - t1.x;
       if(Float.isNaN(diff)) return false;
       if((diff<0?-diff:diff) > epsilon) return false;

       diff = y - t1.y;
       if(Float.isNaN(diff)) return false;
       if((diff<0?-diff:diff) > epsilon) return false;

       diff = z - t1.z;
       if(Float.isNaN(diff)) return false;
       if((diff<0?-diff:diff) > epsilon) return false;

       return true;

    }


    /**
     * Returns a hash code value based on the data values in this
     * object.  Two different Tuple3f objects with identical data values
     * (i.e., Tuple3f.equals returns true) will return the same hash
     * code value.  Two objects with different data members may return the
     * same hash value, although this is not likely.
     * @return the integer hash code value
     */
    @Override
    public int hashCode() {
	long bits = 1L;
	bits = VecMathUtil.hashFloatBits(bits, x);
	bits = VecMathUtil.hashFloatBits(bits, y);
	bits = VecMathUtil.hashFloatBits(bits, z);
	return VecMathUtil.hashFinish(bits);
    }



   public final void clamp(float min, float max, Tuple3f t)
   {
        if( t.x > max ) {
          x = max;
        } else if( t.x < min ){
          x = min;
        } else {
          x = t.x;
        }

        if( t.y > max ) {
          y = max;
        } else if( t.y < min ){
          y = min;
        } else {
          y = t.y;
        }

        if( t.z > max ) {
          z = max;
        } else if( t.z < min ){
          z = min;
        } else {
          z = t.z;
        }

   }


   public final void clampMin(float min, Tuple3f t)
   {
        if( t.x < min ) {
          x = min;
        } else {
          x = t.x;
        }

        if( t.y < min ) {
          y = min;
        } else {
          y = t.y;
        }

        if( t.z < min ) {
          z = min;
        } else {
          z = t.z;
        }

   }


   public final void clampMax(float max, Tuple3f t)
   {
        if( t.x > max ) {
          x = max;
        } else {
          x = t.x;
        }

        if( t.y > max ) {
          y = max;
        } else {
          y = t.y;
        }

        if( t.z > max ) {
          z = max;
        } else {
          z = t.z;
        }

   }


  public final void absolute(Tuple3f t)
  {
       x = Math.abs(t.x);
       y = Math.abs(t.y);
       z = Math.abs(t.z);
  }


   public final void clamp(float min, float max)
   {
        if( x > max ) {
          x = max;
        } else if( x < min ){
          x = min;
        }

        if( y > max ) {
          y = max;
        } else if( y < min ){
          y = min;
        }

        if( z > max ) {
          z = max;
        } else if( z < min ){
          z = min;
        }

   }


   public final void clampMin(float min)
   {
      if( x < min ) x=min;
      if( y < min ) y=min;
      if( z < min ) z=min;

   }


   public final void clampMax(float max)
   {
      if( x > max ) x=max;
      if( y > max ) y=max;
      if( z > max ) z=max;

   }


  public final void absolute()
  {
     x = Math.abs(x);
     y = Math.abs(y);
     z = Math.abs(z);

  }


  public final void interpolate(Tuple3f t1, Tuple3f t2, float alpha)
  {
           this.x = (1-alpha)*t1.x + alpha*t2.x;
           this.y = (1-alpha)*t1.y + alpha*t2.y;
           this.z = (1-alpha)*t1.z + alpha*t2.z;


  }


  public final void interpolate(Tuple3f t1, float alpha)
  {
     this.x = (1-alpha)*this.x + alpha*t1.x;
     this.y = (1-alpha)*this.y + alpha*t1.y;
     this.z = (1-alpha)*this.z + alpha*t1.z;


  }

    /**
	 * Get the <i>x</i> coordinate.
	 *
	 * @return the  <i>x</i> coordinate.
	 *
	 * @since vecmath 1.5
	 */
	public final float getX() {
		return x;
	}


	/**
	 * Set the <i>x</i> coordinate.
	 *
	 * @param x  value to <i>x</i> coordinate.
	 *
	 * @since vecmath 1.5
	 */
	public final void setX(float x) {
		this.x = x;
	}


	/**
	 * Get the <i>y</i> coordinate.
	 *
	 * @return the <i>y</i> coordinate.
	 *
	 * @since vecmath 1.5
	 */
	public final float getY() {
		return y;
	}


	/**
	 * Set the <i>y</i> coordinate.
	 *
	 * @param y value to <i>y</i> coordinate.
	 *
	 * @since vecmath 1.5
	 */
	public final void setY(float y) {
		this.y = y;
	}

	/**
	 * Get the <i>z</i> coordinate.
	 *
	 * @return the <i>z</i> coordinate
	 *
	 * @since vecmath 1.5
	 */
	public final float getZ() {
		return z;
	}


	/**
	 * Set the <i>Z</i> coordinate.
	 *
	 * @param z value to <i>z</i> coordinate.
	 *
	 * @since vecmath 1.5
	 */
	public final void setZ(float z) {
		this.z = z;
	}
}
