public class CodingBatExercises {
	public boolean nearHundred(int n) {
		int num = Math.abs(n);

		if(n < 0) {
			return false;
		}

		if(num <= 100) {
			if(100 - num <= 10) {
				return true;
			}
		}

		if(num >= 100) {
			if(num - 100 <= 10) {
				return true;
			}
		}

		if(num <= 200) {
			if(200 - num <= 10) {
				return true;
			}
		}

		if(num >= 200) {
			if(num - 200 <= 10) {
				return true;
			}
		}
		return false;
	}
	public boolean startHi(String str) {
  		if(str.length() >= 2) {
    		String var_ = str.substring(0,2);
    		if(var_.equals("hi") == true) {
      			return true;
    		}
    		return false;
  		}
  		return false;
	}

}