package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.engflexy.alc.bean.history.ConfirmationTokenHistory;


public class ConfirmationTokenHistorySpecification extends AbstractHistorySpecification<ConfirmationTokenHistoryCriteria, ConfirmationTokenHistory> {

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria) {
        super(criteria);
    }

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
