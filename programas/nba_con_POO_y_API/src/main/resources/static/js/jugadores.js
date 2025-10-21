const API_URL = "http://localhost:8181/api";

async function cargarJugadores() {
  const resp = await fetch(`${API_URL}/jugadores`);
  const jugadores = await resp.json();

  const equipos = [...new Set(jugadores.map(j => j.equipo))].sort();
  const select = document.querySelector("#equipoFiltro");
  select.innerHTML = `<option value="">-- Todos los equipos --</option>` +
    equipos.map(e => `<option value="${e}">${e}</option>`).join("");

  mostrarJugadores(jugadores);

  select.addEventListener("change", () => {
    const filtro = select.value;
    const filtrados = filtro ? jugadores.filter(j => j.equipo === filtro) : jugadores;
    mostrarJugadores(filtrados);
  });
}

function mostrarJugadores(lista) {
  const tbody = document.querySelector("#tablaJugadores tbody");
  tbody.innerHTML = "";
  lista.forEach(j => {
    tbody.innerHTML += `<tr><td>${j.nombre}</td><td>${j.posicion}</td><td>${j.equipo}</td></tr>`;
  });
}

document.addEventListener("DOMContentLoaded", cargarJugadores);
