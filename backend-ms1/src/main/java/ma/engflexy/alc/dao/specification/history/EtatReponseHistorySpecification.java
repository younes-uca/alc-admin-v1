package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.engflexy.alc.bean.history.EtatReponseHistory;


public class EtatReponseHistorySpecification extends AbstractHistorySpecification<EtatReponseHistoryCriteria, EtatReponseHistory> {

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
