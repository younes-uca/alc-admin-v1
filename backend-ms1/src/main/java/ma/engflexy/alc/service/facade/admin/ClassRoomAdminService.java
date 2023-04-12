package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.ClassRoom;
import ma.engflexy.alc.dao.criteria.core.ClassRoomCriteria;
import ma.engflexy.alc.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface ClassRoomAdminService extends  IService<ClassRoom,ClassRoomCriteria, ClassRoomHistoryCriteria>  {

    List<ClassRoom> findByProfId(Long id);
    int deleteByProfId(Long id);



}
