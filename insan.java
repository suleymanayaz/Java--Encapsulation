public class insan{
    private String cinsiyet;
    private String isim;
    private Integer yasi;
    public insan(String cinsiyet, Integer yasi, String isim){ // counstructer
        this.cinsiyet = cinsiyet;
        this.yasi = yasi;
        this.isim = isim;
    }
        public String getcinsiyet(){ 
            return cinsiyet;
        }    
        public Integer getyasi(){
            return yasi;
        }
        public String getisim(){
            return isim;
        }
        public void setcinsiyet(String cinsiyet){
            this.cinsiyet = cinsiyet;
        }
        public void setyasi(Integer yasi){
            this.yasi = yasi;
        }
        public void setisim(String isim){
            this.isim = isim;
        }
    public static void main (String [] args) {
        insan sulo = new insan("Erkek",19,"suleyman");
        System.out.println(sulo.yasi);
        System.out.println(sulo.cinsiyet);
        System.out.println(sulo.isim);
        // Göründüğü gibi direk oluşan nesneden erişebiliyoruz.
        // Fakat farklı bir sinifdan erişim mümkün değildir.

    }
}
    class insan2{
        public static void main (String [] args){
            insan murat = new insan("Erkek",20,"murat");
        /*  System.out.println(murat.yasi);
            System.out.println(murat.cinsiyet);
            System.out.println(murat.isim);
            murat.yasi = 19;
            Farklı bir sınıftan erişmek istediğimizde veya değiştirmek istediğimizde :
            The field insan.yasi is not visible
            gibi hatalarla karşılaşırız sebebi private olmasından kaynaklanıyor.
            bu hatayi gidermek için insan sınıfında oluşturdugumuz getter ve setter methodları kullanıyoruz
            */
            System.out.println(murat.getyasi());
            System.out.println(murat.getcinsiyet());
            System.out.println(murat.getisim());
            murat.setyasi(19); // böylelikle muratın yaşını değiştirmiş olduk.
            System.out.println(murat.getyasi());
        }

    }
    
