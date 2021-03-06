package br.ufsc.bridge.res.dab.medicoesobservacoes.perimetrocefalico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class ResABPesoCorporalQualquerEventoData {

	@XmlElement(name = "Peso")
	private ResABPesoValue peso;
}
