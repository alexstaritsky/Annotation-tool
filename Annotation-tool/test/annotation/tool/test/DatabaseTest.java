package annotation.tool.test;

import annotation.tool.*;

/**
 *
 * @author Alexander
 */
public class DatabaseTest {

    public static void main(String[] args) {
        DatabaseConnection test = new DatabaseConnection("cytosine.nl", "owe7_pg6", "blaat1234", 1521);
        System.out.println(DatabaseConnection.checkJDBCDriver());
        System.out.println(test.addBestand(0, "test", "testtype"));
        System.out.println(test.addBestand(1, "test1", "testtype"));
        System.out.println(test.addBestand(2, "test2", "testtype"));
        System.out.println(test.addBestand(3, "test3", "testtype"));
    }
}
