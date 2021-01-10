public class EncapsulationPrivateVariableExample{
    private int value;
    
    public EncapsulationPrivateVariableExample(){ // counstructer
        value = 5 ;
    }
    
    public int getvalue(){ 
        return value ;
    }
    
    public void setvalue(int value){
        this.value = value ;
    }
    
}

public class encapsulation{
    public static void main(String [] args){
        EncapsulationPrivateVariableExample reference = new EncapsulationPrivateVariableExample(); // counstructer 
        // System.out.println("VALUE degeri : " + reference.value); There is no direct access to a variable that is private in Java.
        
        // If the getter method is defined, we can access it indirectly using the getter method.
        System.out.println("VALUE degeri : " + reference.getvalue());
        
        // Refenrence.value = 10;  If the setter method is defined, we can change it indirectly by using the setter method.
        reference.setvalue(6);
        
        System.out.println("VALUE degeri : " + reference.getvalue());
    }
}




