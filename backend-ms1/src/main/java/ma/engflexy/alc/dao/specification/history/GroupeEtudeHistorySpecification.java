package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.engflexy.alc.bean.history.GroupeEtudeHistory;


public class GroupeEtudeHistorySpecification extends AbstractHistorySpecification<GroupeEtudeHistoryCriteria, GroupeEtudeHistory> {

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
