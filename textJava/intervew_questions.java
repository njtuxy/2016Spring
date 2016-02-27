//Google interview 
//Find the length of maxium
public Node findNext(Node node, int value){
	if(node!=null){
		findNext(node.left);
		System.out.print(node.data + " ");
		if(node.data == value){
			return node.parent;
		}		
		findNext(node.right)
	}
	return node;
}


public int[] arrayPlusNumber(int[] array, int num){
	//convert array to a number:
	int arrayNumber = convertArrayToNumber();
	return convertNumberToArray(num + arrayNumber);

}

public int convertArrayToNumber(int[] array){
	int result;
	StringBuilder sb = new StringBuilder();
	for(int i=0; i< array.size; i++){
		sb.append(i);
	}
	return Integer.parseInt(sb.toString());
}

public int[] convertNumberToArray(int number){
	String temp = number.toString();
	int[] result = new int[temp.length];
	for(int i=0; i<result.length; i++){
		result[i] = temp.charAt(i);
	}
	return result;
}

