package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.TypeHomeWork;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.TypeHomeWork;
import java.util.List;


@Repository
public interface TypeHomeWorkDao extends AbstractRepository<TypeHomeWork,Long>  {
    TypeHomeWork findByCode(String code);
    int deleteByCode(String code);


}
