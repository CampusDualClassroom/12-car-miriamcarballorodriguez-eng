package com.campusdual.classroom;

public class Exercise {
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

