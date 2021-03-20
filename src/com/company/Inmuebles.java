package com.company;

public class Inmuebles {
    private String fechadeadquisicion;
    private long lote;
    private String ultdueños;
    private long numregistro;

    public void setFechadeadquisicion(String fechadeadquisicion) {
        this.fechadeadquisicion = fechadeadquisicion;
    }

    public void setLote(long lote) {
        this.lote = lote;
    }

    public void setUltdueños(String ultdueños) {
        this.ultdueños = ultdueños;
    }

    public void setNumregistro(long numregistro) {
        this.numregistro = numregistro;
    }

    public Inmuebles (String fechadeadquisicion, long lote, String ultdueños, long numregistro) {
        this.fechadeadquisicion = fechadeadquisicion;
        this.lote = lote;
        this.ultdueños = ultdueños;
        this.numregistro = numregistro;
    }
    public String getFechadeadquisicion() {
        return fechadeadquisicion;
    }

    public long getLote() {
        return lote;
    }

    public String getUltdueños() {
        return ultdueños;
    }

    public long getNumregistro() {
        return numregistro;
    }

}
