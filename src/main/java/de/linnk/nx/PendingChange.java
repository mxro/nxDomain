package de.linnk.nx;

public interface PendingChange {
	public enum Status { UNSENT, SENDING, UNCONFIRMED } 
	
	public NodeChange getChange();
	public ResourceConnection getConnection();
	
	/**
	 * returns the progress of the change when it is sending
	 * @return
	 */
	public Object getProgress();
}
