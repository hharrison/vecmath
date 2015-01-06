package javax.vecmath;

public abstract class Tupled<T extends Tupled<T>> extends Tuple<T> {

	public abstract void clamp(double min, double max);
	public abstract void clamp(double min, double max, T t);
	public abstract void clampMax(double max);
	public abstract void clampMax(double max, T t);
	public abstract void clampMin(double min);
	public abstract void clampMin(double min, T t);
	public abstract void get(double[] t);
	public abstract void scale(double s);
	public abstract void scale(double s, T t);
	public abstract void scaleAdd(double s, T t);
	public abstract void scaleAdd(double s, T t1, T t2);
	public abstract void set(double[] t);

}
