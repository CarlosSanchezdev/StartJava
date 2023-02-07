public class Coche {
    private String marca;
    private String color;
    private int ruedas;
    private boolean hibrido;




    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    public int getRuedas()
    {
        return ruedas;
    }
    public void setRuedas(int ruedas)
    {
        this.ruedas = ruedas;
    }

    public String getHibrido()
    {
         String resultado =  hibrido ? "coche hibrido": "coche diesel";
        return resultado;
    }
    public void setHibrido(boolean hibrido)
    {
        this.hibrido = hibrido;
    }
}
