import java.util.ArrayList;

public class Test {

    private int a;

    public void geta(){

    }

    static {
        System.out.println("This is Test!");
    }

    class inner{
        public inner(){}

        public void ss(){
            System.out.println("This is Inner!");
        }
    }

    public Test(){}


    public static void main(String[] args) {
        inner inner = new Test().new inner();
        inner.ss();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ss").append("dada");
        stringBuffer.toString();
        System.out.println(2147483647-(-2147483647));
        String dada = new String("dada");
        System.out.println("----------");
        System.out.println(dada.hashCode());
        dada = "-1";
        System.out.println(dada.hashCode());
        System.out.println("========");
        StringBuffer stringBuffer1 = new StringBuffer("21313");
        System.out.println(stringBuffer1.hashCode());
        stringBuffer1.delete(0,stringBuffer1.length());
        System.out.println(stringBuffer1.length());

        String[] strs = new String[]{"313","dad","ss",""};
        for (String str : strs) {
            System.out.println(str);
        }
        System.out.println("==========");
        StringBuffer[] ss = new StringBuffer[strs.length];
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("")){
                ss[i] = new StringBuffer();
            }else {
                ss[i] = new StringBuffer(strs[i]);
            }

            System.out.println(ss[i].toString());
        }

        ArrayList<String> strings = new ArrayList<>();
        strings.add("");
        strings.add("");

        System.out.println(strings);
        System.out.println("=================");
        System.out.println("=================");
        String s = new String("");
//        for(){
//
//        }
    }
}
