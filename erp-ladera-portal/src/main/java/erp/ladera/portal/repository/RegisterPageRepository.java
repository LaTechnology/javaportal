package erp.ladera.portal.repository;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import erp.ladera.portal.model.RegisterPageModel;


@Repository

@Transactional(readOnly = false)
@Configuration
@EnableTransactionManagement
public class RegisterPageRepository {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void saveRegisterDetails(RegisterPageModel registerPageModel) {

		hibernateTemplate.saveOrUpdate(registerPageModel);
		
	
	}
	public List<RegisterPageModel>getRegisterDetails() {
		 
		String queryString="select * from registerdetails";
		
	
		SQLQuery query=	hibernateTemplate.getSessionFactory().openSession().createSQLQuery(queryString);
		query.addEntity(RegisterPageModel.class);
	     List<RegisterPageModel> registerDetails=query.list();
		return registerDetails;
	
	}

public List<RegisterPageModel> getRegisterDetailsById(Integer id) {
		
		RegisterPageModel registerPageModel = (RegisterPageModel) hibernateTemplate.getSessionFactory().openSession()
				.load(RegisterPageModel.class, id);
		String queryString="SELECT  * FROM registerdetails  join addressdetails on registerdetails.addressModel_addressId=addressdetails.addressId where id=:id";
		SQLQuery query=	hibernateTemplate.getSessionFactory().openSession().createSQLQuery(queryString);
		query.addEntity(RegisterPageModel.class);
		query.setParameter("id", id);
		 List<RegisterPageModel> registerDetails=query.list();
		return registerDetails;
	}



}
