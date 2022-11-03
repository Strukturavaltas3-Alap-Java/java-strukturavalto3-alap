package week15.day03.lambdas;

import java.text.Collator;
import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 0, 5, -8, 2, 2));
        for (int i = 0; i < numbers.size() - 1; i++) {
//            System.out.print(new NumberComparator().compare(numbers.get(i), numbers.get(i + 1)));
//            System.out.print(" ");

            // -1 1 -1 1 -1 0
            // -1 1 -1 1 -1 0
            // -6 9 -5 13 -10 0
        }

        List<Person> people1 = new ArrayList<>(Arrays.asList(
                new Person("Józsi", 23),
                new Person("Sanyi", 34),
                new Person("Géza", 46),
                new Person("Karcsi", 54)
        ));
        List<Person> ordered = new ArrayList<>(people1);

//        ordered.sort(new PersonNameComparator());
//        System.out.println(ordered);

//        ordered.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person one, Person other) {
//                return one.getName().compareTo(other.getName());
//            }
//        });
//        System.out.println(ordered);

//        ordered.sort((Person one, Person other) -> {
//                return one.getName().compareTo(other.getName());
//            }
//        );
//        System.out.println(ordered);

//        ordered.sort((one, other) -> {
//                    return one.getName().compareTo(other.getName());
//                }
//        );
//        System.out.println(ordered);

//        ordered.sort((one, other) -> one.getName().compareTo(other.getName()));
//        System.out.println(ordered);
//
//        ordered.sort(Comparator.comparing(Person::getName));
//        System.out.println(ordered);

//        List<Person> filtered = people1.stream()
//                .filter(new PersonAgePredicate())
//                .collect(Collectors.toList());
//        System.out.println(filtered);

//        List<Person> filtered = people1.stream()
//                .filter(new Predicate<Person>() {
//                    @Override
//                    public boolean test(Person person) {
//                        return person.getAge() > 40;
//                    }
//                })
//                .collect(Collectors.toList());
//        System.out.println(filtered);

//        List<Person> filtered = people1.stream()
//                .filter((Person person) -> { return person.getAge() > 40; })
//                .collect(Collectors.toList());
//        System.out.println(filtered);

//        List<Person> filtered = people1.stream()
//                .filter(person -> person.getAge() > 40)
////                .collect(Collectors.toList());
//        .toList();
//        System.out.println(filtered);


        List<Person> people2 = new ArrayList<>(Arrays.asList(
                new Person("Árpád", 23),
                new Person("Attila", 34),
                new Person("Ábel", 46),
                new Person("András", 54)
        ));
        List<Person> ordered2 = new ArrayList<>(people2);

//        List<String> names = new ArrayList<>(Arrays.asList("Árpád", "Attila", "Ábel", "András"));
//        names.sort(Collator.getInstance(new Locale("hu", "HU")));
//        System.out.println(names);
//
//        ordered2.sort(Collator.getInstance(new Locale("hu", "HU")));
//        System.out.println(ordered2);

//        ordered2.sort(Comparator.comparing(new PeopleComparatorByName(), Collator.getInstance(new Locale("hu", "HU"))));
//        System.out.println(ordered2);

//        ordered2.sort(Comparator.comparing(new Function<Person, String>() {
//            @Override
//            public String apply(Person person) {
//                return person.getName();
//            }
//        }, Collator.getInstance(new Locale("hu", "HU"))));
//        System.out.println(ordered2);

//        ordered2.sort(Comparator.comparing((Person person) -> { return person.getName(); }, Collator.getInstance(new Locale("hu", "HU"))));
//        System.out.println(ordered2);

//        ordered2.sort(Comparator.comparing(person -> person.getName(), Collator.getInstance(new Locale("hu", "HU"))));
//        System.out.println(ordered2);

        ordered2.sort(Comparator.comparing(Person::getName, Collator.getInstance(new Locale("hu", "HU"))));
        System.out.println(ordered2);
    }



}
