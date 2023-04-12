package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.ReclamationEtudiantHistory;


public class ReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<ReclamationEtudiantHistoryCriteria, ReclamationEtudiantHistory> {

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
