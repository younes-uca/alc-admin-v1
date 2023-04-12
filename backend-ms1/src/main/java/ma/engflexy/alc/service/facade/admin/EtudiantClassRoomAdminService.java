package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.EtudiantClassRoom;
import ma.engflexy.alc.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.engflexy.alc.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface EtudiantClassRoomAdminService extends  IService<EtudiantClassRoom,EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria>  {

    List<EtudiantClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<EtudiantClassRoom> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
