package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.engflexy.alc.bean.history.ReponseEtudiantHomeWorkHistory;


public class ReponseEtudiantHomeWorkHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkHistory> {

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
