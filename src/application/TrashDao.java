package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

 
public class TrashDao {
    private Connection conn; //DB 커넥?�� ?���? 객체
    private static final String USERNAME = "root";//DBMS?��?�� ?�� ?��?��?��
    private static final String PASSWORD = "1234";//DBMS?��?�� ?�� 비�?번호
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";//DBMS?��?��?�� db�?
    public TrashDao() {
        try {
            System.out.println("generator");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("fale ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
    }
    public ArrayList<SInformation> search(String cit, String dis, String area) {
    	ArrayList<SInformation> articles = new ArrayList<SInformation>();
    	String sql = "SELECT ��ȣ, �õ���, �ñ�����, ����������, ����������������� FROM info_table where �õ��� = '" + cit + "' AND �ñ����� = '" +dis +"' AND ����������������� like '%" + area + "%'";
    	ResultSet rs = null;
    	
		Connection conn = null;
		Statement st = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Integer pk = rs.getInt("��ȣ");
				String city = rs.getString("�õ���");
				String district = rs.getString("�ñ�����");
				String manageName = rs.getString("����������");
				String areaName = rs.getString("�����������������");
				SInformation trash = new SInformation(pk, city, district,manageName, areaName);
				articles.add(trash);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articles;
	}
    public SInformation findByCode(int id){
		Connection conn = null;
		ResultSet rs = null;
		Statement st = null;
		SInformation tra = new SInformation();
		String sql = "SELECT * FROM info_table WHERE ��ȣ=" + id;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {			
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			rs.next();
			Integer pk = rs.getInt("��ȣ");
			String city = rs.getString("�õ���");
			String district = rs.getString("�ñ�����");
			String manageName = rs.getString("����������");
			String areaName = rs.getString("�����������������");
			String dischargeType = rs.getString("�����������");
			String dischargePlace = rs.getString("�������");
			String lifeWay = rs.getString("��Ȱ�����������");
			String foodWay = rs.getString("���Ĺ������������");
			String recycleWay = rs.getString("��Ȱ��ǰ������");
			String tempWay = rs.getString("�Ͻ����ٷ���⹰������");
			String tempPlace = rs.getString("�Ͻ����ٷ���⹰�������");
			String phoneNum = rs.getString("�����μ���ȭ��ȣ");
			String lifeDay = rs.getString("��Ȱ������������");
			String foodDay = rs.getString("���Ĺ�������������");
			String recycleDay = rs.getString("��Ȱ��ǰ�������");
			String lifeStartTime = rs.getString("��Ȱ�����������۽ð�");
			String foodStartTime = rs.getString("���Ĺ������������۽ð�");
			String recycleStartTime = rs.getString("��Ȱ��ǰ������۽ð�");
			String tempStartTime = rs.getString("�Ͻ����ٷ���⹰������۽ð�");
			String lifeEndTime = rs.getString("��Ȱ�������������ð�");
			String foodEndTime = rs.getString("���Ĺ��������������ð�");
			String recycleEndTime = rs.getString("��Ȱ��ǰ��������ð�");
			String tempEndTime = rs.getString("�Ͻ����ٷ���⹰��������ð�");
			String uncollectedDate = rs.getString("�̼�����");
			String Department = rs.getString("�����μ���");
			
			
			
			SInformation trash = new SInformation( pk,  city,  district, manageName,  areaName,  dischargeType, dischargePlace,  lifeWay,  foodWay,  recycleWay,  tempWay, 
			          tempPlace,  lifeDay,  foodDay,  recycleDay,  lifeStartTime,  foodStartTime ,  recycleStartTime,  tempStartTime,  lifeEndTime, 
			          foodEndTime ,  recycleEndTime ,  tempEndTime ,  uncollectedDate,  Department,  phoneNum);
			tra = trash;
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}	
		return tra;
	}
    
}
 