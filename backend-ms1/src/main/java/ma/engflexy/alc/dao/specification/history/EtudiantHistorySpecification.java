package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.EtudiantHistory;


public class EtudiantHistorySpecification extends AbstractHistorySpecification<EtudiantHistoryCriteria, EtudiantHistory> {

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
