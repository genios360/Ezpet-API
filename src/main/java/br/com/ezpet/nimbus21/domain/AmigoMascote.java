package br.com.ezpet.nimbus21.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_AMIGO_MASCOTE")
@SequenceGenerator(name = "amigoMascoteSequence", sequenceName = "SQ_AMIGO_MASCOTE", allocationSize = 1)
public class AmigoMascote {

	@Id
	@Column(name = "cd_amigo_mascote")
	private Long codigo;

	@ManyToOne(cascade = { CascadeType.REMOVE})
	@JoinColumn(name = "cd_mascote", nullable = false)
	@JsonBackReference(value="mascote-amigo")
	private Mascote mascote;

}
