
public class DataBase {
    public final void baglantıKur(String username,String password){
        //bir metodu final olarak tanımlarsak başka bir yapıda extend işlemi yaptıktan sonra bu yapıyı kesinlikle yeni yapımızda override edemeyiz
        //Java buna kesinlikle izin vermiyor
        //bir classta final kullanırsak bu classtan hewrhangi bir alt sınıf türetemiyoruz(Direkt olarak)
        System.out.println(username);
        System.out.println(password);
    }
    
}
