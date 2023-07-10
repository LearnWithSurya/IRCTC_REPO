public class StringProgram1{
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="JAVA";
        String s3=new String("JAVA");
        String s4=new String("PYTHON");
        String s5=new String("PYTHON");
        String s6="PYTHON";
        String s7="python";
        if(s1==s2){
         System.out.println("Reference are equal");
        }
        else{
         System.out.println("Reference are not equal");
        }
        if(s1==s3){
            System.out.println("Reference s1==s3 equal");
        }
        else{
            System.out.println("Rference s1==s3 not equal");
        }
        if(s4.equals(s5)){
            System.out.println("Values are equal");
        }
        else{
            System.out.println("Values are not equal");
        }
        if(s6==s7){
            System.out.println("Reference s6==s7 are equal");
        }
        else{
              System.out.println("Reference s6==s7 are not equal");
        }
        if(s6.equals(s7)){
             System.out.println("Values are s6==s7 equal");
        }
        else{
            System.out.println("Values are s6==s7 not equal");
        }
        if(s6.equalsIgnoreCase(s7)){
            System.out.println("values equals Ignore case equal");
        }
        else{
            System.out.println("values equals Ignore case are not equal");
        }
    }
}