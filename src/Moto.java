public class Moto {

        private String marca;
        private String color;
        private int ruedas;


        public Moto(String marca,String color){
            this.marca=marca;
            this.color=color;
            this.ruedas=2;
        }

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

}
