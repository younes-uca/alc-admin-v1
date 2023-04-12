package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.FaqEtudiantHistory;


public class FaqEtudiantHistorySpecification extends AbstractHistorySpecification<FaqEtudiantHistoryCriteria, FaqEtudiantHistory> {

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
