package com.example.demo.model;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

@Service
public class Posting {

    private String MatDoc;
    private String Item;
    private String DocDate;
    private String PstngDate;
    private String MaterialDescription;
    private String Quantity;
    private String BUn;
    private String AmountLC;
    private String Crcy;
    private String User;
//    private boolean authorized;

    public Posting() {
    }

    public Posting(String matDoc, String item, String docDate, String pstngDate, String materialDescription, String quantity, String BUn, String amountLC, String crcy, String user) {
        this.MatDoc = matDoc;
        this.Item = item;
        this.DocDate = docDate;
        this.PstngDate = pstngDate;
        this.MaterialDescription = materialDescription;
        this.Quantity = quantity;
        this.BUn = BUn;
        this.AmountLC = amountLC;
        this.Crcy = crcy;
        this.User = user;
//        this.authorized = authorized;
    }

    public void fromMap(Map<String, String> map){
        new Posting(
         MatDoc = map.get("Mat. Doc."),
         Item = map.get("Item"),
         DocDate = map.get("Doc. Date"),
         PstngDate = map.get("Pstng Date"),
         MaterialDescription = map.get("Material Description"),
         Quantity = map.get("Quantity"),
         BUn = map.get("BUn"),
         AmountLC = map.get("Amount LC"),
         Crcy = map.get("Crcy"),
         User = map.get("User Name")
        );
    }

    public String getMatDoc() {
        return MatDoc;
    }

    public void setMatDoc(String matDoc) {
        MatDoc = matDoc;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getDocDate() {
        return DocDate;
    }

    public void setDocDate(String docDate) {
        DocDate = docDate;
    }

    public String getPstngDate() {
        return PstngDate;
    }

    public void setPstngDate(String pstngDate) {
        PstngDate = pstngDate;
    }

    public String getMaterialDescription() {
        return MaterialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        MaterialDescription = materialDescription;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getBUn() {
        return BUn;
    }

    public void setBUn(String BUn) {
        this.BUn = BUn;
    }

    public String getAmountLC() {
        return AmountLC;
    }

    public void setAmountLC(String amountLC) {
        AmountLC = amountLC;
    }

    public String getCrcy() {
        return Crcy;
    }

    public void setCrcy(String crcy) {
        Crcy = crcy;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    @Override
    public String toString() {
        return "Posting{" +
                "MatDoc='" + MatDoc + '\'' +
                ", Item='" + Item + '\'' +
                ", DocDate='" + DocDate + '\'' +
                ", PstngDate='" + PstngDate + '\'' +
                ", MaterialDescription='" + MaterialDescription + '\'' +
                ", Quantity='" + Quantity + '\'' +
                ", BUn='" + BUn + '\'' +
                ", AmountLC='" + AmountLC + '\'' +
                ", Crcy='" + Crcy + '\'' +
                ", User='" + User + '\'' +
                '}';
    }
}
