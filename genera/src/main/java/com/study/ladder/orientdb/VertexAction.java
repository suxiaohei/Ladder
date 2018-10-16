package com.study.ladder.orientdb;

import java.util.Iterator;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;

/**
 * @author sx
*
*/
public class VertexAction {
	
	VertexService service = new VertexService();
	
	/**
	 * ����Person�࣬����Person�������Ϣ
	 */
	public Edge insertTest(){
		CreateGraph createGraph = new CreateGraph();
		OrientGraph graph = createGraph.createOrientGraph();
		Edge lucaKonwsMarko = null ;
		graph.begin();
		long startMili=System.currentTimeMillis();
		try{
			System.out.println("��ʼ");
			if(graph.getVerticesOfClass("class:People") != null){
				System.out.println("�Ѿ�����");
			}else{
				graph.createVertexType("People");
			}
			for(int i=0;i<=100000;i++){
				Iterable<Vertex> vertexs = graph.getVerticesOfClass("People");
//				for(Iterator<Vertex> iter = vertexs.iterator();iter.hasNext();){
//					Vertex vertex = iter.next();
//					Iterable<Edge> edges = vertex.getEdges(Direction.IN,"knows");
//					for(Iterator<Edge> iterEdge = edges.iterator();iterEdge.hasNext();){
//						Edge edge = iterEdge.next();
//						System.out.println("ID ===" + edge.getId());
//						System.out.println("Lable ===" + edge.getLabel());
//						edge.getVertex(Direction.BOTH);
//						for(String key : edge.getPropertyKeys()){
//							System.out.println("property ===" + edge.getProperty(key));
//						}
//					}
//				}
//				Iterable<Edge> edges = graph.getEdgesOfClass("People");
//				for(Iterator<Edge> iter = edges.iterator();iter.hasNext();){
//					Edge edge = iter.next();
//					System.out.println("ID ===" + edge.getId());
//					System.out.println("Lable ===" + edge.getLabel());
//					for(String key : edge.getPropertyKeys()){
//						System.out.println("property ===" + edge.getProperty(key));
//					}
//				}
				//��������ΪPeople����
				Vertex luca = graph.addVertex("class:People");
				Iterable<Edge> edges = luca.getEdges(Direction.IN,"knows");
				for(Iterator<Edge> iterEdge = edges.iterator();iterEdge.hasNext();){
					Edge edge = iterEdge.next();
					System.out.println("ID ===" + edge.getId());
					System.out.println("Lable ===" + edge.getLabel());
					for(String key : edge.getPropertyKeys()){
						System.out.println("property ===" + edge.getProperty(key));
					}
				}
				luca.setProperty("name"+i, "luca"+i);
				Vertex marko = graph.addVertex("class:People");
				marko.setProperty("name"+i,"marko"+i);
				//������ϵ
				lucaKonwsMarko = graph.addEdge(null,luca, marko, "knows");
			}
			graph.commit();
		}catch(Exception e){
			graph.rollback();
			e.printStackTrace();
		}finally{
			graph.shutdown();
		}
		System.out.println("����");
		long endMili=System.currentTimeMillis();
		System.out.println("�ܺ�ʱΪ��"+(endMili-startMili)+"����");
		
		return lucaKonwsMarko;
	}
	
	public void batchTest(){
		CreateGraph createGraph = new CreateGraph();
		OrientGraph graph = createGraph.createOrientGraph();
		graph.begin();
		try{
			service.insertBatch(graph);
		}catch(Exception e){
			graph.rollback();
			e.printStackTrace();
		}finally{
			graph.shutdown();
		}
	}
	
	public void insertNoT(){
		CreateGraph createGraph = new CreateGraph();
		OrientGraph graph = createGraph.createOrientGraph();
		graph.begin();
		long startMili=System.currentTimeMillis();
		try{
			System.out.println("��ʼ");
			if(graph.getVerticesOfClass("class:People") != null){
				System.out.println("�Ѿ�����");
			}else{
				graph.createVertexType("People");
			}
			
			Iterable<Vertex> vertices = graph.getVertices("name1", "luca1");
			Iterator<Vertex> iterVertex = vertices.iterator();
			//���Vertex�Ѿ�����
			if(iterVertex.hasNext()){
				Vertex startVertex = iterVertex.next();
				Iterable<Edge> edges = startVertex.getEdges(Direction.OUT, "knows");
				for(Iterator<Edge> iterEdge = edges.iterator();iterEdge.hasNext();){
					Edge edge = iterEdge.next();
					Vertex Endvertex = edge.getVertex(Direction.IN);
					if("marko1".equals(Endvertex.getProperty("name1"))){
						System.out.println("�ڵ��Ѿ�����");
						continue;
					}
					for(String key : edge.getPropertyKeys()){
					}
				}
				System.out.println("������ͬ��Vertex");
			}			
//			for(int i=0; i<=1;i++){
//				//��������ΪPeople����
//				Vertex luca = graph.addVertex("class:People");
//				luca.setProperty("name", "luca");
//				Vertex marko = graph.addVertex("class:People");
//				marko.setProperty("name","marko");
//			}
			
			//������ϵ
			graph.commit();
		}catch(Exception e){
			graph.rollback();
			e.printStackTrace();
		}finally{
			graph.shutdown();
		}
		System.out.println("����");
		long endMili=System.currentTimeMillis();
		System.out.println("�ܺ�ʱΪ��"+(endMili-startMili)+"����");
	
	}
	
	public static void main(String[] args){
		VertexAction v = new VertexAction();
		
		//ѭ��100000�β���
//		v.insertTest();
		//JavaScript SQL ����
//		v.batchTest();
		//����ȥ��
		v.insertNoT();
	}
}

