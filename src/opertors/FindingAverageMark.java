package opertors;

public class FindingAverageMark {
	public static void main(String[] args) {
		String studentName = "A.kalaikumar";
		int rollNumber = 105;
		int subjectM1Mark = 70;
		int subjectM2mark = 80;
		int subjectEnglishMark= 70;
		int subjectJavaMark= 90;
		int subjectDatabaseMark = 60;
	float totalMark = subjectM1Mark+subjectM2mark+subjectEnglishMark+subjectJavaMark+ subjectDatabaseMark;
	float averagePercentage = totalMark / 5;
	System.out.println("Name : " + studentName);
	System.out.println("Roll no : " + rollNumber);
	System.out.println("average :"+averagePercentage+"%");
	}

}
