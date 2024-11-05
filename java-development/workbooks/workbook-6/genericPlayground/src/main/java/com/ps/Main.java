package com.ps;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> tmnt = new ArrayList<>(
//                Arrays.asList("Leonardo", "Michelangelo", "Donatello", "Raphael", "Master Splinter")
//        );

        // ["Leonardo", "Michelangelo", "Donatello", "Raphael", "Master Splinter"]

        // ['L', 'M', 'D', 'R', 'M']


//        Stream<String> tmntStream = tmnt.stream();
//        Stream<Character> firstLetters = tmntStream.map(member->member.charAt(0));
//        List<Character> modifiedList = firstLetters.collect(Collectors.toList());

//        List<Character> modifiedList = tmnt
//                .stream()
//                .map(member->member.charAt(0))
//                .collect(
//                        Collectors.toList()
//                );
//
//        System.out.println(modifiedList);

//        HashMap<String, String> nicknamesTmnt = new HashMap<>();
//        nicknamesTmnt.put("Leonardo", "Leo");
//        nicknamesTmnt.put("Michelangelo", "Mickey");
//        nicknamesTmnt.put("Donatello", "Donny");
//        nicknamesTmnt.put("Raphael", "Ralph");

        List<Person> people = List.of(
                new Person("Alice", "Johnson", 25),
                new Person("Bob", "Smith", 30),
                new Person("Cathy", "Brown", 28),
                new Person("David", "Wilson", 35),
                new Person("Eva", "Taylor", 22),
                new Person("Frank", "Anderson", 40),
                new Person("Grace", "Thomas", 29),
                new Person("Henry", "Jackson", 31),
                new Person("Isabel", "Martin", 27),
                new Person("Jack", "Lee", 33)
        );

        // Reduce
        int totalAges = people.stream()
                .reduce(0, (accum, person)->accum + person.getAge(), Integer::sum);
        System.out.println(totalAges);

//        String nameToSearch = "t";
//
//        // Filter
//        List<Person> matching = people.stream()
//                .filter(person -> {
//                    return person.getFirstName().toLowerCase().startsWith(nameToSearch)
//                            || person.getLastName().toLowerCase().startsWith(nameToSearch);
//                })
//                .collect(Collectors.toList());
//
//        System.out.println(matching);

//        In your name search logic, replace your for loop with a stream and filter function.
//                Ensure that your new list of names still contains the correct results.
//                Step 2
//        Replace the for loop in your average age calculation with stream methods. HINT: You will need to chain multiple methods together: i.e. map(), reduce()
//        Step 3:
//        Using only stream methods find the following answers.
//        HINT: This could be done a few different ways: using sorted() or a
//        combination of map() and reduce()
//        Display the age of the oldest person in the list. Display the age of the youngest person in the list.

    }
}