public class ComplexUserCheckService implements IUserCheckService{

    @Override
    public Boolean checkUser(User user){
        if (user.getAge()>=18&& user.getName().startsWith("M")){
            return true;
        }
        return false;
    }

}
