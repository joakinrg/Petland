const Letra = (event) => {
    const char = event.keyCode;
    return (char > 64 && char < 91) || (char > 96 && char < 123) || char == 8;
};

const Numero = (event) => {
    const teclado = event.which || event.keyCode;
    if (teclado == 8) return true;
    const letras = /[0-9\d{10} .]/;
    const cadena = String.fromCharCode(teclado);
    return letras.test(cadena);
};

const Telefono = (event) => {
    const teclado = event.which || event.keyCode;
    if (teclado == 8) return true;
    const input = event.target;
    if (input.value.length >= 8) {
        event.preventDefault();
        return false;
    }
    const letras = /[0-9\d{10} .]/;
    const cadena = String.fromCharCode(teclado);
    return letras.test(cadena);
};

const Email = (event) => {
    const char = String.fromCharCode(event.keyCode);
    const letras = /[A-Za-z0-9.@_-]/;
    return letras.test(char);
};

const RFC = (event) => {
    const char = String.fromCharCode(event.keyCode);
    const letras = /^[a-zA-Z0-9]*$/;
    return letras.test(char);
};

const Password = (event) => {
    const char = String.fromCharCode(event.keyCode);
    const letras = /^[a-zA-Z0-9]*$/;
    return letras.test(char);
};
