
/*-----------------Funciones-------------------------------*/

programa AireAcondicionado
inicio
    funcion principal()
        var integer opcion = 0

        mostrar: "bienvenido - ingrese opcion"
        ingrese: opcion

        si opcion = 1 entonces
            prender()
        sino si opcion = 2 entonces
            apagar()
        sino 
            mostrar: "error"
            principal()  //funcion recorsiva (vuelve a empezar)
        fin si
    fin funcion

    funcion auxiliar()
        mostrar: "continua prendido"
    fin funcion

    funcion encender()
        mostrar: "encendido"
        auxiliar()
    fin funcion

    funcion apagar()
        mostrar: "apagado"
    fin funcion
fin


/*--------------------------Funciones con parametros-------------------------- */


programa AireAcondicionado
inicio
//*NO tener variables globales y locales de una funcion con el mismo nombre
//*SI tener variables locales en dos funciones dif
//*La funcion PRINCIPAL no lleva parametros 
inicio
    funcion principal()
        var integer opcion = 0
        var integer temperatura = 0

        mensaje = "hasta luego"

        mostrar: "bienvenido - ingrese opcion"
        ingresar: opcion

        ingresar: temperatura

        si opcion = 1 entonces
            encender(temperatura, "grados")
        sino si opcion = 2 entonces
            apagar()
        sino 
            mostrar: "error"
            principal()  //funcion recorsiva (vuelve a empezar)
        fin si
    fin funcion

    funcion auxiliar()
        mostrar: "continua prendido"
    fin funcion

    funcion encender(integer t, string medida)
        mostrar: "encendido a " + t + medida
        auxiliar()
    fin funcion

    funcion apagar()
        mostrar: "apagado"
    fin funcion
fin



/*----------------Funcinoes con retorno------------------- */
inicio
    funcion principal()
        mostrar: nombreRegistrado()
    
    funcion string nombreRegistrado()
        var string nombre = ""
        mostrar: "ingrese el nombre de la persona"
        ingresar: nombre

        retornar: nombre
    fin funcion

    
fin






/*SI son mas de 2 o 3 las funciones que afectan una variable
es recomendable hacerla global
SIOSI una funcion va a modificar 1 variable entonces tiene que
ser local

*/