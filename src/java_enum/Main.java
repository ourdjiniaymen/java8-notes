package java_enum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Exercise one
        // exerciseOne();
        // Exercise two
        System.out.println("----Exercise Two----");
        exerciseTwo();
        // Exercise three
        System.out.println("----Exercise Three----");
        exerciseThree();
        // Exercise four
        System.out.println("----Exercise Four----");
        exerciseFour();
        // Exercise five
        System.out.println("----Exercise Five----");
        exerciseFive();
        // Exercise six
        System.out.println("----Exercise Six----");
        exerciseSix();
    }

    public static void exerciseOne() {
        /*
        Advanced Traffic Light System
         */
        TrafficLight active = TrafficLight.values()[0];
        System.out.println(active);
        int timer = 0;
        while (true) {
            System.out.println("Timer " + timer);
            try {
                Thread.sleep(1000);
                timer += 1;
                if (timer == active.getDuration()) {
                    active = active.next();
                    timer = 0;
                    System.out.println(active);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void exerciseTwo() {
        /*
        Payment System
         */
        try {
            System.out.println(PaymentStatus.getStatusFromDescription("Pending transaction"));
        } catch (NoSuchElementException e) {
            System.out.println("No Status with the provided description");
        }
    }

    public static void exerciseThree() {
        /*
        Enum with Abstract Methods
         */
        System.out.println("Add =>" + Operation.ADD.apply(1, 2));
        System.out.println("Subtract =>" + Operation.SUBTRACT.apply(1, 2));
        System.out.println("Multiply =>" + Operation.MULTIPLY.apply(1, 2));
        System.out.println("Divide =>" + Operation.DIVIDE.apply(1, 2));
    }

    public static void exerciseFour() {
        /*
        Role-Based Access Control
         */
        System.out.println("Admin =>" + UserRole.ADMIN.getPermissions());
        System.out.println("User =>" + UserRole.USER.getPermissions());
        System.out.println("Guest =>" + UserRole.GUEST.getPermissions());
    }

    public static void exerciseFive() {
         /*
          Configurable Settings
         */
        Arrays.stream(Configuration.values()).forEach(c -> System.out.println(c + " => " + c.getValue()));
    }

    public static void exerciseSix() {
         /*
          EnumSet and EnumMap
         */
        EnumSet<Weekday> weekdays = EnumSet.of(Weekday.SUNDAY, Weekday.MONDAY);
        EnumMap<Weekday, String> activities = new EnumMap<Weekday, String>(Weekday.class) {{
            put(Weekday.MONDAY, "Gym");
            put(Weekday.FRIDAY, "Movie Night");
        }};
        System.out.println("Days in set : ");
        weekdays.forEach(System.out::println);
        System.out.println("Activities : ");
        activities.forEach((day, act) -> System.out.println(day + " => " + act));

    }
}

enum TrafficLight {
    RED(3), YELLOW(3), GREEN(3);
    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public TrafficLight next() {
        int ordinal = this.ordinal();
        TrafficLight[] values = TrafficLight.values();
        if (ordinal == values.length - 1) return values[0];
        return values[ordinal + 1];
    }
}

enum PaymentStatus {
    PENDING("Pending transaction", false),
    COMPLETED("Completed transaction", true),
    FAILED("Failed transaction", true),
    REFUNDED("Refunded transaction", true);
    private final String description;
    private final boolean isFinal;

    PaymentStatus(String description, boolean isFinal) {
        this.description = description;
        this.isFinal = isFinal;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isFinal() {
        return isFinal;
    }

    static public PaymentStatus getStatusFromDescription(String description) throws NoSuchElementException {
        return Arrays.stream(PaymentStatus.values()).
                filter(p -> Objects.equals(p.description, description)).
                findFirst().orElseThrow(NoSuchElementException::new);
    }
}

enum Operation {
    ADD {
        @Override
        int apply(int a, int b) {
            return a + b;
        }
    }, SUBTRACT {
        @Override
        int apply(int a, int b) {
            return a - b;
        }
    }, MULTIPLY {
        @Override
        int apply(int a, int b) {
            return a * b;
        }
    }, DIVIDE {
        @Override
        int apply(int a, int b) {
            return a / b;
        }
    };

    abstract int apply(int a, int b);
}

enum Permission {
    READ, WRITE, DELETE;
}

enum UserRole {
    ADMIN {
        @Override
        List<Permission> getPermissions() {
            return Arrays.asList(Permission.DELETE, Permission.READ, Permission.WRITE);
        }
    }, USER {
        @Override
        List<Permission> getPermissions() {
            return Arrays.asList(Permission.READ, Permission.WRITE);
        }
    }, GUEST {
        @Override
        List<Permission> getPermissions() {
            return Collections.singletonList(Permission.READ);
        }
    };

    abstract List<Permission> getPermissions();
}

enum Configuration {
    MAX_CONNECTIONS(0), TIMEOUT(1), DEBUG_MODE(2);
    private final int value;

    Configuration(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}

enum Weekday {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}