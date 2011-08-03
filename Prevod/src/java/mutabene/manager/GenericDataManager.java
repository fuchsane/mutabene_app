/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mutabene.service.interfaces.IDataManager;

/**
 *
 * @author stenlik
 */

public abstract class GenericDataManager<T> implements IDataManager<T, Integer, String, Long> {
//public class GenericDataManager {
        //private GenericDataManager() {}
        
	protected static final EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("transactions-optional");

	public static EntityManagerFactory get() {
		return emfInstance;
	}
}
