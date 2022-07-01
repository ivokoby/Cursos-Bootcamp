// While

var numeroWhile=1;

while (numeroWhile < 3) {
    numeroWhile++;
    return numeroWhile;
}

// Do While

do {
    numeroWhile++;
    return numeroWhile;
    
} while (numeroWhile<3);


// If

var numeroIf = 0;

if (numeroIf>0) {
    return "Es positivo"
}
else if (numeroIf<0){
    return "Es negativo"
}   
else {
    return "Es 0"
}

// For

var numeroFor = 0;

for (var i=0; i<3; i++){
    numeroFor += 1;
    return numeroFor;
}

// Switch

var estacion = "otoño";
        switch(estacion) {
            case "verano":
                return "Estamos en verano";
                break;
            case "invierno":
                return "Estamos en invierno";
                break;
            case "primavera":
                return "Estamos en primavera";
                break;
            case "otoño":
                return "Estamos en otoño";
                break;
            default:
                return "No es una estación";
        }
    

