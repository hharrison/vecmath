package javax.vecmath;

/**
 * This class describes a Tuple that holds ints. The number of ints is
 * determined by subclasses. 
 *
 * @param <T> The type of this tuple. Subclasses should provide themselves to
 *   fill this parameter.
 *
 * @since 1.6
 */
public abstract class Tuplei<T extends Tuplei<T>> extends Tuple<T> {

	private static final long serialVersionUID = -7508116170295643350L;

	/**
	 *  Clamps this tuple to the range [low, high].
	 *  @param min  the lowest value in this tuple after clamping
	 *  @param max  the highest value in this tuple after clamping
	 */
	public abstract void clamp(int min, int max);

	/**
	 *  Clamps the tuple parameter to the range [low, high] and
	 *  places the values into this tuple.
	 *  @param min   the lowest value in the tuple after clamping
	 *  @param max  the highest value in the tuple after clamping
	 *  @param t   the source tuple, which will not be modified
	 */
	public abstract void clamp(int min, int max, T t);

	/**
	 *  Clamps the maximum value of this tuple to the max parameter.
	 *  @param max   the highest value in the tuple after clamping
	 */
	public abstract void clampMax(int max);

	/**
	 *  Clamps the maximum value of the tuple parameter to the max
	 *  parameter and places the values into this tuple.
	 *  @param max   the highest value in the tuple after clamping
	 *  @param t   the source tuple, which will not be modified
	 */
	public abstract void clampMax(int max, T t);

	/**
	 *  Clamps the minimum value of this tuple to the min parameter.
	 *  @param min   the lowest value in this tuple after clamping
	 */
	public abstract void clampMin(int min);

	/**
	 *  Clamps the minimum value of the tuple parameter to the min
	 *  parameter and places the values into this tuple.
	 *  @param min   the lowest value in the tuple after clamping
	 *  @param t   the source tuple, which will not be modified
	 */
	public abstract void clampMin(int min, T t);

	/**
	 * Gets the value of this tuple and copies the values into t.
	 * @param t  the array into which the values are copied
	 */
	public abstract void get(int[] t);

	/**
	 * Sets the value of this vector to the scalar multiplication
	 * of tuple t1.
	 * @param s the scalar value
	 * @param t1 the source tuple
	 */
	public abstract void scale(int s);

	/**
	 * Sets the value of this tuple to the scalar multiplication
	 * of the scale factor with this.
	 * @param s the scalar value
	 */
	public abstract void scale(int s, T t);

	/**
	 * Sets the value of this tuple to the scalar multiplication
	 * of itself and then adds tuple t1 (this = s*this + t1).
	 * @param s the scalar value
	 * @param t1 the tuple to be added
	 */
	public abstract void scaleAdd(int s, T t);

	/**
	 * Sets the value of this tuple to the scalar multiplication
	 * of tuple t1 and then adds tuple t2 (this = s*t1 + t2).
	 * @param s the scalar value
	 * @param t1 the tuple to be scaled and added
	 * @param t2 the tuple to be added without a scale
	 */
	public abstract void scaleAdd(int s, T t1, T t2);

	/**
	 * Sets the value of this tuple to the coordinates specified in
	 * the array.
	 * @param t the array containing the coordinates in order
	 */
	public abstract void set(int[] t);

}
