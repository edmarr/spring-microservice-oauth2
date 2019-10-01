package br.com.tcc.logistica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcc.logistica.domain.ItemBemProduto;
import br.com.tcc.logistica.dto.ItemBemProdutoDTO;
import br.com.tcc.logistica.repository.LogisticaRepository;

@Service
public class LogisticaService {

	@Autowired
	private LogisticaRepository repository;

	public void save(ItemBemProdutoDTO volume) {
		ItemBemProduto entity = new ItemBemProduto();
		entity.setDescricao(volume.getDescricao());
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
