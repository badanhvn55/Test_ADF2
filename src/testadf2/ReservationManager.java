/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testadf2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ReservationManager {

    PriorityQueue<Passenger> pq = new PriorityQueue<>();
    Passenger psg = new Passenger();

    Scanner scan = new Scanner(System.in);

    public void addPassenger() {
        System.out.println("---------- Add information service -----------");
        System.out.println("Enter passenger name: ");
        String name = scan.nextLine();
        System.out.println("Enter Reservation ID: ");
        String id = scan.nextLine();
        System.out.println("Enter passenger address: ");
        String address = scan.nextLine();
        System.out.println("Enter passenger phone number: ");
        String phone = scan.nextLine();
        System.out.println("Enter Reservation time start: ");
        String start = scan.nextLine();
        System.out.println("Enter Reservation time end: ");
        String end = scan.nextLine();

        psg.setName(name);
        psg.setAddress(address);
        psg.setPhone(phone);
        psg.setId(id);
        psg.setTimeEnd(end);
        psg.setTimeStart(start);
        pq.add(psg);

        System.out.println("Add information success!");
    }
    
    

    public void modifyPassenger() {
        if (pq.isEmpty() == false) {
            System.out.println("---------- Search and modify -----------");
            System.out.println("Enter Reservation ID: ");
            String strId = scan.nextLine();
            pq.forEach(psg1 -> {
                if (psg1.getId() == null ? strId == null : psg1.getId().equals(strId)) {
                    System.out.println("----------- Information Passenger ----------");
                    System.out.println("name: " + psg1.getName());
                    System.out.println("id: " + psg1.getId());
                    System.out.println("address: " + psg1.getAddress());
                    System.out.println("phone: " + psg1.getPhone());
                    System.out.println("date start: " + psg1.getTimeStart());
                    System.out.println("date end: " + psg1.getTimeEnd());
                    System.out.println("---------------------------------------------");
                    System.out.println("Please enter new name: ");
                    String name = scan.nextLine();
                    System.out.println("Please enter new address: ");
                    String address = scan.nextLine();
                    System.out.println("Please enter new phone: ");
                    String phone = scan.nextLine();
                    System.out.println("Please enter new time start: ");
                    String start = scan.nextLine();
                    System.out.println("Please enter new time end: ");
                    String end = scan.nextLine();

                    psg1.setName(name);
                    psg1.setAddress(address);
                    psg1.setPhone(phone);
                    psg1.setId(strId);
                    psg1.setTimeEnd(end);
                    psg1.setTimeStart(start);
                    System.out.println("Change information success!");

                } else {
                    System.err.println("ID not valid!");
                }
            });
        } else {
            System.out.println("No data...");
        }
    }

    public void displayPassenger() {
        if (pq.isEmpty() == false) {
            pq.forEach(arr -> {
                System.out.println("-------- Information passenger --------");
                System.out.println(" - Name: " + arr.getName() + " - ID: " + arr.getId() + " - Phone: " + arr.getPhone());
                System.out.println(" Address: " + arr.getAddress() + " - Time start: " + arr.getTimeStart() + " - Time end: " + arr.getTimeEnd());
            });
        } else {
            System.out.println("No data");
        }

    }

}
