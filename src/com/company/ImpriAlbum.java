package com.company;

public class ImpriAlbum {
    Album Disco1 = new Album();
    Album Disco2 = new Album();
    Album Disco3 = new Album();
    int elige;
    boolean sal1 = false, sal2 = false;
    public char opcion;

    public void Menu(){opcion = ' ';}

    public void MenuPrincipal(){
        LectorTeclado leer = new LectorTeclado();
        sal1 = false;
        do{
            System.out.println("Bienvenido al programa para Album Musicales");
            elige = leer.LecturaEntero();
            if (elige <= 3){ MenuDisco();}
            else if (elige == 4) { System.out.println("Gracias por usar el programa!"); sal2 = true;}
            else
                System.out.println("Ingrese una opcion valida por favor");
            System.out.println("                                     ");
        }while(sal2 == false);
    }

    public void MenuOperaciones(){
        LectorTeclado leer = new LectorTeclado();
        System.out.println("Elige una opcion que desees ejecutar en el menú: ");
        System.out.println("Ingrese A para agregarle datos al disco.");
        System.out.println("Ingrese B para imprimir todos los datos del disco.");
        System.out.println("Ingrese C para volver al menu de elegir disco.");
        System.out.print("Opcion: ");
        opcion = leer.LecturaChar();
    }


    public void MenuDisco(){
        do{
            switch(elige){
                case 1:

                    System.out.println("Ingrese los datos del primer disco");
                    MenuOperaciones();
                    if(opcion == 'A'||opcion == 'a'){Disco1.setNombreDisco(); Disco1.setAutor(); Disco1.setFormato(); Disco1.setCanciones();}
                    else if(opcion == 'B'||opcion == 'b'){
                        System.out.println("Nombre del disco: " + Disco1.getNombreDisco());
                        System.out.println("Nombre del autor: " + Disco1.getAutor());
                        System.out.println("Nombre del formato: " + Disco1.getFormato());
                        System.out.println("Canciones: ");
                        Disco1.getCanciones();}
                    else if(opcion == 'C'||opcion == 'c'){ System.out.println("Gracias por usar esta opcion"); sal1 = true;}
                    else
                        System.out.println("Intente de nuevo.");

                    break;
                case 2:

                    System.out.println("Ingrese los datos del segundo disco ");
                    MenuOperaciones();
                    if(opcion == 'A'||opcion == 'a'){Disco2.setNombreDisco(); Disco2.setAutor(); Disco2.setFormato(); Disco2.setCanciones();}
                    else if(opcion == 'B'||opcion == 'b'){
                        System.out.println("Nombre del disco: " + Disco2.getNombreDisco());
                        System.out.println("Nombre del autor: " + Disco2.getAutor());
                        System.out.println("Nombre del formato: " + Disco2.getFormato());
                        System.out.println("Canciones: ");
                        Disco2.getCanciones();}
                    else if(opcion == 'C'||opcion == 'c'){ System.out.println("Gracias por usar esta opcion "); sal1 = true;}
                    else
                        System.out.println("Intente de nuevo.");
                    System.out.println("                                     ");

                    break;
                case 3:

                    System.out.println("Ingrese los datos del disco 3");
                    MenuOperaciones();
                    if(opcion == 'A'||opcion == 'a'){Disco3.setNombreDisco(); Disco3.setAutor(); Disco3.setFormato(); Disco3.setCanciones();}
                    else if(opcion == 'B'||opcion == 'b'){
                        System.out.println("Nombre del disco: " + Disco3.getNombreDisco());
                        System.out.println("Nombre del autor: " + Disco3.getAutor());
                        System.out.println("Nombre del formato: " + Disco3.getFormato());
                        System.out.println("Canciones: ");
                        Disco3.getCanciones();
                    }
                    else if(opcion == 'C'||opcion == 'c'){ System.out.println("Gracias por usar esta opcion"); sal1 = true;}
                    else
                        System.out.println("Intente de nuevo.");
                    System.out.println("                                     ");

                    break;
                default:
                    System.out.println("Intente de nuevo.");
                    System.out.println("                                                     ");
                    break;
            }
        }while(sal1 == false);
        MenuPrincipal();
    }
}
