package dto;

import java.util.List;

public interface BaseDao<T> {

	List<T> getAll();

	T getDetail(int id);

	T add(T data);

	void delete(int id);

}
