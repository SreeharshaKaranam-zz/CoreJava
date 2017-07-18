package com.wordpress.sreeharshasite;

public interface Iterator<T>  {
	public abstract boolean hasNext();
	public abstract Object next();
	public abstract void remove(Object obj);

}
