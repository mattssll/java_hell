package com.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */


public class App {
    // Create a class BankAccount

    // create record class called BankAccount


    public static void main(String[] args) throws IOException {
        System.out.println("Writting from Object to json file and to string");

        String jsonFilePrefix = "./json_parser/src/resources/";
        String jsonFilePath = jsonFilePrefix + "bankaccount.json";
        String jsonListFilePath = jsonFilePrefix + "bankaccount_list.json";

        ObjectMapper objectMapper = new ObjectMapper();
        BankAccount bankAccount = new BankAccount(123, "TeslaAcct");

        objectMapper.writeValue(new File(jsonFilePath), bankAccount);

        String asString = objectMapper.writeValueAsString(bankAccount);
        System.out.println(asString);

        System.out.println("Reading json text and printing as BankAccount Object");
        String jsonString = """
                {
                    "id": 321,
                    "name": "MicrosoftAcct"
                }
                """;
        BankAccount ba1 = objectMapper.readValue(jsonString, BankAccount.class);
        System.out.println(ba1);

        System.out.println("Reading json file and printing as BankAccount Object");
        BankAccount ba2 = objectMapper.readValue(new File(jsonFilePath), BankAccount.class);
        System.out.println(ba2);

        System.out.println("Read single json into a map");
        Map<String, Object> bankAccountMap = new HashMap<>();
        bankAccountMap = objectMapper.readValue(new File(jsonFilePath),bankAccountMap.getClass());
        System.out.println(bankAccountMap);

        System.out.println("Read list of json to a List of Objects (HashMap)");
        List<BankAccount> bankAccountsList = new ArrayList<>();
        bankAccountsList = objectMapper.readValue(new File(jsonListFilePath), bankAccountsList.getClass());
        System.out.println(bankAccountsList);

        System.out.println("Read list of json to a Map<String, Array>");
        Map<String, List<BankAccount>> bankAccountsMap = new HashMap<>();
        bankAccountsMap.put("testing", bankAccountsList);
        System.out.println(bankAccountsMap);


    }
}