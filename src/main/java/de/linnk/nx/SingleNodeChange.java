package de.linnk.nx;

public interface SingleNodeChange<O> extends NodeChange {
	/**
	 * Which nodes are affected by the change
	 * might return NodeReference objects
	 * 
	 * @return
	 */
	public O getAffectedNode();
	public O perform(Object owner, O node);
}
