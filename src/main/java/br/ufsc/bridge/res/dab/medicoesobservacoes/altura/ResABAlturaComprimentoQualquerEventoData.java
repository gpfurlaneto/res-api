package br.ufsc.bridge.res.dab.medicoesobservacoes.altura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class ResABAlturaComprimentoQualquerEventoData {

	@XmlElement(name = "Altura__fslash__comprimento")
	private ResABAlturaComprimentoValue alturaComprimento;
}
