package com.seyran.leetcodejavasolutions.easy;

import java.util.*;
public class DeleteDuplicateEmails {


        public void deleteDuplicateEmails(List<Person> persons) {

            Map<String, Integer> minIdMap = new HashMap<>();


            for (Person p : persons) {
                minIdMap.put(
                        p.email,
                        Math.min(minIdMap.getOrDefault(p.email, Integer.MAX_VALUE), p.id)
                );
            }


            Iterator<Person> it = persons.iterator();
            while (it.hasNext()) {
                Person p = it.next();
                if (p.id != minIdMap.get(p.email)) {
                    it.remove();
                }
            }
        }
    }

    class Person {
        int id;
        String email;

        Person(int id, String email) {
            this.id = id;
            this.email = email;
    }
}
