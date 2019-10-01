package br.com.tcc.sac.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcc.sac.domain.Sac;
import br.com.tcc.sac.dto.SacDTO;
import br.com.tcc.sac.repository.TarifaRepository;

@Service
public class SacService {

	@Autowired
	private TarifaRepository repository;

	public void save(SacDTO dto) {
		Sac entity = new Sac();
		entity.setDescricao(dto.getDescricao());
		entity.setEmail(dto.getEmail());
		repository.save(entity);
	}
	
	
	public List<SacDTO> list() {
		List<SacDTO> target = new ArrayList<>();
		SacDTO dto = null;
		for(Sac e : repository.findAll()) {
			dto = new SacDTO();
			dto.setEmail(e.getEmail());
			dto.setDescricao(e.getDescricao());
			target.add(dto);
		}
		return target;
	}
//
//	
//
//	public Volume findOne(Integer id) throws BusinessException{
//		Volume volume = null;
//		Volume entity = repository.findById(id).get();
//		
//		if (entity == null) {
//			throw new BusinessException("NOT FOUND");
//		}
//		
//		if (entity != null) {
//			volume = new Volume();
//			volume.setId(entity.getId());
//		}
//		return volume;
//	}

}
