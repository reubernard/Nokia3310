import java.util.Scanner;
public class Nokia3310 {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String prompt = """

        WELCOME TO NOKIA

        MAIN MENU

        Press

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

        """;

        System.out.print(prompt);
        int userInput = input.nextInt();

        switch (userInput) {

            case 1: {
                String phoneBookPrompt = """

                Phone book

                Press

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

                """;

                System.out.print(phoneBookPrompt);
                userInput = input.nextInt();

                switch (userInput) {

                    case 1: {
                        String searchPrompt = """

                        Search all your contacts

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(searchPrompt);
                        input.nextInt();
                        break;
                    }

                    case 2: {
                        String serviceNoPrompt = """

                        Service Numbers

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(serviceNoPrompt);
                        input.nextInt();
                        break;
                    }

                    case 3: {
                        String addNamePrompt = """

                        Add Name

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(addNamePrompt);
                        input.nextInt();
                        break;
                    }

                    case 4: {
                        String erasePrompt = """

                        Erase Contact

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(erasePrompt);
                        input.nextInt();
                        break;
                    }

                    case 5: {
                        String editPrompt = """

                        Edit Contact

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(editPrompt);
                        input.nextInt();
                        break;
                    }

                    case 6: {
                        String assignTonePrompt = """

                        Assign Tone

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(assignTonePrompt);
                        input.nextInt();
                        break;
                    }

                    case 7: {
                        String sendBcardPrompt = """

                        Send Business Card

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(sendBcardPrompt);
                        input.nextInt();
                        break;
                    }

                    case 8: {
                        String optionsPrompt = """

                        Options

                        Press

                        1   ->  Type of view
                        2   ->  Memory Status
                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(optionsPrompt);
                        input.nextInt();
                        break;
                    }

                    case 9: {
                        String speedDialsPrompt = """

                        Speed Dials

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(speedDialsPrompt);
                        input.nextInt();
                        break;
                    }

                    case 10: {
                        String voiceTagsPrompt = """

                        Voice Tags

                        Press

                        0   ->  To go back to Phone Book
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(voiceTagsPrompt);
                        input.nextInt();
                        break;
                    }
                }

                break;
            }

            case 2: {
                String messagesPrompt = """

                Messages

                Press

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

                """;

                System.out.print(messagesPrompt);
                userInput = input.nextInt();

                switch (userInput) {

                    case 1: {
                        String writeMessagePrompt = """

                        Write your message

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(writeMessagePrompt);
                        input.nextInt();
                        break;
                    }

                    case 2: {
                        String inboxPrompt = """

                        Inbox

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(inboxPrompt);
                        input.nextInt();
                        break;
                    }

                    case 3: {
                        String outboxPrompt = """

                        Outbox

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(outboxPrompt);
                        input.nextInt();
                        break;
                    }

                    case 4: {
                        String pictureMessages = """

                        Picture Messages

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(pictureMessages);
                        input.nextInt();
                        break;
                    }

                    case 5: {
                        String templates = """

                        Message Templates

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(templates);
                        input.nextInt();
                        break;
                    }

                    case 6: {
                        String smileys = """

                        Smileys

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(smileys);
                        input.nextInt();
                        break;
                    }

                    case 7: {
                        String messageSettings = """

                        Message Settings

                        Press

                        1   ->  Set
                        2   ->  Common
                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;

                        System.out.print(messageSettings);
                        userInput = input.nextInt();

                        switch (userInput) {

                            case 1: {
                                String setPrompt = """

                                Set Messages

                                Press

                                1   ->  Message centre number
                                2   ->  Message sent as
                                3   ->  Message validity
                                9   ->  To go back to Main Menu

                                """;
                                System.out.print(setPrompt);
                                input.nextInt();
                                break;
                            }

                            case 2: {
                                String commonPrompt = """

                                Common

                                Press

                                1   ->  Delivery Reports
                                2   ->  Reply via same centre
                                3   ->  Character support
                                9   ->  To go back to Main Menu

                                """;
                                System.out.print(commonPrompt);
                                input.nextInt();
                                break;
                            }
                        }

                        break;
                    }

                    case 8: {
                        String infoServices = """

                        Information Services

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(infoServices);
                        input.nextInt();
                        break;
                    }

                    case 9: {
                        String voiceMailboxNumber = """

                        Voice mailbox number

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(voiceMailboxNumber);
                        input.nextInt();
                        break;
                    }

                    case 10: {
                        String serviceCommandEditor = """

                        Service command editor

                        Press

                        0   ->  To go back to previous menu
                        9   ->  To go back to Main Menu

                        """;
                        System.out.print(serviceCommandEditor);
                        input.nextInt();
                        break;
                    }
                }

                break;
            }

            case 3: {
                String chatPrompt = """

                Chat

                Press

                0   ->  Go back
                9   ->  Main Menu

                """;
                System.out.print(chatPrompt);
                input.nextInt();
                break;
            }

            case 4: {
                String callRegisterPrompt = """

                Call Register

                Press

                1   ->  Missed calls
                2   ->  Received calls
                3   ->  Dialled numbers
                4   ->  Erase recent call lists
                5   ->  Show call duration
                6   ->  Show call costs
                7   ->  Call cost settings
                8   ->  Prepaid credit

                """;
                System.out.print(callRegisterPrompt);
                input.nextInt();
                break;
            }

            case 5: {
                String tonesPrompt = """

                Tones

                Press

                1   ->  Ringing tone
                2   ->  Ringing volume
                3   ->  Incoming call alert
                4   ->  Composer
                5   ->  Message alert tone
                6   ->  Keypad tones
                7   ->  Warning tones
                8   ->  Vibrating alert
                9   ->  Screen saver

                """;
                System.out.print(tonesPrompt);
                input.nextInt();
                break;
            }

            case 6: {
                String settingsPrompt = """

                Settings

                Press

                1   ->  Call settings
                2   ->  Phone settings
                3   ->  Security settings
                4   ->  Restore factory settings

                """;
                System.out.print(settingsPrompt);
                input.nextInt();
                break;
            }

            case 7: {
                String callDivertPrompt = """

                Call Divert

                Press

                0   ->  Back
                9   ->  Main Menu

                """;
                System.out.print(callDivertPrompt);
                input.nextInt();
                break;
            }

            case 8: {
                String gamesPrompt = """

                Games

                Press

                1   ->  Snake
                2   ->  Space Impact
                3   ->  Bantumi
                4   ->  Pairs II

                """;
                System.out.print(gamesPrompt);
                input.nextInt();
                break;
            }

            case 9: {
                String calcPrompt = """

                Calculator

                Press

                0   ->  Back
                9   ->  Main Menu

                """;
                System.out.print(calcPrompt);
                input.nextInt();
                break;
            }

            case 10: {
                String remindersPrompt = """

                Reminders

                Press

                0   ->  Back
                9   ->  Main Menu

                """;
                System.out.print(remindersPrompt);
                input.nextInt();
                break;
            }

            case 11: {
                String clockPrompt = """

                Clock

                Press

                1   ->  Alarm clock
                2   ->  Clock settings
                3   ->  Date setting
                4   ->  Stopwatch
                5   ->  Countdown timer
                6   ->  Auto update of date and time

                """;
                System.out.print(clockPrompt);
                input.nextInt();
                break;
            }

            case 12: {
                String profilesPrompt = """

                Profiles

                Press

                0   ->  Back
                9   ->  Main Menu

                """;
                System.out.print(profilesPrompt);
                input.nextInt();
                break;
            }

            case 13: {
                String simServicesPrompt = """

                SIM Services

                Press

                0   ->  Back
                9   ->  Main Menu

                """;
                System.out.print(simServicesPrompt);
                input.nextInt();
                break;
            }
        }
    }
}

