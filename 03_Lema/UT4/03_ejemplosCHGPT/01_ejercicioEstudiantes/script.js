let estudiantes = [];
document.getElementById("nombre").addEventListener("submit", function(e){
    e.preventDefault();

    const nombre = document.getElementById("nombre").value;
    const edad = document.getElementById("edad").value;
    const promedio = parseFloat(document.getElementById("promedio").value);

    estudiantes.push({nobre, edad, promedio});

    document.getElementById("formularioEstudiante").reset();
    document.getElementById("resultado").textContent = "Estudiante agregado";    
});

