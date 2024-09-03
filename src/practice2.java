public class practice2 {
    public static void main(String[] args) {
        Cars Template = new Cars();
        Template.company = "Template";
        Template.model = "Puch.ev";
        Template.mNo = 3250;
        /*
        System.out.println(Template.company);
        System.out.println(Template.model);
        System.out.println(Template.mNo);
         */
        Template.getDetails("Maruti", "Rand Vitara", 2435);

        System.out.println(Template.company);
        System.out.println(Template.model);
        System.out.println(Template.mNo);
    }
}
class Cars{
    String company;
    String model;
    int mNo;

    void getDetails(String comp , String mode , int SNo ){
        company = comp;
        model = mode;
        mNo = SNo;
    }
    int getRoll(int sno){
        return sno;
    }
}
