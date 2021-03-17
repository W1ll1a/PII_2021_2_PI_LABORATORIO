package hn.edu.ujcv.pii.p2;

import hn.edu.ujcv.pii.p2.Objetos.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;


public class Main {

    static listaAlumnos alumnosList = new listaAlumnos();
    static listaCatedratico catedraticolist = new listaCatedratico();
    static listaCampus ListaDeCampus = new listaCampus();
    static listaCarreras listaDeCarreras = new listaCarreras();
    static listaClases listaDeClases = new listaClases();
    static listaPeriodo listaDePeriodos = new listaPeriodo();

    public static void main(String[] args) {
        // write your code here
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("*****************************");
            System.out.println("        Menu principal           ");
            System.out.println("*****************************");
            System.out.println("1.Alumno\n2.Catedratico\n3.Campus\n" +
                    "4.Historial\n5.Carrera\n6.Clase\n7.Periodo\n0.Salir");
            System.out.println("********opcion********");
            opcion = teclado.nextInt();
            System.out.println("***********************");
            menuPrincipal(opcion);
        } while (opcion != 0);
    }

    public static void menuPrincipal(int opcion) {
        try {
            switch (opcion) {
                case 1: {
                    menuAlumno();
                    break;
                }
                case 2: {
                    menuCatedratico();
                }
                break;
                case 3: {
                    menuCampus();
                }
                break;
                case 4:
                    menuHistorial();
                    break;
                case 5:
                    menuCarrera();
                    break;
                case 6:
                    menuClases();
                    break;
                case 7:
                    menuPeriodo();
                    break;
                case 0:
                    System.out.println("Tenga un buen dia ");
                    break;
                default:
                    System.out.println("No es una de las opciones.");
                    break;
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e.getMessage());
        }
    }

    public static void menuClases() {
        Clase clase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("**************Menu de Clases**************** ");
        System.out.println("1.Agregar nueva Clase\n2.Enlistar Clase\n");
        System.out.println("************opcion************");
        int opcion = teclado.nextInt();
        System.out.println("******************************");
        try {
            switch (opcion) {
                case 1:
                    clase = new Clase();
                    System.out.println("Nombre de la Clase");
                    String nombre = teclado.next();
                    clase.setNombre(nombre);
                    System.out.println("Id Clase ");
                    int id = teclado.nextInt();
                    clase.setId(id);
                    System.out.println("Nota de Acumulativo primer parcial ");
                    int notaAcum1 = teclado.nextInt();
                    clase.setNotaAcumulativo1(notaAcum1);
                    System.out.println("Nota de Acumulativo segundo parcial ");
                    int notaAcum2 = teclado.nextInt();
                    clase.setNotaAcumulativo2(notaAcum2);
                    System.out.println("Nota de Acumulativo tercer parcial ");
                    int notaAcum3 = teclado.nextInt();
                    clase.setNotaAcumulativo3(notaAcum3);
                    System.out.println("Nota de Examen ");
                    int examen = teclado.nextInt();
                    clase.setNotaExamen(examen);
                    System.out.println("Nota Reposicion");
                    int notaRepo = teclado.nextInt();
                    clase.setNotarecuperacion(notaRepo);
                    System.out.println("Unidades valorativas ");
                    int unidades = teclado.nextInt();
                    clase.setUnidadesValorativas(unidades);
                    listaDeClases.addClase(clase);
                    listaDeClases.addClase(clase);
                    break;
                case 2:
                    listaDeClases.imprimirLista();
                    System.out.println("*******************");
                    break;
                default:
                    System.out.println("No es una de las opciones");
                    break;

            }

        } catch (Exception e) {
            System.err.println("ERROR " + e.getMessage());
        }

    }

    public static void menuPeriodo() throws ParseException {
        Scanner teclado = new Scanner(System.in);
        Periodo periodo;
        int opcion;
        System.out.println("Menu periodo");
        System.out.println("1.agregar\n2.enlistar\n");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1: {
                periodo = new Periodo();
                System.out.println("Descripcion");
                String descripcion = teclado.next();
                periodo.setDescripcion(descripcion);
                System.out.println("Id del periodo");
                int id = teclado.nextInt();
                periodo.setId(id);
                System.out.println("Fecha de inicio ");
                String SfechaInicio = teclado.next();
                Date fechaDeInicio = new SimpleDateFormat("dd/MM/yyyy").parse(SfechaInicio);
                periodo.setFechaInicio(fechaDeInicio);
                System.out.println("Fecha que finaliza");
                String SfechaFin = teclado.next();
                Date fechaDeFinalizacion = new SimpleDateFormat("dd/MM/yyyy").parse(SfechaFin);
                periodo.setFechafin(fechaDeFinalizacion);
                listaDePeriodos.Addperiodo(periodo);
            }
            break;
            case 2: {
                listaDePeriodos.imprimirLista();
                break;
            }
            default:
                System.out.println("No es parte de las opciones. ");
                break;
        }
    }

    public static void menuCarrera() {
        Carrera carrera;
        Scanner teclado = new Scanner(System.in);
        System.out.println("**************Menu de Carreras**************** ");
        System.out.println("1.Agregar nueva Carrera\n2.Enlistar Carrera");
        System.out.println("************opcion************");
        int opcion = teclado.nextInt();
        System.out.println("******************************");
        try {
            switch (opcion) {
                case 1:
                    carrera = new Carrera();
                    System.out.println("Nombre de la carrera");
                    String nombre = teclado.next();
                    carrera.setNombre(nombre);
                    System.out.println("Id Carrera ");
                    int id = teclado.nextInt();
                    carrera.setId(id);
                    listaDeCarreras.addCarrera(carrera);
                    break;
                case 2:
                    listaDeCarreras.imprimirLista();
                    System.out.println("*******************");
                    break;
                default:
                    System.out.println("No es una de las opciones");
                    break;
            }

        } catch (Exception e) {
            System.err.println("ERROR " + e.getMessage());
        }
    }

    public static void menuAlumno() {
        Alumno alumno;
        Scanner teclado = new Scanner(System.in);
        System.out.println("**************Menu de Alumnos**************** ");
        System.out.println("1.Agregar nuevo alumno\n2.Enlistar Alumnos");
        System.out.println("************opcion************");
        int opcion = teclado.nextInt();
        System.out.println("******************************");
        try {
            switch (opcion) {
                case 1: {
                    alumno = new Alumno();
                    System.out.println("Nombre");
                    String nombre = teclado.next();
                    alumno.setNombre(nombre);
                    System.out.println("Id");
                    String Sid = teclado.next();
                    long id = Long.parseLong(Sid);
                    alumno.setId(id);
                    System.out.println("Cuenta");
                    String Scuenta = teclado.next();
                    Long cuenta = Long.parseLong(Scuenta);
                    alumno.setCuenta(cuenta);
                    System.out.println("Fecha de nacimiento");
                    String Sdate = teclado.next();
                    Date fechaDenacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(Sdate);
                    alumno.setFechaDeNacimiento(fechaDenacimiento);
                    alumnosList.addAlumno(alumno);
                    System.out.println("*************************");
                    break;
                }

                case 2: {
                    alumnosList.imprimirLista();
                    System.out.println("**********************");
                    break;
                }
                default:
                    System.out.println("No es opcion valida.");
                    break;
            }

        } catch (Exception e) {
            System.err.println("ERROR " + e.getMessage());
        }
    }

    public static void menuCatedratico() {
        Catedratico catedratico = new Catedratico();
        Scanner teclado = new Scanner(System.in);
        System.out.println("**************Menu de Catedratico**************** ");
        System.out.println("1.Agregar nuevo catedratico\n2.Enlistar catedraticos");
        System.out.println("************opcion************");
        int opcion = teclado.nextInt();
        System.out.println("******************************");
        try {
            switch (opcion) {
                case 1: {
                    catedratico = new Catedratico();
                    System.out.println("Nombre");
                    String nombre = teclado.next();
                    catedratico.setNombre(nombre);
                    System.out.println("Id");
                    String Sid = teclado.next();
                    long id = Long.parseLong(Sid);
                    catedratico.setId(id);
                    System.out.println("Codigo");
                    int codigo = teclado.nextInt();
                    catedratico.setCodigo(codigo);
                    System.out.println("Fecha de nacimiento");
                    String Sdate = teclado.next();
                    Date fechaDenacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(Sdate);
                    catedratico.setFechaDeNacimiento(fechaDenacimiento);
                    catedraticolist.addCatedratico(catedratico);
                    System.out.println("*************************");
                    break;
                }
                case 2: {
                    catedraticolist.imprimirLista();
                    System.out.println("**********************");
                    break;
                }
                default:
                    System.out.println("No es opcion valida.");
                    break;
            }
        } catch (Exception e) {
            System.err.println("ERROR " + e.getMessage());
        }

    }


    public static void menuCampus() throws ParseException {
        Campus campus;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("*******Menu Catedratico*********");
        System.out.println("1.Agregar campus\n2.Lista de campus");
        System.out.println("******opcion*********");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1: {
                campus = new Campus();
                System.out.println("Nombre del campus");
                String nombreCampus = teclado.next();
                campus.setNombre(nombreCampus);
                System.out.println("Direccion del campus");
                String direccion = teclado.next();
                campus.setDireccion(direccion);
                System.out.println("id Del campus");
                int Id = teclado.nextInt();
                campus.setId(Id);
                System.out.println("Fecha de inicio");
                String Sdate = teclado.next();
                Date fechaDeInicio = new SimpleDateFormat("dd/MM/yyyy").parse(Sdate);
                campus.setFechaDeInicio(fechaDeInicio);
                ListaDeCampus.addCampus(campus);
            }
            break;
            case 2:
                ListaDeCampus.imprimirLista();
                System.out.println("***************");
                break;
            default:
                System.out.println("No era parte de las opciones ");
                break;
        }
    }

    public static Alumno buscarAlumno(long numeroDeCuenta) {
        for (Alumno elemento : alumnosList) {
            if (numeroDeCuenta == elemento.getCuenta()) {
                return elemento;
            }
        }
        System.out.println("No se encontro alumno con esa cuenta");
        return null;
    }
    public static Catedratico buscarCatedratico (int codigo){
        for (Catedratico elemento : catedraticolist) {
            if (codigo == elemento.getCodigo()) {
                return elemento;
            }
        }
        System.out.println("No se encontro catedratico con ese codigo.");
        return null;
    }
    public static Campus buscarCampus(int id ){
        for (Campus elemento : ListaDeCampus) {
            if (id == elemento.getId()) {
                return elemento;
            }
        }
        System.out.println("No se encontro campus con ese Id");
        return null;
    }
    public static Carrera buscarCarrera(int id ){
        for (Carrera elemento : listaDeCarreras) {
            if ( id == elemento.getId()) {
                return elemento;
            }
        }
        System.out.println("No se encontro carrera con ese id");
        return null;
    }
    public static Clase buscarClase (int id){
        for (Clase elemento : listaDeClases) {
            if (id == elemento.getId()) {
                return elemento;
            }
        }
        System.out.println("No se encontro clase con ese codigo");
        return null;
    }
    public static Periodo buscarPeriodo (int id){
        for (Periodo elemento : listaDePeriodos) {
            if (id == elemento.getId()) {
                return elemento;
            }
        }
        System.out.println(" no se encontro periodo con ese Id");
        return null;
    }

    public static void menuHistorial() {
        Historial historial = new Historial();
        Scanner teclado = new Scanner(System.in);
        System.out.println("********menu Historial **********");
        System.out.println("1.Alumno\n2.Campus\n3.Carreras\n"+
                "4.Periodos\n5.Clases\n");
        int opcion = teclado.nextInt();
        try {
            switch (opcion) {
                case 1: {
                    alumnosList.imprimirLista();
                    System.out.println("***********************");
                    System.out.println("Cuenta del alumno que quieren en el historial ");
                    System.out.println("************************");
                    long cuenta = teclado.nextLong();
                    historial.setAlumno(buscarAlumno(cuenta));
                }
                break;

                case 2: {
                    ListaDeCampus.imprimirLista();
                    System.out.println("*************************");
                    System.out.println("Id del Campus que desea buscar ");
                    int idDelCampus = teclado.nextInt();
                    historial.setCarrera(buscarCarrera(idDelCampus));

                }
                break;
                case 3: {
                    //carreras
                        listaDeCarreras.imprimirLista();
                    System.out.println("*********************");
                        System.out.println("Id de la carrera que desea buscar ");
                        int idDeCarrera = teclado.nextInt();
                        historial.setCarrera(buscarCarrera(idDeCarrera));
                    }
                    break;

                case 4: {
                    //Catedraticos
                    listaDePeriodos.imprimirLista();
                    System.out.println("********************");
                    System.out.println("Id del Periodo que desea buscar ");
                    int idDePeriodo = teclado.nextInt();
                    historial.setPeriodo(buscarPeriodo(idDePeriodo));
                    break;
                }
                case 5: {
                    //Clases
                    listaDeClases.imprimirLista();
                    System.out.println("*********************");
                    System.out.println("Id de la clase que desea buscar ");
                    int idDeClase = teclado.nextInt();
                    listaDeClases.addClase(buscarClase(idDeClase));
                    historial.setClase(listaDeClases);
                }
                break;

                default: {
                    System.out.println("No era parte de las opciones.");
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e.getMessage());
        }
    }


}


