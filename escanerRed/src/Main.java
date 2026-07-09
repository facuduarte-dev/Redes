import java.util.Scanner;
import java.net.InetAddress;
import java.util.ArrayList;

public class Main{
    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la ip a escanear");
        String ipIngresada = sc.nextLine();

        ArrayList<String> ipsActivas = new ArrayList<>();


        for(int i =1; i <= 30; i++ ) {

            String ipActual = ipIngresada + "." + i;
            InetAddress ip = InetAddress.getByName(ipActual);
            if(ip.isReachable(1000)){
                ipsActivas.add(ipActual);
                System.out.println("La ip " + ip + " Esta activa");
            }else{
                System.out.println("La ip " + ip + " Esta Desactivada");
            }

        }

        System.out.println("Las ip activas son: ");
        for(String equipo : ipsActivas){
            System.out.println(equipo);
        }
        
        Equipo pc = new Equipo(
            "192.168.1.24",
            "ea:5d:9b:81:8b:17",
            true
        );

        System.out.println("IP: " + pc.getIp());
        System.out.println("MAC: " + pc.getMac());
        System.out.println("Activo: " + pc.isActivo());
    }
}
