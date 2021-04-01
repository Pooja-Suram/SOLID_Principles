package com.principles.openanddependency.following;

interface ServiceType{
    public void provideService();
}


class Complaint implements ServiceType{

    @Override
    public void provideService() {
        System.out.println("Processing complaint");
    }
}



class ServiceRequest implements ServiceType{

    @Override
    public void provideService() {
        System.out.println("Processing customer's service request");
    }
}



class CustomerService{

    public void provideServiceBasedOnServiceType(ServiceType serviceType){
        serviceType.provideService();;
    }
}




public class CustomerServiceImplementation {

    public static void main(String[] args) {
        ServiceType service = new Complaint();
        CustomerService customerService = new CustomerService();
        customerService.provideServiceBasedOnServiceType(service);
    }

}
