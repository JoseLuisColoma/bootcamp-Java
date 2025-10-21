const API_URL = "http://localhost:8181/api";

async function cargarEquipos() {
  const resp = await fetch(`${API_URL}/equipos`);
  const equipos = await resp.json();

  const tbody = document.querySelector("#tablaEquipos tbody");
  tbody.innerHTML = "";

  equipos.forEach(e => {
    tbody.innerHTML += `
      <tr>
        <td>${e.nombre}</td>
        <td>${e.abreviatura}</td>
        <td>${e.ciudad}</td>
        <td>${e.conferencia}</td>
        <td>${e.division}</td>
      </tr>`;
  });
}

document.addEventListener("DOMContentLoaded", cargarEquipos);
