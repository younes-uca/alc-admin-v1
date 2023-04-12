package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.HomeWorkEtudiantHistory;


public class HomeWorkEtudiantHistorySpecification extends AbstractHistorySpecification<HomeWorkEtudiantHistoryCriteria, HomeWorkEtudiantHistory> {

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
