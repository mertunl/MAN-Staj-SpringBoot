package com.man.spring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "registry")
public class Registry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String getKayitTipi() {
        return kayitTipi;
    }

    public void setKayitTipi(String kayitTipi) {
        this.kayitTipi = kayitTipi;
    }

    private String  kayitTipi;

    public String[] getBildirenBolum() {
        return bildirenBolum;
    }

    public void setBildirenBolum(String[] bildirenBolum) {
        this.bildirenBolum = bildirenBolum;
    }

    private String [] bildirenBolum;

    public String getLdSorumlusu() {
        return ldSorumlusu;
    }

    public void setLdSorumlusu(String ldSorumlusu) {
        this.ldSorumlusu = ldSorumlusu;
    }

    private String  ldSorumlusu;

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    private String aciklama;

    public String getSaseNo() {

        return saseNo;
    }

    public void setSaseNo(String saseNo) {
        this.saseNo = saseNo;
    }

    private String saseNo;

    public Integer getTaracSayi() {

        return taracSayi;
    }

    public void setTaracSayi(Integer taracSayi) {
        this.taracSayi = taracSayi;
    }

    private Integer taracSayi;

    public String getParcaNo() {
        return parcaNo;
    }

    public void setParcaNo(String parcaNo) {
        this.parcaNo = parcaNo;
    }

    private String parcaNo;

    public String getTesisatNo() {
        return tesisatNo;
    }

    public void setTesisatNo(String tesisatNo) {
        this.tesisatNo = tesisatNo;
    }

    private String tesisatNo;

    public String getAdaptasyonNo() {


        return AdaptasyonNo;
    }

    public void setAdaptasyonNo(String adaptasyonNo) {
        AdaptasyonNo = adaptasyonNo;
    }

    private String AdaptasyonNo;

    public Integer getAracbasiSure() {
        return aracbasiSure;
    }

    public void setAracbasiSure(Integer aracbasiSure) {
        this.aracbasiSure = aracbasiSure;
    }

    private Integer aracbasiSure;

    public Integer gettSure() {

        return tSure;
    }

    public void settSure(Integer tSure) {
        this.tSure = tSure;
    }

    private Integer tSure;

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    private String mesai;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    private String a;

    /*public Object trimToSize(List<String> getsaseNo) {
        getsaseNo= trimToSize(getsaseNo);
        return getsaseNo;
    }
    */

}
