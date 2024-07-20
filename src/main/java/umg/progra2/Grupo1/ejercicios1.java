package umg.progra2.Grupo1;

public class ejercicios1 {

    public Cubo() {
        private double lado;

        public Cubo(double lado) {
                this.lado = lado;
            }

            // Método para calcular el volumen
            public double calcularVolumen(); {
                return Math.pow(lado, 3);
            }

            // Método getter para obtener el valor del lado
            public double getLado() {
                return lado;
            }

            // Método setter para establecer el valor del lado
            public void setLado(double lado) {
                this.lado = lado;
            }
        }
    }
}
