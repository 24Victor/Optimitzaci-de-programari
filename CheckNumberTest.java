public class CheckNumberTest {
    private double number;
    public CheckNumberTest(double num) {
    this.number = num;
    }
    public double comprovaSigne() {
    double status;
    if (this.number < 0)
    status = -1;
    else if (this.number == 0)
    status = 0;
    else
    status = 1;
    return status;
    }
    }