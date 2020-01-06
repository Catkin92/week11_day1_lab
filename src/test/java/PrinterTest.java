import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before() {
        printer = new Printer(10);
    }

    @Test
    public void hasSheets() {
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void printerCanPrint() {
        printer.print(5, 1);
        assertEquals(5, printer.getSheets());
    }

    @Test
    public void printerCantPrintNoPaper() {
        printer.print(5, 3);
        assertEquals(10, printer.getSheets());
    }
}
