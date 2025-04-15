let carrito = [];
let total = 0;

function agregarAlCarrito(nombre, precio){
    carrito.push({nombre, precio});
    total += precio;
    actualizarCarrito();
}

function actualizarCarrito(){
    const lista = document.getElementById("lista-carrito");;
    const totalSpan = document.getElementById("total");

    lista.innerHTML = "";

    carrito.forEach((item, index) => {
        const li =document.createElement("li");
        li.textContent = `${item.nombre} - $${item.precio}`;
        lista.appendChild(li);
    });

    totalSpan.textContent = total;
}