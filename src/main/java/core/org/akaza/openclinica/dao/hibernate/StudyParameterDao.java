package core.org.akaza.openclinica.dao.hibernate;

import core.org.akaza.openclinica.domain.datamap.StudyParameter;
import org.hibernate.query.Query;

public class StudyParameterDao extends AbstractDomainDao<StudyParameter> {
	
    @Override
    public Class<StudyParameter> domainClass() {
        return StudyParameter.class;
    }

	public StudyParameter findByHandle(String handle) {
        String query = "from " + getDomainClassName() + " sp where sp.handle = :handle ";
        Query q = getCurrentSession().createQuery(query);
        q.setString("handle", handle);
        return (StudyParameter) q.uniqueResult();
    }
}
