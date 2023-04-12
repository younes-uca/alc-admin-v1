package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.GroupeEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.GroupeEtudiantHistory;


public class GroupeEtudiantHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantHistoryCriteria, GroupeEtudiantHistory> {

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
