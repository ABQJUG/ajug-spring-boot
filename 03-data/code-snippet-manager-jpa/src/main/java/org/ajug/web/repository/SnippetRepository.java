package org.ajug.web.repository;

import javax.transaction.Transactional;

import org.ajug.web.domain.Snippet;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface SnippetRepository extends CrudRepository<Snippet,String>{

}
