package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.engflexy.alc.bean.history.EtatEtudiantScheduleHistory;


public class EtatEtudiantScheduleHistorySpecification extends AbstractHistorySpecification<EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleHistory> {

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
