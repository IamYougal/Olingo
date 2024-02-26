package com.odata.odata.config;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.olingo.odata2.api.edm.provider.EdmProvider;
import org.apache.olingo.odata2.api.processor.ODataContext;
import org.apache.olingo.odata2.api.processor.ODataProcessor;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPATransaction;
import org.apache.olingo.odata2.jpa.processor.api.access.JPAPaging;
import org.apache.olingo.odata2.jpa.processor.api.model.JPAEdmExtension;

public class MyODataJPAContext implements ODataJPAContext {

    private EntityManagerFactory emf;
    private JPAEdmExtension jpaEdmExtension;

    @Override
    public EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    @Override
    public JPAEdmExtension getJPAEdmExtension() {
        return jpaEdmExtension;
    }

    // Implement other methods as needed

    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void setJPAEdmExtension(JPAEdmExtension jpaEdmExtension) {
        this.jpaEdmExtension = jpaEdmExtension;
    }

	@Override
	public String getPersistenceUnitName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPersistenceUnitName(String pUnitName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ODataProcessor getODataProcessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setODataProcessor(ODataProcessor processor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EdmProvider getEdmProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEdmProvider(EdmProvider edmProvider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ODataContext getODataContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setODataContext(ODataContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setJPAEdmMappingModel(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getJPAEdmMappingModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEntityManager(EntityManager em) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultNaming(boolean defaultNaming) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getDefaultNaming() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPageSize(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPaging(JPAPaging paging) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPAPaging getPaging() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ODataJPATransaction getODataJPATransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContainerManaged(boolean containerManaged) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isContainerManaged() {
		// TODO Auto-generated method stub
		return false;
	}
}
