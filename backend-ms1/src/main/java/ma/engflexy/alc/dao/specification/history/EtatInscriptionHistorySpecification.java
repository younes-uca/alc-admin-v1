package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.engflexy.alc.bean.history.EtatInscriptionHistory;


public class EtatInscriptionHistorySpecification extends AbstractHistorySpecification<EtatInscriptionHistoryCriteria, EtatInscriptionHistory> {

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
