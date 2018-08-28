package TaskListDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TaskDao {

	@Autowired
	EntityManager entityManager; 

public List<Task> findAll() {

	TypedQuery<Task> namedQuery = entityManager.createNamedQuery("find_all_tasks", Task.class);
	return namedQuery.getResultList();
}

public Task findById(int idTask) {
	return entityManager.find(Task.class, idTask);
	
}
public void deleteById(int id) {
	Task t= findById(id);
	entityManager.remove(t);
}
      }