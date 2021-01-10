public class Human{
    private String gender;
    private String name;
    private int age;   
    
    public human(){
        // counstructer method
        this.gender = NULL;
        this.name = NULL;
        this.age = 0;
    }
    
    public human(String gender, int age, String name){
        // We did the constructor overload method
        // The overload method separates methods with the same name (return types do not matter) in terms of their received parameters.
        // this.gender = object variable  , gender = local variable
        // this.age = object variable  , age = local variable
        // this.namer = object variable  , name = local variable
        this.gender = gender;
        this.age = age;
        this.name = name;
    }
        public String getGender(){
            return this.gender;
        }    
        public int getAge(){
            return age;
        }
        public String getName(){
            return this.name;
        }
        public void setcinsiyet(String gender){
            this.gender = gender;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }
        public boolean thanbig(human x){
            return this.age > x.age;
        }
        public boolean overName(human x){
            return this.isim == x.isim;
        }
        public boolean equalGender(human x){
            return this.gender== x.gender;
        }
        public static void main(String []args){
            Human sulo = new Human("Erkek" , 19 , "Suleyman"); 
            Human murat = new Human("Erkek" , 20 ,"Murat");
            Human gizem = new Human("Kadın" , 18 , "Gizem");
            System.out.print(sulo.isim + " " + murat.isim + "'dan yaşca ");
            System.out.println(sulo.thanbig(murat)?"buyuktur":"kucuktur");
            System.out.print(sulo.isim + " " + gizem.isim + "'dan yaşca ");
            System.out.println(sulo.thanbig(gizem)?"buyuktur":"kucuktur");
            System.out.print(sulo.isim + " " + murat.isim + " adas ");
            System.out.println(sulo.overad(murat)?"'lar" : " degiller" );
            System.out.print(sulo.isim + " " + gizem.isim + " adas ");
            System.out.println(sulo.overad(gizem)?"'lar" : " degiller" );
            System.out.print(sulo.isim + " " + murat.isim + " hemcins ");
            System.out.println(sulo.equalgender(murat)?"'ler" : " degiller" );
            System.out.print(sulo.isim + " " + gizem.isim + " adas ");
            System.out.println(sulo.equalgender(gizem)?"'ler" : " degiller" );
         }
}
