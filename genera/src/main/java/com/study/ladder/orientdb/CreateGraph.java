package com.study.ladder.orientdb;

import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.blueprints.impls.orient.OrientGraphFactory;
import com.tinkerpop.blueprints.impls.orient.OrientGraphNoTx;

public class CreateGraph {

	private String localtion = "D:/Program Files (x86)/orientdb-community-2.1-rc3/databases/db";
	
	/**
	 * 
	 * @return
	 */
	public OrientGraph createOrientGraph(){
		OrientGraph graph = new OrientGraph("plocal:" + localtion);
		return graph;
	}

	/**
	 * 
	 * @return
	 */
	public OrientGraph createOrientGraphByFactory(){
		OrientGraphFactory factory = new OrientGraphFactory("plocal:" + localtion).setupPool(1, 10);
		OrientGraph graph = factory.getTx();
		return graph;
	}
	
	public void createGraphDb(){
		OrientGraphNoTx  orientGraphNoTx = new OrientGraphNoTx("plocal:" + localtion);
	}
	
}
