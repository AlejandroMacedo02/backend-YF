
package com.example.yanaforun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author alejandromacedop
 */

@Entity
@Data
@Table(name = "persona_taller")
public class PersonaTaller {
    
    @Id
    @Column(name = "peta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petaId;
    
    @Column (name = "pe_estado_asistencia")
    private int petaEstadoAsistencia;
    
    @ManyToOne
    @JoinColumn(name = "pe_id")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "ta_id")
    private Taller taller;
    
}