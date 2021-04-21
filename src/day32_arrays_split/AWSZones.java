package day32_arrays_split;
import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("---- Starting deployment of etsy app to AWS zones ----");
        System.out.println();

        String [] zonesSplit = zones.split(",");
        System.out.println(Arrays.toString(zonesSplit));

        System.out.println("Number of ',' -> "+zonesSplit.length);

        for(String eachZone : zonesSplit) {
            System.out.println("Deploying ["+app+"] to " +eachZone+ "...");
            System.out.println("Deployment completed for "+eachZone+"...");
        }
        System.out.println();
        System.out.println("----- All deployments complete, traffic enabled -----");
    }
}
