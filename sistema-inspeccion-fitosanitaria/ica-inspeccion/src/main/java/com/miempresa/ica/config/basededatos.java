@Configuration
public class basededatos {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
        dataSource.setUsername("INSPECCION");
        dataSource.setPassword("INSPECCION1234");
        return dataSource;
    }
}
