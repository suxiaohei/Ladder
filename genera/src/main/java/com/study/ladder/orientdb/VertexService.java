package com.study.ladder.orientdb;

import com.tinkerpop.blueprints.impls.orient.OrientGraph;

public class VertexService {

	VertexDao dao = new VertexDao();
	
	public void insertBatch(OrientGraph graph){
		dao.batchSql(graph);
	}
}
