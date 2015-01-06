package javax.vecmath;

public abstract class Tuple<T extends Tuple<T>>
implements java.io.Serializable, Cloneable {

    private static final long serialVersionUID = 2172728256449529639L;

	public abstract void absolute();
	public abstract void absolute(T t);
	public abstract void add(T t);
	public abstract void add(T t1, T t2);
	public abstract void get(T t);
	public abstract void negate();
	public abstract void negate(T t);
	public abstract void set(T t);
	public abstract void sub(T t1);
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
