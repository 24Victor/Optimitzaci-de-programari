/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */
public class CheckNumber { 
    private double number; 
    public CheckNumber(double num) { 
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
    