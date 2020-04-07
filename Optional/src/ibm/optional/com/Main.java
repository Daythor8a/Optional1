package ibm.optional.com;

import java.util.*;

public class Main {

    public String getCarInsuranceName(Optional<Person> person){
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }

    public Insurance findCheapestInsurance(Person person, Car car){

            String price;
            ArrayList<Integer> services = new ArrayList<>();
            Integer s1 = new Service().getPrice();
            Integer s2 = new Service().getPrice();
            Integer s3 = new Service().getPrice();
            services.add(s1);
            services.add(s2);
            services.add(s3);
            //Cual es el menor
            int cheapestPrice = services.indexOf(Collections.min(services));

            price = Integer.toString(cheapestPrice);

            Optional<String> companyName = Optional.of(price);

            Insurance cheapestCompany = new Insurance();

            if (companyName.isPresent()){

                cheapestCompany.getName();
                return cheapestCompany;
            }

            //String cheapestCompany = car.getInsurance().flatMap(Insurance::getService);

        return cheapestCompany;
    }

    public Optional<Insurance> nullSafeFindCheapestInsurance(){


        return null;
    }


    public String getCarInsuranceName(Optional<Person> person, int minAge){

        Person age = new Person();

        if ( age.getAge() > minAge){

        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
        }else
        {
            return null;
        }
    }

   /*
    public static <T extends Comparable<T>> int findMinIndex(final List<T> xs) {
        int minIndex;
        if (xs.isEmpty()) {
            minIndex = -1;
        } else {
            final ListIterator<T> itr = xs.listIterator();
            T min = itr.next(); // first element as the current minimum
            minIndex = itr.previousIndex();
            while (itr.hasNext()) {
                final T curr = itr.next();
                if (curr.compareTo(min) < 0) {
                    min = curr;
                    minIndex = itr.previousIndex();
                }
            }
        }
        return minIndex;
    }

    */

}
