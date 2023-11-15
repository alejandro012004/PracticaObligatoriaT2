import java.util.Calendar;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class PracticaObligatoriaT2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int billete5e = 0, billete10e = 0, billete20e = 0, billete50e = 0, billete100e = 0, billete200e = 0, billete500e = 0,
                monedas2e = 0, monedas1e = 0, monedas50c = 0, monedas20c = 0, monedas10c = 0, monedas5c = 0, monedas2c = 0, monedas1c = 0,
                cambiobillete5e = 100, cambiobillete10e = 100, cambiobillete20e = 100, cambiobillete50e = 100, cambiobillete100e = 100,
                cambiobillete200e = 100, cambiobillete500e = 100, cambiomonedas2e = 100, cambiomonedas1e = 100, cambiomonedas50c = 100,
                cambiomonedas20c = 100, cambiomonedas10c = 100, cambiomonedas5c = 100, cambiomonedas2c = 100, cambiomonedas1c = 100,
                numeroReservaAux = 0, numNocheAux = 0,
                opcion = 0, opcionMenuAdmin = 0, opcionCantidadPersonas, opcionCheckout, numeroReserva = 0,
                numNocheHab1 = 0, numNocheHab2 = 0, numNocheHab3 = 0, numNocheHab4 = 0, numNocheHab5 = 0,
                numNocheHab6 = 0, numNocheHab7 = 0, numNocheHab8 = 0, numNocheHab9 = 0, numNocheHab10 = 0;
        String  estadoHabitacion1 = "", estadoHabitacion2 = "", estadoHabitacion3 = "", estadoHabitacion4 = "", estadoHabitacion5 = "",
                estadoHabitacion6 = "", estadoHabitacion7 = "", estadoHabitacion8 = "", estadoHabitacion9 = "", estadoHabitacion10 = "",
                tipoHabitacion = "",
                nombreClienteHab1 = "", nombreClienteHab2 = "", nombreClienteHab3 = "", nombreClienteHab4 = "", nombreClienteHab5 = "",
                nombreClienteHab6 = "", nombreClienteHab7 = "", nombreClienteHab8 = "", nombreClienteHab9 = "", nombreClienteHab10 = "",
                nombreClienteAux = "", fechaEntradaAux = "",
                fechaEntradaHab1 = "", fechaEntradaHab2 = "", fechaEntradaHab3 = "", fechaEntradaHab4 = "", fechaEntradaHab5 = "",
                fechaEntradaHab6 = "", fechaEntradaHab7 = "", fechaEntradaHab8 = "", fechaEntradaHab9 = "", fechaEntradaHab10 = "",
                metodoPago = "", nombreMenu = "", passwordMenu = "";
        float   totalConIva = 0f, iva = 0f, dineroIntro, cambio,
                tarifaHab1 = 0f, tarifaHab2 = 0f, tarifaHab3 = 0f, tarifaHab4 = 0f, tarifaHab5 = 0f, tarifaHab6 = 0f, tarifaHab7 = 0f, tarifaHab8 = 0f, tarifaHab9 = 0f, tarifaHab10 = 0f,
                tarifaAux = 0f, total = 0f, ingresosTotales = 0f;
        final float PRECIOHABITACIONDOBLE = 60f, PRECIOHABITACIONINDIVIDUAL = 45f;

        Calendar calendarEntradaHab1 = Calendar.getInstance();
        Calendar calendarSalidaHab1 = Calendar.getInstance();
        Calendar calendarEntradaHab2 = Calendar.getInstance();
        Calendar calendarSalidaHab2 = Calendar.getInstance();
        Calendar calendarEntradaHab3 = Calendar.getInstance();
        Calendar calendarSalidaHab3 = Calendar.getInstance();
        Calendar calendarEntradaHab4 = Calendar.getInstance();
        Calendar calendarSalidaHab4 = Calendar.getInstance();
        Calendar calendarEntradaHab5 = Calendar.getInstance();
        Calendar calendarSalidaHab5 = Calendar.getInstance();
        Calendar calendarEntradaHab6 = Calendar.getInstance();
        Calendar calendarSalidaHab6 = Calendar.getInstance();
        Calendar calendarEntradaHab7 = Calendar.getInstance();
        Calendar calendarSalidaHab7 = Calendar.getInstance();
        Calendar calendarEntradaHab8 = Calendar.getInstance();
        Calendar calendarSalidaHab8 = Calendar.getInstance();
        Calendar calendarEntradaHab9 = Calendar.getInstance();
        Calendar calendarSalidaHab9 = Calendar.getInstance();
        Calendar calendarEntradaHab10 = Calendar.getInstance();
        Calendar calendarSalidaHab10 = Calendar.getInstance();

        DateFormat formateador = new SimpleDateFormat("dd/M/yy");
        Calendar calendario = new GregorianCalendar();

        // Variables int:
        // opcion = Es las opciones del menu principal (1 menu)
        // opcionMenuAdmin = Es las opciones del menu de Administrador (2 menu)
        // opcionCantidadPersonas = Es la opcion que pondremos al preguntar por la cantidad de personas
        // confir = Numero de confirmación de la reserva
        // entrada = Fecha de entrada al hotel
        // salida = Fecha de salida del hotel
        // noches = Número de noches que se van a facturar
        // numeroReserva = Es el numero de reserva de la habitacion

        //Variables String:
        // descripcion = Nombre del cliente
        // estadoHabitacion(x) = Es ver si esta vacía o llena la habitación
        // tipoHabitacion(x) = ?
        // nombreClienteHab(x) = Es el nombre del cliente
        // nombreMenu = Es el nombre que tendrá en el menu (menu 2)
        // passwordMenu = Es la clave que tendrá en el menu (menu 2)

        //Variables boolean:
        // pax = Huéspedes alojados (1 o 2)

        //Variables float:
        // tarifa = Precio por noche
        // totalSinIva = Total a pagar SIN IVA
        // subtotal = Total a pagar
        // iva = 21% del Subtotal
        // totalConIva = Es el Subtotal CON IVA

        //Variables final float:
        // PRECIOHABITACIONDOBLE = Es el precio de la habitacion doble
        // PRECIOHABITACIONINDIVIDUAL = Es el precio de la habitacion individual

        System.out.println("$$\\   $$\\            $$\\               $$\\         $$\\               $$\\                                         \n" +
                "$$ |  $$ |           $$ |              $$ |        $$ |              \\__|                                        \n" +
                "$$ |  $$ | $$$$$$\\ $$$$$$\\    $$$$$$\\  $$ |      $$$$$$\\    $$$$$$\\  $$\\ $$\\    $$\\ $$$$$$\\   $$$$$$\\   $$$$$$\\  \n" +
                "$$$$$$$$ |$$  __$$\\\\_$$  _|  $$  __$$\\ $$ |      \\_$$  _|  $$  __$$\\ $$ |\\$$\\  $$  |\\____$$\\ $$  __$$\\ $$  __$$\\ \n" +
                "$$  __$$ |$$ /  $$ | $$ |    $$$$$$$$ |$$ |        $$ |    $$ |  \\__|$$ | \\$$\\$$  / $$$$$$$ |$$ /  $$ |$$ /  $$ |\n" +
                "$$ |  $$ |$$ |  $$ | $$ |$$\\ $$   ____|$$ |        $$ |$$\\ $$ |      $$ |  \\$$$  / $$  __$$ |$$ |  $$ |$$ |  $$ |\n" +
                "$$ |  $$ |\\$$$$$$  | \\$$$$  |\\$$$$$$$\\ $$ |        \\$$$$  |$$ |      $$ |   \\$  /  \\$$$$$$$ |\\$$$$$$$ |\\$$$$$$  |\n" +
                "\\__|  \\__| \\______/   \\____/  \\_______|\\__|         \\____/ \\__|      \\__|    \\_/    \\_______| \\____$$ | \\______/ \n" +
                "                                                                                             $$\\   $$ |          \n" +
                "                                                                                             \\$$$$$$  |          \n" +
                "                                                                                              \\______/           ");


        do {
            System.out.print("""
                    \n=======================================================
                                        
                    Bienvenido al menu del hotel Ciudad de Martos.
                                        
                    Opciones a elegir
                               
                    1.- Ver el estado de ocupacion de las habitaciones.
                    2.- Reservar una habitacion.
                    3.- Realizar el checkout de una habitacion.
                    4.- Menu de administrador.
                               
                    Elige una de las siguientes opciones:\s""");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1: //Ver el estado de ocupacion de las habitaciones
                    System.out.println((estadoHabitacion1.equals("")) ? "Habitación 1 esta disponible" : "Habitación 1 no esta disponible");
                    System.out.println((estadoHabitacion2.equals("")) ? "Habitación 2 esta disponible" : "Habitación 2 no esta disponible");
                    System.out.println((estadoHabitacion3.equals("")) ? "Habitación 3 esta disponible" : "Habitación 3 no esta disponible");
                    System.out.println((estadoHabitacion4.equals("")) ? "Habitación 4 esta disponible" : "Habitación 4 no esta disponible");
                    System.out.println((estadoHabitacion5.equals("")) ? "Habitación 5 esta disponible" : "Habitación 5 no esta disponible");
                    System.out.println((estadoHabitacion6.equals("")) ? "Habitación 6 esta disponible" : "Habitación 6 no esta disponible");
                    System.out.println((estadoHabitacion7.equals("")) ? "Habitación 7 esta disponible" : "Habitación 7 no esta disponible");
                    System.out.println((estadoHabitacion8.equals("")) ? "Habitación 8 esta disponible" : "Habitación 8 no esta disponible");
                    System.out.println((estadoHabitacion9.equals("")) ? "Habitación 9 esta disponible" : "Habitación 9 no esta disponible");
                    System.out.println((estadoHabitacion10.equals("")) ? "Habitación 10 esta disponible" : "Habitación 10 no esta disponible");
                    System.out.println("Pulse una tecla para continuar...");
                    scanner.nextLine();
                    break;

                case 2: //Reservar una habitacion.
                    String opcionTipo = " ";
                    System.out.print("<Cuantas personas planean alojarse? ");
                    opcionCantidadPersonas = Integer.parseInt(scanner.nextLine().toLowerCase());

                    switch (opcionCantidadPersonas) {
                        case 2://Mira las habitanciones dobles libres
                            if (estadoHabitacion1.equals("")) {
                                System.out.println("La habitacion 1 esta disponible.");
                                estadoHabitacion1 = "ocupada";

                                System.out.println("Introduzca el nombre del cliente: ");
                                nombreClienteHab1 = scanner.nextLine();

                                numeroReserva++;

                                System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                numNocheHab1 = Integer.parseInt(scanner.nextLine());

                                calendarSalidaHab1.add(Calendar.DATE, numNocheHab1);
                                System.out.println("La fecha de salida será: " + calendarSalidaHab1.getTime());

                                System.out.printf("\nEl precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                tarifaHab1 = numNocheHab1 * PRECIOHABITACIONDOBLE;

                                iva = (float) (tarifaHab1 * 0.21);

                                total = (int) (tarifaHab1 + iva);

                                System.out.print("Cargando ");
                                for (int i = 0; i < 3; i++) {
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    System.out.print(". ");
                                }

                                System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                System.out.println(" ");
                                System.out.println("Pulse una tecla para continuar...");
                                scanner.nextLine();

                            } else {
                                if (estadoHabitacion2.equals("")) {
                                    System.out.println("La habitacion 2 esta disponible.");
                                    estadoHabitacion2 = "ocupada";

                                    System.out.println("Introduzca el nombre del cliente: ");
                                    nombreClienteHab2 = scanner.nextLine();

                                    numeroReserva++;

                                    System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                    numNocheHab2 = Integer.parseInt(scanner.nextLine());

                                    calendarSalidaHab2.add(Calendar.DATE, numNocheHab2);
                                    System.out.println("La fecha de salida será: " + calendarSalidaHab2.getTime());

                                    System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                    tarifaHab2 = numNocheHab2 * PRECIOHABITACIONDOBLE;

                                    iva = (float) (tarifaHab2 * 0.21);

                                    total = (int) (tarifaHab2 + iva);

                                    System.out.print("Cargando ");
                                    for (int i = 0; i < 3; i++) {
                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                        System.out.print(". ");
                                    }

                                    System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                    System.out.println(" ");
                                    System.out.println("Pulse una tecla para continuar...");
                                    scanner.nextLine();

                                } else {
                                    if (estadoHabitacion3.equals("")) {
                                        System.out.println("la habitacion 3 esta disponible.");
                                        estadoHabitacion3 = "ocupada";

                                        System.out.println("Introduzca el nombre del cliente: ");
                                        nombreClienteHab3 = scanner.nextLine();

                                        numeroReserva++;

                                        System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                        numNocheHab3 = Integer.parseInt(scanner.nextLine());

                                        calendarSalidaHab3.add(Calendar.DATE, numNocheHab3);
                                        System.out.println("La fecha de salida será: " + calendarSalidaHab3.getTime());

                                        System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                        tarifaHab3 = numNocheHab3 * PRECIOHABITACIONDOBLE;

                                        iva = (float) (tarifaHab3 * 0.21);

                                        total = (int) (tarifaHab3 + iva);

                                        System.out.print("Cargando ");
                                        for (int i = 0; i < 3; i++) {
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                throw new RuntimeException(e);
                                            }
                                            System.out.print(". ");
                                        }

                                        System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                        System.out.println(" ");
                                        System.out.println("Pulse una tecla para continuar...");
                                        scanner.nextLine();

                                    } else {
                                        if (estadoHabitacion4.equals("")) {
                                            System.out.println("la habitacion 4 esta disponible.");
                                            estadoHabitacion4 = "ocupada";

                                            System.out.println("Introduzca el nombre del cliente: ");
                                            nombreClienteHab4 = scanner.nextLine();

                                            numeroReserva++;

                                            System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                            numNocheHab4 = Integer.parseInt(scanner.nextLine());

                                            calendarSalidaHab4.add(Calendar.DATE, numNocheHab1);
                                            System.out.println("La fecha de salida será: " + calendarSalidaHab4.getTime());

                                            System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                            tarifaHab4 = numNocheHab4 * PRECIOHABITACIONDOBLE;

                                            iva = (float) (tarifaHab4 * 0.21);

                                            total = (int) (tarifaHab4 + iva);

                                            System.out.print("Cargando ");
                                            for (int i = 0; i < 3; i++) {
                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException e) {
                                                    throw new RuntimeException(e);
                                                }
                                                System.out.print(". ");
                                            }

                                            System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                            System.out.println(" ");
                                            System.out.println("Pulse una tecla para continuar...");
                                            scanner.nextLine();

                                        } else {
                                            if (estadoHabitacion5.equals("")) {
                                                System.out.println("la habitacion 5 esta disponible.");
                                                estadoHabitacion5 = "ocupada";

                                                System.out.println("Introduzca el nombre del cliente: ");
                                                nombreClienteHab5 = scanner.nextLine();

                                                numeroReserva++;

                                                System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                                numNocheHab5 = Integer.parseInt(scanner.nextLine());

                                                calendarSalidaHab5.add(Calendar.DATE, numNocheHab5);
                                                System.out.println("La fecha de salida será: " + calendarSalidaHab5.getTime());

                                                System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                                tarifaHab5 = numNocheHab5 * PRECIOHABITACIONDOBLE;

                                                iva = (float) (tarifaHab5 * 0.21);

                                                total = (int) (tarifaHab5 + iva);

                                                System.out.print("Cargando ");
                                                for (int i = 0; i < 3; i++) {
                                                    try {
                                                        Thread.sleep(1000);
                                                    } catch (InterruptedException e) {
                                                        throw new RuntimeException(e);
                                                    }
                                                    System.out.print(". ");
                                                }

                                                System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                                System.out.println(" ");
                                                System.out.println("Pulse una tecla para continuar...");
                                                scanner.nextLine();

                                            } else {
                                                if (estadoHabitacion6.equals("")) {
                                                    System.out.println("la habitacion 6 esta disponible.");
                                                    estadoHabitacion6 = "ocupada";

                                                    System.out.println("Introduzca el nombre del cliente: ");
                                                    nombreClienteHab6 = scanner.nextLine();

                                                    numeroReserva++;

                                                    System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                                    numNocheHab6 = Integer.parseInt(scanner.nextLine());

                                                    calendarSalidaHab6.add(Calendar.DATE, numNocheHab6);
                                                    System.out.println("La fecha de salida será: " + calendarSalidaHab6.getTime());

                                                    System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                                    tarifaHab6 = numNocheHab6 * PRECIOHABITACIONDOBLE;

                                                    iva = (float) (tarifaHab6 * 0.21);

                                                    total = (int) (tarifaHab6 + iva);

                                                    System.out.print("Cargando ");
                                                    for (int i = 0; i < 3; i++) {
                                                        try {
                                                            Thread.sleep(1000);
                                                        } catch (InterruptedException e) {
                                                            throw new RuntimeException(e);
                                                        }
                                                        System.out.print(". ");
                                                    }

                                                    System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                                    System.out.println(" ");
                                                    System.out.println("Pulse una tecla para continuar...");
                                                    scanner.nextLine();

                                                } else {
                                                    if (estadoHabitacion7.equals("")) {
                                                        System.out.println("la habitacion 7 esta disponible.");
                                                        estadoHabitacion7 = "ocupada";

                                                        System.out.println("Introduzca el nombre del cliente: ");
                                                        nombreClienteHab7 = scanner.nextLine();

                                                        numeroReserva++;

                                                        System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                                        numNocheHab7 = Integer.parseInt(scanner.nextLine());

                                                        calendarSalidaHab7.add(Calendar.DATE, numNocheHab7);
                                                        System.out.println("La fecha de salida será: " + calendarSalidaHab7.getTime());

                                                        System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                                        tarifaHab7 = numNocheHab7 * PRECIOHABITACIONDOBLE;

                                                        iva = (float) (tarifaHab7 * 0.21);

                                                        total = (int) (tarifaHab7 + iva);

                                                        System.out.print("Cargando ");
                                                        for (int i = 0; i < 3; i++) {
                                                            try {
                                                                Thread.sleep(1000);
                                                            } catch (InterruptedException e) {
                                                                throw new RuntimeException(e);
                                                            }
                                                            System.out.print(". ");
                                                        }

                                                        System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                                        System.out.println(" ");
                                                        System.out.println("Pulse una tecla para continuar...");
                                                        scanner.nextLine();

                                                    } else {
                                                        if (estadoHabitacion8.equals("")) {
                                                            System.out.println("la habitacion 8 esta disponible.");
                                                            estadoHabitacion8 = "ocupada";

                                                            System.out.println("Introduzca el nombre del cliente: ");
                                                            nombreClienteHab8 = scanner.nextLine();

                                                            numeroReserva++;

                                                            System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                                            numNocheHab8 = Integer.parseInt(scanner.nextLine());

                                                            calendarSalidaHab8.add(Calendar.DATE, numNocheHab8);
                                                            System.out.println("La fecha de salida será: " + calendarSalidaHab8.getTime());

                                                            System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                                            tarifaHab8 = numNocheHab8 * PRECIOHABITACIONDOBLE;

                                                            iva = (float) (tarifaHab8 * 0.21);

                                                            total = (int) (tarifaHab8 + iva);

                                                            System.out.print("Cargando ");
                                                            for (int i = 0; i < 3; i++) {
                                                                try {
                                                                    Thread.sleep(1000);
                                                                } catch (InterruptedException e) {
                                                                    throw new RuntimeException(e);
                                                                }
                                                                System.out.print(". ");
                                                            }

                                                            System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                                            System.out.println(" ");
                                                            System.out.println("Pulse una tecla para continuar...");
                                                            scanner.nextLine();

                                                        } else {
                                                            if (estadoHabitacion9.equals("")) {
                                                                System.out.println("la habitacion 9 esta disponible.");
                                                                estadoHabitacion9 = "ocupada";

                                                                System.out.println("Introduzca el nombre del cliente: ");
                                                                nombreClienteHab9 = scanner.nextLine();

                                                                numeroReserva++;

                                                                System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                                                numNocheHab9 = Integer.parseInt(scanner.nextLine());

                                                                calendarSalidaHab9.add(Calendar.DATE, numNocheHab9);
                                                                System.out.println("La fecha de salida será: " + calendarSalidaHab9.getTime());

                                                                System.out.printf("El precio por noche en la habitacion doble es de %.2f \n", PRECIOHABITACIONDOBLE);

                                                                tarifaHab9 = numNocheHab9 * PRECIOHABITACIONDOBLE;

                                                                iva = (float) (tarifaHab9 * 0.21);

                                                                total = (int) (tarifaHab9 + iva);

                                                                System.out.print("Cargando ");
                                                                for (int i = 0; i < 3; i++) {
                                                                    try {
                                                                        Thread.sleep(1000);
                                                                    } catch (InterruptedException e) {
                                                                        throw new RuntimeException(e);
                                                                    }
                                                                    System.out.print(". ");
                                                                }

                                                                System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");
                                                                System.out.println(" ");
                                                                System.out.println("Pulse una tecla para continuar...");
                                                                scanner.nextLine();

                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;


                        case 1://Mira las habitaciones libres individuales
                            if (estadoHabitacion5.equals("")) {
                                System.out.println("La habitacion 5 esta disponible.");
                                estadoHabitacion5 = "ocupada";

                                System.out.println("Introduzca el nombre del cliente: ");
                                nombreClienteHab5 = scanner.nextLine();

                                numeroReserva++;

                                System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                numNocheHab5 = Integer.parseInt(scanner.nextLine());

                                calendarSalidaHab5.add(Calendar.DATE, numNocheHab5);
                                System.out.println("La fecha de salida será: " + calendarSalidaHab5.getTime());

                                System.out.printf("El precio por noche en la habitacion individual es de %.2f \n", PRECIOHABITACIONINDIVIDUAL);

                                tarifaHab5 = numNocheHab5 * PRECIOHABITACIONINDIVIDUAL;

                                iva = (float) (tarifaHab5 * 0.21);

                                total = (int) (tarifaHab5 + iva);

                                System.out.print("Cargando ");
                                for (int i = 0; i < 3; i++) {
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    System.out.print(". ");
                                }

                                System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");

                                System.out.println(" ");
                                System.out.println("Pulse una tecla para continuar...");
                                scanner.nextLine();

                            } else {
                                if (estadoHabitacion10.equals("")) {
                                    System.out.println("La habitacion 10 esta disponible.");
                                    estadoHabitacion10 = "ocupada";

                                    System.out.println("Introduzca el nombre del cliente: ");
                                    nombreClienteHab10 = scanner.nextLine();

                                    numeroReserva++;

                                    System.out.println("introduce el numero de noche que se quedaran los clientes: ");
                                    numNocheHab10 = Integer.parseInt(scanner.nextLine());

                                    calendarSalidaHab10.add(Calendar.DATE, numNocheHab10);
                                    System.out.println("La fecha de salida será: " + calendarSalidaHab10.getTime());

                                    System.out.printf("El precio por noche en la habitacion individual es de %.2f \n", PRECIOHABITACIONINDIVIDUAL);

                                    tarifaHab10 = numNocheHab10 * PRECIOHABITACIONINDIVIDUAL;

                                    iva = (float) (tarifaHab10 * 0.21);

                                    total = (int) (tarifaHab10 + iva);

                                    System.out.print("Cargando ");
                                    for (int i = 0; i < 3; i++) {
                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                        System.out.print(". ");
                                    }

                                    System.out.println("\nReserva finalizada con exito, espero que su estancia en el hotel sea placentera.");

                                    System.out.println(" ");
                                    System.out.println("Pulse una tecla para continuar...");
                                    scanner.nextLine();

                                } else {
                                    System.out.println("Todas las habitaciones dobles estan ocupadas.");
                                }
                            }
                            break;

                        default:
                            System.out.println("Opcion introducida incorrecta, asegurese el dato introducido sea 1 o 2.");
                    }
                    break;

                case 3://Realizar el checkout de la habitacion.
                    System.out.println("""
                            Introduce el numero de habitacion del que quieres realizar el checkout (1-10)
                            """);
                    opcionCheckout = Integer.parseInt(scanner.nextLine());

                    switch (opcionCheckout) {
                        case 1:

                            if (estadoHabitacion1.equals(""))
                                System.out.println("La habitacion seleccionada esta vacia.");
                            else {
                                nombreClienteAux = nombreClienteHab1;
                                numeroReservaAux = numeroReserva;
                                fechaEntradaAux = fechaEntradaHab1;
                                numNocheAux = numNocheHab1;
                                tarifaAux = tarifaHab1;
                                iva = (float) (tarifaAux * 0.21);
                                total = (tarifaHab1 + iva);
                                ingresosTotales += total;
                                tipoHabitacion = "doble";
                                estadoHabitacion1 = "";
                                nombreClienteHab1 = "";
                                numeroReserva = 0;
                                fechaEntradaHab1 = "";
                                numNocheHab1 = 0;
                                tarifaHab1 = 0;
                            }


                            break;

                        case 2:

                            if (estadoHabitacion1.equals(""))
                                System.out.println("La habitacion seleccionada esta vacia.");
                            else {
                                nombreClienteAux = nombreClienteHab2;
                                numeroReservaAux = numeroReserva;
                                fechaEntradaAux = fechaEntradaHab2;
                                numNocheAux = numNocheHab2;
                                tarifaAux = tarifaHab2;
                                iva = (float) (tarifaAux * 0.21);
                                total = (tarifaHab2 + iva);
                                ingresosTotales += total;
                                tipoHabitacion = "doble";
                                estadoHabitacion2 = "";
                                nombreClienteHab2 = "";
                                fechaEntradaHab2 = "";
                                numNocheHab2 = 0;
                                tarifaHab2 = 0;
                            }
                            break;

                        case 3:

                            nombreClienteAux = nombreClienteHab3;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab3;
                            numNocheAux = numNocheHab3;
                            tarifaAux = tarifaHab3;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab3 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "doble";
                            estadoHabitacion3 = "";
                            nombreClienteHab3 = "";
                            fechaEntradaHab3 = "";
                            numNocheHab3 = 0;
                            tarifaHab3 = 0;

                            break;

                        case 4:

                            nombreClienteAux = nombreClienteHab4;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab4;
                            numNocheAux = numNocheHab4;
                            tarifaAux = tarifaHab4;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab4 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "doble";
                            estadoHabitacion4 = "";
                            nombreClienteHab4 = "";
                            fechaEntradaHab4 = "";
                            numNocheHab4 = 0;
                            tarifaHab4 = 0;

                            break;
                        case 5:

                            nombreClienteAux = nombreClienteHab5;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab5;
                            numNocheAux = numNocheHab5;
                            tarifaAux = tarifaHab5;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab5 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "individual";
                            estadoHabitacion5 = "";
                            nombreClienteHab5 = "";
                            fechaEntradaHab5 = "";
                            numNocheHab5 = 0;
                            tarifaHab5 = 0;

                            break;

                        case 6:

                            nombreClienteAux = nombreClienteHab6;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab6;
                            numNocheAux = numNocheHab6;
                            tarifaAux = tarifaHab6;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab6 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "doble";
                            estadoHabitacion6 = "";
                            nombreClienteHab6 = "";
                            fechaEntradaHab6 = "";
                            numNocheHab6 = 0;
                            tarifaHab6 = 0;

                            break;

                        case 7:

                            nombreClienteAux = nombreClienteHab7;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab7;
                            numNocheAux = numNocheHab7;
                            tarifaAux = tarifaHab7;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab7 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "doble";
                            estadoHabitacion7 = "";
                            nombreClienteHab7 = "";
                            fechaEntradaHab7 = "";
                            numNocheHab7 = 0;
                            tarifaHab7 = 0;

                            break;

                        case 8:

                            nombreClienteAux = nombreClienteHab8;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab8;
                            numNocheAux = numNocheHab8;
                            tarifaAux = tarifaHab8;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab8 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "doble";
                            estadoHabitacion8 = "";
                            nombreClienteHab8 = "";
                            fechaEntradaHab8 = "";
                            numNocheHab8 = 0;
                            tarifaHab8 = 0;

                            break;

                        case 9:

                            nombreClienteAux = nombreClienteHab9;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab9;
                            numNocheAux = numNocheHab9;
                            tarifaAux = tarifaHab9;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab9 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "doble";
                            estadoHabitacion9 = "";
                            nombreClienteHab9 = "";
                            fechaEntradaHab9 = "";
                            numNocheHab9 = 0;
                            tarifaHab9 = 0;

                            break;

                        case 10:

                            nombreClienteAux = nombreClienteHab10;
                            numeroReservaAux = numeroReserva;
                            fechaEntradaAux = fechaEntradaHab10;
                            numNocheAux = numNocheHab10;
                            tarifaAux = tarifaHab10;
                            iva = (float) (tarifaAux * 0.21);
                            total = (tarifaHab10 + iva);
                            ingresosTotales += total;
                            tipoHabitacion = "individual";
                            estadoHabitacion10 = "";
                            nombreClienteHab10 = "";
                            fechaEntradaHab10 = "";
                            numNocheHab10 = 0;
                            tarifaHab10 = 0;

                            break;
                    }

                    //Calculamos el cambio si la habitacion es doble
                    System.out.println("==========================================================");
                    System.out.println("- nombre del cliente = " + nombreClienteAux);
                    System.out.println("- numero reserva = " + numeroReservaAux);
                    System.out.println("- fecha entrada = " + fechaEntradaAux);
                    System.out.println("- Noches que han pasado = " + numNocheAux);
                    System.out.println("- tarifa de habitacion = " + tarifaAux);
                    System.out.println("- iva = " + iva);
                    System.out.println("- factura total con iva incluido = " + total);
                    System.out.println("==========================================================2");
                    System.out.println("Pulse cualquier boton para continuar...");
                    scanner.nextLine();

                    //Preguntamos la forma de pago de manera que solo puede ser efectivo porque esta el datafono roto
                    do {
                        System.out.println("Introduce cual es el metodo de pago que va a utilizar (efectivo o tarjeta) ");
                        metodoPago = scanner.nextLine().toLowerCase();
                        if (metodoPago.equals("tarjeta"))
                            System.out.println("Metodo de pago no disponible.");
                    } while (!metodoPago.equals("efectivo"));

                    //preguntamos el dinero que quiere introducir y calculamos el cambio.
                    do {
                        System.out.print("introduzca el dinero: ");
                        dineroIntro = Float.parseFloat(scanner.nextLine());
                        if (total > dineroIntro) System.out.println("Cantidad insuficiente");

                    } while (dineroIntro < total);
                    cambio = dineroIntro - total;

                    System.out.print("Calculando su cambio ");
                    for (int i = 0; i < 3; i++) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(". ");
                    }
                     System.out.println("Su cambio total es: " + cambio);
                    while (cambio >= 500) {
                        billete500e++;
                        cambio -= 500;
                    }
                    while (cambio >= 200) {
                        billete200e++;
                        cambio -= 200;
                    }
                    while (cambio >= 100) {
                        billete100e++;
                        cambio -= 100;
                    }
                    while (cambio >= 50) {
                        billete50e++;
                        cambio -= 50;
                    }
                    while (cambio >= 20) {
                        billete20e++;
                        cambio -= 20;
                    }
                    while (cambio >= 10) {
                        billete10e++;
                        cambio -= 10;
                    }
                    while (cambio >= 5) {
                        billete5e++;
                        cambio -= 5;
                    }
                    while (cambio >= 2) {
                        monedas2e++;
                        cambio -= 2;
                    }
                    while (cambio >= 1) {
                        monedas1e++;
                        cambio -= 1;
                    }
                    while (cambio >= 0.50) {
                        monedas50c++;
                        cambio -= (float) Math.round(cambio * 100) / 100;
                    }
                    while (cambio >= 0.20) {
                        monedas20c++;
                        cambio -= (float) Math.round(cambio * 100) / 100;
                    }
                    while (cambio >= 0.10) {
                        monedas10c++;
                        cambio -= (float) Math.round(cambio * 100) / 100;
                    }
                    while (cambio >= 0.05) {
                        monedas5c++;
                        cambio -= (float) Math.round(cambio * 100) / 100;
                    }
                    while (cambio > 0.01) {
                        monedas2c++;
                        cambio -= (float) Math.round(cambio * 100) / 100;
                    }
                    if (billete500e > 0) System.out.println("Billetes de 500 euros: " + billete500e);
                    cambiobillete500e -= billete500e;
                    if (billete200e > 0) System.out.println("Billetes de 200 euros: " + billete200e);
                    cambiobillete200e -= billete200e;
                    if (billete100e > 0) System.out.println("Billetes de 100 euros: " + billete100e);
                    cambiobillete100e -= billete100e;
                    if (billete50e > 0) System.out.println("Billetes de 50 euros: " + billete50e);
                    cambiobillete50e -= billete50e;
                    if (billete20e > 0) System.out.println("Billetes de 20 euros: " + billete20e);
                    cambiobillete20e -= billete20e;
                    if (billete10e > 0) System.out.println("Billetes de 10 euros: " + billete10e);
                    cambiobillete10e -= billete10e;
                    if (billete5e > 0) System.out.println("Billetes de 5 euros: " + billete5e);
                    cambiobillete5e -= billete5e;
                    if (monedas2e > 0) System.out.println("Monedas de 2 euros: " + monedas2e);
                    cambiomonedas2e -= monedas2e;
                    if (monedas1e > 0) System.out.println("Monedas de 1 euros: " + monedas1e);
                    cambiomonedas1e -= monedas1e;
                    if (monedas50c > 0) System.out.println("Monedas de 50 centimos: " + monedas50c);
                    cambiomonedas50c -= monedas50c;
                    if (monedas20c > 0) System.out.println("Monedas de 20 centimos: " + monedas20c);
                    cambiomonedas20c -= monedas20c;
                    if (monedas10c > 0) System.out.println("Monedas de 10 centimos: " + monedas10c);
                    cambiomonedas10c -= monedas10c;
                    if (monedas5c > 0) System.out.println("Monedas de 5 centimos: " + monedas5c);
                    cambiomonedas5c -= monedas5c;
                    if (monedas2c > 0) System.out.println("Monedas de 2 centimos: " + monedas2c);
                    cambiomonedas2c -= monedas2c;
                    if (monedas1c > 0) System.out.println("Monedas de 1 centimos: " + monedas1c);
                    cambiomonedas1c -= monedas1c;

                    nombreClienteAux = "";

                    numNocheAux = 0;

                    tarifaAux = 0;

                    iva = 0;

                    total = 0;

                    System.out.println("Pulse cualquier boton para continuar...");
                    scanner.nextLine();

                    break;

                case 4://Menu de administrador. Usuario: "carlos" Clave: "1234"
                    do {
                        System.out.print("Introduce tu usuario: ");
                        nombreMenu = scanner.nextLine().toLowerCase();
                        System.out.print("Introduce tu contraseña: ");
                        passwordMenu = scanner.nextLine().toLowerCase();
                        if (nombreMenu.equals("carlos") && (passwordMenu.equals("1234"))) {
                            System.out.printf("""
                                    *******
                                    !Bienvenido %s!
                                    Menu de administrador
                                               
                                    1. Consultar los ingresos totales y el número de reservas finalizadas.
                                    2. Consultar las monedas restantes para el cambio.
                                    3. Apagar el software.
                                               
                                    Elige una de las siguientes opciones:""", nombreMenu);
                            opcionMenuAdmin = Integer.parseInt(scanner.nextLine());
                            switch (opcionMenuAdmin) {
                                case 1: //Consultar los ingresos totales y el número de reservas finalizadas.
                                    System.out.println("Ingresos totales: " + ingresosTotales + "\nNúmeros de reservas: " + numeroReserva);
                                    break;
                                case 2: //Consultar las monedas restantes para el cambio.
                                    System.out.println("Billetes de 500 euros: " + cambiobillete500e);
                                    System.out.println("Billetes de 200 euros: " + cambiobillete200e);
                                    System.out.println("Billetes de 100 euros: " + cambiobillete100e);
                                    System.out.println("Billetes de 50 euros: " + cambiobillete50e);
                                    System.out.println("Billetes de 20 euros: " + cambiobillete20e);
                                    System.out.println("Billetes de 10 euros: " + cambiobillete10e);
                                    System.out.println("Billetes de 5 euros: " + cambiobillete5e);
                                    System.out.println("Monedas de 2 euros: " + cambiomonedas2e);
                                    System.out.println("Monedas de 1 euros: " + cambiomonedas1e);
                                    System.out.println("Monedas de 50 centimos: " + cambiomonedas50c);
                                    System.out.println("Monedas de 20 centimos: " + cambiomonedas20c);
                                    System.out.println("Monedas de 10 centimos: " + cambiomonedas10c);
                                    System.out.println("Monedas de 5 centimos: " + cambiomonedas5c);
                                    System.out.println("Monedas de 2 centimos: " + cambiomonedas2c);
                                    System.out.println("Monedas de 1 centimos: " + cambiomonedas1c);
                                    break;
                                case 3: //Apagar el software
                                    break;
                                default: //Opcion no valida en el menu de administrador
                                    System.out.println("Opcion no valida.\n" + "Pulse una tecla para continuar...");
                                    scanner.nextLine();
                            }
                        } else System.out.println("Usuario incorrecto");
                    } while (opcionMenuAdmin != 3);
                    break; // break del case 4
                default: ////Opcion no valida en el menu principal
                    System.out.println("Opcion no valida.\n" + "Pulse una tecla para continuar...");
                    scanner.nextLine();
            }
        } while (opcion != 4);
    }
}