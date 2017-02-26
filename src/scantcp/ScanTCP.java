/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scantcp;

/**
 *
 * @author ncvescera
 */
public class ScanTCP {

    /**
     * @param args the command line arguments
     */
    
    //arg1 = ip
    //arg2 = port (senza si scanzionano tutte)[può essere anche prot-port]
    public static void main(String[] args) {
        Scanner scan;
        switch (args.length) {
            case 0:
                System.err.println("Missing arguments!");
                break;
            case 1:
                scan = new Scanner(args[0]);
                scan.scan();
                break;
            case 2:
                if(args[1].indexOf("-") > 0){
                    scan = new Scanner(args[0],args[1]);
                    scan.scan();
                }
                else {
                    scan = new Scanner(args[0], Integer.parseInt(args[1]));
                    scan.scan();
                }
                break;
            default:
                System.err.println("Missing arguments!");
                break;
        }
      
    }
    
}
