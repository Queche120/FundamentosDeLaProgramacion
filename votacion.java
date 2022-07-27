//AUTOR: José Ignacio Monzón
//DESCRIPCION: Actividad extra conteo de votos
//FECHA: 07/05/2022

programa: ConteoDeVotos
inicio

    //Emilio entiendo que las variables totalA totalB totalC, es un error de concepto hacerlas globales
    // ya que por regla son modificadas por una sola funcion, pero me resulta más facil para comprender el
    // programa, ya que son requeridas por las demas funciones.

    var integer totalA = 0
    var integer totalB = 0
    var integer totalC = 0
    const string partidosPoliticos[3]

    partidosPoliticos[1] = "PartidoA"
    partidosPoliticos[2] = "PartidoB"
    partidosPoliticos[3] = "PartidoC"

    
    funcion principal()
        var string rtdo = ""
        mostrar: "Bienvenidos al Votatron 2.0"

        // Aca directamente invoco las funciones, me hubiese gustado poner opciones pero como la consigna era
        // que se ejecute de una vez lo planteo así.

        contar()
        total()

        //Acá le agrego una funcion para determinar el ganador de la mesa
        rtdo = ganadaor()
        mostrar: rtdo

        mostrar: "Muchas gracias hasta la proxima"
    fin funcion

    funcion contar()
        var string voto = ""
        const integer mensaje = "Ingrese voto según sea partido A, B o C. Para finalizar recuento ingrese F"

        //Aca suponemos que se abre el sobre de la urna y van ingresar el voto partido A, B o C
        mostrar: mensaje
        ingresar: voto

        mientras voto != "F" hacer
            si voto = "A" entonces
                totalA = totalA + 1
            sino si voto = "B" entonces
                totalB = totalB + 1
            sino si voto = "C" entonces
                totalC = totalC + 1
            sino
                mostrar: "Error en parametro"
                contar()
            fin si

            mostrar: mensaje
            ingresar: voto
        fin mientras
    fin funcion

    funcion total()
        mostrar: "El Resultado de la Mesa X fue:"
        mostrar: partidosPoliticos[1] + totalA + "votos"
        mostrar: partidosPoliticos[2] + totalB + "votos"
        mostrar: partidosPoliticos[3] + totalC + "votos"

    fin funcion

    funcion string ganador()
        var string rtdo = ""

        si totalA > totalB Y totalA > totalC entonces
            rtdo = "El ganador es" + partidosPoliticos[1]
        sino si totalB > totalA Y totalB > totalC entonces
            rtdo = "El ganador es" + partidosPoliticos[2]
        sino si totalC > totalA Y totalC > totalB entonces
            rtdo = "El ganador es" + partidosPoliticos[3]
        sino 
            rtdo = "no hay ganador, hay empate"
        fin si

        retornar: rtdo
    fin funcion

        

fin