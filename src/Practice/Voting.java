package Practice;

class BJP{
    public static int modicount=0;
    static BJP modi;
    private BJP(){

    }
    public static BJP voteBJP(){
        modicount++;
        if(modi==null){
            modi=new BJP();
        }
        return modi;
    }
}
class TDP{
    public static int babucount=0;
    static TDP babu;
    public static TDP voteTDP(){
        babucount++;
        if(babu==null){
            babu=new TDP();
        }
        return babu;
    }
    private TDP(){

    }

}
class TRS{
    public static  int kcrcount=0;
    static TRS kcr;
    public static TRS voteTRS(){
        kcrcount++;
        if(kcr==null){
            kcr=new TRS();
        }
        return kcr;
    }
    private TRS(){

    }

}
public class Voting {
    void voteTRS(){
        TRS ts= TRS.voteTRS();
    }
    void voteTDP(){
        TDP ap=TDP.voteTDP();
    }
    void voteBJP(){
        BJP modi=BJP.voteBJP();
    }
    int bjpCount(){
        int count= BJP.modicount;
        return count;
    }
    int trsCount(){
        int count=TRS.kcrcount;
        return count;
    }
    int tdpCount(){
       int count=TDP.babucount;
       return count;
    }
    public static void main(String[] args){
        Voting ppl= new Voting();
        ppl.voteBJP();ppl.voteTDP();ppl.voteTDP();ppl.voteBJP();ppl.voteTRS();ppl.voteTDP();
        System.out.println(ppl.tdpCount()+" votes have been baaged by TDP");
        System.out.println(ppl.trsCount()+" votes have been baaged by TRS");
        System.out.println(ppl.bjpCount()+" votes have been baaged by BJP");

    }
}
