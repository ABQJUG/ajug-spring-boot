package org.ajug.web.repository;

import org.ajug.web.domain.Snippet;
import org.springframework.data.repository.CrudRepository;

public interface SnippetRepository extends CrudRepository<Snippet,String>{ //Or MongoRepository<Snippet,String>

}
