package br.com.tcc.expedicao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcc.expedicao.domain.Tarifa;
import br.com.tcc.expedicao.dto.TarifaDTO;
import br.com.tcc.expedicao.repository.TarifaRepository;

@Service
public class TarifaService {

	@Autowired
	private TarifaRepository repository;

	public void save(TarifaDTO volume) {
		Tarifa entity = new Tarifa();
		entity.setDescTarifa(volume.getDescTarifa());
		repository.save(entity);
	}
	
	
//	public List<Volume> list() {
//		List<Volume> target = new ArrayList<>();
//		repository.findAll().forEach(target::add);
//		return target;
//	}
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
