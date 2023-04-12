package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.TypeTeacher;
import org.springframework.stereotype.Repository;
import ma.engflexy.alc.bean.core.TypeTeacher;
import java.util.List;


@Repository
public interface TypeTeacherDao extends AbstractRepository<TypeTeacher,Long>  {
    TypeTeacher findByCode(String code);
    int deleteByCode(String code);


}
