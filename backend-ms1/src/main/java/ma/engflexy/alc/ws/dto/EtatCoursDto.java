package  ma.engflexy.alc.ws.dto;

import ma.engflexy.alc.zynerator.audit.Log;
import ma.engflexy.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtatCoursDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;




    public EtatCoursDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }






}
