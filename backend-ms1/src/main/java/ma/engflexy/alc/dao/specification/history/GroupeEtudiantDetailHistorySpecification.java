package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.engflexy.alc.bean.history.GroupeEtudiantDetailHistory;


public class GroupeEtudiantDetailHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailHistory> {

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
