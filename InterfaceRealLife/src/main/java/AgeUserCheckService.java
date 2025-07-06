public class AgeUserCheckService implements IUserCheckService{


    @Override
    public Boolean checkUser(User user){
        if (user.getAge()>=18){
            return true;
        }
        return false;
    }
}
