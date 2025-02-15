//public class TestFlight extends JFrame {
//	private ArrayList<>Flight[] flights;
private ButtonGroup classesGroup = new ButtonGroup();
ArrayList<Flight> flights1 = new ArrayList<Flight>();
private ArrayList<FlightsComponent> flightComponents = new ArrayList<>();
//	Object[] flig = new Object[5];


//	public void CreateSql() throws ClassNotFoundException, SQLException{
//		public void populateFlights() {
//			
//		}
//	}
public void populateFlights(String from,String to,String date, int numPassengers) {
    try {
        System.out.println(from);
        System.out.println(to);
        System.out.println(date);
        String query = "SELECT * FROM flights WHERE departure=? AND destination=? AND flightDate=?;";
        String url = "jdbc:sqlite:/Users/adnan/eclipse-workspace/Study/src/project/airline.db";
//			Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(url);
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, from);
        preparedStatement.setString(2, to);
        preparedStatement.setString(3, date);
        System.out.println(preparedStatement);
        ResultSet rs = preparedStatement.executeQuery();
        
        while(rs.next()) {
            flights1.add(new Flight(rs.getInt("id"), rs.getString("departure"), rs.getString("destination"),rs.getString("departureTime"),rs.getString("arrivelTime"),rs.getString("flightDuration"), rs.getString("departureAirport"), rs.getString("destinationAirport"), rs.getInt("ecoPrice"),rs.getInt("busPrice"), rs.getString("flightDate")));
        }
    }
}  