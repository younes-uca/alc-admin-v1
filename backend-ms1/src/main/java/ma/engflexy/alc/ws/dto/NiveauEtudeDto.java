package  ma.engflexy.alc.ws.dto;

import ma.engflexy.alc.zynerator.audit.Log;
import ma.engflexy.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class NiveauEtudeDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;




    public NiveauEtudeDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }






}