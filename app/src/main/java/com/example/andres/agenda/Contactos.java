package com.example.andres.agenda;

public class Contactos {

    private String nombre,nickname,cell,tell,email,dire,contra,rcontra,cate;


    public Contactos(){}

    public Contactos(String nombre,String nickname,String cell,String tell,String email,String dire,String contra,String rcontra,String cate){
     this.nombre = nombre;
     this.nickname = nickname;
     this.cell = cell;
     this.tell = tell;
     this.dire = dire;
     this.email = email;
     this.contra = contra;
     this.rcontra = rcontra;
     this.cate = cate;}

    public String getNombre(){return nombre;}
    public String getNickname(){return nickname;}
    public String getCell(){return cell;}
    public String getTell(){return tell;}
    public String getDire(){return dire;}
    public String getEmail(){return email;}
    public String getContra(){return contra;}
    public String getRcontra(){return rcontra;}
    public String getCate(){return cate;}
                       }
