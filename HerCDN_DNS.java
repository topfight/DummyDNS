import java.net.InetAddress;
import java.net.ServerSocket;

public class HerCDN_DNS implements Runnable{
	private ServerSocket my_sock;
	public HerCDN_DNS(InetAddress addr, int port) throws Exception{
		my_sock= new ServerSocket(port, 100, addr);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
