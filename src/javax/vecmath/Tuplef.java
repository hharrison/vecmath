package javax.vecmath;

public abstract class Tuplef<T extends Tuplef<T>> extends Tuple<T> {

	public abstract void clamp(float min, float max);
	public abstract void clamp(float min, float max, T t);
	public abstract void clampMax(float max);
	public abstract void clampMax(float max, T t);
	public abstract void clampMin(float min);
	public abstract void clampMin(float min, T t);
	public abstract void get(float[] t);
	public abstract void scale(float s);
	public abstract void scale(float s, T t);
	public abstract void scaleAdd(float s, T t);
	public abstract void scaleAdd(float s, T t1, T t2);
	public abstract void set(float[] t);

}
