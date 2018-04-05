package com.developer.SpringMySQL.models;

import javax.persistence.*;

/**
 * Created by @author OGI aka nOy39
 *
 */

@Entity
@Table(name = "output")
public class AppOutput {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idoutput")
    private int idOutput;

    @Column(name = "prog_code")
    private int progCode;

    @Column(name = "pol_expand")
    private int polExpand;

    @Column(name = "iso_expand")
    private int isoExpend;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    public int getIdOutput() {
        return idOutput;
    }

    public void setIdOutput(int idOutput) {
        this.idOutput = idOutput;
    }

    public int getProgCode() {
        switch (progCode) {
            case 3: return 1801;
            case 4: return 2001;
            case 5: return 1881;
            default:
        }
        return progCode;
    }

    public void setProgCode(int progCode) {
        this.progCode = progCode;
    }

    public int getPolExpand() {
        return polExpand;
    }

    public void setPolExpand(int polExpand) {
        this.polExpand = polExpand;
    }

    public int getIsoExpend() {
        return isoExpend;
    }

    public void setIsoExpend(int isoExpend) {
        this.isoExpend = isoExpend;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
