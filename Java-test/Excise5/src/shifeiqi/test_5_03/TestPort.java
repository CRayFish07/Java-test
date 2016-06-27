package shifeiqi.test_5_03;

import java.net.DatagramSocket;
import java.net.SocketException;

import org.junit.Test;

/**
 * 
 * @author feiqishi
 *
 */
public class TestPort {

	@Test
	public void test() throws SocketException {
		boolean is = testPort(9999);
		if (is)
			System.out.println("�˿ڿ���ʹ��");
		else
			System.out.println("�˿��Ѿ���ռ��");
	}

	/**
	 * ���Զ˿�ռ�÷���
	 * 
	 * @param port
	 *            �˿ں�
	 * @return
	 */
	private boolean testPort(int port) {

		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(port);
			return true;
		} catch (SocketException e) {
			return false;
		}finally{
			ds.close();
		}
	}
}