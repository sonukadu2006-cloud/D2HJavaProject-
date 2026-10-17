import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Core data variables
        int balance = 100;
        String email = "";
        String phone = "";
        String subscribedPack = "None";
        String addedChannels = "None";
        String subscribedServices = "None";

        Scanner input = new Scanner(System.in);

        // 2. Continuous system loop
        while (true) {
            System.out.println("\nWelcome to SatTV");
            System.out.println("1. View current balance in the account");
            System.out.println("2. Recharge Account");
            System.out.println("3. View available packs, channels and services");
            System.out.println("4. Subscribe to base packs");
            System.out.println("5. Add channels to an existing subscription");
            System.out.println("6. Subscribe to special services");
            System.out.println("7. View current subscription details");
            System.out.println("8. Update email and phone number for notifications");
            System.out.println("9. Exit");
            
            System.out.print("Enter the option: ");
            int option = input.nextInt();
            
            // --- Option 1: View Balance ---
            if (option == 1) {
                System.out.println("Current balance is " + balance + " Rs.");
            } 
            // --- Option 2: Recharge ---
            else if (option == 2) {
                System.out.print("Enter the amount to recharge: ");
                int amount = input.nextInt(); 
                balance = balance + amount; 
                System.out.println("Recharge completed successfully.");
                System.out.println("Current balance is " + balance + " Rs.");
            }
            // --- Option 3: Price View ---
            else if (option == 3) {
                System.out.println("\n--- Available Packs & Channels ---");
                System.out.println("Silver Pack: 50 Rs. (Zee, Sony, Star Plus)");
                System.out.println("Gold Pack: 100 Rs. (All Silver + Sports channels)");
                System.out.println("Channels: Zee (10 Rs), Sony (15 Rs), Star Sports (20 Rs)");
                System.out.println("Services: Learn Cooking (20 Rs), Learn Fitness (30 Rs)");
            }
            // --- Option 4: Base Packs ---
            else if (option == 4) {
                System.out.print("Enter the pack you wish to subscribe (Silver 'S' or Gold 'G'): ");
                String choice = input.next();
                
                if (choice.equalsIgnoreCase("S")) {
                    if (balance >= 50) {
                        balance = balance - 50;
                        subscribedPack = "Silver Pack";
                        System.out.println("Subscribed to Silver Pack successfully.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                } 
                else if (choice.equalsIgnoreCase("G")) {
                    if (balance >= 100) {
                        balance = balance - 100;
                        subscribedPack = "Gold Pack";
                        System.out.println("Subscribed to Gold Pack successfully.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                }
            }
            // --- Option 5: Add Channels ---
            else if (option == 5) {
                System.out.print("Enter channel name to add (Zee / Sony / StarSports): ");
                String channel = input.next();
                int cost = 0;
                
                if (channel.equalsIgnoreCase("Zee")) cost = 10;
                else if (channel.equalsIgnoreCase("Sony")) cost = 15;
                else if (channel.equalsIgnoreCase("StarSports")) cost = 20;

                if (cost > 0) {
                    if (balance >= cost) {
                        balance = balance - cost;
                        addedChannels = channel;
                        System.out.println("Channel added successfully.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                } else {
                    System.out.println("Invalid Channel.");
                }
            }
            // --- Option 6: Special Services ---
            else if (option == 6) {
                System.out.print("Enter service to subscribe (Cooking / Fitness): ");
                String service = input.next();
                int cost = 0;
                
                if (service.equalsIgnoreCase("Cooking")) cost = 20;
                else if (service.equalsIgnoreCase("Fitness")) cost = 30;

                if (cost > 0) {
                    if (balance >= cost) {
                        balance = balance - cost;
                        subscribedServices = service;
                        System.out.println("Subscribed to service successfully.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                } else {
                    System.out.println("Invalid Service.");
                }
            }
            // --- Option 7: Subscription Details ---
            else if (option == 7) {
                System.out.println("\n--- Subscription Details ---");
                System.out.println("Current Balance: " + balance + " Rs.");
                System.out.println("Registered Email: " + email);
                System.out.println("Registered Phone: " + phone);
                System.out.println("Subscribed Pack: " + subscribedPack);
                System.out.println("Added Channels: " + addedChannels);
                System.out.println("Special Services: " + subscribedServices);
            }
            // --- Option 8: Update Contact Info ---
            else if (option == 8) {
                System.out.print("Enter email address: ");
                email = input.next();
                
                System.out.print("Enter phone number: ");
                phone = input.next();
                
                System.out.println("Email and phone number updated successfully.");
            }
            // --- Option 9: Exit ---
            else if (option == 9) {
                System.out.println("Thank you for using SatTV!");
                break; 
            }
        } 
        input.close();
    } 
}
