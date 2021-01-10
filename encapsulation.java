public class Encapsulation{
    private int value;
    public Encapsulation(){ // counstructer
        value = 5 ;
    }
    public int getvalue(){ 
        return value ;
    }
    public void setvalue(int value){
        this.value = value ;
    }
    public static void main(String [] args){
        encapsulation reference = new encapsulation(); // counstructer 
        // System.out.println("VALUE degeri : " + reference.value);
        // Java da  private olan bir değişkeni direk olarak erişim yoktur.
        // getter methodu tanımlayıp dolaylı yoldan erişebiliriz.
        System.out.println("VALUE degeri : " + reference.getvalue());
        // setter methodu tanımlayıp direş erişip değiştirebiliriz.
        reference.setvalue(6);
        System.out.println("VALUE degeri : " + reference.getvalue());
    }
}




