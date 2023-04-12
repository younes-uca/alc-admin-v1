package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.WorkloadBonusProf;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface WorkloadBonusProfDao extends AbstractRepository<WorkloadBonusProf,Long>  {

    List<WorkloadBonusProf> findByWorkloadBonusId(Long id);
    int deleteByWorkloadBonusId(Long id);
    List<WorkloadBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<WorkloadBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);

}
