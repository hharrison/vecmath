package javax.vecmath;

public abstract class Tuplei<T extends Tuplei<T>> extends Tuple<T> {

	private static final long serialVersionUID = -7508116170295643350L;

	public abstract void clamp(int min, int max);
	public abstract void clamp(int min, int max, T t);
	public abstract void clampMax(int max);
	public abstract void clampMax(int max, T t);
	public abstract void clampMin(int min);
	public abstract void clampMin(int min, T t);
	public abstract void get(int[] t);
	public abstract void scale(int s);
	public abstract void scale(int s, T t);
	public abstract void scaleAdd(int s, T t);
	public abstract void scaleAdd(int s, T t1, T t2);
	public abstract void set(int[] t);

}
