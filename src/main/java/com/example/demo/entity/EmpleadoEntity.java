package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_empleado")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoEntity {

	@Id
	@Column(name = "dni_empleado", nullable = false, unique = true, length = 8)
	private String dni_empleado;

	@Column(name = "nombre_empleado", nullable = false, length = 45)
	private String nombre_empleado;

	@Column(name = "apellido_empleado", nullable = false, length = 45)
	private String apellido_empleado;

	@Column(name = "fecha_nacimiento", nullable = false)
	private LocalDate fechaNacimiento;

	@Column(name = "direccion", nullable = false, length = 45)
	private String direccion;

	@Column(name = "correo", nullable = false, unique = true, length = 45)
	private String correo;

	@ManyToOne
	@JoinColumn(name = "area_id", nullable = false)
	private AreaEntity areaEntity;

}
