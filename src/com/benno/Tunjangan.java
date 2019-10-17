package com.benno;

public class Tunjangan {
    private Double gaji;
    private String status;

    public Double getGaji() {
        return gaji;
    }

    public void setGaji(Double gaji) {
        this.gaji = gaji;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double hitungTunjangan(){
        Double tunjangan;
        tunjangan = status.equals("Menikah") ? gaji * 0.35 : 0;
        return tunjangan;
    }

    public Double hitungTotal(){
        return gaji + hitungTunjangan();
    }
}
