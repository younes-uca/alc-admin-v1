package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.engflexy.alc.bean.history.EtudiantCoursHistory;


public class EtudiantCoursHistorySpecification extends AbstractHistorySpecification<EtudiantCoursHistoryCriteria, EtudiantCoursHistory> {

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
