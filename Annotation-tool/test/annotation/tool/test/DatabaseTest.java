package annotation.tool.test;

import annotation.tool.*;

/**
 *
 * @author Alexander
 */
public class DatabaseTest {

    public static void main(String[] args) throws Exception {
        DatabaseConnection test = new DatabaseConnection("cytosine.nl", "owe7_pg6", "blaat1234", 1521);
        System.out.println(test.checkBestand("testfasta"));
    }
}
