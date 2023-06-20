public class Exam {
    private int writeTest = 0;
    private int praticeTest = 0;

    Exam(int writeTest, int praticeTest) {
        this.writeTest = writeTest;
        this.praticeTest = praticeTest;
    }

    Exam() {

    }

    public void setPraticeTest(int praticeTest) {
        this.praticeTest = praticeTest;
    }

    public void setWriteTest(int writeTest) {
        this.writeTest = writeTest;
    }

    public int getPraticeTest() {
        return praticeTest;
    }

    public int getWriteTest() {
        return writeTest;
    }

    public String getResult() {
        int finalTest = this.writeTest + this.praticeTest;
        if (this.writeTest == 0 && this.praticeTest == 0) {
            return "NC";
        } else if ((this.writeTest <= 0 && finalTest > 18) ||
                (this.writeTest <= 0 && this.praticeTest < 18) ||
                (this.writeTest > 0 && finalTest < 18)) {
            return "NS";
        } else if (finalTest > 30) {
            return "30L";
        } else {
            return String.valueOf(finalTest);
        }
    }
}
