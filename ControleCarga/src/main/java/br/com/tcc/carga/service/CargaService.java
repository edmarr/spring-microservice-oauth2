package br.com.tcc.carga.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcc.carga.domain.ItemBemProduto;
import br.com.tcc.carga.dto.ItemBemProdutoDTO;
import br.com.tcc.carga.repository.CargaRepository;

@Service
public class CargaService {

	@Autowired
	private CargaRepository repository;

	public void save(ItemBemProdutoDTO dto) {
		ItemBemProduto entity = new ItemBemProduto();
		entity.setDescricao(dto.getDescricao());
		entity.setEmail(dto.getEmail());
		entity.setEmailDestinatario(dto.getEmailDestinatario());
		repository.save(entity);
	}
	
	
	public List<ItemBemProdutoDTO> list() {
		List<ItemBemProdutoDTO> target = new ArrayList<>();
		ItemBemProdutoDTO dto = null;
		
		for(ItemBemProduto e : repository.findAll()){
			dto = new ItemBemProdutoDTO();
			dto.setId(e.getIdItemBemProduto());
			dto.setDescricao(e.getDescricao());
			dto.setEmail(e.getEmail());
			dto.setEmailDestinatario(e.getEmailDestinatario());
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
