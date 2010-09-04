package de.linnk.nx;

import java.util.List;

/**
 * The methods for changes should not be called directly, 
 * call by using NodeChanges and ResourceConnections instead
 * 
 * @author mx
 *
 * @param <I>
 */
public interface CompositeNode<I> {
	public List<I> getNodes();
	public Object getOwnerNode();
	public void addNode(I n);
	public void removeNode(I n);
}
