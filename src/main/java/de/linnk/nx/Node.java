package de.linnk.nx;

import java.util.List;

public interface Node {
	public List<Object> getNodes();
	public Object getOwnerNode();
	public void addNode(Object n);
	public void removeNode(Object n);
}
