package com.company;

public class Album {
    private String nombreDisco, autor, formato, nombreCancion[]= new String[19];
    private double duracion, duracionCancion[] = new double[19];
    private int numeroCanciones;

    public void DiscosMusicales(){
        nombreDisco = "";
        autor = "";
        formato = "";
        duracion = 0;
        numeroCanciones = 0;
        nombreCancion = new String[]{"","","","","","","","","","","","","","","","","","","",""};
        duracionCancion = new double[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    }

    public void setNombreDisco(){
        System.out.println("--------------------------------------------");
        LectorTeclado leer = new LectorTeclado();
        System.out.println("Ingrese el nombre del disco: ");
        nombreDisco = leer.LeerCadena();
    }

    public void setAutor(){
        LectorTeclado leer = new LectorTeclado();
        System.out.println("Ingrese el nombre del artista de este disco: ");
        autor = leer.LeerCadena();
    }

    public void setFormato(){
        LectorTeclado leer = new LectorTeclado();
        System.out.println("Ingrese el formato del disco: ");
        formato = leer.LeerCadena();
    }

    public void setCanciones(){
        LectorTeclado leer = new LectorTeclado();
        do{
            System.out.println("¿Cuantas canciones son?: ");
            numeroCanciones = leer.LecturaEntero();
            if(numeroCanciones > 20){System.out.println("Solo se pueden ingresar hasta 20 temas musicales. \nIntente de nuevo.");
                System.out.println("                                     ");
            }
        }while(numeroCanciones > 20);
        for (int i = 0, j = 1; i < numeroCanciones; i++, j++){
            System.out.println("Ingrese el nombre de la cancion numero " + j + ": ");
            nombreCancion[i] = leer.LeerCadena();
            System.out.println("Ingrese la duracion de la cancion numero " + j + ": ");
            duracionCancion[i] = leer.LecturaDecimal();
            duracion = duracion + duracionCancion[i];
        }
        System.out.println("Datos Listos");
    }

    public String getNombreDisco(){
        return nombreDisco;
    }

    public String getAutor(){
        return autor;
    }

    public String getFormato(){
        return formato;
    }

    public void getCanciones(){
        for (int i = 0, j = 1; i < numeroCanciones; i++, j++){
            System.out.println(j + ". " + nombreCancion[i] + " (Duracion: " + duracionCancion[i] + ").");
        }
        System.out.println("");
        System.out.println("Duracion total del disco: " + duracion);
    }

}
