package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.EtatEtudiantHistory;


public class EtatEtudiantHistorySpecification extends AbstractHistorySpecification<EtatEtudiantHistoryCriteria, EtatEtudiantHistory> {

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
