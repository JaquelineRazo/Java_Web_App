
package com.javamaster.model;


import java.util.Objects;


public class UsersRecord {
    private String date;
    private String altura;
    private String peso;
    private String imc;

    public UsersRecord(){
        
    }

    public UsersRecord(String date, String altura, String peso, String imc) {
        this.date = date;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
       
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.date);
        hash = 79 * hash + Objects.hashCode(this.altura);
        hash = 79 * hash + Objects.hashCode(this.peso);
        hash = 79 * hash + Objects.hashCode(this.imc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsersRecord other = (UsersRecord) obj;
        if (!Objects.equals(this.altura, other.altura)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.imc, other.imc)) {
            return false;
        }
        return Objects.equals(this.date, other.date);
    }

    @Override
    public String toString() {
        return "UsersRecord{" + "date=" + date + ", altura=" + altura + ", peso=" + peso + ", imc=" + imc + '}';
    }
    
    
}
