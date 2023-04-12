package ma.engflexy.alc.service.impl.admin;

import ma.engflexy.alc.bean.core.Prof;
import ma.engflexy.alc.bean.history.ProfHistory;
import ma.engflexy.alc.dao.criteria.core.ProfCriteria;
import ma.engflexy.alc.dao.criteria.history.ProfHistoryCriteria;
import ma.engflexy.alc.dao.facade.core.ProfDao;
import ma.engflexy.alc.dao.facade.history.ProfHistoryDao;
import ma.engflexy.alc.dao.specification.core.ProfSpecification;
import ma.engflexy.alc.service.facade.admin.ProfAdminService;
import ma.engflexy.alc.zynerator.service.AbstractServiceImpl;
import ma.engflexy.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.engflexy.alc.bean.core.TrancheHoraireProf;
import ma.engflexy.alc.bean.core.ClassRoom;
import ma.engflexy.alc.bean.core.RecommendTeacher;

import ma.engflexy.alc.service.facade.admin.TypeTeacherAdminService ;
import ma.engflexy.alc.service.facade.admin.ParcoursAdminService ;
import ma.engflexy.alc.service.facade.admin.ClassRoomAdminService ;
import ma.engflexy.alc.service.facade.admin.TrancheHoraireProfAdminService ;
import ma.engflexy.alc.service.facade.admin.RecommendTeacherAdminService ;
import ma.engflexy.alc.service.facade.admin.CategorieProfAdminService ;


import java.util.List;
@Service
public class ProfAdminServiceImpl extends AbstractServiceImpl<Prof,ProfHistory, ProfCriteria, ProfHistoryCriteria, ProfDao,
ProfHistoryDao> implements ProfAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Prof create(Prof t) {
        super.create(t);
        if (t.getTrancheHoraireProfList() != null) {
                t.getTrancheHoraireProfList().forEach(element-> {
                    element.setProf(t);
                    trancheHoraireProfService.create(element);
            });
        }
        if (t.getClassRooms() != null) {
                t.getClassRooms().forEach(element-> {
                    element.setProf(t);
                    classRoomService.create(element);
            });
        }
        if (t.getRecommendTeachers() != null) {
                t.getRecommendTeachers().forEach(element-> {
                    element.setProf(t);
                    recommendTeacherService.create(element);
            });
        }
        return t;
    }

    public Prof findWithAssociatedLists(Long id){
        Prof result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setTrancheHoraireProfList(trancheHoraireProfService.findByProfId(id));
            result.setClassRooms(classRoomService.findByProfId(id));
            result.setRecommendTeachers(recommendTeacherService.findByProfId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        trancheHoraireProfService.deleteByProfId(id);
        classRoomService.deleteByProfId(id);
        recommendTeacherService.deleteByProfId(id);
    }


    public void updateWithAssociatedLists(Prof prof){
    if(prof !=null && prof.getId() != null){
            List<List<TrancheHoraireProf>> resultTrancheHoraireProfList= trancheHoraireProfService.getToBeSavedAndToBeDeleted(trancheHoraireProfService.findByProfId(prof.getId()),prof.getTrancheHoraireProfList());
            trancheHoraireProfService.delete(resultTrancheHoraireProfList.get(1));
            ListUtil.emptyIfNull(resultTrancheHoraireProfList.get(0)).forEach(e -> e.setProf(prof));
            trancheHoraireProfService.update(resultTrancheHoraireProfList.get(0),true);
            List<List<ClassRoom>> resultClassRooms= classRoomService.getToBeSavedAndToBeDeleted(classRoomService.findByProfId(prof.getId()),prof.getClassRooms());
            classRoomService.delete(resultClassRooms.get(1));
            ListUtil.emptyIfNull(resultClassRooms.get(0)).forEach(e -> e.setProf(prof));
            classRoomService.update(resultClassRooms.get(0),true);
            List<List<RecommendTeacher>> resultRecommendTeachers= recommendTeacherService.getToBeSavedAndToBeDeleted(recommendTeacherService.findByProfId(prof.getId()),prof.getRecommendTeachers());
            recommendTeacherService.delete(resultRecommendTeachers.get(1));
            ListUtil.emptyIfNull(resultRecommendTeachers.get(0)).forEach(e -> e.setProf(prof));
            recommendTeacherService.update(resultRecommendTeachers.get(0),true);
    }
    }

    public Prof findByReferenceEntity(Prof t){
        return  dao.findByRef(t.getRef());
    }

    public List<Prof> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<Prof> findByCategorieProfId(Long id){
        return dao.findByCategorieProfId(id);
    }
    public int deleteByCategorieProfId(Long id){
        return dao.deleteByCategorieProfId(id);
    }
    public List<Prof> findByTypeTeacherId(Long id){
        return dao.findByTypeTeacherId(id);
    }
    public int deleteByTypeTeacherId(Long id){
        return dao.deleteByTypeTeacherId(id);
    }

    Prof findByUsername(String username){
        return dao.findByUsername(username);
    }
    public void configure() {
        super.configure(Prof.class,ProfHistory.class, ProfHistoryCriteria.class, ProfSpecification.class);
    }

    @Autowired
    private TypeTeacherAdminService typeTeacherService ;
    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private ClassRoomAdminService classRoomService ;
    @Autowired
    private TrancheHoraireProfAdminService trancheHoraireProfService ;
    @Autowired
    private RecommendTeacherAdminService recommendTeacherService ;
    @Autowired
    private CategorieProfAdminService categorieProfService ;
    public ProfAdminServiceImpl(ProfDao dao, ProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}