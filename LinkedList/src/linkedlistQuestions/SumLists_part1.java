package linkedlistQuestions;

public class SumLists_part1 {

	public static void main(String args[]) {

		Linkedlist list1 = new Linkedlist();

		list1.append(6);
		list1.append(7);
		list1.append(1);

		Linkedlist list2 = new Linkedlist();

		list2.append(9);
		list2.append(8);
		list2.append(9);
		list2.append(9);

		Linkedlist result = sumOfLists(list1, list2);
		result.display();

	}

	public static Linkedlist sumOfLists(Linkedlist list1, Linkedlist list2) {
		Linkedlist sumlist = new Linkedlist();

		Node node1 = list1.getHead();
		Node node2 = list2.getHead();

		if (node1 == null) {
			return list1;
		}

		if (node2 == null) {
			return list2;
		}

		int sum = 0;
		int carry = 0, place = 0;

		while (node1 != null && node2 != null) {
			sum = node1.data + node2.data + carry;

			if (sum > 9) {
				place = sum % 10;
				carry = sum / 10;
				sumlist.append(place);
			} else {
				sumlist.append(sum);
				carry = 0;
			}
			node1 = node1.next;
			node2 = node2.next;
		}

		if (node1 == null && node2 != null) {
			while (node2 != null) {
				sum = carry + node2.data;
				if (sum > 9) {
					place = sum % 10;
					carry = sum / 10;
					sumlist.append(place);
				} else {
					sumlist.append(sum);
					carry = 0;
				}
				node2 = node2.next;
			}
		}
		if (node2 == null && node1 != null) {
			while (node1 != null) {
				sum = carry + node1.data;
				if (sum > 9) {
					place = sum % 10;
					carry = sum / 10;
					sumlist.append(place);
				} else {
					sumlist.append(sum);
					carry = 0;
				}
				node1 = node1.next;
			}
		}

		if (carry != 0) {
			sumlist.append(carry);
		}

		return sumlist;
	}
}
