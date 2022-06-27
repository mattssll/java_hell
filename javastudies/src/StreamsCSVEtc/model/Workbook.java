package StreamsCSVEtc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.List;

public class Workbook {
    // static fields to help build the html table
    public String htmlHeader = "<html>"+"\n"+"<body>"+"\n";
    public String tableHeader = "<table>"+"\n"+"<tr>"+"\n";
    public String tableBottom = "</table>"+"\n";
    public String htmlBottom = "</body>"+"\n"+"</html>";

    public Workbook() {
    }


    // dynamically generate table headers
    public String createWorkbookCols(Field[] tableCols) {
        String tableColumns = "";
        for (Field col : tableCols) {
            String th = "<th>" + col.getName() + "</th>"+"\n";
            tableColumns += th;
        }
        return tableColumns;
    }

    // dynamically generate table rows
    public String createTableRow(People person) throws IllegalAccessException {
        String tableRow = "<tr>"+"\n";
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
            String tValue = "<td>" + field.get(person) + "</td>"+"\n";
            tableRow += tValue;
        }
        tableRow = tableRow + "</tr>"+"\n";
        return tableRow;
    }
}
