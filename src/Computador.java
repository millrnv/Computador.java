public class Computador {

    private String marca;
    private String modelo;
    private String color;
    private String procesador;
    private boolean wifi;
    private boolean bluetooth;
    private boolean hdmi;
    private boolean encendido;
    private boolean actualizado;


    public static void main(String[] args) {

        Computador Acer = new Computador("Acer", "Swift 3", "Intel Core i5 1135G7","negro");  //objeto o ejemplar de clase
        Computador MSI = new Computador("MSI", "Katana 17", "Intel Core i5-12450H","negro");
        Computador Asus = new Computador("Asus", "TUF FX505DU-AL090T", " AMD Ryzen 7 3750H","rojo");


        System.out.println("El computador es un " + MSI.dameMarca() + " modelo " + MSI.dameModelo() + ", tiene un procesador " + MSI.dameProcesador() + " y es de color " +MSI.dameColor()+ ".");
        MSI.estadoWifi(true);
        System.out.println(Acer.mostrarWifi());
        MSI.estadoHDMI(true);
        System.out.println(Acer.mostrarHDMI());
        MSI.estadoBluetooth(true);
        System.out.println(Acer.mostrarBluetooth());

        System.out.println("El computador es un " + Asus.dameMarca() + " modelo " + Asus.dameModelo() + ", tiene un procesador " + Asus.dameProcesador() + " y es de color " +Asus.dameColor()+ ".");
        Asus.estadoWifi(true);
        System.out.println(Acer.mostrarWifi());
        Asus.estadoHDMI(true);
        System.out.println(Acer.mostrarHDMI());
        Asus.estadoBluetooth(true);
        System.out.println(Acer.mostrarBluetooth());

        System.out.println("El computador es un " + Acer.dameMarca() + " modelo " + Acer.dameModelo() + ", tiene un procesador " + Acer.dameProcesador() + " y es de color " +Acer.dameColor()+ ".");
        Acer.estadoWifi(true);
        System.out.println(Acer.mostrarWifi());
        Acer.estadoHDMI(true);
        System.out.println(Acer.mostrarHDMI());
        Acer.estadoBluetooth(false);
        System.out.println(Acer.mostrarBluetooth());




    }


    public Computador(String marca, String modelo, String procesador, String color) {   //constructor

        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.color = color;
    }


        public void encender () {
            if (!encendido) {
                System.out.println("El equipo se está encendiendo.");
                encendido = true;
            } else {
                System.out.println("El equipo ya está encendido.");
            }
        }


        public void apagar () {
            if (encendido) {
                System.out.println("El equipo se está apagando");
                encendido = false;
            } else {
                System.out.println("El equipo ya está apagado.");

            }

        }

        public void actualizar () {
            if (encendido) {
                System.out.println("El equipo se está actualizando.");
                actualizado = true;
            } else {
                System.out.println("El equipo no se puede actualizar apagado.");
            }

        }

        public void estableceMarca (String marca){
            this.marca = marca;
        }


        public String dameMarca () {
            return marca;
        }

        public void estableceModelo (String modelo){

            this.modelo = modelo;
        }

        public String dameModelo () {

            return modelo;
        }

        public void estableceProcesador (String procesador){
            this.procesador = procesador;
        }

        public String dameProcesador(){
            return procesador;
        }

        public void estableceColor (String color){

            this.color = color;
        }


        public String dameColor () {

            return color;

        }
        public void estadoWifi(boolean wifi) {

            this.wifi = wifi;

        }



    public String mostrarWifi() {
        if (wifi) {
            return "El computador tiene Wifi.";
        } else {
            return "El computador no tiene Wifi.";
        }
    }

    public void estadoHDMI(boolean hdmi) {

        this.hdmi = hdmi;

    }



    public String mostrarHDMI() {
        if (hdmi) {
            return "El computador tiene HDMI.";
        } else {
            return "El computador no tiene HDMI.";
        }
    }

    public void estadoBluetooth(boolean bluetooth) {

        this.bluetooth = bluetooth;

    }



    public String mostrarBluetooth() {
        if (bluetooth) {
            return "El computador tiene Bluetooth.";
        } else {
            return "El computador no tiene Bluetooth.";
        }
    }



}

