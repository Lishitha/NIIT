package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	public CategoryDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public Category get(String id){
		String hql= "from Category where id=" + "'"+id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listCategory=query.list();
		//there is only one record is there, because it is primary key
		//list is like array. so first will getqqqqq
		if(listCategory != null && !listCategory.isEmpty()){
			return listCategory.get(0);
		}
		return null;
		
	}
	
	//passing the category obj
	//if its already exist, then update
	//else save
	@Transactional
	public void saveOrUpdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}
	
	//based on id - delete one row
	//so used one obj
	@Transactional
	public void delete(String id){
		Category CategoryToDelete=new Category();
		CategoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(CategoryToDelete);
		
	}
	
	
	@Transactional
	public List<Category> list(){
		@SuppressWarnings("unchecked")
		List<Category> listCategory=(List<Category>)sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
		     
	}
	
	

}
