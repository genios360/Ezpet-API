package br.com.ezpet.nimbus21.domain.dto;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import br.com.ezpet.nimbus21.domain.Role;
import br.com.ezpet.nimbus21.domain.UsuarioAdmin;
import lombok.Getter;

@Getter
public class UsuarioAdminDTO {

	private Long codigo;
	private String email;
	private String senha;
	private Collection<Role> roles;
	
	public UsuarioAdminDTO(UsuarioAdmin usuarioAdmin) {
		this.codigo = usuarioAdmin.getCodigo();
		this.email = usuarioAdmin.getEmail();
		this.senha = usuarioAdmin.getSenha();
		this.roles = usuarioAdmin.getRoles();
	}
	
	public static List<UsuarioAdminDTO> converter (List<UsuarioAdmin> usuariosAdmin) {
		return usuariosAdmin.stream().map(UsuarioAdminDTO::new).collect(Collectors.toList());
	}
	
	
}