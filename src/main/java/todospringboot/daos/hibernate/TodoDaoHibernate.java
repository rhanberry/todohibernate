package todospringboot.daos.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


import todospringboot.daos.TodoDao;
import todospringboot.entities.TodoList;


@Component
@Transactional
public class TodoDaoHibernate implements TodoDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em){
		this.em = em;
	}

	
	@Override
	public void add(TodoList todolist) {
		System.out.println(todolist.getTodoDesc());
		em.persist(todolist);
		
	}

	@Override
	public void update(TodoList todolist) {
		em.merge(todolist);		
	}

	@Override
	public List<TodoList> getAllTodoList() {
		return em.
				createQuery("SELECT e FROM TodoList e", TodoList.class).
				getResultList();
	}

	@Override
	public TodoList getByTodoId(Integer todoId) {
		return em
				.createQuery("SELECT e FROM TodoList e WHERE e.todoId = :id", TodoList.class)
				.setParameter("id", todoId)
				.getSingleResult();
	}

	@Override
	public void delete(Integer todoId) {
		TodoList todolist = getByTodoId(todoId);
		em.remove(todolist);
	}
	
	

}
