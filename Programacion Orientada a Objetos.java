clase Mes
    //atributos
    String nombre nuevaInstancia String()
    Integer cantidadDeDia nuevaInstancia Integer()

    //metodos
    metodo asignarElNombre(String nombreNuevo)
        si nombreNuevo != "" entonces
            nombre = nombreNuevo
        sino
            ingresar: nombre
        fin si
    fin metodo

    metodo mostrarMetodo()
        mostrar: nombre
    fin metodo

    metodo Mes()
        nombre = ""
        cantidadDeDia = 0
    fin metodo


fin class

clase MesTest
    metodo MesTest()
        Mes mes1 nuevaInstancia Mes()
        Mes mes2 nuevaInstancia Mes()
        Mes mes3 nuevaInstancia Mes()

        //OBJ.ATRIBUTOS
        mes1.cantidadDeDia = 31   //acceso directo (modificando directamente el atributo)
        //OBJ.METODOS
        mes1.asignarElNombre("enero")  //acceso indirecto (pasando por un metodo)
        mes2.asignarElNombre("febrero")

    fin metodo
fin clase

/* 
String: clase (tipo de dato)
nombre: objeto
nuevaInstancia: palabra reservada
String(): metodo constructor
*/





//-------------------Modificadores de acceso------------------------


clase Torneo 

    privado Strging nombre nuevaInstancia String()

    metodo publico Torneo()
    fin

    metodo publico cambiarNombre(nuevoNombre)
        nombre = nuevoNombre
    fin metodo

fin clase 


clase CrearTorneo

    privado Torneo amateur nuevaInstancia torneo()

    metodo publico CrearTorneo()
        //amateur.nombre = "asas" ERROR!
        amateur.cambiarNombre("Torneo de amigo")
    fin metodo

fin clase



//-----------------------Herencia--------------------------------
/* La herencia la recibe la clase hija. Heredando los atributos y los metodos de la clase padre. 
    logrando utilizar todas sus caracteristicas y operar con ellas*/

clase Torneo 

    privado Strging nombre nuevaInstancia String()
    protegido String superficie nuevaInstancia String()

    metodo publico Torneo()
    fin

    metodo publico cambiarNombre(nuevoNombre)
        nombre = nuevoNombre
    fin metodo

fin clase 


clase publica Futbol5
    metodo publico Futbol5()
        superficie = "sintetico"
        //nombre = "Pedro" ERROR! 
        //cambiarNombre("Pedro") 
    fin metodo

    metodo publico Futbol5(String nombreNuevo)
            superficie = "sintetico"
            cambiarNombre(nombreNuevo)
    fin metodo
fin clase

clase publica Tenis
    metodo publico Tenis()
        superficie = "carpeta"
    fin metodo
fin clase


clase CrearTorneo

    privado Futbol5 amateur nuevaInstancia Futbol5()
    privado Futbol5 deLaAFA nuevaInstancia Futbol5("Torneo local")
    privado Tenis semiPro nuevaInstancia Tenis()

    metodo publico CrearTorneo()
        amateur.cambiarNombre("Torneo de amigo")
        semiPro.cambairNombre("Copa Cavana")
    fin metodo

fin clase



/*------------------------------Interface-------------------------------- */

interface publica FIFA
    metodo publico cantidadDeMiembros()
    metodo publico String obtenerNombre()
fin interface


clase publica UEFA implementa FIFA
    privado Integer miembros nuevaInstancia Integer()

    metodo publico cantidadDeMiembros()
        miembros = 56
    fin metodo

    metodo publico String obtenerNombre()
        retornar: "UEFA"
    fin metodo
fin clase

clase publica CONMEBOL implementa FIFA
    privado Integer miembros nuevaInstancia Integer()

    metodo publico cantidadDeMiembros()
        miembros = 13
    fin metodo

    metodo publico String obtenerNombre()
        retornar: "CONMEBOL"
    fin metodo
fin clase





/*---------------------------Clases asbtractas-------------------------------- */

interface publica FIFA  //Tiene la firma de los metodos
    metodo publico cantidadDeMiembros()
    metodo publico String obtenerNombre()
fin interface


clase publica UEFA implementa FIFA
    privado Integer miembros nuevaInstancia Integer()

    metodo publico cantidadDeMiembros()
        miembros = 56
    fin metodo

    metodo publico String obtenerNombre()
        retornar: "UEFA"
    fin metodo
fin clase

clase publica abstract CONMEBOL implementa FIFA //Tiene metodos implementados
    privado Integer miembros nuevaInstancia Integer()

    metodo publico cantidadDeMiembros()
        miembros = 13
    fin metodo

    metodo publico String obtenerNombre()
        retornar: "CONMEBOL"
    fin metodo
fin clase




/*---------------------------Polimorfismo-------------------------------- */



interface publica FIFA  //Tiene la firma de los metodos
    metodo publico cantidadDeMiembros()
    metodo publico String obtenerNombre()
fin interface


clase publica UEFA implementa FIFA
    privado Integer miembros nuevaInstancia Integer()

    metodo publico cantidadDeMiembros()
        miembros = 56
    fin metodo

    metodo publico String obtenerNombre()
        retornar: "UEFA"
    fin metodo
fin clase

clase publica abstract CONMEBOL implementa FIFA //Tiene metodos implementados
    privado Integer miembros nuevaInstancia Integer()

    metodo publico cantidadDeMiembros()
        miembros = 13
    fin metodo

    metodo publico String obtenerNombre()
        retornar: "CONMEBOL"
    fin metodo
fin clase

clase publica pertenece
    metodo publico pertenece()
        FIFA afa nuevaInstancia CONMEBOL()
        FIFA fff nuevaInstancia UEFA()
    fin metodo 
fin clase



// CASTING O CASTEO

calse publica Comparador
    metodo publico Comparador()
        String ValorS nuevaInstancia String()
        Integer valorN nuevaInstancia Integer()

        valorS = "100"
        valorN = 100

        mostrar: (String)valorN

        mostrar: valorS + 1
fin clase