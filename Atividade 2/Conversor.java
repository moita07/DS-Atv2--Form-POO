public class Conversor {
    private int temperatura;
    public Conversor(int temperatura) {
      this.temperatura = temperatura;
    }
    //converte celsius para fahrenheit
    public int cparaf() {
      return (temperatura * 9/5) + 32;
    }
    //converte fahrenheit para celsius
    public int fparac() {
      return (temperatura - 32) * 5/9;
    }
   }