package com.cibergames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table (name="tb_usuario")
public class Usuario {
	@Id
	@Column(name="codigo_usu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="login_usu")
	@NotBlank(message="Debes especificar el email")
	@Email(message="El email no es válido")
	private String correo;
	
	@Column(name="clave_usu")
	@NotBlank(message="Debes especificar tu contraseña")
	@Size(min=6, max=20, message="Mínimo 6 caracteres, máximo 20.")
	private String clave;
	
	@Column(name="nombre_usu")
	@NotBlank(message="Debes ingresar tu nombre")
	@Size(min=3, max=80, message="El campo debe contener mínimo 3 caracteres y máximo 80.")
	private String nombre;
	
	@Column(name="apellido_usu")
	@NotBlank(message="Debes ingresar tu apellido")
	@Size(min=3, max=80, message="El campo debe contener mínimo 3 caracteres y máximo 80.")
	private String apellido;
	
	@Column(name="dni_usu")
	@NotBlank(message="Debes ingresar tu DNI")
	@Size(min=8, max=8, message="El DNI debe contener 8 dígitos obligatoriamente.")
	private String dni;

}
