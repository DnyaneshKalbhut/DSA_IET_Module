package SinglyLinklist;

public class SinglyLinklist {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}	
	}
      Node head;
	public SinglyLinklist() {
		head=null;
	}
	
	public void addNode(int val) {	
		Node node = new Node(val);
		if(head==null) {
			head = node;
		}else{
			Node temp =head;
			while(temp.next!=null ) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public void addByPosition(int val ,int pos) {
		Node node = new Node(val);
		if(head==null && pos>1) {
			System.out.println("List is empty");
		}else {
			if(pos==1) {
				head=node;
			}else {
				Node temp = head;
				int count =1 ;
				while(count!=pos) {
					temp = temp.next;
					count++;
				}
				if(temp!=null) {
					node.next=temp.next;
					temp.next=node;
				}else {
					System.out.println("The given position beyond the limit of list");
				}
			}
		}
	}
	
	
           public void addByValue(int val , int value) {
		      Node node = new Node(value);
		      
		      if(head==null) {
		    	  head = node;
		      }else {
		      
		      Node temp=head;
		      while(temp!=null && temp.data!=val) {
		    	  temp=temp.next;
		      }
		      
		      
		      if(temp!=null) {
		    	  node.next=temp.next;
		    	  temp.next=node;
		      
		      }
		    }
	      }
      
           public void deleteByPosition(int pos) {
       		if(head==null) {
       			System.out.println("list is empty");
       		}else {
       			Node temp=head,prev=null;
       			if(pos==1) {
       				head=temp.next;
       				temp.next=null;
       				temp=null;
       			}else {
       				for(int i=1;temp!=null && i<=pos-1;i++) {
       					prev=temp;
       					temp=temp.next;
       				}
       				if(temp!=null) {
       					prev.next=temp.next;
       					temp.next=null;
       					temp=null;
       				}else {
       					System.out.println("position is beyond the length of the list");
       				}
       			}
       		}
       	}
           
           public void deleteByVal(int val) {
      
        	   if(head==null) {
        		   System.out.println("list is empty");
          		}else {
          		  Node temp = head;
          		  Node prev=null;
          		  if(head.data==val) {
          			head=temp.next;
    		    	temp.next=null;
    		    	temp=null;
          		  }
          		  else {
          		  while(temp!=null && temp.data!=val) {
          			  prev=temp;
          			  temp=temp.next;
          		  }       		  
          		  if(temp!=null) {
          			prev.next=prev.next.next;
          		  }else {
  		    		System.out.println("data not found");
  		    	}
            }  
          }
       }

       
        public void Display() {
		  Node temp =head;
		  while( temp!=null ) {
			  System.out.println(temp.data);
			  temp=temp.next;
		  }
	  }
}

