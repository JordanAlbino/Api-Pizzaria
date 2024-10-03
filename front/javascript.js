const exibicao = document.querySelector("#exibicao");

window.onload = () => {

}




const options = {
    method: 'GET',
    headers: {
        'Content-type': 'application/json',
        'Access-Control-Allow-Origin': 'http://localhost:8080',
        'Access-Control-Allow-Headers': 'Origin, X-Requested-With, Content-Type, Accept'
    }
};

fetch('http://localhost:8080/pizzas', options)
    .then(response => response.json())
    .then(response => {
        
        console.log(response);
    })
    .catch(erro => {
        console.error(erro)
    });
    