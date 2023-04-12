package ma.engflexy.alc.dao.facade.core;


import ma.engflexy.alc.zynerator.repository.AbstractRepository;
import ma.engflexy.alc.bean.core.Admin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AdminDao extends AbstractRepository<Admin,Long>  {

    Admin findByUsername(String username);

}
