package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.engflexy.alc.bean.history.HoweWorkQSTReponseHistory;


public class HoweWorkQSTReponseHistorySpecification extends AbstractHistorySpecification<HoweWorkQSTReponseHistoryCriteria, HoweWorkQSTReponseHistory> {

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
