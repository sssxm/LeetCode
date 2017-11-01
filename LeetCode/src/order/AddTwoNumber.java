package order;


/**
 * 2
 * Add two number
 * @author Ximin She
 *
 */
public class AddTwoNumber {

	public static void main(String[] args) {


	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		if(l1 == null || l2 == null)
            return null;
		
		int carry = 0;
		ListNode output = new ListNode(0);
		ListNode l3 = output;
		
		while(l1 != null || l2 != null){
			int newVal = 0;
			if(l1 != null){
				newVal += l1.val;
				l1 = l1.next;
			}
			if(l2 != null){
				newVal += l2.val;
				l2 = l2.next;
			}
			
			newVal += carry;
			carry = newVal/10;
			newVal = newVal%10;
			
			l3.next = new ListNode(newVal);
			l3 = l3.next;
		}
		
		if(carry == 1){
			l3.next = new ListNode(1);
		}
		return output.next;
    }
	
}
