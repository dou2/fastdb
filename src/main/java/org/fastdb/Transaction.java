package org.fastdb;

import java.sql.Connection;

import javax.persistence.PersistenceException;

public interface Transaction {
	/**
	 * Commit the current transaction
	 */
	public void commit() throws PersistenceException;

	/**
	 * Roll back the current transaction
	 */
	public void rollback() throws PersistenceException;

	/**
	 * get the connection on the current transaction
	 * 
	 * @return
	 */
	Connection getConnection();
}
