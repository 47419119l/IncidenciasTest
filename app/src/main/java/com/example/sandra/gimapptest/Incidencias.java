package com.example.sandra.gimapptest;

/**
 * Created by sandra on 27/04/2016.
 */
public class Incidencias {

    private String idMaquina;
    private String tipusIncidencia;
    private String incidencia;
    private String user;
    private boolean revisat;

    Incidencias(){

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(String idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getTipusIncidencia() {
        return tipusIncidencia;
    }

    public void setTipusIncidencia(String tipusIncidencia) {
        this.tipusIncidencia = tipusIncidencia;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public boolean isRevisat() {
        return revisat;
    }

    public void setRevisat(boolean revisat) {
        this.revisat = revisat;
    }
}
