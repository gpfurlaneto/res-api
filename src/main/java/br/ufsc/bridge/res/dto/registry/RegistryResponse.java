package br.ufsc.bridge.res.dto.registry;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistryResponse {

	private List<RegistryItem> items = new ArrayList<>();
}
