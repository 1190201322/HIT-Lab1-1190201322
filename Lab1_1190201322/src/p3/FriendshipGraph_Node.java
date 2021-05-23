package p3;

import p3.FriendshipGraph.Node;
import p3.FriendshipGraph.Node.Edge;

public class FriendshipGraph_Node {
	private Node next = null;//next����һ��Node��
	Person person;
	private boolean vis;//vis�Ǽ�¼�Ƿ���ʹ�;
	private int dis = Integer.MAX_VALUE;//dis���뵱ǰ�����������

	private Edge le = null;//le��ֱ�����ӵıߣ�

	
	
	//����Ӧ��Node���뵽Node��������
	public void addNode(Node nextVertex) {
		nextVertex.next = this.next;
		this.next = nextVertex;
		
}
	//
	public class Edge {
		FriendshipGraph_Node or = null;
		public Node ter = null;//or:һ���ڵ㣻 ter:��һ���ڵ㣻ne:��һ���͸�������֮��ıߣ����ظ��ıߣ�
		public Edge ne = null;
	}
	//�ڽӱ��еıߣ�ÿ��Edge����洢���ڽӱ��е���һ���ߣ��Լ���Ӧ�ıߵ�����Person����Ӧ��Node
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
