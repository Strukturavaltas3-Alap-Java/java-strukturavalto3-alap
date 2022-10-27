package week14.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clients {

    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client){
        clients.add(client);
        Collections.sort(clients);
    }


    public Client findClientByRegNumber(String regNumber){
        List<Client> other = new ArrayList<>(clients);
       //Collections.sort(other);

        int index = Collections.binarySearch(other,new Client(null,regNumber));
        if(index<0){
            throw new IllegalArgumentException("Client not found:"+regNumber);
        }
        return other.get(index);
    }

    public Client findByRegNumberIndexOf(String regNumber){
        int index = clients.indexOf(new Client(null,regNumber));
        return clients.get(index);
    }

    public Client findByRegNumberOwnBinarySearch(String regNumber){
        int start = 0;
        int end = clients.size()-1;

        while(start<=end){
            int middle = (start+end)/2;
            String actualRegNumber = clients.get(middle).getRegNumber();
            if(actualRegNumber.equals(regNumber)){
                return clients.get(middle);
            }
            else if(actualRegNumber.compareTo(regNumber)<0){
                start=middle+1;
            }else {
                end = middle - 1;
            }
        }
        throw new IllegalArgumentException("Cannot find!");
    }

    public List<Client> getClients(){
       ArrayList<Client> result = new ArrayList<>();
       for(Client actual : clients){
           result.add(new Client(actual));
       }
       return result;
    }

    public List<Client> getOriginalClientsNewList(){
        return new ArrayList<>(clients);
    }
    public List<Client> getOriginalClients(){
        return clients;
    }

    public List<Client> getAllClients(){
        List<Client> newClients = new ArrayList<>(clients);
        Collections.copy(newClients,clients);
        return newClients;
    }

    public static void main(String[] args) {
        Clients c = new Clients();
        c.addClient(new Client("John","1"));
        c.addClient(new Client("Jack","4"));
        c.addClient(new Client("Jane","3"));
        c.addClient(new Client("Jill","2"));
        c.addClient(new Client("Jasmine","5"));
        System.out.println(c.getAllClients());
        System.out.println(c.getOriginalClientsNewList());
        System.out.println(c.getOriginalClients());
        System.out.println(c.getClients());
    }


}
