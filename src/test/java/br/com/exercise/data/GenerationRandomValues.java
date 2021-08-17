package br.com.exercise.data;

import java.util.Random;

public class GenerationRandomValues {

    public String getValueNames() {
        String[] names = {"Douglas", "Maria", "Franciele", "Almir", "João"};
        String selectName = (names[new Random().nextInt(names.length)]);
        return selectName;
    }

    public String getValuePhone() {
        String[] phone = {"51 99999-9999", "55 99999-8888", "51 88888-9999", "51 88888-8888"};
        String selectPhone = (phone[new Random().nextInt(phone.length)]);
        return selectPhone;
    }

    public String getValueCity() {
        String[] city = {"Porto Alegre", "Alvorada", "Gravataí", "Canoas"};
        String selectCity = (city[new Random().nextInt(city.length)]);
        return selectCity;
    }

    public String getValueUsername() {
        String[] username = {"Teste", "Testando", "Testanderson"};
        String selectUsername = (username[new Random().nextInt(username.length)]);
        return selectUsername;
    }


}
