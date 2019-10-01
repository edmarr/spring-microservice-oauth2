package br.com.tcc.acesso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.tcc.acesso.domain.ApplicationUser;
import br.com.tcc.acesso.dto.ApplicationUserDTO;
import br.com.tcc.acesso.repository.ApplicationUserRepository;

@Service
public class ApplicationUserService {

	@Autowired
	private ApplicationUserRepository repository;
	

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;




	public void save(ApplicationUserDTO dto) {
		ApplicationUser entity = new ApplicationUser();
		entity.setUsername(dto.getUsername());
		entity.setPassword(bCryptPasswordEncoder.encode( dto.getPassword()));
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
