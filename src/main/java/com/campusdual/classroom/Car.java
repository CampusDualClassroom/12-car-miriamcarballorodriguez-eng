package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
    }

    public void start() {
        if (this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        }else{
            System.out.println("Vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }
    public void accelerate(){
        if (speedometer < MAX_SPEED){
            speedometer +=10;
        }
        if (speedometer > MAX_SPEED){
            speedometer=MAX_SPEED;
            }
        }



    public void brake(){
       if (speedometer >0){
           speedometer -= 10;
       if (speedometer < 0){
           speedometer=0;
           }
       }
    }

    public void turnAngleOfWheels(int angle){
        int newAngle = this.wheelsAngle + angle;
        if ( newAngle > 45 ){
            wheelsAngle = 45;
            System.out.println( "Ángulo máx alcanzado: 45º");
        }else if (newAngle < -45){
            wheelsAngle = -45;
            System.out.println("Ángulo min alcanzado: -45 º");
        }else {
            wheelsAngle = newAngle;
            System.out.println( "Ángulo actual del volante" + wheelsAngle + "º.");
        }

    }

    public String showSteeringWheelDetail(){
        if (wheelsAngle >0 ){
            return  "Volante girado" + wheelsAngle + "º a la derecha.";
        }else if (wheelsAngle <0){
            return "Volante girado" + Math.abs(wheelsAngle) + "º a la izquierda. ";
        }else {
            return "Volante recto";
        }
    }
    public boolean isReverse(){


        return false;
    }

    public void setReverse(boolean reverse){
       if (speedometer ==0){
           this.reverse =reverse;
           if (reverse){
               gear ="R";
               System.out.println("Marcha atrás activada.");
           }else {
               gear = "N";
               System.out.println("Marcha atrás desactivada.");
           }
       }
        if (speedometer>0){
            if (reverse){
                System.out.println("No puedes poner marcha atrás mientras el coche está en movimiento");
            }else {
                System.out.println("No puedes quitar la marcha atrás mientras el coche está en movimiento");
            }
        }
    }

    public void showDetails(){
        System.out.println("\n=== Estado del vehículo ===");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Combustible: " + fuel);
        System.out.println("Tacómetro: " + tachometer + " rpm");
        System.out.println("Velocímetro: " + speedometer + " km/h");
        System.out.println("Ángulo del volante: " + wheelsAngle + "°");
        System.out.println("Marcha actual: " + gear);
        System.out.println("===========================\n");

    }

    public boolean isTachometerGreaterThanZero() {
        if (tachometer >0){
            return true;


        }else{
            return false;

        }
    }

    public boolean isTachometerEqualToZero()  {

            if (tachometer==0){
                return true;


            }else{
                return false;

            }
        }



    public static void main(String[] args) {
        Car car = new Car ("Toyota", "Corolla", "Gasolina");
        System.out.println("Estado inicial");
            car.showDetails();
            System.out.println();
        System.out.println("Arrancando coche ");
            car.start();
            car.showDetails();
            System.out.println();
        System.out.println("Acelerando hasta velocidad max");
            while (car.speedometer < car.MAX_SPEED){
                car.accelerate();
            }System.out.println("Velocidad final tras acelerar:" + car.speedometer);
            car.showDetails();
            System.out.println();
        System.out.println("Girando volante ");
            car.turnAngleOfWheels(20);
            car.turnAngleOfWheels (30);
            System.out.println(car.showSteeringWheelDetail());
             System.out.println();
        System.out.println("Intentando poner marcha atrás con vehículo en movimiento");
            car.speedometer =50 ;
            car.setReverse(true);
            car.setReverse(false);
            car.showDetails();
            System.out.println();
        System.out.println("Apagando coche ");
            car.speedometer = 0;
            car.stop();
            car.showDetails();
    }
}




