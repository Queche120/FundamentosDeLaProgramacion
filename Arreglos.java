/*-----Vectores o arreglos de una linea-------- */

programa ListadoDeAlumnos
inicio
    var string alumnos[200]
    var integer i = 1

    mientras i<=200 hacer
        mostrar: "ingrese alumno nro " + i
        ingresar: alumnos[i]
        i = i+1
    fin mientras

    mostrar: "ingrese nro del alumno a mostrar "
    ingresar: i
    si i>=1 Y i<=200 entonces 
        mostrar: alumno[i]
    sino
        mostrar: "Posición incorrecta"
    fin si

    mostrar: "muchas gracias, hasta luego"

fin

/*--------Matrices o doble dimension--------- */

programa Goleadores
inicio
    var string goleador [10][3]
    //col1: nombre del jugador
    //col2: cantidad de goles de jugada
    //col3: cantidad de goles de penal
    var integer i = 1
/*
    goleador [1][1] = "Juanfer"
    goleador [1][2] = "5"
    goleados [1][2] = "2"

    goleador [2][1] = "Juanfer"
    goleador [2][2] = "5"
    goleados [2][2] = "2"
*//*
    mientras i<10 hacer 
        mostrar: "ingrese el nombre"
        ingresar: goleador[i][1]
        mostrar: "ingrese los goles de jugada"
        ingresar: goleador[i][2]
        mostrar: "ingrese los goles de penal"
        ingresar: goleador[i][3]
        i=i+1
    fin mientras
*/
    mientras i<=10 hacer
        j=1
        mientras j<=3 hacer
            mostrar: "ingrese el valor de la columna "+j
            ingresar: goleador[i][j]

            j=j+1
        fin mientras

        i=i+1
    fin mientras

fin