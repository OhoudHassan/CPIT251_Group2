
package cpit251_group2;



public class Worker {
    
    //////////////////////////// Worker variables information ////////////////////////////
    private String workerName;
    private String workerPhone;
    private String workerEmail;
    private String price;
    private String workHouer;
    private String workerEvaluation;
    
    //////////////////////////////////// Constructor ////////////////////////////////////

    public Worker(String workerName, String workerPhone, String workerEmail, String price, String workHouer, String workerEvaluation) {
        this.workerName = workerName;
        this.workerPhone = workerPhone;
        this.workerEmail = workerEmail;
        this.price = price;
        this.workHouer = workHouer;
        this.workerEvaluation = workerEvaluation;
    }
    
    //////////////////////////// Get, Set and toString methods ////////////////////////////

    public String getWorkerName() {
        return workerName;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public String getPrice() {
        return price;
    }

    public String getWorkHouer() {
        return workHouer;
    }

    public String getWorkerEvaluation() {
        return workerEvaluation;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setWorkHouer(String workHouer) {
        this.workHouer = workHouer;
    }

    public void setWorkerEvaluation(String workerEvaluation) {
        this.workerEvaluation = workerEvaluation;
    }


    @Override
    public String toString() {
        return "\n ------------------------ Worker information ------------------------"
                + "\n workerName: " + workerName  + "\n worker Phone: " + workerPhone 
                + "\n worker Email: " + workerEmail + "\n price: " + price + "SR per hour"
                + "\n visit time: " + workHouer + "\n worker Evaluation: " + workerEvaluation
                + "\n ------------------------------------------------------------------";
    }
    
    
    
}
