import java.util.Scanner;
public class Nokia3310{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

    String prompt = """
    

    WELCOME TO NOKIA
    
    MAIN MENU

    Press

    1   ->  Phone book
    2   ->  Messages
    3   ->  Chat
    4   ->  Call register
    5   ->  Tone
    6   ->  Settings
    7   ->  Call divert
    8   ->  Games
    9   ->  Calculator
    10  ->  Reminders
    11  ->  Clock
    12  ->  Profiles
    13  ->  SIM services
    
    """;

    System.out.print(prompt);
    int userInput = input.nextInt();

    switch (userInput){
        case 1 : {
            String phoneBookPrompt = """
            
            Phone book

            Press

            1   ->  Search
            2   ->  Service Nos.
            3   ->  Add name
            4   ->  Erace
            5   ->  Edit
            6   ->  Assign tone
            7   ->  Send b'card
            8   ->  Options
            9   ->  Speed dials
            10  ->  Voice tags
    
            """;

            System.out.print(phoneBookPrompt);
            userInput = input.nextInt();
            
            switch (userInput){
                
                case 1 : {
                    String searchPrompt = """
                    
                    Search all your contacts

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(searchPrompt);
                    userInput = input.nextInt();
                }

                case 2:{
                    String serviceNoPrompt = """
                    
                    Service Numbers

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(serviceNoPrompt);
                    userInput = input.nextInt();
                }

                case 3:{
                    String addNamePrompt = """
                    
                    Add Name

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(addNamePrompt);
                    userInput = input.nextInt();
                }

                case 4:{
                    String erasePrompt = """
                    
                    Erase

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(erasePrompt);
                    userInput = input.nextInt();
                }

                case 5:{
                    String editPrompt = """
                    
                    Service Numbers

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(editPrompt);
                    userInput = input.nextInt();
                }

                 case 6 :{
                    String assignTonePrompt = """
                    
                    Assign Tone

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(assignTonePrompt);
                    userInput = input.nextInt();
                }
                
                    case 7 :{
                    String sendBcodePrompt = """
                    
                    Assign Tone

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(sendBcodePrompt);
                    userInput = input.nextInt();
                }                
                        
                case 8:{
                    String optionsPrompt = """
                    
                    Options

                    Press

                    1   ->  Type of view
                    2   ->  Memory Status
                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(optionsPrompt);
                    userInput = input.nextInt();
                }
                
                case 9 :{
                    String speedDialsPrompt = """
                    
                    Speed Dials

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(speedDialPrompt);
                    userInput = input.nextInt();
                }

                case 10 :{
                    String voiceTagsPrompt = """
                    
                    Voice Tags

                    Press

                    0   ->  To go back to Phone Book
                    9   ->  To go back to Main Menu
                      
                    """;

                    System.out.print(voiceTagsPrompt);
                    userInput = input.nextInt();
                }
                    
            }
        }
        }
    
    
    }
    









}

}
