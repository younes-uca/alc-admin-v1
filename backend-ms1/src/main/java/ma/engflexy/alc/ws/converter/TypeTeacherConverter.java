package  ma.engflexy.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.engflexy.alc.zynerator.util.StringUtil;
import ma.engflexy.alc.zynerator.converter.AbstractConverter;
import ma.engflexy.alc.zynerator.util.DateUtil;
import ma.engflexy.alc.bean.history.TypeTeacherHistory;
import ma.engflexy.alc.bean.core.TypeTeacher;
import ma.engflexy.alc.ws.dto.TypeTeacherDto;

@Component
public class TypeTeacherConverter extends AbstractConverter<TypeTeacher, TypeTeacherDto, TypeTeacherHistory> {


    public  TypeTeacherConverter(){
        super(TypeTeacher.class, TypeTeacherDto.class, TypeTeacherHistory.class);
    }

    @Override
    public TypeTeacher toItem(TypeTeacherDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeTeacher item = new TypeTeacher();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public TypeTeacherDto toDto(TypeTeacher item) {
        if (item == null) {
            return null;
        } else {
            TypeTeacherDto dto = new TypeTeacherDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
