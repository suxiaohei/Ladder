package com.study.Ladder.orientdb;

import com.orientechnologies.orient.core.command.script.OCommandScript;
import com.orientechnologies.orient.core.db.record.OIdentifiable;
import com.tinkerpop.blueprints.impls.orient.OrientDynaElementIterable;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;

public class VertexDao {

	public 
	OrientDynaElementIterable batchSql(OrientGraph graph){

		String cmd = "begin\n";
		cmd += "LET a = CREATE VERTEX SET script = true\n";
		cmd += "LET b = SELECT FROM V LIMIT 1\n";
		cmd += "LET e = CREATE EDGE FROM $a TO $b \n";
		cmd += "COMMIT RETRY 100\n";
		cmd += "return $e";
		
//		String cmd = "begin\n";
//		cmd += "let account = create vertex Account set name = 'Luke'\n";
//		cmd += "let city = select from City where name = 'London'\n";
//		cmd += "let edge = create edge Lives from $account to $city";
//		cmd += "commit retry 100\n";
//		cmd += "return $account";
		
		OrientDynaElementIterable edge = graph.command(new OCommandScript("sql",cmd)).execute();
		return edge;
	}
}
