package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

        Cliente cliente = null;
        Empleado empleado = null;
        Habitacion habitación = null;
        String nombre, apellidos, DNI, tipo;
        int numeroTelefono, idHabitacion, idCliente, idEmpleado, numeroCamas;
        double costePorDia;

        int opcion = 10;

        do {
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Dar de baja a un cliente.");
            System.out.println("3. Registrar empleado.");
            System.out.println("4. Dar de baja a un empleado.");
            System.out.println("5. Agregar nueva habitación.");
            System.out.println("6. Eliminar una habitación.");
            System.out.println("7. Mostrar todos los clientes.");
            System.out.println("8. Mostrar todos los empleados.");
            System.out.println("9. Mostrar todas las habitaciones.");
            System.out.println("10. Salir del programa.");
            System.out.println("Introduce el número de la opcion deseada: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el id del nuevo cliente: ");
                    idCliente = scanner.nextInt();
                    cliente = new Cliente(idCliente);
                    scanner.nextLine();
                    System.out.println("Introduzca el nombre del nuevo cliente: ");
                    nombre = scanner.nextLine();
                    cliente.nombre = nombre;
                    System.out.println("Introduzca los apellidos del nuevo cliente: ");
                    apellidos = scanner.nextLine();
                    cliente.apellidos = apellidos;
                    System.out.println("Introduzca el DNI del nuevo cliente: ");
                    cliente.DNI = scanner.nextLine();
                    System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
                    numeroTelefono = scanner.nextInt();
                    cliente.numeroTelefono = numeroTelefono;
                    clientes.add(cliente);

                    break;
                case 2:
                    System.out.println("Introduzca el id del cliente a dar de baja: ");
                    idCliente = scanner.nextInt();

                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para dar de baja...");
                    } else {
                        for (Cliente clienteAEliminar : clientes) {
                            if (clienteAEliminar.idCliente == idCliente) {
                                clientes.remove(clienteAEliminar);
                            }
                        }
                    }

                    break;
                case 3:
                    System.out.println("Introduzca el id del nuevo empleado: ");
                    idEmpleado = scanner.nextInt();
                    empleado = new Empleado(idEmpleado);
                    scanner.nextLine();
                    System.out.println("Introduzca el nombre del nuevo empleado: ");
                    nombre = scanner.nextLine();
                    empleado.nombre = nombre;
                    System.out.println("Introduzca los apellidos del nuevo empleado: ");
                    apellidos = scanner.nextLine();
                    empleado.apellidos = apellidos;
                    System.out.println("Introduzca el DNI del nuevo empleado: ");
                    DNI = scanner.nextLine();
                    empleado.DNI = DNI;
                    System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
                    numeroTelefono = scanner.nextInt();
                    empleado.numeroTelefono = numeroTelefono;
                    empleados.add(empleado);

                    break;
                case 4:
                    System.out.println("Introduzca el id del empleado a dar de baja: ");
                    idCliente = scanner.nextInt();
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados para dar de baja...");
                    } else {

                        for (Empleado clienteABorrar : empleados) {
                            if (clienteABorrar.idEmpleado == idCliente) {
                                empleado = clienteABorrar;

                            }
                        }
                        empleados.remove(empleado);
                    }

                    break;
                case 5:
                    System.out.println("Introduzca el id de la nueva habitación: ");
                    idHabitacion = scanner.nextInt();
                    habitación = new Habitacion(idHabitacion);
                    scanner.nextLine();
                    System.out.println("Introduzca el tipo de la nueva habitación: ");
                    tipo = scanner.nextLine();
                    habitación.tipo = tipo;
                    System.out.println("Introduzca número de camas de la nueva habitación: ");
                    numeroCamas = scanner.nextInt();
                    habitación.numeroCamas = numeroCamas;
                    System.out.println("Introduzca el coste por día de la nueva habitación: ");
                    costePorDia = scanner.nextDouble();
                    habitación.costePorDia = costePorDia;
                    scanner.nextLine();
                    habitaciones.add(habitación);

                    break;
                case 6:
                    System.out.println("Introduzca el id de la habitación a eliminar: ");
                    idCliente = scanner.nextInt();
                    if (habitaciones.isEmpty()) {
                        System.out.println("No hay habitaciones para borrar...");
                    } else {

                        for (Habitacion clienteABorrar : habitaciones) {
                            if (clienteABorrar.idHabitacion == idCliente) {
                                habitación = clienteABorrar;

                            }
                        }

                        habitaciones.remove(habitación);
                    }

                    break;
                case 7:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para mostrar...");
                    } else {
                        for (Cliente habitaciónAMostrar : clientes) {
                            System.out.println("ID: " + habitaciónAMostrar.idCliente);
                            System.out.println("Nombre: " + habitaciónAMostrar.nombre);
                            System.out.println("Apellidos: " + habitaciónAMostrar.apellidos);
                            System.out.println("DNI: " + habitaciónAMostrar.DNI);
                            System.out.println("Número de teléfono: " + habitaciónAMostrar.numeroTelefono);
                            System.out.println("");
                        }
                    }

                    break;
                case 8:
                    if (empleados.isEmpty()) {
                        System.out.println("No hay profesores para mostrar...");
                    } else {

                        for (Empleado empleadoAMostrar : empleados) {
                            System.out.println("ID: " + empleadoAMostrar.idEmpleado);
                            System.out.println("Nombre: " + empleadoAMostrar.nombre);
                            System.out.println("Apellidos: " + empleadoAMostrar.apellidos);
                            System.out.println("DNI: " + empleadoAMostrar.DNI);
                            System.out.println("Número de teléfono: " + empleadoAMostrar.numeroTelefono);
                            System.out.println("");
                        }
                    }

                    break;
                case 9:
                    if (habitaciones.isEmpty()) {
                        System.out.println("No hay habitaciones para mostrar...");
                    } else {

                        for (Habitacion claseAMostrar : habitaciones) {
                            System.out.println("ID: " + claseAMostrar.idHabitacion);
                            System.out.println("Tipo: " + claseAMostrar.tipo);
                            System.out.println("Número de camas: " + claseAMostrar.numeroCamas);
                            System.out.println("Coste por día: " + claseAMostrar.costePorDia);
                            System.out.println("");
                        }
                    }

                    break;
                case 10:
                    System.out.println("Cerrando el programa...");

                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }
}
