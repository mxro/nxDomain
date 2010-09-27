package de.linnk.nx;

import java.util.List;

public interface Identity {
	public String getUsername();
	public Object getUsernode();
	public List<Authorization> getAuthorization(String uriDomain);
}
