public class Equipo{

    private String ip;
    private String mac;
    private boolean isActivo;

    //Constructor
    public Equipo(String ip, String mac, boolean isActivo){
        this.ip = ip; //la ip (QUE PERTENECE A ESTE EQUIPO) de este va a ser = a la que reciba
        this.mac = mac;
        this.isActivo = isActivo; 
    }

    public String getIp(){
        return ip;
    }

    public String getMac(){
        return mac;
    }

    public boolean isActivo(){
        return isActivo;
    }

}