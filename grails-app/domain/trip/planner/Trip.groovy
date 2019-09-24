package trip.planner

import org.springframework.validation.Errors

class Trip {

    static constraints = {
    }
    String destino
    String origen
    Integer hora

    String getDestino() {
        return destino
    }

    void setDestino(String destino) {
        this.destino = destino
    }

    String getOrigen() {
        return origen
    }

    void setOrigen(String origen) {
        this.origen = origen
    }

    Integer getHora() {
        return hora
    }

    void setHora(Integer hora) {
        this.hora = hora
    }
}
