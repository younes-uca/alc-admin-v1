package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.ScheduleProf;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ScheduleProfDao extends AbstractRepository<ScheduleProf,Long>  {

    List<ScheduleProf> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<ScheduleProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ScheduleProf> findByCoursId(Long id);
    int deleteByCoursId(Long id);

}
