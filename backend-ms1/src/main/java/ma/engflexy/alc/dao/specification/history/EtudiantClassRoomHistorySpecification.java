package  ma.engflexy.alc.dao.specification.history;

import ma.engflexy.alc.zynerator.specification.AbstractHistorySpecification;
import ma.engflexy.alc.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.engflexy.alc.bean.history.EtudiantClassRoomHistory;


public class EtudiantClassRoomHistorySpecification extends AbstractHistorySpecification<EtudiantClassRoomHistoryCriteria, EtudiantClassRoomHistory> {

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
