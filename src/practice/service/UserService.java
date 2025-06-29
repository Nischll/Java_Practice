package practice.service;

import practice.customException.ValidationException;

public class UserService {
    public void registerUser(String email, String contact, int age, String address) throws ValidationException {
        if(!email.matches(("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))){
            throw new ValidationException("invalid email format", 400);
        }
        if(contact == null || contact.isEmpty()) {
            throw new ValidationException("contact number must not be empty", 400);
        }
        if(contact.length() < 10){
            throw new ValidationException("contact number must be of 10 numbers", 400);
        }
        if (age < 18) {
            throw new ValidationException("you are under age!", 422);
        }
        if(address == null || address.isEmpty()){
            throw new ValidationException("address must not be empty", 400);
        }

        System.out.println("User " + email + " of " + age + " age, " + "address " + address + " and contact number " + contact + " has registered successfully.");
    }

}
