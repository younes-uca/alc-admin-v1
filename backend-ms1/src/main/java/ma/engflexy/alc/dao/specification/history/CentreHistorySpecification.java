package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.CentreHistoryCriteria;
import ma.engflexy.alc.bean.history.CentreHistory;


public class CentreHistorySpecification extends AbstractHistorySpecification<CentreHistoryCriteria, CentreHistory> {

    public CentreHistorySpecification(CentreHistoryCriteria criteria) {
        super(criteria);
    }

    public CentreHistorySpecification(CentreHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
