package br.ufsc.bridge.res.dto.repository;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepositoryRegisterDTO {

	private String cnsProfissional;
	private String cboProfissional;
	private String cnesUnidadeSaude;

	private String cnsPaciente;
	private String idInstalacao;
	private String submissionSetId;

	private List<RepositoryRegisterDocumentDTO> documents;

}
