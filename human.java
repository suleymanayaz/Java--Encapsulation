public class human{
    private String cinsiyet;
    private String isim;
    private int yasi;   
    public human(){
        // counstructer method
        this.cinsiyet = NULL;
        this.isim = NULL;
        this.yasi = 0;

    }
    public human(String cinsiyet, int yasi, String isim){
        // counstructer overload method yaptık 
        // overload method aynı isime sahip methodların(dönüş tipleri önemli değil) aldigi
        // parametreler cinsinden ayrımına denir.
        this.cinsiyet = cinsiyet;
        this.yasi = yasi;
        this.isim = isim;
    }
        public String getcinsiyet(){
            return cinsiyet;
        }    
        public int getyasi(){
            return yasi;
        }
        public String getisim(){
            return isim;
        }
        public void setcinsiyet(String cinsiyet){
            this.cinsiyet = cinsiyet;
        }
        public void setyasi(int yasi){
            this.yasi = yasi;
        }
        public void setisim(String isim){
            this.isim = isim;
        }
        public boolean thanbig(human x){
            return this.yasi > x.yasi;
        }
        public boolean overad(human x){
            return this.isim == x.isim;
        }
        public boolean equalgender(human x){
            return this.cinsiyet == x.cinsiyet;
        }
        public static void main(String []args){
            human sulo = new human("Erkek" , 19 , "Suleyman"); 
            human murat = new human("Erkek" , 20 ,"Murat");
            human gizem = new human("Kadın" , 18 , "Gizem");
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