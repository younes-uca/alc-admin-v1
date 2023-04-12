package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.engflexy.alc.bean.history.NiveauEtudeHistory;


public class NiveauEtudeHistorySpecification extends AbstractHistorySpecification<NiveauEtudeHistoryCriteria, NiveauEtudeHistory> {

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
