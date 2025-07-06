public class main {
    public static void main(String[] args){

        SingUpManager singUpManager=new SingUpManager(new ComplexUserCheckService());

        singUpManager.signUp(new User(1,"Mehmet",28));


    }
}

