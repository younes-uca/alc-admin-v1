package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.engflexy.alc.bean.history.ReponseEtudiantHistory;


public class ReponseEtudiantHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHistoryCriteria, ReponseEtudiantHistory> {

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
