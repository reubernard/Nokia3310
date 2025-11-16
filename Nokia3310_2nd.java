import java.util.Scanner;
public class Nokia3310_2nd{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        while (true) {
            String mainMenu = """

            WELCOME TO NOKIA

            MAIN MENU

            1   ->  Phone book
            2   ->  Messages
            3   ->  Chat
            4   ->  Call register
            5   ->  Tones
            6   ->  Settings
            7   ->  Call divert
            8   ->  Games
            9   ->  Calculator
            10  ->  Reminders
            11  ->  Clock
            12  ->  Profiles
            13  ->  SIM services
            0   ->  Exit

            """;

            System.out.print(mainMenu);
            int mainChoice = input.nextInt();

            switch (mainChoice) {
                case 1 -> {
                    while (true) {
                        String phoneBook = """

                        PHONE BOOK

                        1   ->  Search
                        2   ->  Service Nos.
                        3   ->  Add name
                        4   ->  Erase
                        5   ->  Edit
                        6   ->  Assign tone
                        7   ->  Send b'card
                        8   ->  Options
                        9   ->  Speed dials
                        10  ->  Voice tags
                        0   ->  exit
                        99   ->  back

                        """;
                        System.out.print(phoneBook);
                        int phoneBookChoice = input.nextInt();

                        switch (phoneBookChoice) {
                            case 1  -> System.out.println("Searching contacts");
                            case 2  -> System.out.println("Service numbers");
                            case 3  -> System.out.println("Adding name");
                            case 4  -> System.out.println("Erasing contact");
                            case 5  -> System.out.println("Editing contact");
                            case 6  -> System.out.println("Assigning tone");
                            case 7  -> System.out.println("Sending business card");
                            case 8  -> System.out.println("Options menu");
                            case 9  -> System.out.println("Speed dials");
                            case 10 -> System.out.println("Voice tags");
                            case 0  -> {System.out.println("Exiting Nokia 3310. Goodbye!");return;}
                            case 99 -> { break; }
                            default -> System.out.println("Invalid input, try again.");
                        }
                        if (phoneBookChoice == 99) break;
                    }
                }

                case 2 -> {
                    while (true) {
                        String messages = """

                        MESSAGES

                        1   ->  Write message
                        2   ->  Inbox
                        3   ->  Outbox
                        4   ->  Picture message
                        5   ->  Templates
                        6   ->  Smileys
                        7   ->  Message settings
                        8   ->  Info service
                        9   ->  Voice mailbox number
                        10  ->  Service command editor
                        0   ->  Back
                        99   ->  Main Menu

                        """;
                        System.out.print(messages);
                        int msgChoice = input.nextInt();

                        switch (msgChoice) {
                            case 1 -> System.out.println("Write your message");
                            case 2 -> System.out.println("Inbox");
                            case 3 -> System.out.println("Outbox...");
                            case 4 -> System.out.println("Picture messages");
                            case 5 -> System.out.println("Message templates");
                            case 6 -> System.out.println("Smileys...");
                            case 7 -> {
                                while (true) {
                                    String msgSettings = """

                                    MESSAGE SETTINGS

                                    1   -> Set
                                    2   -> Common
                                    0   -> Exit
                                    99  -> back

                                    """;
                                    System.out.print(msgSettings);
                                    int msChoice = input.nextInt();

                                    switch (msChoice) {
                                        case 1 -> System.out.println("Set messages");
                                        case 2 -> System.out.println("Common settings");
                                        case 0 -> {System.out.println("Exiting Nokia 3310. Goodbye!"); return;}
                                        case 99 -> { break; }
                                        default -> System.out.println("Invalid input, try again.");
                                    }
                                    if (msChoice == 99) break;
                                }
                            }
                            case 8  -> System.out.println("Information services");
                            case 9  -> System.out.println("Voice mailbox number");
                            case 10 -> System.out.println("Service command editor");
                            case 0  -> {System.out.println("Exiting Nokia 3310. Goodbye!"); return;}
                            case 99 -> { break; }
                            default -> System.out.println("Invalid input, try again.");
                        }
                        if (msgChoice == 99) break;
                    }
                }

                case 3 -> {
                    while (true) {
                        String chat = """

                        CHAT

                        99   -> back

                        """;
                        System.out.print(chat);
                        int chatChoice = input.nextInt();
                        if (chatChoice == 0 || chatChoice == 99) break;
                    }
                }

                case 4 -> {
                    while (true) {
                        String callReg = """

                        CALL REGISTER

                        1 -> Missed calls
                        2 -> Received calls
                        3 -> Dialled numbers
                        4 -> Erase recent call lists
                        5 -> Show call duration
                        6 -> Show call costs
                        7 -> Call cost settings
                        8 -> Prepaid credit
                        0 -> exit
                        9 -> back

                        """;
                        System.out.print(callReg);
                        int crChoice = input.nextInt();
                        if (crChoice == 9) break;
                        System.out.println("Selected option " + crChoice);
                        if (crChoice == 0) return;
                    }
                }

                case 5 -> {
                    while (true) {
                        String tones = """

                        TONES

                        1 -> Ringing tone
                        2 -> Ringing volume
                        3 -> Incoming call alert
                        4 -> Composer
                        5 -> Message alert tone
                        6 -> Keypad tones
                        7 -> Warning tones
                        8 -> Vibrating alert
                        9 -> Screen saver
                        0 -> Back
                        9 -> Main Menu

                        """;
                        System.out.print(tones);
                        int tonesChoice = input.nextInt();
                        if (tonesChoice == 0 || tonesChoice == 9) break;
                        System.out.println("Selected option " + tonesChoice);
                    }
                }

                case 6 -> {
                    while (true) {
                        String settings = """

                        SETTINGS

                        1 -> Call settings
                        2 -> Phone settings
                        3 -> Security settings
                        4 -> Restore factory settings
                        0 -> Back
                        9 -> Main Menu

                        """;
                        System.out.print(settings);
                        int setChoice = input.nextInt();
                        if (setChoice == 0 || setChoice == 9) break;
                        System.out.println("Selected option " + setChoice);
                    }
                }

                case 7 -> {
                    while (true) {
                        String callDivert = """

                        CALL DIVERT

                        0 -> Back
                        9 -> Main Menu

                        """;
                        System.out.print(callDivert);
                        int cdChoice = input.nextInt();
                        if (cdChoice == 0 || cdChoice == 9) break;
                    }
                }

                case 8 -> {
                    while (true) {
                        String games = """

                        GAMES

                        1 -> Snake
                        2 -> Space Impact
                        3 -> Bantumi
                        4 -> Pairs II
                        0 -> Back
                        9 -> Main Menu

                        """;
                        System.out.print(games);
                        int gameChoice = input.nextInt();
                        if (gameChoice == 0 || gameChoice == 9) break;
                        System.out.println("Selected option " + gameChoice);
                    }
                }

                case 9 -> System.out.println("Calculator opened");
                case 10 -> System.out.println("Reminders opened");
                case 11 -> System.out.println("Clock opened");
                case 12 -> System.out.println("Profiles opened");
                case 13 -> System.out.println("SIM Services opened");
                case 0 -> {
                    System.out.println("Exiting Nokia 3310. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid input, try again.");
            }
        }
    }
}

