package org.ajug.web.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ajug.web.domain.Snippet;
import org.springframework.jdbc.core.RowMapper;

public class SnippetRowMapper implements RowMapper<Snippet> {

	@Override
	public Snippet mapRow(ResultSet rs, int row) throws SQLException {
		Snippet snippet = new Snippet();
		snippet.setId(rs.getString("id"));
		snippet.setTitle(rs.getString("title"));
		snippet.setCode(rs.getString("code"));
		snippet.setCreated(rs.getDate("created"));
		snippet.setModified(rs.getDate("modified"));
		return snippet;
	}

}
