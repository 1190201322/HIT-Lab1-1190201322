package p3;

import p3.FriendshipGraph.Node;
import p3.FriendshipGraph.Node.Edge;

public class FriendshipGraph_Node {
	private Node next = null;//next是下一个Node；
	Person person;
	private boolean vis;//vis是记录是否访问过;
	private int dis = Integer.MAX_VALUE;//dis是与当前起点的最近距离

	private Edge le = null;//le是直接连接的边；

	
	
	//将相应的Node加入到Node的链表中
	public void addNode(Node nextVertex) {
		nextVertex.next = this.next;
		this.next = nextVertex;
		
}
	//
	public class Edge {
		FriendshipGraph_Node or = null;
		public Node ter = null;//or:一个节点； ter:另一个节点；ne:另一个和该这两点之间的边（即重复的边）
		public Edge ne = null;
	}
	//邻接表中的边，每个Edge对象存储了邻接表中的下一条边，以及对应的边的两个Person所对应的Node
	public void addNodeEdge(Node toVertex) {
		Edge newEdge = new Edge();
		newEdge.or = this;
		newEdge.ter = toVertex;
		newEdge.ne = this.le;
		this.le = newEdge;

	}
	
	
	public class Node {
		private Node next = null;
		Person person;
		private boolean vis;
		private int dis = Integer.MAX_VALUE;

		private Edge lastEdge = null;

		//public void LoadData(Person person) {
		//	this.person = person;
		//	person.node1 = this;
		//}

		public void addNode(Node nextVertex) {
			nextVertex.next = this.next;
			this.next = nextVertex;
		}


	}
}
