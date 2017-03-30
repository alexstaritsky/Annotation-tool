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
        System.out.println(test.addBestand("test", "testtype"));
        System.out.println(test.addBestand("test1", "testtype"));
        System.out.println(test.addBestand("test2", "testtype"));
        System.out.println(test.addBestand("test3", "testtype"));
        System.out.println(test.getBestanden());
    }
}
