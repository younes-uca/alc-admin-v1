package ma.engflexy.alc.service.facade.admin;

import java.util.List;
import ma.engflexy.alc.bean.core.InviteStudent;
import ma.engflexy.alc.dao.criteria.core.InviteStudentCriteria;
import ma.engflexy.alc.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.engflexy.alc.zynerator.service.IService;

public interface InviteStudentAdminService extends  IService<InviteStudent,InviteStudentCriteria, InviteStudentHistoryCriteria>  {

    List<InviteStudent> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
