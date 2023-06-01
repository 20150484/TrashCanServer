package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

 
public class TrashDao {
    private Connection conn; //DB 而ㅻ꽖?뀡 ?뿰寃? 媛앹껜
    private static final String USERNAME = "root";//DBMS?젒?냽 ?떆 ?븘?씠?뵒
    private static final String PASSWORD = "1234";//DBMS?젒?냽 ?떆 鍮꾨?踰덊샇
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";//DBMS?젒?냽?븷 db紐?
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
    	String sql = "SELECT 번호, 시도명, 시군구명, 관리구역명, 관리구역대상지역명 FROM info_table where 시도명 = '" + cit + "' AND 시군구명 = '" +dis +"' AND 관리구역대상지역명 like '%" + area + "%'";
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
				Integer pk = rs.getInt("번호");
				String city = rs.getString("시도명");
				String district = rs.getString("시군구명");
				String manageName = rs.getString("관리구역명");
				String areaName = rs.getString("관리구역대상지역명");
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
		String sql = "SELECT * FROM info_table WHERE 번호=" + id;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {			
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			rs.next();
			Integer pk = rs.getInt("번호");
			String city = rs.getString("시도명");
			String district = rs.getString("시군구명");
			String manageName = rs.getString("관리구역명");
			String areaName = rs.getString("관리구역대상지역명");
			String dischargeType = rs.getString("배출장소유형");
			String dischargePlace = rs.getString("배출장소");
			String lifeWay = rs.getString("생활쓰레기배출방법");
			String foodWay = rs.getString("음식물쓰레기배출방법");
			String recycleWay = rs.getString("재활용품배출방법");
			String tempWay = rs.getString("일시적다량폐기물배출방법");
			String tempPlace = rs.getString("일시적다량폐기물배출장소");
			String phoneNum = rs.getString("관리부서전화번호");
			String lifeDay = rs.getString("생활쓰레기배출요일");
			String foodDay = rs.getString("음식물쓰레기배출요일");
			String recycleDay = rs.getString("재활용품배출요일");
			String lifeStartTime = rs.getString("생활쓰레기배출시작시각");
			String foodStartTime = rs.getString("음식물쓰레기배출시작시각");
			String recycleStartTime = rs.getString("재활용품배출시작시각");
			String tempStartTime = rs.getString("일시적다량폐기물배출시작시각");
			String lifeEndTime = rs.getString("생활쓰레기배출종료시각");
			String foodEndTime = rs.getString("음식물쓰레기배출종료시각");
			String recycleEndTime = rs.getString("재활용품배출종료시각");
			String tempEndTime = rs.getString("일시적다량폐기물배출종료시각");
			String uncollectedDate = rs.getString("미수거일");
			String Department = rs.getString("관리부서명");
			
			
			
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
 