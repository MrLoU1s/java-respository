public class Apps{

int users ;

public Apps(int users){
this.users=users;
}

public void setUsers(int users){
this.users=users;
}

public int getUsers(){
return users;
}

public static void main(String[] args){
Apps myApps = new Apps();
System.out.printf(" The number of users in Apps are : ");
System.out.println(myApps.getUsers());
}
} 