package Lesson27;

public class Test12 {
    void marafon(int tempAir, int tempRunning) throws LegsInguryException {
        if (tempRunning > 12) {
            throw new LegsInguryException("Oups! Too fast!");
        }
        if (tempAir > 35) {
            throw new ContractedMuscleException();
        }
        System.out.println("Finished marafon");
    }

    public static void main(String[] args) {
        Test12 t12 = new Test12();
        try {
            t12.marafon(141, 11);
        } catch (LegsInguryException e) {
            System.out.println(e.getMessage());
        }
    }
}


class LegsInguryException extends Exception {

    LegsInguryException(String message) {
        super(message);
    }

    LegsInguryException() {
    }
}


class ContractedMuscleException extends RuntimeException {
    ContractedMuscleException(String message) {
        super((message));
    }

    ContractedMuscleException() {
    }

}