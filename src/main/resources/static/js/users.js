// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {
    const rawResponse = await fetch(`http://localhost:8080/usuarios`,{
      method:'GET',
      headers:{
        'Accept':'application/json',
        'Content-Type':'application/json'
      },
    });
    const usuarios = await rawResponse.json();
    console.log(usuarios);
    let usuario = '';
    usuarios.forEach(user => {
      usuario+=
      `<tr>
      <td>${user.id}</td>
      <td>${user.nombre} ${user.apellido}</td>
      <td>${user.email}</td>
      <td>${user.telefono}</td>
      <td>
          <a href="#" class="btn btn-danger btn-circle btn-sm">
              <i class="fas fa-trash"></i>
          </a>
      </td>
    </tr>`
    });
    console.log(usuario);
    document.querySelector('#usuarios tbody').outerHTML= usuario;
}
