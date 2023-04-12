package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.ResultatHomeWork;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.ResultatHomeWork;
import java.util.List;


@Repository
public interface ResultatHomeWorkDao extends AbstractRepository<ResultatHomeWork,Long>  {
    ResultatHomeWork findByCode(String code);
    int deleteByCode(String code);


}
