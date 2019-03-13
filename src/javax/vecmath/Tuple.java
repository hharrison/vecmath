package javax.vecmath;

/**
 * This is the top-level class of the hierarchy of Tuples. It specifies
 * methods which accept as their arguments other Tuples of the same number
 * and type as the Tuple on which the method is invoked, or methods which
 * accept no arguments. Methods which accept primitives are specified by the
 * subclasses of Tuple.
 *
 * @param <T> The type of this tuple as a subclass of Tuple; the number and
 *   type of primitives held by this Tuple are determined by this parameter.
 *   Subclasses of Tuple should provide themselves to fill this parameter.
 *
 * @since 1.6
 */
public abstract class Tuple<T extends Tuple<T>>
implements java.io.Serializable, Cloneable {

	private static final long serialVersionUID = 2172728256449529639L;

	/**
	 * Sets each component of this tuple to its absolute value.
	 */
	public abstract void absolute();

	/**
	 * Sets each component of the tuple parameter to its absolute
	 * value and places the modified values into this tuple.
	 * @param t   the source tuple, which will not be modified
	 */
	public abstract void absolute(T t);

	/**
	 * Sets the value of this tuple to the vector sum of itself and tuple t1.
	 * @param t1 the other tuple
	 */
	public abstract void add(T t1);

	/**
	 * Sets the value of this tuple to the vector sum of tuples t1 and t2.
	 * @param t1 the first tuple
	 * @param t2 the second tuple
	 */
	public abstract void add(T t1, T t2);

	/**
	 * Gets the value of this tuple and copies the values into t.
	 * @param t  the Tuple object into which the values of this object are copied
	 */
	public abstract void get(T t);

	/**
	 * Negates the value of this tuple in place.
	 */
	public abstract void negate();

	/**
	 * Sets the value of this tuple to the negation of tuple t1.
	 * @param t1 the source tuple
	 */
	public abstract void negate(T t);

	/**
	 * Sets the value of this tuple to the value of tuple t1.
	 * @param t1 the tuple to be copied
	 */
	public abstract void set(T t);

	/**
	 * Sets the value of this tuple to the vector difference of
	 * itself and tuple t1 (this = this - t1) .
	 * @param t1 the other tuple
	 */
	public abstract void sub(T t1);

	/**
	 * Sets the value of this tuple to the vector difference
	 * of tuples t1 and t2 (this = t1 - t2).
	 * @param t1 the first tuple
	 * @param t2 the second tuple
	 */
	public abstract void sub(T t1, T t2);

	/**
	 * Returns true if the data members of t1 are equal to the corresponding
	 * data members in this Tuple.
	 * @param t1  the tuple with which the comparison is made
	 * @return  true or false
	 */
	public abstract boolean equals(T t);

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError();
		}
	}

}
