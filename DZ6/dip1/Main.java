package DZ6.dip1;

import DZ6.dip1.model.Report;
import DZ6.dip1.model.ReportItem;
import DZ6.dip1.model.util.Printer;
import DZ6.dip1.model.util.ReportPrinter;
import DZ6.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {

        log.log(Level.INFO, "Стартовал метод main в пакете model");
        Printer<ReportItem> printer = new ReportPrinter();
        Report report = new Report(printer);
        report.calculate();
        report.output();
    }
}