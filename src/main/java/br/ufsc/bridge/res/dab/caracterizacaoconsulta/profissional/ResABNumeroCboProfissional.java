package br.ufsc.bridge.res.dab.caracterizacaoconsulta.profissional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

import br.ufsc.bridge.res.dab.common.ResABStringValueEHR;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class ResABNumeroCboProfissional {

	@XmlElement(name = "value")
	private ResABStringValueEHR value;
}
