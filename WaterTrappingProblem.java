public class WaterTrappingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pillars[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int n = pillars.length;
		if(n == 0) {
			System.out.println("No pillars exixts...");
		}
		int leftPillarsMax[] = new int[n];	// prefix max
		int rightPillarsMax[] = new int[n]; // suffix max
		
		leftPillarsMax[0] = pillars[0];
		rightPillarsMax[n - 1] = pillars[n - 1];
		
		for(int i = 1; i < n; i++) {
			leftPillarsMax[i] = Math.max(leftPillarsMax[i - 1], pillars[i]);
		}
		System.out.println("Left Pillar Max");
		for(int i : leftPillarsMax) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		for(int i = n - 2; i >= 0; i--) {
			rightPillarsMax[i] = Math.max(rightPillarsMax[i + 1], pillars[i]);
		}
		
		System.out.println("Right Pillar Max");
		for(int i : rightPillarsMax) {
			System.out.print(i + ", ");
		}
		
		int amount = 0;
		for(int i = 0; i < n; i++) {
			int currentPillarHeight = pillars[i];
			int decidingHeight = Math.min(leftPillarsMax[i], rightPillarsMax[i]);
			if(decidingHeight > currentPillarHeight) {
				amount += decidingHeight - currentPillarHeight;
			}
		}
		
		System.out.println();
		System.out.println("Amount of water :: " + amount);
	}

}
