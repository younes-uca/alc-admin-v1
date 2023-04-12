package  ma.engflexy.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.engflexy.alc.bean.core.Prof;

import ma.engflexy.alc.zynerator.util.StringUtil;
import ma.engflexy.alc.zynerator.converter.AbstractConverter;
import ma.engflexy.alc.zynerator.util.DateUtil;
import ma.engflexy.alc.bean.history.ClassAverageBonusProfHistory;
import ma.engflexy.alc.bean.core.ClassAverageBonusProf;
import ma.engflexy.alc.ws.dto.ClassAverageBonusProfDto;

@Component
public class ClassAverageBonusProfConverter extends AbstractConverter<ClassAverageBonusProf, ClassAverageBonusProfDto, ClassAverageBonusProfHistory> {

    @Autowired
    private SalaryConverter salaryConverter ;
    @Autowired
    private ProfConverter profConverter ;
    private boolean prof;
    private boolean salary;

    public  ClassAverageBonusProfConverter(){
        super(ClassAverageBonusProf.class, ClassAverageBonusProfDto.class, ClassAverageBonusProfHistory.class);
    }

    @Override
    public ClassAverageBonusProf toItem(ClassAverageBonusProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        ClassAverageBonusProf item = new ClassAverageBonusProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getMois()))
                item.setMois(dto.getMois());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(this.salary && dto.getSalary()!=null)
                item.setSalary(salaryConverter.toItem(dto.getSalary())) ;



        return item;
        }
    }

    @Override
    public ClassAverageBonusProfDto toDto(ClassAverageBonusProf item) {
        if (item == null) {
            return null;
        } else {
            ClassAverageBonusProfDto dto = new ClassAverageBonusProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getMois()))
                dto.setMois(item.getMois());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.salary && item.getSalary()!=null) {
            dto.setSalary(salaryConverter.toDto(item.getSalary())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.prof = value;
        this.salary = value;
    }


    public SalaryConverter getSalaryConverter(){
        return this.salaryConverter;
    }
    public void setSalaryConverter(SalaryConverter salaryConverter ){
        this.salaryConverter = salaryConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isSalary(){
        return this.salary;
    }
    public void  setSalary(boolean salary){
        this.salary = salary;
    }
}
