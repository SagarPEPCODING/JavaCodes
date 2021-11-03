package calculations.inheritance;

/**
 * InnerMultipleInheritance
 */
interface InnerMultipleInheritance_1 {

    default void display(int val)
    {
        System.out.println("Default InnerMultipleInheritance_1");
    }
    
}

/**
 * InnerMultipleInheritance_1
 */
interface InnerMultipleInheritance_2 {
    default void display(int val)
    {
        System.out.println("Default InnerMultipleInheritance_2");
    }
    
}

class implementingCLass implements InnerMultipleInheritance_1, InnerMultipleInheritance_2
 {
    public void display(int val)
    {
        if(val == 1) {
            InnerMultipleInheritance_1.super.display(1);
        }else {
            InnerMultipleInheritance_2.super.display(1);
        }
    }   
 }
class MultipleInheritance {
    public static void main(String[] args) {
        implementingCLass obj = new implementingCLass();
        obj.display(2);
    }
}

