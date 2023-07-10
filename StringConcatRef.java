public class StringConcatRef{
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="PYTHON";
        String s3=s1.concat(s2);
        String s4=s1.concat(s2);
        if(s3==s4){
            System.out.println("Reference are equal");
        }
        else{
            System.out.println("Refernce are unequal");
        }
        if(s3.equals(s4)){
            System.out.println("Value are equal");
        }
        else{
            System.out.println("Value are unequal");
        }
    }
}