package unlam.concesionaria;

import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Vehiculo[] vehiculos = null;
		Cliente[] clientes = null;
		Vendedor[] vendedores = null;
		int opcion;
		int opcionPrincipal;
		do {
			System.out.println("----------------------Inicializacion de BD Concensionaria ------------------");
			System.out.println("1- Ingresar los Vehiculo a la concesionaria");
			System.out.println("2- Ingresar los Clientes a la concesionaria");
			System.out.println("3- Ingresar los Vendedores a la concesionaria");
			System.out.println("0- Salir");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Ingrese la cantidad de autos que quiere ingresar a la concecionaria \n");
				int cantidadAutos = teclado.nextInt();
				int cantidadIngresados = 0;
				vehiculos = new Vehiculo[cantidadAutos];
				while (cantidadAutos != cantidadIngresados) {
					Vehiculo vehiculo = new Vehiculo();
					System.out.println("Ingrese la marca del vehiculo \n");
					String marca = teclado.next();
					System.out.println("Ingrese el modelo del vehiculo \n");
					String modelo = teclado.next();
					System.out.println("Ingrese el color del vehiculo \n");
					String color = teclado.next();
					System.out.println("Ingrese la cantidad de años del vehiculo \n");
					int año = teclado.nextInt();
					System.out.println("Ingrese el precio del vehiculo \n");
					float precio = teclado.nextFloat();

					/* Seteamos al vehiculo sus propiedades */
					vehiculo.setMarca(marca);
					vehiculo.setModelo(modelo);
					vehiculo.setColor(color);
					vehiculo.setCantidadDeCoches(año);
					vehiculo.setPrecio(precio);
					/* Agregamos al vector */
					vehiculos[cantidadIngresados] = vehiculo;
					cantidadIngresados++;
				}
				break;

			case 2:
				System.out.println("Ingrese la cantidad de clientes que quiere ingresar a la concecionaria \n");
				int cantidadClientes = teclado.nextInt();
				int cantidadIngresadosClientes = 0;
				clientes = new Cliente[cantidadClientes];

				while (cantidadClientes != cantidadIngresadosClientes) {
					System.out.println("Ingrese el nombre del cliente \n");
					String nombre = teclado.next();
					System.out.println("Ingrese el apellido del cliente \n");
					String apellido = teclado.next();
					System.out.println("Ingrese la edad del cliente \n");
					int edad = teclado.nextInt();
					System.out.println("Es un cliente recurrente (VIP) ? Opciones =  Si/No  \n");
					String opcionVip = teclado.next();
					boolean vip = opcionVip.equals("Si") ? true : false;

					/* Seteamos al cliente y sus propiedades */
					Cliente cliente = new Cliente();
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setEdad(edad);
					cliente.setEsVip(vip);

					/* Asignamos al cliente */
					clientes[cantidadIngresadosClientes] = cliente;

					/* Alteramos el contador de clientes */
					cantidadIngresadosClientes++;
					
				}
				break;

			case 3:
				System.out.println("Ingrese la cantidad de vendedores que quiere ingresar a la concecionaria \n");
				int cantidadVendedores = teclado.nextInt();
				int cantidadIngresadosVendedores = 0;
				vendedores = new Vendedor[cantidadVendedores];

				while (cantidadVendedores != cantidadIngresadosVendedores) {
					System.out.println("Ingrese el nombre del cliente \n");
					String nombre = teclado.next();
					System.out.println("Ingrese el apellido del cliente \n");
					String apellido = teclado.next();

					/* Seteamos al cliente y sus propiedades */
					Vendedor vendedor = new Vendedor();
					vendedor.setNombre(nombre);
					vendedor.setApellido(apellido);

					/* Asignamos al cliente */
					vendedores[cantidadIngresadosVendedores] = vendedor;

					/* Alteramos el contador de clientes */
					cantidadIngresadosVendedores++;
				}

				break;
			case 0:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (opcion != 0);

		do {
			System.out.println("----------------------Menu Principal de BD Concensionaria ------------------");
			System.out.println("1- Listar los Vehiculo a la concesionaria");
			System.out.println("2- Listar los Clientes a la concesionaria");
			System.out.println("3- Listar los Vendedores a la concesionaria");
			System.out.println("4- Ejecutar Adquisicion de vehiculo");
			System.out.println("0- Fin");
			opcionPrincipal = teclado.nextInt();

			switch (opcionPrincipal) {
			case 1:
				if (vehiculos.length > 0) {
					System.out.println("Cantidad de vehiculos " + vehiculos.length);
					for (Vehiculo vehiculo : vehiculos) {
						System.out.println(vehiculo.toString());
					}
				}else {
					System.out.println("No hay vehiculos disponibles");
				}
				break;
			case 2:
				if (clientes.length > 0) {
					System.out.println("Cantidad de clientes " + clientes.length);
					for (Cliente cliente : clientes) {
						System.out.println(cliente.toString());
					}
				}else {
					System.out.println("No hay clientes disponibles cargados en el sistema");
				}
				break;
			case 3:
				if (vendedores.length > 0) {
					System.out.println("Cantidad de vendedores " + clientes.length);
					for (Vendedor vendedor : vendedores) {
						System.out.println(vendedor.toString());
					}
				}else {
					System.out.println("No hay vendedores disponibles");
				}
				break;
			case 4:
				System.out.println("No implementado jeje");
				break;
			case 0:
				System.out.println("Fin de proceso principal");
			default:
				break;
			}

		} while (opcionPrincipal != 0);

		teclado.close();
	}

}
