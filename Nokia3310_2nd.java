import java.util.Scanner;
public class Nokia3310_2nd {
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
                String phoneBookMenu = """

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
                0   ->  Exit App
                99  ->  Back

                """;
                System.out.print(phoneBookMenu);
                int phoneBookChoice = input.nextInt();

                switch (phoneBookChoice) {
                    case 1 -> System.out.println("Searching contacts");
                    case 2 -> System.out.println("Service numbers");
                    case 3 -> System.out.println("Adding name");
                    case 4 -> System.out.println("Erasing contact");
                    case 5 -> System.out.println("Editing contact");
                    case 6 -> System.out.println("Assigning tone");
                    case 7 -> System.out.println("Sending business card");
                    case 8 -> System.out.println("Options menu");
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                    case 0 -> { System.out.println("Exiting Nokia 3310. Goodbye"); return; }
                    case 99 -> { break; }
                    default -> System.out.println("Invalid input, try again.");
                }

                if (phoneBookChoice == 99) break;
            }
        }

        case 2 -> {
            while (true) {
                String messagesMenu = """

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
                0   ->  Exit App
                99  ->  Back

                """;
                System.out.print(messagesMenu);
                int msgChoice = input.nextInt();

                switch (msgChoice) {
                    case 1 -> System.out.println("Write your message");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture message");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");

                    case 7 -> {
                        while (true) {
                            String msgSettingsMenu = """

                            MESSAGE SETTINGS

                            1   -> Set
                            2   -> Common
                            0   -> Exit App
                            99  -> Back

                            """;
                            System.out.print(msgSettingsMenu);
                            int msChoice = input.nextInt();

                            switch (msChoice) {
                                case 1 -> System.out.println("Set messages");
                                case 2 -> System.out.println("Common settings");
                                case 0 -> { System.out.println("Exiting Nokia 3310. Goodbye!"); return; }
                                case 99 -> { break; }
                                default -> System.out.println("Invalid input, try again.");
                            }

                            if (msChoice == 99) break;
                        }
                    }

                    case 8 -> System.out.println("Information services");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                    case 0 -> { System.out.println("Exiting Nokia 3310. Goodbye!"); return; }
                    case 99 -> { break; }
                    default -> System.out.println("Invalid input, try again.");
                }

                if (msgChoice == 99) break;
            }
        }

        case 3 -> {
            while (true) {
                String chatMenu = """

                CHAT

                1   -> Start Chat
                99  -> Back

                """;
                System.out.print(chatMenu);
                int chatChoice = input.nextInt();

                if (chatChoice == 1) System.out.println("Chat started");
                if (chatChoice == 99) break;
            }
        }

        case 4 -> {
            while (true) {
                String callRegisterMenu = """

                CALL REGISTER

                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled numbers
                4 -> Erase recent call lists
                5 -> Show call duration
                6 -> Show call costs
                7 -> Call cost settings
                8 -> Prepaid credit
                0 -> Exit App
                9 -> Back

                """;

                System.out.print(callRegisterMenu);
                int crChoice = input.nextInt();

                switch (crChoice) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erasing recent call lists");
                    case 5 -> System.out.println("Call duration displayed");
                    case 6 -> System.out.println("Call costs displayed");
                    case 7 -> System.out.println("Call cost settings opened");
                    case 8 -> System.out.println("Prepaid credit displayed");
                    case 0 -> { System.out.println("Exiting Nokia 3310. Goodbye!"); return; }
                    case 9 -> { break; }
                    default -> System.out.println("Invalid input, try again.");
                }

                if (crChoice == 9) break;
            }
        }

        case 5 -> {
            while (true) {
                String tonesMenu = """

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

                """;
                System.out.print(tonesMenu);
                int tonesChoice = input.nextInt();

                if (tonesChoice == 0) break;
                System.out.println("Selected tone option " + tonesChoice);
            }
        }

        case 6 -> {
            while (true) {
                String settingsMenu = """

                SETTINGS

                1 -> Call settings
                2 -> Phone settings
                3 -> Security settings
                4 -> Restore factory settings
                0 -> Back

                """;
                System.out.print(settingsMenu);
                int setChoice = input.nextInt();

                switch (setChoice) {

                    case 1 -> {
                        while (true) {
                            String callSettingsMenu = """

                            CALL SETTINGS

                            1 -> Automatic redial
                            2 -> Speed dialling
                            3 -> Call waiting
                            4 -> Summary after call
                            5 -> Send my number
                            6 -> Phone line in use
                            7 -> Automatic answer
                            99 -> Back

                            """;
                            System.out.print(callSettingsMenu);
                            int callSettingsChoice = input.nextInt();

                            if (callSettingsChoice == 99) break;

                            System.out.println("Selected call setting " + callSettingsChoice);
                        }
                    }

                    case 2 -> {
                        while (true) {
                            String phoneSettingsMenu = """

                            PHONE SETTINGS

                            1 -> Language
                            2 -> Cell info display
                            3 -> Welcome note
                            4 -> Network selection
                            5 -> Lights
                            6 -> Confirm SIM service actions
                            99 -> Back

                            """;
                            System.out.print(phoneSettingsMenu);
                            int phoneSettingsChoice = input.nextInt();

                            if (phoneSettingsChoice == 99) break;

                            System.out.println("Selected phone setting " + phoneSettingsChoice);
                        }
                    }

                    case 3 -> {
                        while (true) {
                            String securitySettingsMenu = """

                            SECURITY SETTINGS

                            1 -> PIN code request
                            2 -> Call barring service
                            3 -> Fixed dialling
                            4 -> Closed user group
                            5 -> Phone security
                            6 -> Change access codes
                            99 -> Back

                            """;
                            System.out.print(securitySettingsMenu);
                            int securitySettingsChoice = input.nextInt();

                            if (securitySettingsChoice == 99) break;

                            System.out.println("Selected security option " + securitySettingsChoice);
                        }
                    }

                    case 4 -> System.out.println("Restoring factory settings");

                    case 0 -> { break; }
                    default -> System.out.println("Invalid input, try again.");
                }

                if (setChoice == 0) break;
            }
        }


        case 7 -> {
            while (true) {
                String callDivertMenu = """

                CALL DIVERT

                1 -> Divert all voice calls
                2 -> Divert when busy
                3 -> Divert when not answered
                4 -> Divert when switched off
                5 -> Cancel all diverts
                0 -> Back

                """;
                System.out.print(callDivertMenu);
                int callDivertChoice = input.nextInt();

                if (callDivertChoice == 0) break;

                System.out.println("Selected call divert option " + callDivertChoice);
            }
        }

        case 8 -> {
            while (true) {
                String gamesMenu = """

                GAMES

                1 -> Snake
                2 -> Space Impact
                3 -> Bantumi
                4 -> Pairs II
                0 -> Back

                """;
                System.out.print(gamesMenu);
                int gamesChoice = input.nextInt();

                if (gamesChoice == 0) break;

                System.out.println("Starting game " + gamesChoice + " (demo)");
            }
        }

        case 9 -> {
            System.out.println("Calculator opened");
        }

        case 10 -> {
            while (true) {
                String remindersMenu = """

                REMINDERS

                1 -> Add reminder
                2 -> View reminders
                3 -> Delete reminder
                0 -> Back

                """;
                System.out.print(remindersMenu);
                int remindersChoice = input.nextInt();

                if (remindersChoice == 0) break;

                System.out.println("Selected reminder option " + remindersChoice);
            }
        }

        case 11 -> {
            while (true) {
                String clockMenu = """

                CLOCK

                1 -> Alarm clock
                2 -> Clock settings
                3 -> Date setting
                4 -> Stopwatch
                5 -> Countdown timer
                6 -> Auto update
                0 -> Back

                """;
                System.out.print(clockMenu);
                int clockChoice = input.nextInt();

                switch (clockChoice) {
                    case 1 -> System.out.println("Alarm clock settings");
                    case 2 -> System.out.println("Clock display settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch started (demo)");
                    case 5 -> System.out.println("Countdown timer started (demo)");
                    case 6 -> System.out.println("Auto update toggled (demo)");
                    case 0 -> { break; }
                    default -> System.out.println("Invalid input, try again.");
                }

                if (clockChoice == 0) break;
            }
        }

        case 12 -> {
            while (true) {
                String profilesMenu = """

                PROFILES

                0 -> Back

                """;
                System.out.print(profilesMenu);
                int profilesChoice = input.nextInt();

                if (profilesChoice == 0) break;

                System.out.println("Profile selected: " + profilesChoice);
            }
        }

        case 13 -> {
            while (true) {
                String simServicesMenu = """

                SIM SERVICES

                1 -> SIM Menu 1
                2 -> SIM Menu 2
                3 -> SIM Menu 3
                0 -> Back

                """;
                System.out.print(simServicesMenu);
                int simServicesChoice = input.nextInt();

                if (simServicesChoice == 0) break;

                System.out.println("SIM service selected: " + simServicesChoice);
            }
        }

        case 0 -> {
            System.out.println("Exiting Nokia 3310. Goodbye!");
            return;
        }

        default -> System.out.println("Invalid input, try again.");
}
}
}
}

