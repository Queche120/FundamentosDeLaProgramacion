clase Modelos

    String modelo nuevaInstancia String()
    String color nuevaInstancia String()
    Integer cantidad nuevaInstancia Integer()

    // catalogo [1] = Mod "A" color negro
    // catalogo [2] = Mod "A" color azul
    // catalogo [3] = Mod "B" color verde
    // catalogo [4] = Mod "B" color naranja

    

fin clase

clase AplicacionTest

    metodo Menu()
        var Integer opcion = 0
        mostrar: "¡Bienvenido! ¿Que desea realizar?"
        mostrar: "1: Modificar stock"
        mostrar: "2: Buscar stock"
        ingresar: opcion

        si opcion = 1 entonces
            Modificar()
        sino si opcion = 2 entonces 
            Buscar()
        sino 
            mostrar: "Opcion no valida"
            Menu()
        fin si
    fin metodo

fin clase

clase Catalogo

    metodo Modificar()
        mostrar: "¿Que "
    fin metodo

fin clase