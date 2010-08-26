package de.linnk.nx;

import java.util.List;

public interface CompositeNode {
	public List<Object> getNodes();
	public Object getOwnerNode();
	public void addNode(Object n);
	public void removeNode(Object n);
}
