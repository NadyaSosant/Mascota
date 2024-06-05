import java.util.Scanner;

public class Menu {
    private Altas altas;
    private Registro registro;
    private Consulta consulta;
    private Paquetes paquetes;


    public Menu() {
    Altas = new Altas();
    Registro = new Registro();
    Consulta = new Consulta();
    Paquetes = new Paquetes();

    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!salir) {
            mostrarMenuPrincipal();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

                        switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado *Altas*");
                    boolean subSal = false;
                    while (!subSal) {
                        System.out.println("1.1 Altas De Cliente");
                        System.out.println("1.2 Altas De Mascota");
                        System.out.println("1.3 Altas De Veterinarios ");
                        System.out.println("1.3 Altas De Asistente Personal ");                       
                        System.out.println("1.4 Altas De Gerente de sucursal");
                        System.out.println("1.5 Volver al menú principal");

                        System.out.print("Elige una Opción: ");
                        int subOpcion = scanner.nextInt();

                        switch (subOpcion) {
                            case 1:
                                System.out.println("Has seleccionado la Altas de Cliente");
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la Altas de Mascota");
                                
                                break;
                            case 3:
                                System.out.println("Has seleccionado la Altas de Veterinarios");
                                
                                break;
                            case 4:
                                System.out.println("Has seleccionado la Altas de Asistente");
                                
                                break;
                             case 5:
                                System.out.println("Has seleccionado la Altas de Gerente");
                                
                                break;
                            case 6:
                                subSal = true;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 6");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado *Registros*");
                    boolean subSali = false;
                    while (!subSali) {
                        System.out.println("2.1. Registros de Citas");
                        System.out.println("2.2. Registros de Citas A Domicilio");
                        System.out.println("2.3. Registros de Adopción de Mascota");
                        System.out.println("2.4. Registros de Devolucion de Mascota");
                        System.out.println("2.5. Registros de Baja Veterinarios");
                        System.out.println("2.6. Registros de Baja Asistente");
                        System.out.println("2.7. Volver al menú principal");

                        System.out.print("Elige una subopción: ");
                        int subOpcion = scanner.nextInt();

                        switch (subOpcion) {
                            case 1:
                                System.out.println("Has seleccionado la Registros de Citas");
                                break;
                            case 2:
                                System.out.println("Has seleccionado la Registros de Adopcion de Mascota");
                            
                                break;
                            case 3:
                                System.out.println("Has seleccionado la Registros de Citas a Domicilio");
                                break;
                            case 4:
                                System.out.println("Has seleccionado la Registros de Devolucion de Mascota");
                            
                                break;
                            case 5:
                                System.out.println("Has seleccionado la Registros de Baja Veterinarios");
                            
                                break;
                            case 6:
                                System.out.println("Has seleccionado la Registros de Baja Asistente");
                                break;
                            case 7:
                                subSali = true;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 7");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción de *Consultas*");
                    boolean subSalir = false;
                    while (!subSalir) {
                        System.out.println("3.1 Consultas De citas con Veterinarios");
                        System.out.println("3.2 Consultas Adopción");
                        System.out.println("3.3 Consultas De Veterinarios");
                        System.out.println("3.4 Volver al menú principal");

                        System.out.print("Elige una subopción: ");
                        int subOpcion = scanner.nextInt();

                        switch (subOpcion) {
                            case 1:
                                System.out.println("Has seleccionado la Consultas De citas con Veterinarios");
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la Consultas Adopción");
                                
                                break;
                            case 3:
                                System.out.println("Has seleccionado la Consultas De Veterinarios");
                                
                                break;
                            case 4:
                                subSalir = true;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 4");
                        }
                    }
                    break;
                    case 4:
                    System.out.println("Has seleccionado la opción de *Paquetes*");
                    boolean subSalirt = false;
                    while (!subSalirt) {
                        System.out.println("4.1 Altas de Paquetes");
                        System.out.println("4.2 Consulta de Paquetes");
                        System.out.println("4.3 Pago de Paquetes");
                        System.out.println("3.4 Volver al menú principal");

                        System.out.print("Elige una subopción: ");
                        int subOpcion = scanner.nextInt();

                        switch (subOpcion) {
                            case 1:
                                System.out.println("Has seleccionado la subopción 1");
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la subopción 2");
                                
                                break;
                            case 3:
                                System.out.println("Has seleccionado la subopción 2");
                                
                                break;
                            case 4:
                                subSalir = true;
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 4");
                        }
                    }
                    break;
        }

        scanner.close();
    }

    private void mostrarMenuPrincipal() {
            System.out.println("1. Altas");
            System.out.println("2. Registro");
            System.out.println("3. Consulta");
            System.out.println("4. Paquetes");
            System.out.println("5. Salir");
    }
}

