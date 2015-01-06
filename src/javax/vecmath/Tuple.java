package javax.vecmath;

public abstract class Tuple<T extends Tuple<T>> {

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

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError();
		}
	}

}
