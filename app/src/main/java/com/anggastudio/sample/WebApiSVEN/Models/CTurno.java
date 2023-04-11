package com.anggastudio.sample.WebApiSVEN.Models;

import java.util.Date;

public class CTurno {

    private String terminalID;
    private Date fecha_Proceso;
    private Integer turno;
    private Date fecha_Cierre;

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public Date getFecha_Proceso() {
        return fecha_Proceso;
    }

    public void setFecha_Proceso(Date fecha_Proceso) {
        this.fecha_Proceso = fecha_Proceso;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public Date getFecha_Cierre() {
        return fecha_Cierre;
    }

    public void setFecha_Cierre(Date fecha_Cierre) {
        this.fecha_Cierre = fecha_Cierre;
    }
}
