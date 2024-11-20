/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RR_Assets;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class RMTransactionforReport {
    private LocalDate dateofReport;
    private ArrayList<String> reports;
    
    public RMTransactionforReport(LocalDate dateofReport){
        this.dateofReport = dateofReport;
        this.reports = new ArrayList<>();
    }
    public LocalDate getDateOfReport(){
        return this.dateofReport;
    }
    public ArrayList<String> getReports(){
        return this.reports;
    }
    public void setReports(ArrayList<String> reports){
        this.reports = reports;
    }
}
