var
const

string
integer
float
double
boolean
date

programa Validacion
Inicio

    var string nombre
    nombre = ""
    var integer clave
    clave = 0

    const string nombreGuardado = "Queche120"
    const integer claveGuardada = 12499

    ingresar: nombre
    ingresar: clave

    mostrar: "el nombre y clave Ingresados son" + nombre + ";" + clave

Fin






_______ESTRUCTURA CONDICIONAL_________



/*si CONDICION entonces

    fin si*/


    CONDICIONAL SIMPLE ___________
    si nombre = nombreGuardado entonces
        mostrar = "adivinaste el nombre"
    fin si



    CONDICIONAL DOBLE ____________
     si nombre = nombreGuardado entonces
        mostrar = "adivinaste el nombre"
    sino
        mostrar = "no adivinaste"
    fin si



    CONDICIONAL COMPUESTA___________
     si nombre = nombreGuardado entonces
        mostrar = "adivinaste el nombre"
    sino si  calve = claveGuardada entonces
        mostrar: "al menos adivinaste la clave"
    sino
        mostrar = "no adivinaste"
    fin si



    CONDICIONAL ANIDADA______________
     si nombre = nombreGuardado entonces
        mostrar = "adivinaste el nombre"
        si clace = claveGuardada entonces
            mostrar: "adivinaste tambien la clave"
        fin si
    sino si  calve = claveGuardada entonces
        mostrar: "al menos adivinaste la clave"
    sino
        mostrar = "no adivinaste"
    fin si



    CONDICIONAL MULTIPLE________________
    en caso de VARIABLE(nombre) hacer
        caso nombreGuardado
            mostrar:"adviniaste el nombre"
        fin caso
        caso  "uno mas"
            mostrar:"esta mal pero no tan mal"
        fin caso
        
        caso "jose"
            mostrar:"nada que ver"
        fin caso

        sino
            mostrar:"segui participando"
    fin en caso de





    si nombre = nombreGuardado Y clave = claveGuardada entonces
        mostrar: "adivino ambas!"
    fin




----------------------*-----------------------

ESTRUCTURAS REPETITIVAS

programa Validacion
Inicio
    var string nombre
    nombre = ""
    var integer clave
    clave = 0

    const string nombreGuardado = "Pedro"
    const integer claveGuardada = 1234

    ingresar: nombre
    ingresar: clave

    (mientras CONDICION DE SALIDA hacer
    fin mientras)

    mientras calve != claveGuardada hacer
        mostrar: "La clave no coincide"
        ingresar: clave //si no se ingresa una accion de salida la funcion se hace infinita
    fin mientras
Fin


CONTADORES Y ACUMULADORES

programa Validacion
Inicio
    var integer i = 0

    var string nombre
    nombre = ""
    var integer clave
    clave = 0

    const string nombreGuardado = "Pedro"
    const integer claveGuardada = 1234

    ingresar: nombre
    ingresar: clave

    (mientras CONDICION DE SALIDA hacer
    fin mientras)

    //mientras calve != claveGuardada hacer
    mientras i < 3 hacer
        mostrar: "La clave no coincide"
        ingresar: clave //si no se ingresa una accion de salida la funcion se hace infinita
        //contador
        i = i + 1
    fin mientras

    //acumulador
    ingresar: subtotal
    total = total * subtotal

    mostrar: "se intento " + i + " veces"
Fin