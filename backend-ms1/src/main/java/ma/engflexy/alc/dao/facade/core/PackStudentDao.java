package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.PackStudent;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.PackStudent;
import java.util.List;


@Repository
public interface PackStudentDao extends AbstractRepository<PackStudent,Long>  {
    PackStudent findByCode(String code);
    int deleteByCode(String code);

    List<PackStudent> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<PackStudent> findByPriceId(Long id);
    int deleteByPriceId(Long id);

}
