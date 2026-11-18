public class CoffeeShopAnalyzer {
    public static void main(String[] args) {
                // Gumagawa ng array para sa sales bawat araw
                int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};

                // Gumagawa ng array para sa pangalan ng mga araw
                String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

                // Nagse-set ng starting value ng total sales
                int totalSales = 0;

                // Nagse-set ng unang value bilang pinakamataas at pinakamababa
                int maxSales = weeklySales[0];
                int minSales = weeklySales[0];

                // Ini-store ang pangalan ng best at worst day
                String bestDay = days[0];
                String worstDay = days[0];

                // Ipinapakita ang daily sales
                System.out.println("--- Daily Sales ---");

                // Inuulit ang bawat element ng array
                for (int i = 0; i < weeklySales.length; i++) {

                    // Ipinapakita ang araw at sales nito
                    System.out.println(days[i] + " sales: " + weeklySales[i]);

                    // Dinadagdag ang sales sa total
                    totalSales = totalSales + weeklySales[i];

                    // Chine-check kung mas mataas ang sales
                    if (weeklySales[i] > maxSales) {
                        maxSales = weeklySales[i];
                        bestDay = days[i];
                    }

                    // Chine-check kung mas mababa ang sales
                    if (weeklySales[i] < minSales) {
                        minSales = weeklySales[i];
                        worstDay = days[i];
                    }
                }

                // Kinukuha ang average sales
                double averageSales = (double) totalSales / weeklySales.length;

                // Ipinapakita ang weekly summary
                System.out.println("\n--- Weekly Summary ---");
                System.out.println("Total Sales: " + totalSales);
                System.out.println("Average Sales: " + averageSales);

                // Ipinapakita ang pinakamataas at pinakamababang sales
                System.out.println("\n--- Best and Worst ---");
                System.out.println("Best Day: " + bestDay + " - " + maxSales);
                System.out.println("Worst Day: " + worstDay + " - " + minSales);
            }
        }