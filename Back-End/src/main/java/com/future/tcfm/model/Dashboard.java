package com.future.tcfm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "group")
public class Dashboard {
    private double groupBalance;
    private int totalMembers;
    private double pendingPayment;
    private double yourContribution;
    private double totalExpenseByValue;
    private String adminAccountNumber;
    private String adminName;
    private Long lastPayment;

    //yourPayment
    //totalExpenseByQuantity

//    public double getGroupBalance() {
//        return groupBalance;
//    }
//    public void setGroupBalance(double groupBalance) {
//        this.groupBalance = groupBalance;
//    }
//
//    public int getTotalMembers() {
//        return totalMembers;
//    }
//    public void setTotalMembers(int totalMembers) {
//        this.totalMembers = totalMembers;
//    }
//
//    public double getPendingPayment() {
//        return pendingPayment;
//    }
//    public void setPendingPayment(double pendingPayment) {
//        this.pendingPayment = pendingPayment;
//    }
//
//    public double getYourContribution() {
//        return yourContribution;
//    }
//    public void setYourContribution(double yourContribution) {
//        this.yourContribution = yourContribution;
//    }
//
//    public double getTotalExpenseByValue() {
//        return totalExpenseByValue;
//    }
//    public void setTotalExpenseByValue(double totalExpenseByValue) {
//        this.totalExpenseByValue = totalExpenseByValue;
//    }
}
