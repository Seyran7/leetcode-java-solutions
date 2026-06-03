package com.seyran.leetcodejavasolutions.easy;


    import java.time.LocalDate;
import java.util.*;

    class Weather {
        int id;
        LocalDate recordDate;
        int temperature;

        public Weather(int id, LocalDate recordDate, int temperature) {
            this.id = id;
            this.recordDate = recordDate;
            this.temperature = temperature;
        }
    }

    public class RisingTemperature {

        public static List<Integer> findIds(List<Weather> weatherList) {
            List<Integer> result = new ArrayList<>();

            Map<LocalDate, Weather> weatherMap = new HashMap<>();

            for (Weather weather : weatherList) {
                weatherMap.put(weather.recordDate, weather);
            }

            for (Weather current : weatherList) {
                LocalDate yesterday = current.recordDate.minusDays(1);

                if (weatherMap.containsKey(yesterday)) {
                    Weather previous = weatherMap.get(yesterday);

                    if (current.temperature > previous.temperature) {
                        result.add(current.id);
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            List<Weather> weatherList = List.of(
                    new Weather(1, LocalDate.of(2015, 1, 1), 10),
                    new Weather(2, LocalDate.of(2015, 1, 2), 25),
                    new Weather(3, LocalDate.of(2015, 1, 3), 20),
                    new Weather(4, LocalDate.of(2015, 1, 4), 30)
            );

            System.out.println(findIds(weatherList));

    }
}
