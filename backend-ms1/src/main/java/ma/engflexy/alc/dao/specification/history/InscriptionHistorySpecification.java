package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.InscriptionHistoryCriteria;
import ma.engflexy.alc.bean.history.InscriptionHistory;


public class InscriptionHistorySpecification extends AbstractHistorySpecification<InscriptionHistoryCriteria, InscriptionHistory> {

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
