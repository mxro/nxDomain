package de.linnk.nx;

import java.util.List;

/**
 * for a client there should always be one top level ResourceConnection
 * this can be connected to a changing number of external ResourceConnections
 * 
 * 
 * @author mx
 *
 */
public interface ResourceConnection {
	
	/**
	 * 
	 * node changes can also be undo/redo
	 * 
	 * @param uriLocation
	 * @param change
	 * @return a node with the status of the commit, eg a FAIL or SUCCESS node
	 */
	public Object commit(String uriLocation, NodeChange change);
	
	/**
	 * 
	 * only gives notification under the uri domain. eg domain "http://www.mxro.de/test"
	 * would result in notifications for "http://www.mxro.de/test/sub/sub1.xml" but not 
	 * for "http://www.mxro.de/test2/sub.xml"
	 * 
	 * @param listener
	 */
	public void registerChangeListener(String uriDomain, ChangeListener listener);
	
	public boolean canResolve(String uri);
	
	/**
	 * usually returns the version of a node which can be retrieved the quickest (eg the version from the local cache),
	 * might later receive change updates if other versions are more recent.
	 * 
	 * @param uri
	 * @return
	 */
	public Object resolve(String uri);
	
	/**
	 * for composite resource connections, one NodeChange might pend in more than
	 * one used ResourceConnections
	 * 
	 * @return
	 */
	public List<PendingChange> getPendingChanges(String uriDomain);
	
	/**
	 * returns a node indicating the current status of this connection
	 * eg a textitem showing connection is okay
	 * 
	 * @return
	 */
	public Object getStatusNode(String uriDomain);
	
	/**
	 * checks whether there are updates for the given resource in remote systems
	 * 
	 * triggers changeListener events
	 * 
	 * @param uri
	 */
	public void checkForUpdates(String uri);
	
	/**
	 * specifies the identiy with which requests are made.
	 * 
	 * @param identity
	 */
	public void setIdentiy(Identity identity);
	
}
