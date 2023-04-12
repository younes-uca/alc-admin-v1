package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ContactHistoryCriteria;
import ma.engflexy.alc.bean.history.ContactHistory;


public class ContactHistorySpecification extends AbstractHistorySpecification<ContactHistoryCriteria, ContactHistory> {

    public ContactHistorySpecification(ContactHistoryCriteria criteria) {
        super(criteria);
    }

    public ContactHistorySpecification(ContactHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
