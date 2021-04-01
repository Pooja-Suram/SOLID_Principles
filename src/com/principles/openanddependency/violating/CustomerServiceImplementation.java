package com.principles.openanddependency.violating;

enum ServiceType{
    COMPLAINT, SERVICE_REQUEST;
}


class CustomerService{

    public void provideService(ServiceType serviceType){
        if("COMPLAINT".equals(serviceType.toString())){
            processComplaint();
        }
        else if("SERVICE_REQUEST".equals(serviceType.toString())){
            processServiceRequest();
        }
    }

    public void processComplaint(){
        System.out.println("Processing Complaint");
    }

    public void processServiceRequest(){
        System.out.println("Processing Customer's service request");
    }
}

//register mobile number case





public class CustomerServiceImplementation {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.provideService(ServiceType.COMPLAINT);
    }

}
