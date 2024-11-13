package org;

public class Father { //only x

	int x =10;
}

class Son extends Father {  // Both x & y
	int y = 20;
	
}

class Daughter extends Father {   //Both x & z
	int z = 30;
}