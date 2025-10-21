const API_URL = "http://localhost:8181/api";

  async function cargarEquipos() {
    try {
      const resp = await fetch(`${API_URL}/equipos`);
      if (!resp.ok) throw new Error("Error al obtener equipos");

      const equipos = await resp.json();
      const select = document.getElementById("equipoSelect");
      select.innerHTML = '<option value="">-- Todos los equipos --</option>';

      equipos.forEach(eq => {
        const option = document.createElement("option");
        option.value = eq.nombre;
        option.textContent = eq.nombre;
        select.appendChild(option);
      });
    } catch (err) {
      console.error("❌ No se pudieron cargar los equipos:", err);
    }
  }

  async function cargarJugadores(equipo = null) {
    try {
      const endpoint = equipo ? `/jugadores/equipo/${encodeURIComponent(equipo)}` : "/jugadores";
      const resp = await fetch(`${API_URL}${endpoint}`);
      if (!resp.ok) throw new Error("Error al obtener jugadores");

      const jugadores = await resp.json();
      const tbody = document.querySelector("#tablaJugadores tbody");
      tbody.innerHTML = "";

      if (jugadores.length === 0) {
        tbody.innerHTML = `<tr><td colspan="3">No se encontraron jugadores.</td></tr>`;
        return;
      }

      jugadores.forEach(j => {
        const fila = `
          <tr>
            <td>${j.nombre}</td>
            <td>${j.posicion || "N/A"}</td>
            <td>${j.equipo}</td>
          </tr>
        `;
        tbody.insertAdjacentHTML("beforeend", fila);
      });
    } catch (err) {
      console.error("❌ No se pudieron cargar los jugadores:", err);
    }
  }

  // === EVENTOS ===
  document.addEventListener("DOMContentLoaded", async () => {
    await cargarEquipos();
    await cargarJugadores();

    document.getElementById("equipoSelect").addEventListener("change", async (e) => {
      const equipo = e.target.value;
      await cargarJugadores(equipo);
    });

    document.getElementById("btnJugadores").addEventListener("click", () => cargarJugadores());
    document.getElementById("btnEquipos").addEventListener("click", () => alert("Vista de equipos próximamente 🏀"));
  });
