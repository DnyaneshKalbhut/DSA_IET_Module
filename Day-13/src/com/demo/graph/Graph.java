package com.demo.graph;

public class Graph {
	
	private MyLinkList [] g ; 
	public Graph(int v) {
		g = new MyLinkList[v];
		for(int i = 0 ;i<v;i++) {
			g[i]=new MyLinkList();
		}
	}
	
	public void addEdge(int source,int destination) {
		g[source].addValue(destination);
	}
	
	public void printGraph() {
		for(int i = 0 ;i<g.length;i++) {
			System.out.println(i+"===>");
			g[i].displayList();
		}
	}
 
}
