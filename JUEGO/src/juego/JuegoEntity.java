/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.io.Serializable;

/**
 *
 * @author ep682
 */
public class JuegoEntity implements Serializable{

    /**
     * @return the PuntajeJugador1
     */
    public int getPuntajeJugador1() {
        return PuntajeJugador1;
    }

    /**
     * @param PuntajeJugador1 the PuntajeJugador1 to set
     */
    public void setPuntajeJugador1(int PuntajeJugador1) {
        this.PuntajeJugador1 = PuntajeJugador1;
    }

    /**
     * @return the PuntajeJugador2
     */
    public int getPuntajeJugador2() {
        return PuntajeJugador2;
    }

    /**
     * @param PuntajeJugador2 the PuntajeJugador2 to set
     */
    public void setPuntajeJugador2(int PuntajeJugador2) {
        this.PuntajeJugador2 = PuntajeJugador2;
    }

    /**
     * @return the NumeroPartidas
     */
    public int getNumeroPartidas() {
        return NumeroPartidas;
    }

    /**
     * @param NumeroPartidas the NumeroPartidas to set
     */
    public void setNumeroPartidas(int NumeroPartidas) {
        this.NumeroPartidas = NumeroPartidas;
    }
    
   private int PuntajeJugador1;
   private int PuntajeJugador2;
   private int NumeroPartidas;
}
