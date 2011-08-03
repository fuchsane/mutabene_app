/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package mutabene.manager;

import java.util.Collection;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import mutabene.model.entity.Todo;

/**
 *
 * @author Anysek
 */
//public class TodoManager extends GenericDataManager<Todo> {
public class TodoManager {
    	public void add(String userId, String summery, String description, String url) {
		synchronized (this) {
			EntityManager em = EMF.get().createEntityManager();
                        //EntityManager em = emfInstance.createEntityManager();
			Todo todo = new Todo(userId, summery, description, url);
			em.persist(todo);
			em.close();
		}
	} 
        
        public List<Todo> getTodos(String userId) {
		EntityManager em = EMF.get().createEntityManager();
		Query q = em.createQuery("select t from Todo t where t.author = :userId");
		q.setParameter("userId", userId);
		List<Todo> todos = q.getResultList();
		return todos;
	}

    public boolean add(Todo object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean update(Todo object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean delete(Todo object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Todo findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Collection<Todo> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Collection<Todo> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Collection<Todo> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
