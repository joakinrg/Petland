const wrapper = document.querySelector('.wrapper');
const loginlink = document.querySelector('.login-link');
const registerlink = document.querySelector('.register-link');
const btnpopup = document.querySelector('.btn-login');
const iconClose = document.querySelector('.icon-close');

registerlink.addEventListener('click', ()=>{
    wrapper.classList.add('active');
});
loginlink.addEventListener('click', ()=>{
    wrapper.classList.remove('active');
});
btnpopup.addEventListener('click', ()=>{
    wrapper.classList.add('active-popup');
});
iconClose.addEventListener('click', ()=>{
    wrapper.classList.remove('active-popup');
});

//validacion login
if(localStorage.getItem('user')){
    //JSON object
    let obj = JSON.parse(localStorage.getItem('user'))
    document.getElementById('username').value = obj.username
    document.getElementById('password').value = obj.password
}
let form = document.getElementById('form')
document.getElementById('login').addEventListener('click', (e) => {
    e.preventDefault()
    let username = document.getElementById('username').value
    let password = document.getElementById('password').value
    let user = {
        username:username,
        password:password
    }
    //local storage
    localStorage.setItem('user', JSON.stringify(user))
    console.log(JSON.stringify(user))

    alert("Tus datos se han guardado localmente :D")
})
document.getElementById('clear').addEventListener('click', ()=>{
    localStorage.clear()
})

var emailfield = document.getElementById("username");
var emaillabel = document.getElementById("email-label");
var emailerror = document.getElementById("email-error");

function validateemail(){
    if(!emailfield.value.match(/^[A-Za-z\._\-0-9]*[@][A-Za-z]*[\.][a-z]{2,4}$/)){
        emailerror.innerHTML = "Por favor introduce un email valido";
        return false;
    }
}