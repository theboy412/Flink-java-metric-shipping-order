package com.ghn;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.Table;
import org.apache.flink.annotation.Public;

import java.util.List;

@Table(keyspace = "AppSeller", name = "metric")
public class ShopMetric {

    public Long getShopID() {
        return shopID;
    }

    public String getMetricID() {
        return metricID;
    }

    public Long shopID;

    public void setShopID(Long shopID) {
        this.shopID = shopID;
    }

    public void setMetricID(String metricID) {
        this.metricID = metricID;
    }

    public String metricID;

    public void setM0(int m0) {
        M0 = m0;
    }

    @Column(name = "m0")
    public int M0;

    @Column(name = "m1")
    public int M1;

    @Column(name = "m2")
    public int M2;
    @Column(name = "m3")
    public int M3;
    @Column(name = "m4")
    public int M4;
    @Column(name = "m5")
    public int M5;
    @Column(name = "m9")
    public int M9;
    @Column(name = "m6")
    public int M6;
    @Column(name = "m7")
    public int M7;
    @Column(name = "m8")
    public int M8;

    @Column(name = "m1_list")
    public List<String> M1List;
    @Column(name = "m2_list")
    public List<String> M2List;
    @Column(name = "m3_list")
    public List<String> M3List;
    @Column(name = "m4_list")
    public List<String> M5List;
    @Column(name = "m5_list")
    public List<String> M6List;
    @Column(name = "m6_list")
    public List<String> M7List;
    @Column(name = "m7_list")
    public List<String> M8List;
    @Column(name = "m8_list")
    public List<String> M9List;

    public void setM1(int m1) {
        M1 = m1;
    }

    public void setM2(int m2) {
        M2 = m2;
    }

    public void setM3(int m3) {
        M3 = m3;
    }

    public void setM4(int m4) {
        M4 = m4;
    }

    public void setM5(int m5) {
        M5 = m5;
    }

    public void setM6(int m6) {
        M6 = m6;
    }

    public void setM7(int m7) {
        M7 = m7;
    }

    public void setM9(int m9) {
        M9 = m9;
    }

    public void setM1List(List<String> m1List) {
        M1List = m1List;
    }

    public void setM2List(List<String> m2List) {
        M2List = m2List;
    }

    public void setM3List(List<String> m3List) {
        M3List = m3List;
    }

    public void setM5List(List<String> m5List) {
        M5List = m5List;
    }

    public void setM6List(List<String> m6List) {
        M6List = m6List;
    }

    public void setM7List(List<String> m7List) {
        M7List = m7List;
    }

    public void setM8List(List<String> m8List) {
        M8List = m8List;
    }

    public void setM9List(List<String> m9List) {
        M9List = m9List;
    }

    public int getM1() {
        return M1;
    }

    public int getM2() {
        return M2;
    }

    public int getM3() {
        return M3;
    }

    public int getM4() {
        return M4;
    }

    public int getM5() {
        return M5;
    }

    public int getM6() {
        return M6;
    }

    public int getM7() {
        return M7;
    }

    public void setM8(int m8) {
        M8 = m8;
    }

    public int getM8() {
        return M8;
    }

    public int getM9() {
        return M9;
    }

    public List<String> getM1List() {
        return M1List;
    }

    public List<String> getM2List() {
        return M2List;
    }

    public List<String> getM3List() {
        return M3List;
    }

    public List<String> getM5List() {
        return M5List;
    }

    public List<String> getM6List() {
        return M6List;
    }

    public List<String> getM7List() {
        return M7List;
    }

    public List<String> getM8List() {
        return M8List;
    }

    public List<String> getM9List() {
        return M9List;
    }
}
